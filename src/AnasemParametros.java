import java.util.ArrayList;
import java.util.List;

public class AnasemParametros extends AnasintBaseVisitor {

    /*(Parametro a devolver r, tipos en el cuerpo de los tipos no primitivos)
    cuerpoTipo:a=IDENTTIPO PARENTESISABIERTO IDENTVARIABLE PARENTESISCERRADO AND r=cuerpoTipo {incluir 'a' en r}
              |a=IDENTTIPO PARENTESISABIERTO IDENTVARIABLE PARENTESISCERRADO;                {incluir 'a' en r}*/
    public List<String> visitCuerpoTipo(Anasint.CuerpoTipoContext ctx) {
        List<String> r = new ArrayList<>();
        String a = ctx.IDENTTIPO().getText();
        r.add(a);
        if (ctx.getChildCount()>4){
            List<String> listaRecur = visitCuerpoTipo(ctx.cuerpoTipo());
            r.addAll(listaRecur);
        }
    return  r;
    }

}
