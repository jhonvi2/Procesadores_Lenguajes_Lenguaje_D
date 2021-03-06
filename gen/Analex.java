// Generated from /Users/juanvega/Downloads/juavegsec/src/Analex.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Analex extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SUBR", "PROGRAMA", "INDIVIDUOS", "RELACIONES", "TIPOS", "INICIALIZACION", 
			"DESCRIPCIONES", "ARROW", "INTERROGACION", "AND", "OR", "PARENTESISABIERTO", 
			"PARENTESISCERRADO", "DOSPUNTOS", "COMA", "IDENTINDIVIDUOSREL", "IDENTTIPO", 
			"IDENTVARIABLE", "TALQUE", "NUMERO", "BLANCO", "TABULADOR", "FIN_LINEA", 
			"COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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


	public Analex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00d9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\7\21\u008f\n\21\f\21\16\21\u0092\13"+
		"\21\3\22\3\22\7\22\u0096\n\22\f\22\16\22\u0099\13\22\3\23\3\23\3\23\7"+
		"\23\u009e\n\23\f\23\16\23\u00a1\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\6\25\u00ac\n\25\r\25\16\25\u00ad\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\30\5\30\u00b9\n\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\7\31\u00c3\n\31\f\31\16\31\u00c6\13\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\7\32\u00d1\n\32\f\32\16\32\u00d4\13\32\3\32\3\32"+
		"\3\32\3\32\4\u00c4\u00d2\2\33\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n"+
		"\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61"+
		"\31\63\32\3\2\b\3\2c|\6\2//\62;aac|\3\2C\\\7\2//\62;C\\aac|\4\2\62;c|"+
		"\3\2\62;\2\u00de\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3"+
		"\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\7@\3\2\2\2"+
		"\tK\3\2\2\2\13V\3\2\2\2\r\\\3\2\2\2\17k\3\2\2\2\21y\3\2\2\2\23|\3\2\2"+
		"\2\25~\3\2\2\2\27\u0081\3\2\2\2\31\u0084\3\2\2\2\33\u0086\3\2\2\2\35\u0088"+
		"\3\2\2\2\37\u008a\3\2\2\2!\u008c\3\2\2\2#\u0093\3\2\2\2%\u009a\3\2\2\2"+
		"\'\u00a2\3\2\2\2)\u00ab\3\2\2\2+\u00af\3\2\2\2-\u00b3\3\2\2\2/\u00b8\3"+
		"\2\2\2\61\u00be\3\2\2\2\63\u00cc\3\2\2\2\65\66\7a\2\2\66\4\3\2\2\2\67"+
		"8\7R\2\289\7T\2\29:\7Q\2\2:;\7I\2\2;<\7T\2\2<=\7C\2\2=>\7O\2\2>?\7C\2"+
		"\2?\6\3\2\2\2@A\7K\2\2AB\7P\2\2BC\7F\2\2CD\7K\2\2DE\7X\2\2EF\7K\2\2FG"+
		"\7F\2\2GH\7W\2\2HI\7Q\2\2IJ\7U\2\2J\b\3\2\2\2KL\7T\2\2LM\7G\2\2MN\7N\2"+
		"\2NO\7C\2\2OP\7E\2\2PQ\7K\2\2QR\7Q\2\2RS\7P\2\2ST\7G\2\2TU\7U\2\2U\n\3"+
		"\2\2\2VW\7V\2\2WX\7K\2\2XY\7R\2\2YZ\7Q\2\2Z[\7U\2\2[\f\3\2\2\2\\]\7K\2"+
		"\2]^\7P\2\2^_\7K\2\2_`\7E\2\2`a\7K\2\2ab\7C\2\2bc\7N\2\2cd\7K\2\2de\7"+
		"\\\2\2ef\7C\2\2fg\7E\2\2gh\7K\2\2hi\7Q\2\2ij\7P\2\2j\16\3\2\2\2kl\7F\2"+
		"\2lm\7G\2\2mn\7U\2\2no\7E\2\2op\7T\2\2pq\7K\2\2qr\7R\2\2rs\7E\2\2st\7"+
		"K\2\2tu\7Q\2\2uv\7P\2\2vw\7G\2\2wx\7U\2\2x\20\3\2\2\2yz\7>\2\2z{\7/\2"+
		"\2{\22\3\2\2\2|}\7A\2\2}\24\3\2\2\2~\177\7(\2\2\177\u0080\7(\2\2\u0080"+
		"\26\3\2\2\2\u0081\u0082\7~\2\2\u0082\u0083\7~\2\2\u0083\30\3\2\2\2\u0084"+
		"\u0085\7*\2\2\u0085\32\3\2\2\2\u0086\u0087\7+\2\2\u0087\34\3\2\2\2\u0088"+
		"\u0089\7<\2\2\u0089\36\3\2\2\2\u008a\u008b\7.\2\2\u008b \3\2\2\2\u008c"+
		"\u0090\t\2\2\2\u008d\u008f\t\3\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\"\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0097\t\4\2\2\u0094\u0096\t\5\2\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098$\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u009a\u009b\5\3\2\2\u009b\u009f\t\2\2\2\u009c\u009e"+
		"\t\6\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0&\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7v\2\2\u00a3"+
		"\u00a4\7c\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7\7s\2"+
		"\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7g\2\2\u00a9(\3\2\2\2\u00aa\u00ac\t"+
		"\7\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae*\3\2\2\2\u00af\u00b0\7\"\2\2\u00b0\u00b1\3\2\2\2"+
		"\u00b1\u00b2\b\26\2\2\u00b2,\3\2\2\2\u00b3\u00b4\7\13\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b6\b\27\2\2\u00b6.\3\2\2\2\u00b7\u00b9\7\17\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\f"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b\30\2\2\u00bd\60\3\2\2\2\u00be\u00bf"+
		"\7\61\2\2\u00bf\u00c0\7,\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00c3\13\2\2\2"+
		"\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7,\2\2\u00c8"+
		"\u00c9\7\61\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\31\2\2\u00cb\62\3\2"+
		"\2\2\u00cc\u00cd\7\61\2\2\u00cd\u00ce\7\61\2\2\u00ce\u00d2\3\2\2\2\u00cf"+
		"\u00d1\13\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d3\3"+
		"\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d6\5/\30\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b\32\2\2\u00d8\64\3\2\2"+
		"\2\n\2\u0090\u0097\u009f\u00ad\u00b8\u00c4\u00d2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}