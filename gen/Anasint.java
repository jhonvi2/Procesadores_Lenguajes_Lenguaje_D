// Generated from /Users/juanvega/Downloads/juavegsec/src/Anasint.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Anasint extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, INDIVIDUOS=2, RELACIONES=3, TIPOS=4, INICIALIZACION=5, DESCRIPCIONES=6, 
		ARROW=7, INTERROGACION=8, AND=9, OR=10, PARENTESISABIERTO=11, PARENTESISCERRADO=12, 
		DOSPUNTOS=13, COMA=14, IDENTINDIVIDUOSREL=15, IDENTTIPO=16, IDENTVARIABLE=17, 
		TALQUE=18, NUMERO=19, BLANCO=20, TABULADOR=21, FIN_LINEA=22, COMENTARIO_BLOQUE=23, 
		COMENTARIO_LINEA=24;
	public static final int
		RULE_programa = 0, RULE_individuos = 1, RULE_decl_individuos = 2, RULE_relaciones = 3, 
		RULE_decl_relaciones = 4, RULE_tipos = 5, RULE_decl_tipos = 6, RULE_tipo = 7, 
		RULE_primitivo = 8, RULE_no_primitivo = 9, RULE_cuerpoTipo = 10, RULE_inicializacion = 11, 
		RULE_decl_inicializaciones = 12, RULE_descripciones = 13, RULE_decl_descripcion = 14, 
		RULE_descripcion = 15, RULE_relacionesBinarias = 16, RULE_consulta = 17, 
		RULE_condicion = 18, RULE_operador_logico = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "individuos", "decl_individuos", "relaciones", "decl_relaciones", 
			"tipos", "decl_tipos", "tipo", "primitivo", "no_primitivo", "cuerpoTipo", 
			"inicializacion", "decl_inicializaciones", "descripciones", "decl_descripcion", 
			"descripcion", "relacionesBinarias", "consulta", "condicion", "operador_logico"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAMA'", "'INDIVIDUOS'", "'RELACIONES'", "'TIPOS'", "'INICIALIZACION'", 
			"'DESCRIPCIONES'", "'<-'", "'?'", "'&&'", "'||'", "'('", "')'", "':'", 
			"','", null, null, null, "'tal que'", null, "' '", "'\t'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAMA", "INDIVIDUOS", "RELACIONES", "TIPOS", "INICIALIZACION", 
			"DESCRIPCIONES", "ARROW", "INTERROGACION", "AND", "OR", "PARENTESISABIERTO", 
			"PARENTESISCERRADO", "DOSPUNTOS", "COMA", "IDENTINDIVIDUOSREL", "IDENTTIPO", 
			"IDENTVARIABLE", "TALQUE", "NUMERO", "BLANCO", "TABULADOR", "FIN_LINEA", 
			"COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Anasint.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Anasint(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(Anasint.PROGRAMA, 0); }
		public IndividuosContext individuos() {
			return getRuleContext(IndividuosContext.class,0);
		}
		public RelacionesContext relaciones() {
			return getRuleContext(RelacionesContext.class,0);
		}
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public InicializacionContext inicializacion() {
			return getRuleContext(InicializacionContext.class,0);
		}
		public DescripcionesContext descripciones() {
			return getRuleContext(DescripcionesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(PROGRAMA);
			setState(41);
			individuos();
			setState(42);
			relaciones();
			setState(43);
			tipos();
			setState(44);
			inicializacion();
			setState(45);
			descripciones();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndividuosContext extends ParserRuleContext {
		public TerminalNode INDIVIDUOS() { return getToken(Anasint.INDIVIDUOS, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(Anasint.DOSPUNTOS, 0); }
		public Decl_individuosContext decl_individuos() {
			return getRuleContext(Decl_individuosContext.class,0);
		}
		public IndividuosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_individuos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterIndividuos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitIndividuos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitIndividuos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndividuosContext individuos() throws RecognitionException {
		IndividuosContext _localctx = new IndividuosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_individuos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(INDIVIDUOS);
			setState(48);
			match(DOSPUNTOS);
			setState(49);
			decl_individuos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_individuosContext extends ParserRuleContext {
		public TerminalNode IDENTINDIVIDUOSREL() { return getToken(Anasint.IDENTINDIVIDUOSREL, 0); }
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public Decl_individuosContext decl_individuos() {
			return getRuleContext(Decl_individuosContext.class,0);
		}
		public Decl_individuosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_individuos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDecl_individuos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDecl_individuos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDecl_individuos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_individuosContext decl_individuos() throws RecognitionException {
		Decl_individuosContext _localctx = new Decl_individuosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_individuos);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(IDENTINDIVIDUOSREL);
				setState(52);
				match(COMA);
				setState(53);
				decl_individuos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(IDENTINDIVIDUOSREL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelacionesContext extends ParserRuleContext {
		public TerminalNode RELACIONES() { return getToken(Anasint.RELACIONES, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(Anasint.DOSPUNTOS, 0); }
		public Decl_relacionesContext decl_relaciones() {
			return getRuleContext(Decl_relacionesContext.class,0);
		}
		public RelacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterRelaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitRelaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitRelaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacionesContext relaciones() throws RecognitionException {
		RelacionesContext _localctx = new RelacionesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_relaciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(RELACIONES);
			setState(58);
			match(DOSPUNTOS);
			setState(59);
			decl_relaciones();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_relacionesContext extends ParserRuleContext {
		public TerminalNode IDENTINDIVIDUOSREL() { return getToken(Anasint.IDENTINDIVIDUOSREL, 0); }
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public Decl_relacionesContext decl_relaciones() {
			return getRuleContext(Decl_relacionesContext.class,0);
		}
		public Decl_relacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_relaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDecl_relaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDecl_relaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDecl_relaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_relacionesContext decl_relaciones() throws RecognitionException {
		Decl_relacionesContext _localctx = new Decl_relacionesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl_relaciones);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(IDENTINDIVIDUOSREL);
				setState(62);
				match(COMA);
				setState(63);
				decl_relaciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(IDENTINDIVIDUOSREL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TiposContext extends ParserRuleContext {
		public TerminalNode TIPOS() { return getToken(Anasint.TIPOS, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(Anasint.DOSPUNTOS, 0); }
		public Decl_tiposContext decl_tipos() {
			return getRuleContext(Decl_tiposContext.class,0);
		}
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterTipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitTipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitTipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(TIPOS);
			setState(68);
			match(DOSPUNTOS);
			setState(69);
			decl_tipos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_tiposContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public Decl_tiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_tipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDecl_tipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDecl_tipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDecl_tipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_tiposContext decl_tipos() throws RecognitionException {
		Decl_tiposContext _localctx = new Decl_tiposContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			tipo();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(72);
				match(COMA);
				setState(73);
				tipo();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public PrimitivoContext primitivo() {
			return getRuleContext(PrimitivoContext.class,0);
		}
		public No_primitivoContext no_primitivo() {
			return getRuleContext(No_primitivoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				primitivo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				no_primitivo();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitivoContext extends ParserRuleContext {
		public TerminalNode IDENTTIPO() { return getToken(Anasint.IDENTTIPO, 0); }
		public TerminalNode PARENTESISABIERTO() { return getToken(Anasint.PARENTESISABIERTO, 0); }
		public TerminalNode IDENTVARIABLE() { return getToken(Anasint.IDENTVARIABLE, 0); }
		public TerminalNode PARENTESISCERRADO() { return getToken(Anasint.PARENTESISCERRADO, 0); }
		public TerminalNode ARROW() { return getToken(Anasint.ARROW, 0); }
		public PrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterPrimitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitPrimitivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitPrimitivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitivoContext primitivo() throws RecognitionException {
		PrimitivoContext _localctx = new PrimitivoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primitivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(IDENTTIPO);
			setState(84);
			match(PARENTESISABIERTO);
			setState(85);
			match(IDENTVARIABLE);
			setState(86);
			match(PARENTESISCERRADO);
			setState(87);
			match(ARROW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_primitivoContext extends ParserRuleContext {
		public TerminalNode IDENTTIPO() { return getToken(Anasint.IDENTTIPO, 0); }
		public TerminalNode PARENTESISABIERTO() { return getToken(Anasint.PARENTESISABIERTO, 0); }
		public TerminalNode IDENTVARIABLE() { return getToken(Anasint.IDENTVARIABLE, 0); }
		public TerminalNode PARENTESISCERRADO() { return getToken(Anasint.PARENTESISCERRADO, 0); }
		public TerminalNode ARROW() { return getToken(Anasint.ARROW, 0); }
		public CuerpoTipoContext cuerpoTipo() {
			return getRuleContext(CuerpoTipoContext.class,0);
		}
		public No_primitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_primitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterNo_primitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitNo_primitivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitNo_primitivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_primitivoContext no_primitivo() throws RecognitionException {
		No_primitivoContext _localctx = new No_primitivoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_no_primitivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(IDENTTIPO);
			setState(90);
			match(PARENTESISABIERTO);
			setState(91);
			match(IDENTVARIABLE);
			setState(92);
			match(PARENTESISCERRADO);
			setState(93);
			match(ARROW);
			setState(94);
			cuerpoTipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CuerpoTipoContext extends ParserRuleContext {
		public TerminalNode IDENTTIPO() { return getToken(Anasint.IDENTTIPO, 0); }
		public TerminalNode PARENTESISABIERTO() { return getToken(Anasint.PARENTESISABIERTO, 0); }
		public TerminalNode IDENTVARIABLE() { return getToken(Anasint.IDENTVARIABLE, 0); }
		public TerminalNode PARENTESISCERRADO() { return getToken(Anasint.PARENTESISCERRADO, 0); }
		public TerminalNode AND() { return getToken(Anasint.AND, 0); }
		public CuerpoTipoContext cuerpoTipo() {
			return getRuleContext(CuerpoTipoContext.class,0);
		}
		public CuerpoTipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpoTipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCuerpoTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCuerpoTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCuerpoTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoTipoContext cuerpoTipo() throws RecognitionException {
		CuerpoTipoContext _localctx = new CuerpoTipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cuerpoTipo);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(IDENTTIPO);
				setState(97);
				match(PARENTESISABIERTO);
				setState(98);
				match(IDENTVARIABLE);
				setState(99);
				match(PARENTESISCERRADO);
				setState(100);
				match(AND);
				setState(101);
				cuerpoTipo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(IDENTTIPO);
				setState(103);
				match(PARENTESISABIERTO);
				setState(104);
				match(IDENTVARIABLE);
				setState(105);
				match(PARENTESISCERRADO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InicializacionContext extends ParserRuleContext {
		public TerminalNode INICIALIZACION() { return getToken(Anasint.INICIALIZACION, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(Anasint.DOSPUNTOS, 0); }
		public Decl_inicializacionesContext decl_inicializaciones() {
			return getRuleContext(Decl_inicializacionesContext.class,0);
		}
		public InicializacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterInicializacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitInicializacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitInicializacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacionContext inicializacion() throws RecognitionException {
		InicializacionContext _localctx = new InicializacionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inicializacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(INICIALIZACION);
			setState(109);
			match(DOSPUNTOS);
			setState(110);
			decl_inicializaciones();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_inicializacionesContext extends ParserRuleContext {
		public TerminalNode IDENTTIPO() { return getToken(Anasint.IDENTTIPO, 0); }
		public TerminalNode PARENTESISABIERTO() { return getToken(Anasint.PARENTESISABIERTO, 0); }
		public TerminalNode IDENTINDIVIDUOSREL() { return getToken(Anasint.IDENTINDIVIDUOSREL, 0); }
		public TerminalNode PARENTESISCERRADO() { return getToken(Anasint.PARENTESISCERRADO, 0); }
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public Decl_inicializacionesContext decl_inicializaciones() {
			return getRuleContext(Decl_inicializacionesContext.class,0);
		}
		public Decl_inicializacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_inicializaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDecl_inicializaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDecl_inicializaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDecl_inicializaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_inicializacionesContext decl_inicializaciones() throws RecognitionException {
		Decl_inicializacionesContext _localctx = new Decl_inicializacionesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decl_inicializaciones);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(IDENTTIPO);
				setState(113);
				match(PARENTESISABIERTO);
				setState(114);
				match(IDENTINDIVIDUOSREL);
				setState(115);
				match(PARENTESISCERRADO);
				setState(116);
				match(COMA);
				setState(117);
				decl_inicializaciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(IDENTTIPO);
				setState(119);
				match(PARENTESISABIERTO);
				setState(120);
				match(IDENTINDIVIDUOSREL);
				setState(121);
				match(PARENTESISCERRADO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescripcionesContext extends ParserRuleContext {
		public TerminalNode DESCRIPCIONES() { return getToken(Anasint.DESCRIPCIONES, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(Anasint.DOSPUNTOS, 0); }
		public List<Decl_descripcionContext> decl_descripcion() {
			return getRuleContexts(Decl_descripcionContext.class);
		}
		public Decl_descripcionContext decl_descripcion(int i) {
			return getRuleContext(Decl_descripcionContext.class,i);
		}
		public DescripcionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descripciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDescripciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDescripciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDescripciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescripcionesContext descripciones() throws RecognitionException {
		DescripcionesContext _localctx = new DescripcionesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_descripciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(DESCRIPCIONES);
			setState(125);
			match(DOSPUNTOS);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMERO) {
				{
				{
				setState(126);
				decl_descripcion();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_descripcionContext extends ParserRuleContext {
		public DescripcionContext descripcion() {
			return getRuleContext(DescripcionContext.class,0);
		}
		public List<ConsultaContext> consulta() {
			return getRuleContexts(ConsultaContext.class);
		}
		public ConsultaContext consulta(int i) {
			return getRuleContext(ConsultaContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public Decl_descripcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_descripcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDecl_descripcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDecl_descripcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDecl_descripcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_descripcionContext decl_descripcion() throws RecognitionException {
		Decl_descripcionContext _localctx = new Decl_descripcionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_decl_descripcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			descripcion();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERROGACION) {
				{
				setState(133);
				consulta();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(134);
					match(COMA);
					setState(135);
					consulta();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescripcionContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(Anasint.NUMERO, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(Anasint.DOSPUNTOS, 0); }
		public RelacionesBinariasContext relacionesBinarias() {
			return getRuleContext(RelacionesBinariasContext.class,0);
		}
		public DescripcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descripcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDescripcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDescripcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDescripcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescripcionContext descripcion() throws RecognitionException {
		DescripcionContext _localctx = new DescripcionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_descripcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(NUMERO);
			setState(144);
			match(DOSPUNTOS);
			setState(145);
			relacionesBinarias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelacionesBinariasContext extends ParserRuleContext {
		public List<TerminalNode> IDENTINDIVIDUOSREL() { return getTokens(Anasint.IDENTINDIVIDUOSREL); }
		public TerminalNode IDENTINDIVIDUOSREL(int i) {
			return getToken(Anasint.IDENTINDIVIDUOSREL, i);
		}
		public TerminalNode PARENTESISABIERTO() { return getToken(Anasint.PARENTESISABIERTO, 0); }
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public TerminalNode PARENTESISCERRADO() { return getToken(Anasint.PARENTESISCERRADO, 0); }
		public RelacionesBinariasContext relacionesBinarias() {
			return getRuleContext(RelacionesBinariasContext.class,0);
		}
		public RelacionesBinariasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacionesBinarias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterRelacionesBinarias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitRelacionesBinarias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitRelacionesBinarias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacionesBinariasContext relacionesBinarias() throws RecognitionException {
		RelacionesBinariasContext _localctx = new RelacionesBinariasContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relacionesBinarias);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(IDENTINDIVIDUOSREL);
				setState(148);
				match(PARENTESISABIERTO);
				setState(149);
				match(IDENTINDIVIDUOSREL);
				setState(150);
				match(COMA);
				setState(151);
				match(IDENTINDIVIDUOSREL);
				setState(152);
				match(PARENTESISCERRADO);
				setState(153);
				match(COMA);
				setState(154);
				relacionesBinarias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(IDENTINDIVIDUOSREL);
				setState(156);
				match(PARENTESISABIERTO);
				setState(157);
				match(IDENTINDIVIDUOSREL);
				setState(158);
				match(COMA);
				setState(159);
				match(IDENTINDIVIDUOSREL);
				setState(160);
				match(PARENTESISCERRADO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsultaContext extends ParserRuleContext {
		public TerminalNode INTERROGACION() { return getToken(Anasint.INTERROGACION, 0); }
		public TerminalNode IDENTVARIABLE() { return getToken(Anasint.IDENTVARIABLE, 0); }
		public TerminalNode TALQUE() { return getToken(Anasint.TALQUE, 0); }
		public TerminalNode PARENTESISABIERTO() { return getToken(Anasint.PARENTESISABIERTO, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARENTESISCERRADO() { return getToken(Anasint.PARENTESISCERRADO, 0); }
		public ConsultaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consulta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterConsulta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitConsulta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitConsulta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsultaContext consulta() throws RecognitionException {
		ConsultaContext _localctx = new ConsultaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_consulta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(INTERROGACION);
			setState(164);
			match(IDENTVARIABLE);
			setState(165);
			match(TALQUE);
			setState(166);
			match(PARENTESISABIERTO);
			setState(167);
			condicion(0);
			setState(168);
			match(PARENTESISCERRADO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionContext extends ParserRuleContext {
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	 
		public CondicionContext() { }
		public void copyFrom(CondicionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondClasicoContext extends CondicionContext {
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public Operador_logicoContext operador_logico() {
			return getRuleContext(Operador_logicoContext.class,0);
		}
		public CondClasicoContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondClasico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondClasico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondClasico(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondTipoContext extends CondicionContext {
		public TerminalNode IDENTTIPO() { return getToken(Anasint.IDENTTIPO, 0); }
		public TerminalNode PARENTESISABIERTO() { return getToken(Anasint.PARENTESISABIERTO, 0); }
		public TerminalNode IDENTVARIABLE() { return getToken(Anasint.IDENTVARIABLE, 0); }
		public TerminalNode PARENTESISCERRADO() { return getToken(Anasint.PARENTESISCERRADO, 0); }
		public CondTipoContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondTipo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondRelacionContext extends CondicionContext {
		public List<TerminalNode> IDENTINDIVIDUOSREL() { return getTokens(Anasint.IDENTINDIVIDUOSREL); }
		public TerminalNode IDENTINDIVIDUOSREL(int i) {
			return getToken(Anasint.IDENTINDIVIDUOSREL, i);
		}
		public TerminalNode PARENTESISABIERTO() { return getToken(Anasint.PARENTESISABIERTO, 0); }
		public TerminalNode IDENTVARIABLE() { return getToken(Anasint.IDENTVARIABLE, 0); }
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public TerminalNode PARENTESISCERRADO() { return getToken(Anasint.PARENTESISCERRADO, 0); }
		public CondRelacionContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondRelacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondRelacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondRelacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondParentesisContext extends CondicionContext {
		public TerminalNode PARENTESISABIERTO() { return getToken(Anasint.PARENTESISABIERTO, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARENTESISCERRADO() { return getToken(Anasint.PARENTESISCERRADO, 0); }
		public CondParentesisContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondParentesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		return condicion(0);
	}

	private CondicionContext condicion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicionContext _localctx = new CondicionContext(_ctx, _parentState);
		CondicionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_condicion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTESISABIERTO:
				{
				_localctx = new CondParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(171);
				match(PARENTESISABIERTO);
				setState(172);
				condicion(0);
				setState(173);
				match(PARENTESISCERRADO);
				}
				break;
			case IDENTTIPO:
				{
				_localctx = new CondTipoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(IDENTTIPO);
				setState(176);
				match(PARENTESISABIERTO);
				setState(177);
				match(IDENTVARIABLE);
				setState(178);
				match(PARENTESISCERRADO);
				}
				break;
			case IDENTINDIVIDUOSREL:
				{
				_localctx = new CondRelacionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(IDENTINDIVIDUOSREL);
				setState(180);
				match(PARENTESISABIERTO);
				setState(181);
				match(IDENTVARIABLE);
				setState(182);
				match(COMA);
				setState(183);
				match(IDENTINDIVIDUOSREL);
				setState(184);
				match(PARENTESISCERRADO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondClasicoContext(new CondicionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_condicion);
					setState(187);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(188);
					operador_logico();
					setState(189);
					condicion(3);
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Operador_logicoContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(Anasint.AND, 0); }
		public TerminalNode OR() { return getToken(Anasint.OR, 0); }
		public Operador_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterOperador_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitOperador_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitOperador_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_logicoContext operador_logico() throws RecognitionException {
		Operador_logicoContext _localctx = new Operador_logicoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operador_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return condicion_sempred((CondicionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condicion_sempred(CondicionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u00c9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6D\n\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bM\n\b\f\b\16\bP\13\b\3\t\3\t\5\tT\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fm\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16}\n\16\3\17\3\17\3\17\7\17\u0082"+
		"\n\17\f\17\16\17\u0085\13\17\3\20\3\20\3\20\3\20\7\20\u008b\n\20\f\20"+
		"\16\20\u008e\13\20\5\20\u0090\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00a4\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00bc\n\24\3\24\3\24\3\24"+
		"\3\24\7\24\u00c2\n\24\f\24\16\24\u00c5\13\24\3\25\3\25\3\25\2\3&\26\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\3\3\2\13\f\2\u00c1\2*\3"+
		"\2\2\2\4\61\3\2\2\2\69\3\2\2\2\b;\3\2\2\2\nC\3\2\2\2\fE\3\2\2\2\16I\3"+
		"\2\2\2\20S\3\2\2\2\22U\3\2\2\2\24[\3\2\2\2\26l\3\2\2\2\30n\3\2\2\2\32"+
		"|\3\2\2\2\34~\3\2\2\2\36\u0086\3\2\2\2 \u0091\3\2\2\2\"\u00a3\3\2\2\2"+
		"$\u00a5\3\2\2\2&\u00bb\3\2\2\2(\u00c6\3\2\2\2*+\7\3\2\2+,\5\4\3\2,-\5"+
		"\b\5\2-.\5\f\7\2./\5\30\r\2/\60\5\34\17\2\60\3\3\2\2\2\61\62\7\4\2\2\62"+
		"\63\7\17\2\2\63\64\5\6\4\2\64\5\3\2\2\2\65\66\7\21\2\2\66\67\7\20\2\2"+
		"\67:\5\6\4\28:\7\21\2\29\65\3\2\2\298\3\2\2\2:\7\3\2\2\2;<\7\5\2\2<=\7"+
		"\17\2\2=>\5\n\6\2>\t\3\2\2\2?@\7\21\2\2@A\7\20\2\2AD\5\n\6\2BD\7\21\2"+
		"\2C?\3\2\2\2CB\3\2\2\2D\13\3\2\2\2EF\7\6\2\2FG\7\17\2\2GH\5\16\b\2H\r"+
		"\3\2\2\2IN\5\20\t\2JK\7\20\2\2KM\5\20\t\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2"+
		"\2NO\3\2\2\2O\17\3\2\2\2PN\3\2\2\2QT\5\22\n\2RT\5\24\13\2SQ\3\2\2\2SR"+
		"\3\2\2\2T\21\3\2\2\2UV\7\22\2\2VW\7\r\2\2WX\7\23\2\2XY\7\16\2\2YZ\7\t"+
		"\2\2Z\23\3\2\2\2[\\\7\22\2\2\\]\7\r\2\2]^\7\23\2\2^_\7\16\2\2_`\7\t\2"+
		"\2`a\5\26\f\2a\25\3\2\2\2bc\7\22\2\2cd\7\r\2\2de\7\23\2\2ef\7\16\2\2f"+
		"g\7\13\2\2gm\5\26\f\2hi\7\22\2\2ij\7\r\2\2jk\7\23\2\2km\7\16\2\2lb\3\2"+
		"\2\2lh\3\2\2\2m\27\3\2\2\2no\7\7\2\2op\7\17\2\2pq\5\32\16\2q\31\3\2\2"+
		"\2rs\7\22\2\2st\7\r\2\2tu\7\21\2\2uv\7\16\2\2vw\7\20\2\2w}\5\32\16\2x"+
		"y\7\22\2\2yz\7\r\2\2z{\7\21\2\2{}\7\16\2\2|r\3\2\2\2|x\3\2\2\2}\33\3\2"+
		"\2\2~\177\7\b\2\2\177\u0083\7\17\2\2\u0080\u0082\5\36\20\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\35\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008f\5 \21\2\u0087\u008c\5$\23"+
		"\2\u0088\u0089\7\20\2\2\u0089\u008b\5$\23\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0090\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008f\u0087\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\37\3\2\2\2\u0091\u0092\7\25\2\2\u0092\u0093\7\17\2\2\u0093\u0094\5\""+
		"\22\2\u0094!\3\2\2\2\u0095\u0096\7\21\2\2\u0096\u0097\7\r\2\2\u0097\u0098"+
		"\7\21\2\2\u0098\u0099\7\20\2\2\u0099\u009a\7\21\2\2\u009a\u009b\7\16\2"+
		"\2\u009b\u009c\7\20\2\2\u009c\u00a4\5\"\22\2\u009d\u009e\7\21\2\2\u009e"+
		"\u009f\7\r\2\2\u009f\u00a0\7\21\2\2\u00a0\u00a1\7\20\2\2\u00a1\u00a2\7"+
		"\21\2\2\u00a2\u00a4\7\16\2\2\u00a3\u0095\3\2\2\2\u00a3\u009d\3\2\2\2\u00a4"+
		"#\3\2\2\2\u00a5\u00a6\7\n\2\2\u00a6\u00a7\7\23\2\2\u00a7\u00a8\7\24\2"+
		"\2\u00a8\u00a9\7\r\2\2\u00a9\u00aa\5&\24\2\u00aa\u00ab\7\16\2\2\u00ab"+
		"%\3\2\2\2\u00ac\u00ad\b\24\1\2\u00ad\u00ae\7\r\2\2\u00ae\u00af\5&\24\2"+
		"\u00af\u00b0\7\16\2\2\u00b0\u00bc\3\2\2\2\u00b1\u00b2\7\22\2\2\u00b2\u00b3"+
		"\7\r\2\2\u00b3\u00b4\7\23\2\2\u00b4\u00bc\7\16\2\2\u00b5\u00b6\7\21\2"+
		"\2\u00b6\u00b7\7\r\2\2\u00b7\u00b8\7\23\2\2\u00b8\u00b9\7\20\2\2\u00b9"+
		"\u00ba\7\21\2\2\u00ba\u00bc\7\16\2\2\u00bb\u00ac\3\2\2\2\u00bb\u00b1\3"+
		"\2\2\2\u00bb\u00b5\3\2\2\2\u00bc\u00c3\3\2\2\2\u00bd\u00be\f\4\2\2\u00be"+
		"\u00bf\5(\25\2\u00bf\u00c0\5&\24\5\u00c0\u00c2\3\2\2\2\u00c1\u00bd\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\'\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\t\2\2\2\u00c7)\3\2\2\2\169"+
		"CNSl|\u0083\u008c\u008f\u00a3\u00bb\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}