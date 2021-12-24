// Generated from /Users/juanvega/Downloads/juavegsec/src/Anasint.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Anasint}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AnasintVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#individuos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndividuos(Anasint.IndividuosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#decl_individuos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_individuos(Anasint.Decl_individuosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#relaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelaciones(Anasint.RelacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#decl_relaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_relaciones(Anasint.Decl_relacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos(Anasint.TiposContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#decl_tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_tipos(Anasint.Decl_tiposContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(Anasint.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#primitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivo(Anasint.PrimitivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#no_primitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_primitivo(Anasint.No_primitivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#cuerpoTipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpoTipo(Anasint.CuerpoTipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#inicializacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacion(Anasint.InicializacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#decl_inicializaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_inicializaciones(Anasint.Decl_inicializacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#descripciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescripciones(Anasint.DescripcionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#decl_descripcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_descripcion(Anasint.Decl_descripcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#descripcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescripcion(Anasint.DescripcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#relacionesBinarias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacionesBinarias(Anasint.RelacionesBinariasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#consulta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsulta(Anasint.ConsultaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondClasico}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondClasico(Anasint.CondClasicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondTipo}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondTipo(Anasint.CondTipoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondRelacion}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondRelacion(Anasint.CondRelacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondParentesis}
	 * labeled alternative in {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondParentesis(Anasint.CondParentesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#operador_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_logico(Anasint.Operador_logicoContext ctx);
}