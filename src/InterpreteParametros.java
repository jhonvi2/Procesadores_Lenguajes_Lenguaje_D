import org.antlr.v4.runtime.misc.Pair;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class InterpreteParametros extends AnasintBaseVisitor {

    HashMap<String, List<String>> almacen_inicializaciones = new HashMap<>();
    HashMap<String, List<Pair<String, String>>> almacen_relaciones = new HashMap<>();
    HashMap<String, List<List<String>>> almacen_tipos = new HashMap<>();

    /*(Parametro a devolver almacen_tipos)
    primitivo:  i=IDENTTIPO PARENTESISABIERTO IDENTVARIABLE PARENTESISCERRADO ARROW  {actualizar_almacen_tipos(i=[])  devolver almacen_tipos} ;*/
    public Object visitPrimitivo(Anasint.PrimitivoContext ctx) {
        List<List<String>> listaVacia = new ArrayList<>();
        String i = ctx.IDENTTIPO().getText();
        almacen_tipos.put(i, listaVacia);
        return almacen_tipos;

    }/*(Parametro a devolver almacen_tipos)
    no_primitivo: z=IDENTTIPO PARENTESISABIERTO IDENTVARIABLE PARENTESISCERRADO ARROW r=cuerpoTipo
    {si (z se encuentra ya en almacen_tipos ) entonces
            definicionPrevia = extrae la definición previa de z
        añadir 'r' a definicionPrevia
        actualizar_almacen_tipos(z,definicionPrevia)
        sino
                definicionInicial = r
        actualizar_almacen_tipos(z,definicionInicial)}
       devolver almacen_tipos*/

    public HashMap visitNo_primitivo(Anasint.No_primitivoContext ctx) {
        List<String> r;
        String z = ctx.getChild(0).getText();
        r = visitCuerpoTipo(ctx.cuerpoTipo());
        if (almacen_tipos.containsKey(z)) {
            List<List<String>> definicionPrevia;
            definicionPrevia = almacen_tipos.get(z);
            definicionPrevia.add(r);
            almacen_tipos.put(z, definicionPrevia);
        } else {
            List<List<String>> definicionInicial = new ArrayList<>();
            definicionInicial.add(r);
            almacen_tipos.put(z, definicionInicial);
        }
        return almacen_tipos;
    }
    /*
  (Parametro a devolver r, tipos en el cuerpo de los tipos no primitivos)
    cuerpoTipo:a=IDENTTIPO PARENTESISABIERTO IDENTVARIABLE PARENTESISCERRADO AND r=cuerpoTipo {incluir 'a' en r}
              |a=IDENTTIPO PARENTESISABIERTO IDENTVARIABLE PARENTESISCERRADO;                {incluir 'a' en r}*/

    public List<String> visitCuerpoTipo(Anasint.CuerpoTipoContext ctx) {
        List<String> r = new ArrayList<>();
        String a = ctx.IDENTTIPO().getText();
        r.add(a);
        if (ctx.getChildCount() > 4) {
            List<String> listaRecur = visitCuerpoTipo(ctx.cuerpoTipo());
            r.addAll(listaRecur);
        }
        return r;
    }


    /*  (Parametro a devolver almacen_inicializaciones)
  inicializacion:INICIALIZACION DOSPUNTOS  decl_inicializaciones
  {        obtener almacen de inicializaciones incial
           calcularTipoNoprimitivo();                   //actualizará el almacen con los nuevos tipos no primitivos
           return almacen_inicializaciones;}*/
    public Object visitInicializacion(Anasint.InicializacionContext ctx) {
        visitDecl_inicializaciones(ctx.decl_inicializaciones());
        calcularTipoNoprimitivo();
        return almacen_inicializaciones;
    }
    /* (Parametro a devolver almacen_inicializaciones)
 decl_inicializaciones:i=IDENTTIPO PARENTESISABIERTO g=IDENTINDIVIDUOSREL PARENTESISCERRADO COMA decl_inicializaciones
                      |i=IDENTTIPO PARENTESISABIERTO g=IDENTINDIVIDUOSREL PARENTESISCERRADO;
                  {si (g se encuentra ya en el almacen_inicializaciones)
                       tiposPrevios = extrae los tipos previos de g
                       añadir 'i' a tiposPrevios
                       actualizar_almacen_inicializaciones(g,tiposPrevios)
                  sino
                        añadir 'i' a tiposIniciales
                        actualizar_almacen_inicializaciones(g,tiposIniciales)}*/
    public HashMap visitDecl_inicializaciones(Anasint.Decl_inicializacionesContext ctx) {
        String i = ctx.IDENTTIPO().getText();
        String g = ctx.IDENTINDIVIDUOSREL().getText();
        if (almacen_inicializaciones.containsKey(g)) {
            List<String> tiposPrevios;
            tiposPrevios = almacen_inicializaciones.get(g);
            tiposPrevios.add(i);
            almacen_inicializaciones.put(g, tiposPrevios);
        } else {
            List<String> tiposIniciales = new ArrayList<>();
            tiposIniciales.add(i);
            almacen_inicializaciones.put(g, tiposIniciales);
        }
        if (ctx.getChildCount() > 4) {
            HashMap<String, List<String>> maparecur = visitDecl_inicializaciones(ctx.decl_inicializaciones());
            almacen_inicializaciones.putAll(maparecur);
        }
        return almacen_inicializaciones;
    }

    /*  descripciones:DESCRIPCIONES DOSPUNTOS d=decl_descripcion ;
                { Obtener almacen_relaciones de d
                  limpiar almacen_relaciones            // es necesario porque almacen_relaciones es una variable global y la siguiente consulta no puede contener los valores de la anterior}*/
    public Object visitDescripciones(Anasint.DescripcionesContext ctx) {
        for (Anasint.Decl_descripcionContext f : ctx.decl_descripcion()) {
            almacen_relaciones.clear();
            visitDecl_descripcion(f);
        }
        return new ArrayList<>();
    }

    /*(Parametro a devolver almacen_relaciones)
   /elacionesBinarias: n=IDENTINDIVIDUOSREL PARENTESISABIERTO i=IDENTINDIVIDUOSREL COMA r=IDENTINDIVIDUOSREL PARENTESISCERRADO COMA relacionesBinarias
                        |n=IDENTINDIVIDUOSREL PARENTESISABIERTO i=IDENTINDIVIDUOSREL COMA r=IDENTINDIVIDUOSREL PARENTESISCERRADO;
                  {listaIndividuos = contendra los individuos que se relacionan
                  pareja = (i,r);
                  añadir pareja a listaIndividuos
                  si (n se encuentra ya en almacen_relaciones)
                      individuosPrevios = extrae la las parejas previas de n
                      añadir 'pareja' a individuosPrevios
                      actualiza_almacen_relaciones(n,individuosPrevios)
                  sino
                      actualiza_almacen_relaciones(n,listaIndividuos)} */
    public HashMap visitRelacionesBinarias(Anasint.RelacionesBinariasContext ctx) {

        List<Pair<String, String>> listaIndividuos = new ArrayList<>();
        String n = ctx.IDENTINDIVIDUOSREL(0).getText();
        String i = ctx.IDENTINDIVIDUOSREL(1).getText();
        String r = ctx.IDENTINDIVIDUOSREL(2).getText();
        Pair<String, String> pareja = new Pair<>(i, r);
        listaIndividuos.add(pareja);

        if (almacen_relaciones.containsKey(n)) {
            List<Pair<String, String>> individuosPrevios;
            individuosPrevios = almacen_relaciones.get(n);
            individuosPrevios.add(pareja);
            almacen_relaciones.put(n, individuosPrevios);

        } else {
            almacen_relaciones.put(n, listaIndividuos);
        }
        if (ctx.getChildCount() > 6) {
            HashMap<String, List<Pair<String, String>>> maparecur = visitRelacionesBinarias(ctx.relacionesBinarias());
            almacen_relaciones.putAll(maparecur);
        }
        return almacen_relaciones;

    }

   /*(Parametro a devolver 'result')
    consulta: INTERROGACION IDENTVARIABLE TALQUE PARENTESISABIERTO result=condicion PARENTESISCERRADO
    {imprimit result}*/
    public Object visitConsulta(Anasint.ConsultaContext ctx) {
        List<String> result;
        result = (List<String>) visit(ctx.getChild(4));
        System.out.println("EL resultado de la consulta " + ctx.INTERROGACION().getText() + ctx.IDENTVARIABLE().getText() + " de la linea " + ctx.getStart().getLine() + " es " + result);
        return result;
    }
    /*  (Parametro a devolver 'result')
        condicion: t=IDENTTIPO PARENTESISABIERTO IDENTVARIABLE PARENTESISCERRADO
        {para cada inicializacion en almacen_inicializaciones
            si el individuo contiene 't'
                añadir individuo a result
        }
*/
    public Object visitCondTipo(Anasint.CondTipoContext ctx) {
        String t = ctx.getChild(0).getText();
        List<String> candidatos = new ArrayList<>();
        for (Map.Entry<String, List<String>> dicc : almacen_inicializaciones.entrySet()) {
            if (dicc.getValue().contains(t)) {
                candidatos.add(dicc.getKey());
            }
        }
        return candidatos;

    }
/*  (Parametro a devolver 'result')
    condicion:  r=IDENTINDIVIDUOSREL PARENTESISABIERTO IDENTVARIABLE COMA s=IDENTINDIVIDUOSREL PARENTESISCERRADO  ;
    {para cada relacion en almacen_relaciones
            listaParejas = extrae las parejas de individuos de 'r'
            para cada pareja en listaParejas
                primero = extrae el primer individuo de pareja(a la izquierda)
                segundo = extrae el segundo individuo de pareja(a la derecha)
                si ('s' es igual a segundo)
                    añadir 'primero' a result
    }
*/
    public Object visitCondRelacion(Anasint.CondRelacionContext ctx) {
        String r = ctx.getChild(0).getText();
        String s = ctx.getChild(4).getText();
        List<String> candidatos = new ArrayList<>();
        for (Map.Entry<String, List<Pair<String, String>>> dicc : almacen_relaciones.entrySet()) {
            if (dicc.getKey().equals(r)) {
                List<Pair<String, String>> listaParejas = new ArrayList<>(dicc.getValue());
                for (int i = 0; i < listaParejas.size(); i++) {
                    Pair<String, String> pareja = listaParejas.get(i);
                    String primero = pareja.a;
                    String segundo = pareja.b;
                    if (s.equals(segundo)) {
                        candidatos.add(primero);

                    }
                }
            }
        }
        return candidatos;
    }

    /*(Parametro a devolver 'result');
      condicion: PARENTESISABIERTO resultParentesis=condicion PARENTESISCERRADO {result=resultParentesis}*/
    public Object visitCondParentesis(Anasint.CondParentesisContext ctx) {
        List<String> result = new ArrayList<>();
        result = (List<String>) visit(ctx.getChild(1));
        return result;
    }
    /*  (Parametro a devolver 'result');
        condicion: candidatosIzq=condicion o=operador_logico candidatosDer=condicion
        {
            si (candidatosIzq no esta vacio && candidatosDer esta vacio && o="||")
                result = candidatosIzq
            si (candidatosIzq esta vacio && candidatosDer no esta vacio && o="||")
                result = candidatosDer
            para cada candidatoizq en candidatosIzq
                para cada candidatoder en candidatosDer
                    si (o="&&")
                        si (candidatoizq == candidatoder)
                            añadir 'candidatoizq' a result
                    sino                                                // o=('||')
                        añadir 'candidatoder' a result
                        añadir 'candidatoizq' a result

        devolver result;
        }
*/
    public Object visitCondClasico(Anasint.CondClasicoContext ctx) {
        String operador = ctx.getChild(1).getText();
        List<String> result = new ArrayList<>();

        List<String> candidatosIzq ;
        List<String> candidatosDer  ;
        candidatosIzq = (List<String>) visit(ctx.getChild(0));
        candidatosDer = (List<String>) visit(ctx.getChild(2));

        if (!candidatosIzq.isEmpty() && candidatosDer.isEmpty() && operador.equals("||"))   // en caso de que no haya candidatos a la derecha  y el operador sea '||' devolver solo el de la izquierda
            result = candidatosIzq;
        else if (candidatosIzq.isEmpty() && !candidatosDer.isEmpty() && operador.equals("||")) // en caso de que no haya candidatos a la izquierda  y el operador sea '||' devolver solo el de la derecha
            result = candidatosDer;
        for (int i = 0; i < candidatosIzq.size(); i++) {
            for (int j = 0; j < candidatosDer.size(); j++) {
                if (operador.equals("&&")) {
                    if (candidatosIzq.get(i).equals(candidatosDer.get(j)))
                        if (!result.contains(candidatosIzq.get(i)))
                            result.add(candidatosIzq.get(i));
                } else {
                    if (!result.contains(candidatosIzq.get(i)))
                        result.add(candidatosIzq.get(i));
                    if (!result.contains(candidatosDer.get(j)))
                        result.add(candidatosDer.get(j));
                }
            }
        }
        return result;
    }
//////////////////////////////////////////////////////////////////////////////////METODO AUXILIAR//////////////////////////////////////////////////////////////////////////////////
    /*(funcion calcularTipoNoPrimitivo())
                cent = false;
                para cada  inicializacion en almacen_inicializaciones
                   para cada tipo en almacen_tipos
                        cuerpoTipoNoPrimitivo = extrae el cuerpo del tipo
                            si (cuerpoTipoNoPrimitivo no es vacío)                            // es decir no es caso base
                                si (los tipos del inidividuo cumplen cuerpoTipoNoPrimitivo)
                                        listaAux = contendra los tipos que ya tenía el individuo y añadira el nuevo tipo
                                        actualiza almacen_inicializaciones(individuo,listaAux);
                                        cent= true;

                si (cent = true)                //si ha habido un cambio
                    calcularTipoNoprimitivo();  // se llamará recursivamente*/
    
    public void calcularTipoNoprimitivo() {
        Boolean cent = false;
        for (Map.Entry<String, List<String>> dicIni : almacen_inicializaciones.entrySet()) {
            for (Map.Entry<String, List<List<String>>> diccTipos : almacen_tipos.entrySet()) {
                List<List<String>> cuerpoTipoNoPrimitivo;
                cuerpoTipoNoPrimitivo = almacen_tipos.get(diccTipos.getKey());
                if (!cuerpoTipoNoPrimitivo.isEmpty()) {
                    for (int i = 0; i < cuerpoTipoNoPrimitivo.size(); i++) {
                        List<String> sublista;
                        sublista = cuerpoTipoNoPrimitivo.get(i);
                        if (dicIni.getValue().containsAll(sublista)) {  // si (los tipos del inidividuo cumplen cuerpoTipoNoPrimitivo)
                            List<String> listaAux = new ArrayList<>();
                            listaAux.addAll(dicIni.getValue());
                            if (!listaAux.contains(diccTipos.getKey()))
                                listaAux.add(diccTipos.getKey());
                            if (!dicIni.getValue().equals(listaAux)) {
                                almacen_inicializaciones.put(dicIni.getKey(), new ArrayList<>(listaAux));
                                cent= true;
                            }
                        }
                    }
                }
            }
        }
        if (cent)
            calcularTipoNoprimitivo();
    }

}




