import java.util.*;
import java.util.stream.Collectors;
public class Anasem extends AnasintBaseListener{

    List<String> alamcen_variables = new ArrayList<>();
    HashMap<String,List<List<String>>> almacen_definiciones_tipos =new HashMap<>();
    AnasemParametros extraeCuerpo = new AnasemParametros();   //permitira extraer el cuerpo de un tipo no primitivo

    /*consulta: INTERROGACION a=IDENTVARIABLE TALQUE PARENTESISABIERTO condicion PARENTESISCERRADO;
    { para cada var en almacen_variables
        si var es distinto de a   //es decir si la variable del cuerpo de la consulta es distinta de la variable cuestionada
        Devolver error }*/
    public void exitConsulta(Anasint.ConsultaContext ctx) {
        String a = ctx.IDENTVARIABLE().getText();
        for (String var : alamcen_variables) {
            if (!var.equals(a))
                System.out.println("En la línea " + ctx.getStart().getLine() + " la variable " + var + " es distinta a la variable cuestionada " + a);

        }
        alamcen_variables.clear();
    }

/*condicion:IDENTINDIVIDUOSREL PARENTESISABIERTO b=IDENTVARIABLE COMA IDENTINDIVIDUOSREL PARENTESISCERRADO {
           añadir 'b' a alamcen_variables}*/
    public void exitCondRelacion(Anasint.CondRelacionContext ctx) {
        String b = ctx.IDENTVARIABLE().getText();
        alamcen_variables.add(b);

    }

/* condicion: IDENTTIPO PARENTESISABIERTO s=IDENTVARIABLE PARENTESISCERRADO{
        añadir 's' a alamacen_variables}*/
    public void exitCondTipo(Anasint.CondTipoContext ctx) {
        String s = ctx.IDENTVARIABLE().getText();
        alamcen_variables.add(s);
    }


    //primitivo:  i=IDENTTIPO PARENTESISABIERTO IDENTVARIABLE PARENTESISCERRADO ARROW  {actualizar_almacen_definiciones_tipos(i=[])  ;
    public void exitPrimitivo(Anasint.PrimitivoContext ctx) {
        List<List<String>> listaVacia = new ArrayList<>();
        String i=ctx.IDENTTIPO().getText();
        almacen_definiciones_tipos.put(i, listaVacia);

    }

    /*   no_primitivo: z=IDENTTIPO PARENTESISABIERTO IDENTVARIABLE PARENTESISCERRADO ARROW r=cuerpoTipo {
    {si (z se encuentra ya en el almacen) entonces
         definicionPrevia = extrae la definición previa de z
         añadir a definicionPrevia r
         actualizar_almacen_definiciones_tipos(z,definicionInicial)
    sino
         definicionInicial = r
         actualizar_almacen_definiciones_tipos(z,definicionInicial)}*/
    public void exitNo_primitivo(Anasint.No_primitivoContext ctx) {
        List<String> r;
        String z =ctx.IDENTTIPO().getText();
        r = extraeCuerpo.visitCuerpoTipo(ctx.cuerpoTipo());
        if (almacen_definiciones_tipos.containsKey(z)){
            List<List<String>> definicionPrevia ;
            definicionPrevia = almacen_definiciones_tipos.get(z);
            definicionPrevia.add(r);
            almacen_definiciones_tipos.put(z, definicionPrevia);
        }
        else {
            List<List<String>> definicionInicial = new ArrayList<>();
            definicionInicial.add(r);
            almacen_definiciones_tipos.put(z, definicionInicial);
        }
    }

    /*    test_ciclicidad(v) devuelve (true/false)
         checker= false    //indicará si se ha encontrado ciclicidad en la definición, por defecto será false porque todavia no se ha encontrado ciclicidad
         definicion = extrae la definición(cuerpo) de v
         para cada i en definicion
            sub_definicion = extrae el primer tipo de la definicion
            checker = ciclo(v,sub_definicion);
            si checker = true
               break            //Se ha encontrado ciclicidad por tanto no hay que seguir comprobando otros caminos
         devolver checker;
*/
    boolean test_ciclicidad(String v)  {
        boolean checker = false;
        try{
            List<List<String>> definicion;
            definicion = almacen_definiciones_tipos.get(v);
            for (int i=0; i<definicion.size(); i++){
                List<String> sub_definicion;
                sub_definicion = definicion.get(i);
                List<String> aux = new LinkedList<>();
                aux.add(v);
                checker = ciclo(aux, sub_definicion);
                 if (checker) break;
            }
            return checker;
        }
        catch (Exception e){
            System.out.println(e.toString());
            return checker;
        }
    }

    boolean contiene_algun_elemento (List<String> V, List<String> definicion){
        return definicion.stream().anyMatch((e)-> V.contains(e));
    }
/*ciclo(V,sub_definicion) devuelve (true/false)
       si algun elemento de definicion ocurre en V entonces
          devolver true
       si no
          para cada tipoAsignado en definicion
          definiciontipoAsginado = extrae la definicion(cuerpo) de tipoAsignado de almacen_definiciones_tipos
          para cada sub_definicion en definiciontipoAsginado
                si sub_definicion no está vacía
                    si (ciclo([V,tipoAsignado],subdefinicion)=true) entonces
                        devolver true

         devolver false*/
    boolean ciclo(List<String> V, List<String> definicion) {
        try {
            if (contiene_algun_elemento(V, definicion))
                return true;
            else
                for (String tipo : definicion) {
                    List<List<String>> definiciontipoAsginado = almacen_definiciones_tipos.get(tipo);

                    for (List<String> sub_definicion : definiciontipoAsginado) {
                        List<String> sub_definicion_aux;
                        sub_definicion_aux = sub_definicion;
                        if (!sub_definicion_aux.isEmpty()) {
                            List<String> aux = new ArrayList<>();
                            aux.addAll(V);
                            aux.add(tipo);
                            if (ciclo(aux, sub_definicion_aux)) {
                                return true;
                            }
                        }
                    }
                }
            return false;
        }
        catch (Exception e){
            System.out.println(e.toString());
            return false;
        }
    }

    /*decl_tipos: t=tipo (COMA t=tipo)*;
        para cada t en almacen_definiciones_tipos
            si existe ciclicidad en t
               devolver ERROR*/
    public void exitDecl_tipos(Anasint.Decl_tiposContext ctx) {
        for (Map.Entry<String, List<List<String>>> dicc : almacen_definiciones_tipos.entrySet()){
            String t = dicc.getKey();
            if (test_ciclicidad(t))
                System.out.println("(Semantico) Asignacion indefinida para el tipo "+t);

        }
    }



}

