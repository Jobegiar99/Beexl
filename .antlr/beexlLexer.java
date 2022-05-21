// Generated from c:\Users\berna\OneDrive\Documents\Compiladores\beexl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class beexlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, WS=22, FILENAME=23, READ=24, CREATE=25, 
		CANVAS=26, RGBA=27, VECTOR=28, FORMAT=29, BACKGROUND=30, VAR=31, FUNCTION=32, 
		VOID=33, MAIN=34, RETURN=35, PRINT=36, MAX_RED=37, MAX_BLUE=38, MAX_GREEN=39, 
		MAX_ALPHA=40, FILL=41, PNG=42, JPG=43, JPEG=44, X=45, Y=46, INT=47, FLOAT=48, 
		RED=49, GREEN=50, BLUE=51, ALPHA=52, IF=53, ELSE=54, FROM=55, TO=56, WHILE=57, 
		DO=58, CANVAS_WIDTH=59, CANVAS_HEIGHT=60, NUMBER=61, DECIMAL_NUMBER=62, 
		STRINGFILENAME=63, ID=64;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "WS", "FILENAME", "READ", "CREATE", 
			"CANVAS", "RGBA", "VECTOR", "FORMAT", "BACKGROUND", "VAR", "FUNCTION", 
			"VOID", "MAIN", "RETURN", "PRINT", "MAX_RED", "MAX_BLUE", "MAX_GREEN", 
			"MAX_ALPHA", "FILL", "PNG", "JPG", "JPEG", "X", "Y", "INT", "FLOAT", 
			"RED", "GREEN", "BLUE", "ALPHA", "IF", "ELSE", "FROM", "TO", "WHILE", 
			"DO", "CANVAS_WIDTH", "CANVAS_HEIGHT", "NUMBER", "DECIMAL_NUMBER", "STRINGFILENAME", 
			"ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'('", "')'", "':'", "'{'", "'}'", "'='", "'&&'", 
			"'||'", "'>'", "'<'", "'<='", "'>='", "'=='", "'!='", "'+'", "'-'", "'/'", 
			"'*'", "'.'", null, "'filename'", "'read'", "'create'", "'canvas'", "'rgba'", 
			"'vector'", "'format'", "'background'", "'var'", "'fun'", "'void'", "'main'", 
			"'return'", "'print'", "'MAX_RED'", "'MAX_BLUE'", "'MAX_GREEN'", "'MAX_ALPHA'", 
			"'fill'", "'.png'", "'.jpg'", "'.jpeg'", "'x'", "'y'", "'int'", "'float'", 
			"'r'", "'g'", "'b'", "'a'", "'if'", "'else'", "'from'", "'to'", "'while'", 
			"'do'", "'CANVAS_WIDTH'", "'CANVAS_HEIGHT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "WS", "FILENAME", 
			"READ", "CREATE", "CANVAS", "RGBA", "VECTOR", "FORMAT", "BACKGROUND", 
			"VAR", "FUNCTION", "VOID", "MAIN", "RETURN", "PRINT", "MAX_RED", "MAX_BLUE", 
			"MAX_GREEN", "MAX_ALPHA", "FILL", "PNG", "JPG", "JPEG", "X", "Y", "INT", 
			"FLOAT", "RED", "GREEN", "BLUE", "ALPHA", "IF", "ELSE", "FROM", "TO", 
			"WHILE", "DO", "CANVAS_WIDTH", "CANVAS_HEIGHT", "NUMBER", "DECIMAL_NUMBER", 
			"STRINGFILENAME", "ID"
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


	public beexlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "beexl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u01c2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\6\27\u00b5\n\27\r\27\16\27\u00b6\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3"+
		",\3,\3-\3-\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\3:\3:\3:\3:\3:\3:\3"+
		";\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3>\5>\u0199\n>\3>\6>\u019c\n>\r>\16>\u019d\3?\3?\3"+
		"?\6?\u01a3\n?\r?\16?\u01a4\3@\3@\6@\u01a9\n@\r@\16@\u01aa\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\5@\u01b8\n@\3@\3@\3A\3A\7A\u01be\nA\fA\16A\u01c1"+
		"\13A\3\u01aa\2B\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\3\2\6\5\2\13\f\17\17\"\"\3"+
		"\2\62;\4\2C\\c|\b\2)+--\62;C\\aac|\2\u01c9\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\3\u0083\3\2\2\2\5\u0085\3\2\2\2\7\u0087\3\2\2"+
		"\2\t\u0089\3\2\2\2\13\u008b\3\2\2\2\r\u008d\3\2\2\2\17\u008f\3\2\2\2\21"+
		"\u0091\3\2\2\2\23\u0093\3\2\2\2\25\u0096\3\2\2\2\27\u0099\3\2\2\2\31\u009b"+
		"\3\2\2\2\33\u009d\3\2\2\2\35\u00a0\3\2\2\2\37\u00a3\3\2\2\2!\u00a6\3\2"+
		"\2\2#\u00a9\3\2\2\2%\u00ab\3\2\2\2\'\u00ad\3\2\2\2)\u00af\3\2\2\2+\u00b1"+
		"\3\2\2\2-\u00b4\3\2\2\2/\u00ba\3\2\2\2\61\u00c3\3\2\2\2\63\u00c8\3\2\2"+
		"\2\65\u00cf\3\2\2\2\67\u00d6\3\2\2\29\u00db\3\2\2\2;\u00e2\3\2\2\2=\u00e9"+
		"\3\2\2\2?\u00f4\3\2\2\2A\u00f8\3\2\2\2C\u00fc\3\2\2\2E\u0101\3\2\2\2G"+
		"\u0106\3\2\2\2I\u010d\3\2\2\2K\u0113\3\2\2\2M\u011b\3\2\2\2O\u0124\3\2"+
		"\2\2Q\u012e\3\2\2\2S\u0138\3\2\2\2U\u013d\3\2\2\2W\u0142\3\2\2\2Y\u0147"+
		"\3\2\2\2[\u014d\3\2\2\2]\u014f\3\2\2\2_\u0151\3\2\2\2a\u0155\3\2\2\2c"+
		"\u015b\3\2\2\2e\u015d\3\2\2\2g\u015f\3\2\2\2i\u0161\3\2\2\2k\u0163\3\2"+
		"\2\2m\u0166\3\2\2\2o\u016b\3\2\2\2q\u0170\3\2\2\2s\u0173\3\2\2\2u\u0179"+
		"\3\2\2\2w\u017c\3\2\2\2y\u0189\3\2\2\2{\u0198\3\2\2\2}\u019f\3\2\2\2\177"+
		"\u01a6\3\2\2\2\u0081\u01bb\3\2\2\2\u0083\u0084\7=\2\2\u0084\4\3\2\2\2"+
		"\u0085\u0086\7.\2\2\u0086\6\3\2\2\2\u0087\u0088\7*\2\2\u0088\b\3\2\2\2"+
		"\u0089\u008a\7+\2\2\u008a\n\3\2\2\2\u008b\u008c\7<\2\2\u008c\f\3\2\2\2"+
		"\u008d\u008e\7}\2\2\u008e\16\3\2\2\2\u008f\u0090\7\177\2\2\u0090\20\3"+
		"\2\2\2\u0091\u0092\7?\2\2\u0092\22\3\2\2\2\u0093\u0094\7(\2\2\u0094\u0095"+
		"\7(\2\2\u0095\24\3\2\2\2\u0096\u0097\7~\2\2\u0097\u0098\7~\2\2\u0098\26"+
		"\3\2\2\2\u0099\u009a\7@\2\2\u009a\30\3\2\2\2\u009b\u009c\7>\2\2\u009c"+
		"\32\3\2\2\2\u009d\u009e\7>\2\2\u009e\u009f\7?\2\2\u009f\34\3\2\2\2\u00a0"+
		"\u00a1\7@\2\2\u00a1\u00a2\7?\2\2\u00a2\36\3\2\2\2\u00a3\u00a4\7?\2\2\u00a4"+
		"\u00a5\7?\2\2\u00a5 \3\2\2\2\u00a6\u00a7\7#\2\2\u00a7\u00a8\7?\2\2\u00a8"+
		"\"\3\2\2\2\u00a9\u00aa\7-\2\2\u00aa$\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac"+
		"&\3\2\2\2\u00ad\u00ae\7\61\2\2\u00ae(\3\2\2\2\u00af\u00b0\7,\2\2\u00b0"+
		"*\3\2\2\2\u00b1\u00b2\7\60\2\2\u00b2,\3\2\2\2\u00b3\u00b5\t\2\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\b\27\2\2\u00b9.\3\2\2\2\u00ba\u00bb"+
		"\7h\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7g\2\2\u00be"+
		"\u00bf\7p\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7o\2\2\u00c1\u00c2\7g\2\2"+
		"\u00c2\60\3\2\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7"+
		"c\2\2\u00c6\u00c7\7f\2\2\u00c7\62\3\2\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca"+
		"\7t\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7v\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ce\64\3\2\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7c\2\2\u00d1"+
		"\u00d2\7p\2\2\u00d2\u00d3\7x\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7u\2\2"+
		"\u00d5\66\3\2\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7i\2\2\u00d8\u00d9\7"+
		"d\2\2\u00d9\u00da\7c\2\2\u00da8\3\2\2\2\u00db\u00dc\7x\2\2\u00dc\u00dd"+
		"\7g\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7q\2\2\u00e0"+
		"\u00e1\7t\2\2\u00e1:\3\2\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7q\2\2\u00e4"+
		"\u00e5\7t\2\2\u00e5\u00e6\7o\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7v\2\2"+
		"\u00e8<\3\2\2\2\u00e9\u00ea\7d\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7e\2"+
		"\2\u00ec\u00ed\7m\2\2\u00ed\u00ee\7i\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0"+
		"\7q\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7f\2\2\u00f3"+
		">\3\2\2\2\u00f4\u00f5\7x\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7t\2\2\u00f7"+
		"@\3\2\2\2\u00f8\u00f9\7h\2\2\u00f9\u00fa\7w\2\2\u00fa\u00fb\7p\2\2\u00fb"+
		"B\3\2\2\2\u00fc\u00fd\7x\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7k\2\2\u00ff"+
		"\u0100\7f\2\2\u0100D\3\2\2\2\u0101\u0102\7o\2\2\u0102\u0103\7c\2\2\u0103"+
		"\u0104\7k\2\2\u0104\u0105\7p\2\2\u0105F\3\2\2\2\u0106\u0107\7t\2\2\u0107"+
		"\u0108\7g\2\2\u0108\u0109\7v\2\2\u0109\u010a\7w\2\2\u010a\u010b\7t\2\2"+
		"\u010b\u010c\7p\2\2\u010cH\3\2\2\2\u010d\u010e\7r\2\2\u010e\u010f\7t\2"+
		"\2\u010f\u0110\7k\2\2\u0110\u0111\7p\2\2\u0111\u0112\7v\2\2\u0112J\3\2"+
		"\2\2\u0113\u0114\7O\2\2\u0114\u0115\7C\2\2\u0115\u0116\7Z\2\2\u0116\u0117"+
		"\7a\2\2\u0117\u0118\7T\2\2\u0118\u0119\7G\2\2\u0119\u011a\7F\2\2\u011a"+
		"L\3\2\2\2\u011b\u011c\7O\2\2\u011c\u011d\7C\2\2\u011d\u011e\7Z\2\2\u011e"+
		"\u011f\7a\2\2\u011f\u0120\7D\2\2\u0120\u0121\7N\2\2\u0121\u0122\7W\2\2"+
		"\u0122\u0123\7G\2\2\u0123N\3\2\2\2\u0124\u0125\7O\2\2\u0125\u0126\7C\2"+
		"\2\u0126\u0127\7Z\2\2\u0127\u0128\7a\2\2\u0128\u0129\7I\2\2\u0129\u012a"+
		"\7T\2\2\u012a\u012b\7G\2\2\u012b\u012c\7G\2\2\u012c\u012d\7P\2\2\u012d"+
		"P\3\2\2\2\u012e\u012f\7O\2\2\u012f\u0130\7C\2\2\u0130\u0131\7Z\2\2\u0131"+
		"\u0132\7a\2\2\u0132\u0133\7C\2\2\u0133\u0134\7N\2\2\u0134\u0135\7R\2\2"+
		"\u0135\u0136\7J\2\2\u0136\u0137\7C\2\2\u0137R\3\2\2\2\u0138\u0139\7h\2"+
		"\2\u0139\u013a\7k\2\2\u013a\u013b\7n\2\2\u013b\u013c\7n\2\2\u013cT\3\2"+
		"\2\2\u013d\u013e\7\60\2\2\u013e\u013f\7r\2\2\u013f\u0140\7p\2\2\u0140"+
		"\u0141\7i\2\2\u0141V\3\2\2\2\u0142\u0143\7\60\2\2\u0143\u0144\7l\2\2\u0144"+
		"\u0145\7r\2\2\u0145\u0146\7i\2\2\u0146X\3\2\2\2\u0147\u0148\7\60\2\2\u0148"+
		"\u0149\7l\2\2\u0149\u014a\7r\2\2\u014a\u014b\7g\2\2\u014b\u014c\7i\2\2"+
		"\u014cZ\3\2\2\2\u014d\u014e\7z\2\2\u014e\\\3\2\2\2\u014f\u0150\7{\2\2"+
		"\u0150^\3\2\2\2\u0151\u0152\7k\2\2\u0152\u0153\7p\2\2\u0153\u0154\7v\2"+
		"\2\u0154`\3\2\2\2\u0155\u0156\7h\2\2\u0156\u0157\7n\2\2\u0157\u0158\7"+
		"q\2\2\u0158\u0159\7c\2\2\u0159\u015a\7v\2\2\u015ab\3\2\2\2\u015b\u015c"+
		"\7t\2\2\u015cd\3\2\2\2\u015d\u015e\7i\2\2\u015ef\3\2\2\2\u015f\u0160\7"+
		"d\2\2\u0160h\3\2\2\2\u0161\u0162\7c\2\2\u0162j\3\2\2\2\u0163\u0164\7k"+
		"\2\2\u0164\u0165\7h\2\2\u0165l\3\2\2\2\u0166\u0167\7g\2\2\u0167\u0168"+
		"\7n\2\2\u0168\u0169\7u\2\2\u0169\u016a\7g\2\2\u016an\3\2\2\2\u016b\u016c"+
		"\7h\2\2\u016c\u016d\7t\2\2\u016d\u016e\7q\2\2\u016e\u016f\7o\2\2\u016f"+
		"p\3\2\2\2\u0170\u0171\7v\2\2\u0171\u0172\7q\2\2\u0172r\3\2\2\2\u0173\u0174"+
		"\7y\2\2\u0174\u0175\7j\2\2\u0175\u0176\7k\2\2\u0176\u0177\7n\2\2\u0177"+
		"\u0178\7g\2\2\u0178t\3\2\2\2\u0179\u017a\7f\2\2\u017a\u017b\7q\2\2\u017b"+
		"v\3\2\2\2\u017c\u017d\7E\2\2\u017d\u017e\7C\2\2\u017e\u017f\7P\2\2\u017f"+
		"\u0180\7X\2\2\u0180\u0181\7C\2\2\u0181\u0182\7U\2\2\u0182\u0183\7a\2\2"+
		"\u0183\u0184\7Y\2\2\u0184\u0185\7K\2\2\u0185\u0186\7F\2\2\u0186\u0187"+
		"\7V\2\2\u0187\u0188\7J\2\2\u0188x\3\2\2\2\u0189\u018a\7E\2\2\u018a\u018b"+
		"\7C\2\2\u018b\u018c\7P\2\2\u018c\u018d\7X\2\2\u018d\u018e\7C\2\2\u018e"+
		"\u018f\7U\2\2\u018f\u0190\7a\2\2\u0190\u0191\7J\2\2\u0191\u0192\7G\2\2"+
		"\u0192\u0193\7K\2\2\u0193\u0194\7I\2\2\u0194\u0195\7J\2\2\u0195\u0196"+
		"\7V\2\2\u0196z\3\2\2\2\u0197\u0199\7/\2\2\u0198\u0197\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u019c\t\3\2\2\u019b\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e|\3\2\2\2"+
		"\u019f\u01a0\5{>\2\u01a0\u01a2\7\60\2\2\u01a1\u01a3\t\3\2\2\u01a2\u01a1"+
		"\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"~\3\2\2\2\u01a6\u01a8\7$\2\2\u01a7\u01a9\13\2\2\2\u01a8\u01a7\3\2\2\2"+
		"\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac\u01b7\7\60\2\2\u01ad\u01ae\7r\2\2\u01ae\u01af\7p\2\2\u01af"+
		"\u01b8\7i\2\2\u01b0\u01b1\7l\2\2\u01b1\u01b2\7r\2\2\u01b2\u01b8\7i\2\2"+
		"\u01b3\u01b4\7l\2\2\u01b4\u01b5\7r\2\2\u01b5\u01b6\7g\2\2\u01b6\u01b8"+
		"\7i\2\2\u01b7\u01ad\3\2\2\2\u01b7\u01b0\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01ba\7$\2\2\u01ba\u0080\3\2\2\2\u01bb\u01bf\t\4"+
		"\2\2\u01bc\u01be\t\5\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u0082\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\n\2\u00b6\u0198\u019d\u01a4\u01aa\u01b7\u01bf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}