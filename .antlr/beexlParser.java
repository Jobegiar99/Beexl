// Generated from c:\Users\DC99_\Documents\Semestre8\Compiladores\La wea\Beexl\beexl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class beexlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, FILENAME=26, READ=27, CREATE=28, CANVAS=29, HEX=30, RGBA=31, 
		VECTOR=32, FORMAT=33, BACKGROUND=34, VAR=35, FUNCTION=36, VOID=37, MAIN=38, 
		RETURN=39, X=40, Y=41, RED=42, GREEN=43, BLUE=44, ALPHA=45, IF=46, ELSE=47, 
		FROM=48, TO=49, DO=50, CANVAS_WIDTH=51, CANVAS_HEIGHT=52, A_HEX=53, B_HEX=54, 
		C_HEX=55, D_HEX=56, E_HEX=57, F_HEX=58, ID=59, DIGIT=60, NUMBER=61, MAX_RED=62, 
		MAX_BLUE=63, MAX_GREEN=64, MAX_ALPHA=65, FILL=66, WS=67, PRINT=68;
	public static final int
		RULE_fileconfig0 = 0, RULE_fileconfig1 = 1, RULE_fileconfig11 = 2, RULE_fileconfig12 = 3, 
		RULE_fileconfig2 = 4, RULE_file0 = 5, RULE_file1 = 6, RULE_canvas0 = 7, 
		RULE_background0 = 8, RULE_background1 = 9, RULE_colorFormat0 = 10, RULE_colorType0 = 11, 
		RULE_type0 = 12, RULE_rgba0 = 13, RULE_rgba1 = 14, RULE_rgba2 = 15, RULE_cExtras0 = 16, 
		RULE_hex0 = 17, RULE_hex1 = 18, RULE_hex2 = 19, RULE_hexChar0 = 20, RULE_vector0 = 21, 
		RULE_vector1 = 22, RULE_vector2 = 23, RULE_vExtras0 = 24, RULE_vars0 = 25, 
		RULE_vars1 = 26, RULE_vars11 = 27, RULE_vars12 = 28, RULE_instruction0 = 29, 
		RULE_extras0 = 30, RULE_assignment20 = 31, RULE_assignment21 = 32, RULE_pixelFill0 = 33, 
		RULE_pixelFill2 = 34, RULE_pixelFill1 = 35, RULE_assignment0 = 36, RULE_print0 = 37, 
		RULE_conditional0 = 38, RULE_hyperExp0 = 39, RULE_superExp1 = 40, RULE_superExp2 = 41, 
		RULE_superExp3 = 42, RULE_superExp0 = 43, RULE_exp1 = 44, RULE_exp2 = 45, 
		RULE_exp3 = 46, RULE_exp0 = 47, RULE_term1 = 48, RULE_term2 = 49, RULE_term3 = 50, 
		RULE_term0 = 51, RULE_factor1 = 52, RULE_factor2 = 53, RULE_factor3 = 54, 
		RULE_factor0 = 55, RULE_cycle0 = 56, RULE_cycle1 = 57, RULE_vectorOperation0 = 58, 
		RULE_vectorOperation1 = 59, RULE_vectorAttribute0 = 60, RULE_vectorAttribute1 = 61, 
		RULE_rgbaOperation0 = 62, RULE_rgbaOperation1 = 63, RULE_rgbaAttribute0 = 64, 
		RULE_rgbaAttribute1 = 65, RULE_hexOperation0 = 66, RULE_hexOperation1 = 67, 
		RULE_hexAttribute0 = 68, RULE_hexAttribute1 = 69, RULE_block0 = 70, RULE_block1 = 71, 
		RULE_main0 = 72, RULE_body0 = 73, RULE_functionCall0 = 74, RULE_functionCall1 = 75;
	private static String[] makeRuleNames() {
		return new String[] {
			"fileconfig0", "fileconfig1", "fileconfig11", "fileconfig12", "fileconfig2", 
			"file0", "file1", "canvas0", "background0", "background1", "colorFormat0", 
			"colorType0", "type0", "rgba0", "rgba1", "rgba2", "cExtras0", "hex0", 
			"hex1", "hex2", "hexChar0", "vector0", "vector1", "vector2", "vExtras0", 
			"vars0", "vars1", "vars11", "vars12", "instruction0", "extras0", "assignment20", 
			"assignment21", "pixelFill0", "pixelFill2", "pixelFill1", "assignment0", 
			"print0", "conditional0", "hyperExp0", "superExp1", "superExp2", "superExp3", 
			"superExp0", "exp1", "exp2", "exp3", "exp0", "term1", "term2", "term3", 
			"term0", "factor1", "factor2", "factor3", "factor0", "cycle0", "cycle1", 
			"vectorOperation0", "vectorOperation1", "vectorAttribute0", "vectorAttribute1", 
			"rgbaOperation0", "rgbaOperation1", "rgbaAttribute0", "rgbaAttribute1", 
			"hexOperation0", "hexOperation1", "hexAttribute0", "hexAttribute1", "block0", 
			"block1", "main0", "body0", "functionCall0", "functionCall1"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'\"'", "'.png.'", "'.jpg'", "'.jpeg'", "','", "'('", "')'", 
			"'#'", "':'", "'='", "'{'", "'}'", "'&&'", "'||'", "'=='", "'<='", "'>='", 
			"'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'.'", "'filename'", "'read'", 
			"'create'", "'canvas'", "'hex'", "'rgba'", "'vector'", "'format'", "'background'", 
			"'var'", "'fun'", "'void'", "'main'", "'return'", "'x'", "'y'", "'r'", 
			"'g'", "'b'", "'a'", "'if'", "'else'", "'from'", "'to'", "'do'", "'CANVAS_WIDTH'", 
			"'CANVAS_HEIGHT'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", null, null, 
			null, "'MAX_RED'", "'MAX_BLUE'", "'MAX_GREEN'", "'MAX_ALPHA'", "'fill'", 
			null, "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "FILENAME", "READ", "CREATE", "CANVAS", "HEX", "RGBA", "VECTOR", 
			"FORMAT", "BACKGROUND", "VAR", "FUNCTION", "VOID", "MAIN", "RETURN", 
			"X", "Y", "RED", "GREEN", "BLUE", "ALPHA", "IF", "ELSE", "FROM", "TO", 
			"DO", "CANVAS_WIDTH", "CANVAS_HEIGHT", "A_HEX", "B_HEX", "C_HEX", "D_HEX", 
			"E_HEX", "F_HEX", "ID", "DIGIT", "NUMBER", "MAX_RED", "MAX_BLUE", "MAX_GREEN", 
			"MAX_ALPHA", "FILL", "WS", "PRINT"
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
	public String getGrammarFileName() { return "beexl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public beexlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Fileconfig0Context extends ParserRuleContext {
		public TerminalNode FILENAME() { return getToken(beexlParser.FILENAME, 0); }
		public Fileconfig1Context fileconfig1() {
			return getRuleContext(Fileconfig1Context.class,0);
		}
		public Fileconfig2Context fileconfig2() {
			return getRuleContext(Fileconfig2Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(beexlParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(beexlParser.WS, i);
		}
		public Fileconfig0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileconfig0; }
	}

	public final Fileconfig0Context fileconfig0() throws RecognitionException {
		Fileconfig0Context _localctx = new Fileconfig0Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_fileconfig0);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(152);
				match(WS);
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			match(FILENAME);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(159);
				match(WS);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			fileconfig1();
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(166);
					match(WS);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(172);
			fileconfig2();
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

	public static class Fileconfig1Context extends ParserRuleContext {
		public TerminalNode READ() { return getToken(beexlParser.READ, 0); }
		public Fileconfig11Context fileconfig11() {
			return getRuleContext(Fileconfig11Context.class,0);
		}
		public TerminalNode CREATE() { return getToken(beexlParser.CREATE, 0); }
		public Fileconfig12Context fileconfig12() {
			return getRuleContext(Fileconfig12Context.class,0);
		}
		public Fileconfig1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileconfig1; }
	}

	public final Fileconfig1Context fileconfig1() throws RecognitionException {
		Fileconfig1Context _localctx = new Fileconfig1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_fileconfig1);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(READ);
				setState(175);
				fileconfig11();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(CREATE);
				setState(177);
				fileconfig12();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Fileconfig11Context extends ParserRuleContext {
		public File0Context file0() {
			return getRuleContext(File0Context.class,0);
		}
		public ColorFormat0Context colorFormat0() {
			return getRuleContext(ColorFormat0Context.class,0);
		}
		public Fileconfig11Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileconfig11; }
	}

	public final Fileconfig11Context fileconfig11() throws RecognitionException {
		Fileconfig11Context _localctx = new Fileconfig11Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_fileconfig11);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			file0();
			setState(181);
			match(T__0);
			setState(182);
			colorFormat0();
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

	public static class Fileconfig12Context extends ParserRuleContext {
		public File0Context file0() {
			return getRuleContext(File0Context.class,0);
		}
		public Canvas0Context canvas0() {
			return getRuleContext(Canvas0Context.class,0);
		}
		public ColorFormat0Context colorFormat0() {
			return getRuleContext(ColorFormat0Context.class,0);
		}
		public Background0Context background0() {
			return getRuleContext(Background0Context.class,0);
		}
		public Fileconfig12Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileconfig12; }
	}

	public final Fileconfig12Context fileconfig12() throws RecognitionException {
		Fileconfig12Context _localctx = new Fileconfig12Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_fileconfig12);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			file0();
			setState(185);
			match(T__0);
			setState(186);
			canvas0();
			setState(187);
			colorFormat0();
			setState(188);
			background0();
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

	public static class Fileconfig2Context extends ParserRuleContext {
		public Vars0Context vars0() {
			return getRuleContext(Vars0Context.class,0);
		}
		public Fileconfig2Context fileconfig2() {
			return getRuleContext(Fileconfig2Context.class,0);
		}
		public Body0Context body0() {
			return getRuleContext(Body0Context.class,0);
		}
		public Fileconfig2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileconfig2; }
	}

	public final Fileconfig2Context fileconfig2() throws RecognitionException {
		Fileconfig2Context _localctx = new Fileconfig2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_fileconfig2);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case WS:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				vars0();
				setState(191);
				fileconfig2();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				body0();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class File0Context extends ParserRuleContext {
		public File1Context file1() {
			return getRuleContext(File1Context.class,0);
		}
		public File0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file0; }
	}

	public final File0Context file0() throws RecognitionException {
		File0Context _localctx = new File0Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_file0);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					matchWildcard();
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(203);
			file1();
			setState(204);
			match(T__1);
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

	public static class File1Context extends ParserRuleContext {
		public File1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file1; }
	}

	public final File1Context file1() throws RecognitionException {
		File1Context _localctx = new File1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_file1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
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

	public static class Canvas0Context extends ParserRuleContext {
		public TerminalNode CANVAS() { return getToken(beexlParser.CANVAS, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(beexlParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(beexlParser.NUMBER, i);
		}
		public List<TerminalNode> WS() { return getTokens(beexlParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(beexlParser.WS, i);
		}
		public Canvas0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canvas0; }
	}

	public final Canvas0Context canvas0() throws RecognitionException {
		Canvas0Context _localctx = new Canvas0Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_canvas0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(208);
				match(WS);
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(CANVAS);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(215);
				match(WS);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(NUMBER);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(222);
				match(WS);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(T__5);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(229);
				match(WS);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(NUMBER);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(236);
				match(WS);
				}
				}
				setState(241);
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

	public static class Background0Context extends ParserRuleContext {
		public TerminalNode BACKGROUND() { return getToken(beexlParser.BACKGROUND, 0); }
		public Background1Context background1() {
			return getRuleContext(Background1Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(beexlParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(beexlParser.WS, i);
		}
		public Background0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_background0; }
	}

	public final Background0Context background0() throws RecognitionException {
		Background0Context _localctx = new Background0Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_background0);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(242);
				match(WS);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(BACKGROUND);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					match(WS);
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(255);
			background1();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(256);
				match(WS);
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(T__0);
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

	public static class Background1Context extends ParserRuleContext {
		public Hex0Context hex0() {
			return getRuleContext(Hex0Context.class,0);
		}
		public Rgba0Context rgba0() {
			return getRuleContext(Rgba0Context.class,0);
		}
		public Background1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_background1; }
	}

	public final Background1Context background1() throws RecognitionException {
		Background1Context _localctx = new Background1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_background1);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				hex0();
				}
				break;
			case RGBA:
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				rgba0();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ColorFormat0Context extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(beexlParser.FORMAT, 0); }
		public ColorType0Context colorType0() {
			return getRuleContext(ColorType0Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(beexlParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(beexlParser.WS, i);
		}
		public ColorFormat0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorFormat0; }
	}

	public final ColorFormat0Context colorFormat0() throws RecognitionException {
		ColorFormat0Context _localctx = new ColorFormat0Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_colorFormat0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(FORMAT);
			setState(269);
			colorType0();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(270);
				match(WS);
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(T__0);
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

	public static class ColorType0Context extends ParserRuleContext {
		public TerminalNode RGBA() { return getToken(beexlParser.RGBA, 0); }
		public TerminalNode HEX() { return getToken(beexlParser.HEX, 0); }
		public ColorType0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorType0; }
	}

	public final ColorType0Context colorType0() throws RecognitionException {
		ColorType0Context _localctx = new ColorType0Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_colorType0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !(_la==HEX || _la==RGBA) ) {
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

	public static class Type0Context extends ParserRuleContext {
		public TerminalNode VECTOR() { return getToken(beexlParser.VECTOR, 0); }
		public List<TerminalNode> WS() { return getTokens(beexlParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(beexlParser.WS, i);
		}
		public ColorType0Context colorType0() {
			return getRuleContext(ColorType0Context.class,0);
		}
		public Type0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type0; }
	}

	public final Type0Context type0() throws RecognitionException {
		Type0Context _localctx = new Type0Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_type0);
		int _la;
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VECTOR:
			case WS:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(280);
					match(WS);
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(286);
				match(VECTOR);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(287);
					match(WS);
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case HEX:
			case RGBA:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				colorType0();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Rgba0Context extends ParserRuleContext {
		public TerminalNode RGBA() { return getToken(beexlParser.RGBA, 0); }
		public Rgba1Context rgba1() {
			return getRuleContext(Rgba1Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(beexlParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(beexlParser.WS, i);
		}
		public Rgba0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgba0; }
	}

	public final Rgba0Context rgba0() throws RecognitionException {
		Rgba0Context _localctx = new Rgba0Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_rgba0);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(296);
				match(WS);
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
			match(RGBA);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(303);
				match(WS);
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			match(T__6);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(310);
					match(WS);
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(316);
			rgba1();
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

	public static class Rgba1Context extends ParserRuleContext {
		public Rgba2Context rgba2() {
			return getRuleContext(Rgba2Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(beexlParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(beexlParser.WS, i);
		}
		public Rgba1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgba1; }
	}

	public final Rgba1Context rgba1() throws RecognitionException {
		Rgba1Context _localctx = new Rgba1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_rgba1);
		int _la;
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				rgba2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(319);
					match(WS);
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(325);
				match(T__7);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(326);
					match(WS);
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(332);
				match(T__0);
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

	public static class Rgba2Context extends ParserRuleContext {
		public CExtras0Context cExtras0() {
			return getRuleContext(CExtras0Context.class,0);
		}
		public TerminalNode NUMBER() { return getToken(beexlParser.NUMBER, 0); }
		public Rgba2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgba2; }
	}

	public final Rgba2Context rgba2() throws RecognitionException {
		Rgba2Context _localctx = new Rgba2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_rgba2);
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAX_RED:
			case MAX_BLUE:
			case MAX_GREEN:
			case MAX_ALPHA:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				cExtras0();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(NUMBER);
				}
				break;
			case T__0:
			case WS:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CExtras0Context extends ParserRuleContext {
		public TerminalNode MAX_RED() { return getToken(beexlParser.MAX_RED, 0); }
		public TerminalNode MAX_BLUE() { return getToken(beexlParser.MAX_BLUE, 0); }
		public TerminalNode MAX_GREEN() { return getToken(beexlParser.MAX_GREEN, 0); }
		public TerminalNode MAX_ALPHA() { return getToken(beexlParser.MAX_ALPHA, 0); }
		public CExtras0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cExtras0; }
	}

	public final CExtras0Context cExtras0() throws RecognitionException {
		CExtras0Context _localctx = new CExtras0Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_cExtras0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (MAX_RED - 62)) | (1L << (MAX_BLUE - 62)) | (1L << (MAX_GREEN - 62)) | (1L << (MAX_ALPHA - 62)))) != 0)) ) {
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

	public static class Hex0Context extends ParserRuleContext {
		public Hex0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex0; }
	}

	public final Hex0Context hex0() throws RecognitionException {
		Hex0Context _localctx = new Hex0Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_hex0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(T__8);
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

	public static class Hex1Context extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(beexlParser.DIGIT, 0); }
		public Hex2Context hex2() {
			return getRuleContext(Hex2Context.class,0);
		}
		public HexChar0Context hexChar0() {
			return getRuleContext(HexChar0Context.class,0);
		}
		public Hex1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex1; }
	}

	public final Hex1Context hex1() throws RecognitionException {
		Hex1Context _localctx = new Hex1Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_hex1);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(DIGIT);
				setState(345);
				hex2();
				}
				break;
			case A_HEX:
			case B_HEX:
			case C_HEX:
			case D_HEX:
			case E_HEX:
			case F_HEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				hexChar0();
				setState(347);
				hex2();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Hex2Context extends ParserRuleContext {
		public Hex1Context hex1() {
			return getRuleContext(Hex1Context.class,0);
		}
		public Hex2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex2; }
	}

	public final Hex2Context hex2() throws RecognitionException {
		Hex2Context _localctx = new Hex2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_hex2);
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				hex1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class HexChar0Context extends ParserRuleContext {
		public TerminalNode A_HEX() { return getToken(beexlParser.A_HEX, 0); }
		public TerminalNode B_HEX() { return getToken(beexlParser.B_HEX, 0); }
		public TerminalNode C_HEX() { return getToken(beexlParser.C_HEX, 0); }
		public TerminalNode D_HEX() { return getToken(beexlParser.D_HEX, 0); }
		public TerminalNode E_HEX() { return getToken(beexlParser.E_HEX, 0); }
		public TerminalNode F_HEX() { return getToken(beexlParser.F_HEX, 0); }
		public HexChar0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexChar0; }
	}

	public final HexChar0Context hexChar0() throws RecognitionException {
		HexChar0Context _localctx = new HexChar0Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_hexChar0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A_HEX) | (1L << B_HEX) | (1L << C_HEX) | (1L << D_HEX) | (1L << E_HEX) | (1L << F_HEX))) != 0)) ) {
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

	public static class Vector0Context extends ParserRuleContext {
		public TerminalNode VECTOR() { return getToken(beexlParser.VECTOR, 0); }
		public Vector1Context vector1() {
			return getRuleContext(Vector1Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(beexlParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(beexlParser.WS, i);
		}
		public Vector0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector0; }
	}

	public final Vector0Context vector0() throws RecognitionException {
		Vector0Context _localctx = new Vector0Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_vector0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(357);
				match(WS);
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			match(VECTOR);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(364);
				match(WS);
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
			match(T__6);
			setState(371);
			vector1();
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

	public static class Vector1Context extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(beexlParser.NUMBER, 0); }
		public Vector2Context vector2() {
			return getRuleContext(Vector2Context.class,0);
		}
		public VExtras0Context vExtras0() {
			return getRuleContext(VExtras0Context.class,0);
		}
		public Vector1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector1; }
	}

	public final Vector1Context vector1() throws RecognitionException {
		Vector1Context _localctx = new Vector1Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_vector1);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(NUMBER);
				setState(374);
				vector2();
				}
				break;
			case CANVAS_WIDTH:
			case CANVAS_HEIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				vExtras0();
				setState(376);
				vector2();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Vector2Context extends ParserRuleContext {
		public Vector1Context vector1() {
			return getRuleContext(Vector1Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(beexlParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(beexlParser.WS, i);
		}
		public Vector2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector2; }
	}

	public final Vector2Context vector2() throws RecognitionException {
		Vector2Context _localctx = new Vector2Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_vector2);
		int _la;
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(T__5);
				setState(381);
				vector1();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(T__7);
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(383);
					match(WS);
					}
					}
					setState(388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(389);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VExtras0Context extends ParserRuleContext {
		public TerminalNode CANVAS_HEIGHT() { return getToken(beexlParser.CANVAS_HEIGHT, 0); }
		public TerminalNode CANVAS_WIDTH() { return getToken(beexlParser.CANVAS_WIDTH, 0); }
		public VExtras0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vExtras0; }
	}

	public final VExtras0Context vExtras0() throws RecognitionException {
		VExtras0Context _localctx = new VExtras0Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_vExtras0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if ( !(_la==CANVAS_WIDTH || _la==CANVAS_HEIGHT) ) {
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

	public static class Vars0Context extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(beexlParser.VAR, 0); }
		public TerminalNode ID() { return getToken(beexlParser.ID, 0); }
		public Vars1Context vars1() {
			return getRuleContext(Vars1Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(beexlParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(beexlParser.WS, i);
		}
		public Vars0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars0; }
	}

	public final Vars0Context vars0() throws RecognitionException {
		Vars0Context _localctx = new Vars0Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_vars0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(394);
				match(WS);
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400);
			match(VAR);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(401);
				match(WS);
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407);
			match(ID);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(408);
				match(WS);
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
			vars1();
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

	public static class Vars1Context extends ParserRuleContext {
		public TerminalNode HEX() { return getToken(beexlParser.HEX, 0); }
		public Vars11Context vars11() {
			return getRuleContext(Vars11Context.class,0);
		}
		public TerminalNode RGBA() { return getToken(beexlParser.RGBA, 0); }
		public TerminalNode VECTOR() { return getToken(beexlParser.VECTOR, 0); }
		public Vars12Context vars12() {
			return getRuleContext(Vars12Context.class,0);
		}
		public Vars1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars1; }
	}

	public final Vars1Context vars1() throws RecognitionException {
		Vars1Context _localctx = new Vars1Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_vars1);
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(HEX);
				setState(417);
				vars11();
				}
				break;
			case RGBA:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				match(RGBA);
				setState(419);
				vars11();
				}
				break;
			case VECTOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				match(VECTOR);
				setState(421);
				vars12();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Vars11Context extends ParserRuleContext {
		public ColorType0Context colorType0() {
			return getRuleContext(ColorType0Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(beexlParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(beexlParser.WS, i);
		}
		public Assignment20Context assignment20() {
			return getRuleContext(Assignment20Context.class,0);
		}
		public Vars11Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars11; }
	}

	public final Vars11Context vars11() throws RecognitionException {
		Vars11Context _localctx = new Vars11Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_vars11);
		int _la;
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(424);
					match(WS);
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(430);
				match(T__9);
				setState(431);
				colorType0();
				setState(432);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(434);
					match(WS);
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(440);
				match(T__9);
				setState(441);
				colorType0();
				setState(442);
				assignment20();
				setState(443);
				match(T__0);
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

	public static class Vars12Context extends ParserRuleContext {
		public TerminalNode VECTOR() { return getToken(beexlParser.VECTOR, 0); }
		public Assignment20Context assignment20() {
			return getRuleContext(Assignment20Context.class,0);
		}
		public Vars12Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars12; }
	}

	public final Vars12Context vars12() throws RecognitionException {
		Vars12Context _localctx = new Vars12Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_vars12);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(VECTOR);
				setState(448);
				assignment20();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(VECTOR);
				setState(450);
				match(T__0);
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

	public static class Instruction0Context extends ParserRuleContext {
		public Extras0Context extras0() {
			return getRuleContext(Extras0Context.class,0);
		}
		public Conditional0Context conditional0() {
			return getRuleContext(Conditional0Context.class,0);
		}
		public Cycle0Context cycle0() {
			return getRuleContext(Cycle0Context.class,0);
		}
		public Instruction0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction0; }
	}

	public final Instruction0Context instruction0() throws RecognitionException {
		Instruction0Context _localctx = new Instruction0Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_instruction0);
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case FILL:
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				extras0();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				conditional0();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
				cycle0();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Extras0Context extends ParserRuleContext {
		public PixelFill0Context pixelFill0() {
			return getRuleContext(PixelFill0Context.class,0);
		}
		public Assignment0Context assignment0() {
			return getRuleContext(Assignment0Context.class,0);
		}
		public Print0Context print0() {
			return getRuleContext(Print0Context.class,0);
		}
		public FunctionCall0Context functionCall0() {
			return getRuleContext(FunctionCall0Context.class,0);
		}
		public Extras0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extras0; }
	}

	public final Extras0Context extras0() throws RecognitionException {
		Extras0Context _localctx = new Extras0Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_extras0);
		try {
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				pixelFill0();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				assignment0();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				print0();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
				functionCall0();
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

	public static class Assignment20Context extends ParserRuleContext {
		public Assignment21Context assignment21() {
			return getRuleContext(Assignment21Context.class,0);
		}
		public Assignment20Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment20; }
	}

	public final Assignment20Context assignment20() throws RecognitionException {
		Assignment20Context _localctx = new Assignment20Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_assignment20);
		try {
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(T__10);
				}
				break;
			case HEX:
			case RGBA:
			case VECTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				assignment21();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Assignment21Context extends ParserRuleContext {
		public TerminalNode RGBA() { return getToken(beexlParser.RGBA, 0); }
		public TerminalNode HEX() { return getToken(beexlParser.HEX, 0); }
		public TerminalNode VECTOR() { return getToken(beexlParser.VECTOR, 0); }
		public Assignment21Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment21; }
	}

	public final Assignment21Context assignment21() throws RecognitionException {
		Assignment21Context _localctx = new Assignment21Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_assignment21);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEX) | (1L << RGBA) | (1L << VECTOR))) != 0)) ) {
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

	public static class PixelFill0Context extends ParserRuleContext {
		public TerminalNode FILL() { return getToken(beexlParser.FILL, 0); }
		public PixelFill1Context pixelFill1() {
			return getRuleContext(PixelFill1Context.class,0);
		}
		public PixelFill2Context pixelFill2() {
			return getRuleContext(PixelFill2Context.class,0);
		}
		public PixelFill0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pixelFill0; }
	}

	public final PixelFill0Context pixelFill0() throws RecognitionException {
		PixelFill0Context _localctx = new PixelFill0Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_pixelFill0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(FILL);
			setState(471);
			pixelFill1();
			setState(472);
			pixelFill2();
			setState(473);
			match(T__0);
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

	public static class PixelFill2Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(beexlParser.ID, 0); }
		public TerminalNode RGBA() { return getToken(beexlParser.RGBA, 0); }
		public TerminalNode HEX() { return getToken(beexlParser.HEX, 0); }
		public PixelFill2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pixelFill2; }
	}

	public final PixelFill2Context pixelFill2() throws RecognitionException {
		PixelFill2Context _localctx = new PixelFill2Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_pixelFill2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEX) | (1L << RGBA) | (1L << ID))) != 0)) ) {
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

	public static class PixelFill1Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(beexlParser.ID, 0); }
		public TerminalNode VECTOR() { return getToken(beexlParser.VECTOR, 0); }
		public PixelFill1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pixelFill1; }
	}

	public final PixelFill1Context pixelFill1() throws RecognitionException {
		PixelFill1Context _localctx = new PixelFill1Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_pixelFill1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_la = _input.LA(1);
			if ( !(_la==VECTOR || _la==ID) ) {
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

	public static class Assignment0Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(beexlParser.ID, 0); }
		public Assignment20Context assignment20() {
			return getRuleContext(Assignment20Context.class,0);
		}
		public Assignment0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment0; }
	}

	public final Assignment0Context assignment0() throws RecognitionException {
		Assignment0Context _localctx = new Assignment0Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_assignment0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(ID);
			setState(480);
			assignment20();
			setState(481);
			match(T__0);
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

	public static class Print0Context extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(beexlParser.PRINT, 0); }
		public Print0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print0; }
	}

	public final Print0Context print0() throws RecognitionException {
		Print0Context _localctx = new Print0Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_print0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(PRINT);
			setState(484);
			match(T__0);
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

	public static class Conditional0Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(beexlParser.IF, 0); }
		public HyperExp0Context hyperExp0() {
			return getRuleContext(HyperExp0Context.class,0);
		}
		public List<Extras0Context> extras0() {
			return getRuleContexts(Extras0Context.class);
		}
		public Extras0Context extras0(int i) {
			return getRuleContext(Extras0Context.class,i);
		}
		public Conditional0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional0; }
	}

	public final Conditional0Context conditional0() throws RecognitionException {
		Conditional0Context _localctx = new Conditional0Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_conditional0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(IF);
			setState(487);
			match(T__6);
			setState(488);
			hyperExp0();
			setState(489);
			match(T__7);
			setState(490);
			match(T__11);
			setState(492); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(491);
				extras0();
				}
				}
				setState(494); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (ID - 59)) | (1L << (FILL - 59)) | (1L << (PRINT - 59)))) != 0) );
			setState(496);
			match(T__12);
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

	public static class HyperExp0Context extends ParserRuleContext {
		public SuperExp0Context superExp0() {
			return getRuleContext(SuperExp0Context.class,0);
		}
		public SuperExp1Context superExp1() {
			return getRuleContext(SuperExp1Context.class,0);
		}
		public HyperExp0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hyperExp0; }
	}

	public final HyperExp0Context hyperExp0() throws RecognitionException {
		HyperExp0Context _localctx = new HyperExp0Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_hyperExp0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			superExp0();
			setState(499);
			superExp1();
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

	public static class SuperExp1Context extends ParserRuleContext {
		public SuperExp2Context superExp2() {
			return getRuleContext(SuperExp2Context.class,0);
		}
		public SuperExp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superExp1; }
	}

	public final SuperExp1Context superExp1() throws RecognitionException {
		SuperExp1Context _localctx = new SuperExp1Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_superExp1);
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				superExp2();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SuperExp2Context extends ParserRuleContext {
		public SuperExp3Context superExp3() {
			return getRuleContext(SuperExp3Context.class,0);
		}
		public HyperExp0Context hyperExp0() {
			return getRuleContext(HyperExp0Context.class,0);
		}
		public SuperExp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superExp2; }
	}

	public final SuperExp2Context superExp2() throws RecognitionException {
		SuperExp2Context _localctx = new SuperExp2Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_superExp2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			superExp3();
			setState(506);
			hyperExp0();
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

	public static class SuperExp3Context extends ParserRuleContext {
		public SuperExp3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superExp3; }
	}

	public final SuperExp3Context superExp3() throws RecognitionException {
		SuperExp3Context _localctx = new SuperExp3Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_superExp3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
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

	public static class SuperExp0Context extends ParserRuleContext {
		public Exp0Context exp0() {
			return getRuleContext(Exp0Context.class,0);
		}
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public SuperExp0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superExp0; }
	}

	public final SuperExp0Context superExp0() throws RecognitionException {
		SuperExp0Context _localctx = new SuperExp0Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_superExp0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			exp0();
			setState(511);
			exp1();
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

	public static class Exp1Context extends ParserRuleContext {
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_exp1);
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				exp2();
				}
				break;
			case T__7:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Exp2Context extends ParserRuleContext {
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public SuperExp0Context superExp0() {
			return getRuleContext(SuperExp0Context.class,0);
		}
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
	}

	public final Exp2Context exp2() throws RecognitionException {
		Exp2Context _localctx = new Exp2Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_exp2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			exp3();
			setState(518);
			superExp0();
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

	public static class Exp3Context extends ParserRuleContext {
		public Exp3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp3; }
	}

	public final Exp3Context exp3() throws RecognitionException {
		Exp3Context _localctx = new Exp3Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_exp3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
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

	public static class Exp0Context extends ParserRuleContext {
		public Term0Context term0() {
			return getRuleContext(Term0Context.class,0);
		}
		public Term1Context term1() {
			return getRuleContext(Term1Context.class,0);
		}
		public Exp0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp0; }
	}

	public final Exp0Context exp0() throws RecognitionException {
		Exp0Context _localctx = new Exp0Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_exp0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			term0();
			setState(523);
			term1();
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

	public static class Term1Context extends ParserRuleContext {
		public Term2Context term2() {
			return getRuleContext(Term2Context.class,0);
		}
		public Term1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term1; }
	}

	public final Term1Context term1() throws RecognitionException {
		Term1Context _localctx = new Term1Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_term1);
		try {
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				term2();
				}
				break;
			case EOF:
			case T__7:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case RGBA:
			case VECTOR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Term2Context extends ParserRuleContext {
		public Term3Context term3() {
			return getRuleContext(Term3Context.class,0);
		}
		public Exp0Context exp0() {
			return getRuleContext(Exp0Context.class,0);
		}
		public Term2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term2; }
	}

	public final Term2Context term2() throws RecognitionException {
		Term2Context _localctx = new Term2Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_term2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			term3();
			setState(530);
			exp0();
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

	public static class Term3Context extends ParserRuleContext {
		public Term3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term3; }
	}

	public final Term3Context term3() throws RecognitionException {
		Term3Context _localctx = new Term3Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_term3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
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

	public static class Term0Context extends ParserRuleContext {
		public Factor0Context factor0() {
			return getRuleContext(Factor0Context.class,0);
		}
		public Factor1Context factor1() {
			return getRuleContext(Factor1Context.class,0);
		}
		public Term0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term0; }
	}

	public final Term0Context term0() throws RecognitionException {
		Term0Context _localctx = new Term0Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_term0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			factor0();
			setState(535);
			factor1();
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

	public static class Factor1Context extends ParserRuleContext {
		public Factor2Context factor2() {
			return getRuleContext(Factor2Context.class,0);
		}
		public Factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor1; }
	}

	public final Factor1Context factor1() throws RecognitionException {
		Factor1Context _localctx = new Factor1Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_factor1);
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				factor2();
				}
				break;
			case EOF:
			case T__7:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case RGBA:
			case VECTOR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Factor2Context extends ParserRuleContext {
		public Factor3Context factor3() {
			return getRuleContext(Factor3Context.class,0);
		}
		public Term0Context term0() {
			return getRuleContext(Term0Context.class,0);
		}
		public Factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor2; }
	}

	public final Factor2Context factor2() throws RecognitionException {
		Factor2Context _localctx = new Factor2Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_factor2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			factor3();
			setState(542);
			term0();
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

	public static class Factor3Context extends ParserRuleContext {
		public Factor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor3; }
	}

	public final Factor3Context factor3() throws RecognitionException {
		Factor3Context _localctx = new Factor3Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
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

	public static class Factor0Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(beexlParser.ID, 0); }
		public SuperExp0Context superExp0() {
			return getRuleContext(SuperExp0Context.class,0);
		}
		public Factor0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor0; }
	}

	public final Factor0Context factor0() throws RecognitionException {
		Factor0Context _localctx = new Factor0Context(_ctx, getState());
		enterRule(_localctx, 110, RULE_factor0);
		try {
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				match(ID);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				match(T__6);
				setState(548);
				superExp0();
				setState(549);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Cycle0Context extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(beexlParser.FROM, 0); }
		public List<Cycle1Context> cycle1() {
			return getRuleContexts(Cycle1Context.class);
		}
		public Cycle1Context cycle1(int i) {
			return getRuleContext(Cycle1Context.class,i);
		}
		public TerminalNode TO() { return getToken(beexlParser.TO, 0); }
		public TerminalNode DO() { return getToken(beexlParser.DO, 0); }
		public List<Extras0Context> extras0() {
			return getRuleContexts(Extras0Context.class);
		}
		public Extras0Context extras0(int i) {
			return getRuleContext(Extras0Context.class,i);
		}
		public Cycle0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle0; }
	}

	public final Cycle0Context cycle0() throws RecognitionException {
		Cycle0Context _localctx = new Cycle0Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_cycle0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(FROM);
			setState(554);
			cycle1();
			setState(555);
			match(TO);
			setState(556);
			cycle1();
			setState(557);
			match(DO);
			setState(558);
			match(T__11);
			setState(560); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(559);
				extras0();
				}
				}
				setState(562); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (ID - 59)) | (1L << (FILL - 59)) | (1L << (PRINT - 59)))) != 0) );
			setState(564);
			match(T__12);
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

	public static class Cycle1Context extends ParserRuleContext {
		public TerminalNode VECTOR() { return getToken(beexlParser.VECTOR, 0); }
		public ColorType0Context colorType0() {
			return getRuleContext(ColorType0Context.class,0);
		}
		public Cycle1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle1; }
	}

	public final Cycle1Context cycle1() throws RecognitionException {
		Cycle1Context _localctx = new Cycle1Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_cycle1);
		try {
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				match(VECTOR);
				}
				break;
			case HEX:
			case RGBA:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				colorType0();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VectorOperation0Context extends ParserRuleContext {
		public List<VectorOperation1Context> vectorOperation1() {
			return getRuleContexts(VectorOperation1Context.class);
		}
		public VectorOperation1Context vectorOperation1(int i) {
			return getRuleContext(VectorOperation1Context.class,i);
		}
		public Exp0Context exp0() {
			return getRuleContext(Exp0Context.class,0);
		}
		public VectorOperation0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorOperation0; }
	}

	public final VectorOperation0Context vectorOperation0() throws RecognitionException {
		VectorOperation0Context _localctx = new VectorOperation0Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_vectorOperation0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			vectorOperation1();
			setState(571);
			exp0();
			setState(572);
			vectorOperation1();
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

	public static class VectorOperation1Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(beexlParser.ID, 0); }
		public TerminalNode VECTOR() { return getToken(beexlParser.VECTOR, 0); }
		public VectorAttribute0Context vectorAttribute0() {
			return getRuleContext(VectorAttribute0Context.class,0);
		}
		public VectorOperation1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorOperation1; }
	}

	public final VectorOperation1Context vectorOperation1() throws RecognitionException {
		VectorOperation1Context _localctx = new VectorOperation1Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_vectorOperation1);
		try {
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				match(VECTOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(576);
				vectorAttribute0();
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

	public static class VectorAttribute0Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(beexlParser.ID, 0); }
		public VectorAttribute1Context vectorAttribute1() {
			return getRuleContext(VectorAttribute1Context.class,0);
		}
		public VectorAttribute0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorAttribute0; }
	}

	public final VectorAttribute0Context vectorAttribute0() throws RecognitionException {
		VectorAttribute0Context _localctx = new VectorAttribute0Context(_ctx, getState());
		enterRule(_localctx, 120, RULE_vectorAttribute0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(ID);
			setState(580);
			match(T__24);
			setState(581);
			vectorAttribute1();
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

	public static class VectorAttribute1Context extends ParserRuleContext {
		public TerminalNode X() { return getToken(beexlParser.X, 0); }
		public TerminalNode Y() { return getToken(beexlParser.Y, 0); }
		public VectorAttribute1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorAttribute1; }
	}

	public final VectorAttribute1Context vectorAttribute1() throws RecognitionException {
		VectorAttribute1Context _localctx = new VectorAttribute1Context(_ctx, getState());
		enterRule(_localctx, 122, RULE_vectorAttribute1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			_la = _input.LA(1);
			if ( !(_la==X || _la==Y) ) {
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

	public static class RgbaOperation0Context extends ParserRuleContext {
		public List<RgbaOperation1Context> rgbaOperation1() {
			return getRuleContexts(RgbaOperation1Context.class);
		}
		public RgbaOperation1Context rgbaOperation1(int i) {
			return getRuleContext(RgbaOperation1Context.class,i);
		}
		public Exp0Context exp0() {
			return getRuleContext(Exp0Context.class,0);
		}
		public RgbaOperation0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgbaOperation0; }
	}

	public final RgbaOperation0Context rgbaOperation0() throws RecognitionException {
		RgbaOperation0Context _localctx = new RgbaOperation0Context(_ctx, getState());
		enterRule(_localctx, 124, RULE_rgbaOperation0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			rgbaOperation1();
			setState(586);
			exp0();
			setState(587);
			rgbaOperation1();
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

	public static class RgbaOperation1Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(beexlParser.ID, 0); }
		public TerminalNode RGBA() { return getToken(beexlParser.RGBA, 0); }
		public RgbaAttribute0Context rgbaAttribute0() {
			return getRuleContext(RgbaAttribute0Context.class,0);
		}
		public RgbaOperation1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgbaOperation1; }
	}

	public final RgbaOperation1Context rgbaOperation1() throws RecognitionException {
		RgbaOperation1Context _localctx = new RgbaOperation1Context(_ctx, getState());
		enterRule(_localctx, 126, RULE_rgbaOperation1);
		try {
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				match(RGBA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
				rgbaAttribute0();
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

	public static class RgbaAttribute0Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(beexlParser.ID, 0); }
		public RgbaAttribute1Context rgbaAttribute1() {
			return getRuleContext(RgbaAttribute1Context.class,0);
		}
		public RgbaAttribute0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgbaAttribute0; }
	}

	public final RgbaAttribute0Context rgbaAttribute0() throws RecognitionException {
		RgbaAttribute0Context _localctx = new RgbaAttribute0Context(_ctx, getState());
		enterRule(_localctx, 128, RULE_rgbaAttribute0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(ID);
			setState(595);
			match(T__24);
			setState(596);
			rgbaAttribute1();
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

	public static class RgbaAttribute1Context extends ParserRuleContext {
		public TerminalNode RED() { return getToken(beexlParser.RED, 0); }
		public TerminalNode GREEN() { return getToken(beexlParser.GREEN, 0); }
		public TerminalNode BLUE() { return getToken(beexlParser.BLUE, 0); }
		public TerminalNode ALPHA() { return getToken(beexlParser.ALPHA, 0); }
		public RgbaAttribute1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgbaAttribute1; }
	}

	public final RgbaAttribute1Context rgbaAttribute1() throws RecognitionException {
		RgbaAttribute1Context _localctx = new RgbaAttribute1Context(_ctx, getState());
		enterRule(_localctx, 130, RULE_rgbaAttribute1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RED) | (1L << GREEN) | (1L << BLUE) | (1L << ALPHA))) != 0)) ) {
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

	public static class HexOperation0Context extends ParserRuleContext {
		public HexOperation1Context hexOperation1() {
			return getRuleContext(HexOperation1Context.class,0);
		}
		public Exp0Context exp0() {
			return getRuleContext(Exp0Context.class,0);
		}
		public HexOperation0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexOperation0; }
	}

	public final HexOperation0Context hexOperation0() throws RecognitionException {
		HexOperation0Context _localctx = new HexOperation0Context(_ctx, getState());
		enterRule(_localctx, 132, RULE_hexOperation0);
		try {
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				hexOperation1();
				setState(601);
				exp0();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				hexOperation1();
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

	public static class HexOperation1Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(beexlParser.ID, 0); }
		public TerminalNode HEX() { return getToken(beexlParser.HEX, 0); }
		public HexAttribute0Context hexAttribute0() {
			return getRuleContext(HexAttribute0Context.class,0);
		}
		public HexOperation1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexOperation1; }
	}

	public final HexOperation1Context hexOperation1() throws RecognitionException {
		HexOperation1Context _localctx = new HexOperation1Context(_ctx, getState());
		enterRule(_localctx, 134, RULE_hexOperation1);
		try {
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				match(HEX);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
				hexAttribute0();
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

	public static class HexAttribute0Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(beexlParser.ID, 0); }
		public HexAttribute1Context hexAttribute1() {
			return getRuleContext(HexAttribute1Context.class,0);
		}
		public HexAttribute0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexAttribute0; }
	}

	public final HexAttribute0Context hexAttribute0() throws RecognitionException {
		HexAttribute0Context _localctx = new HexAttribute0Context(_ctx, getState());
		enterRule(_localctx, 136, RULE_hexAttribute0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(ID);
			setState(612);
			match(T__24);
			setState(613);
			hexAttribute1();
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

	public static class HexAttribute1Context extends ParserRuleContext {
		public TerminalNode RED() { return getToken(beexlParser.RED, 0); }
		public TerminalNode GREEN() { return getToken(beexlParser.GREEN, 0); }
		public TerminalNode BLUE() { return getToken(beexlParser.BLUE, 0); }
		public HexAttribute1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexAttribute1; }
	}

	public final HexAttribute1Context hexAttribute1() throws RecognitionException {
		HexAttribute1Context _localctx = new HexAttribute1Context(_ctx, getState());
		enterRule(_localctx, 138, RULE_hexAttribute1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RED) | (1L << GREEN) | (1L << BLUE))) != 0)) ) {
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

	public static class Block0Context extends ParserRuleContext {
		public List<Block1Context> block1() {
			return getRuleContexts(Block1Context.class);
		}
		public Block1Context block1(int i) {
			return getRuleContext(Block1Context.class,i);
		}
		public Block0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block0; }
	}

	public final Block0Context block0() throws RecognitionException {
		Block0Context _localctx = new Block0Context(_ctx, getState());
		enterRule(_localctx, 140, RULE_block0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(T__11);
			setState(619); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(618);
				block1();
				}
				}
				setState(621); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (VAR - 35)) | (1L << (IF - 35)) | (1L << (FROM - 35)) | (1L << (ID - 35)) | (1L << (FILL - 35)) | (1L << (PRINT - 35)))) != 0) );
			setState(623);
			match(T__12);
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

	public static class Block1Context extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(beexlParser.VAR, 0); }
		public Instruction0Context instruction0() {
			return getRuleContext(Instruction0Context.class,0);
		}
		public Block1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block1; }
	}

	public final Block1Context block1() throws RecognitionException {
		Block1Context _localctx = new Block1Context(_ctx, getState());
		enterRule(_localctx, 142, RULE_block1);
		try {
			setState(627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				match(VAR);
				}
				break;
			case IF:
			case FROM:
			case ID:
			case FILL:
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				instruction0();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Main0Context extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(beexlParser.FUNCTION, 0); }
		public TerminalNode VOID() { return getToken(beexlParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(beexlParser.MAIN, 0); }
		public Block0Context block0() {
			return getRuleContext(Block0Context.class,0);
		}
		public Main0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main0; }
	}

	public final Main0Context main0() throws RecognitionException {
		Main0Context _localctx = new Main0Context(_ctx, getState());
		enterRule(_localctx, 144, RULE_main0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(FUNCTION);
			setState(630);
			match(VOID);
			setState(631);
			match(MAIN);
			setState(632);
			match(T__6);
			setState(633);
			match(T__7);
			setState(634);
			block0();
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

	public static class Body0Context extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(beexlParser.MAIN, 0); }
		public List<TerminalNode> FUNCTION() { return getTokens(beexlParser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(beexlParser.FUNCTION, i);
		}
		public Body0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body0; }
	}

	public final Body0Context body0() throws RecognitionException {
		Body0Context _localctx = new Body0Context(_ctx, getState());
		enterRule(_localctx, 146, RULE_body0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(636);
				match(FUNCTION);
				}
				}
				setState(639); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTION );
			setState(641);
			match(MAIN);
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

	public static class FunctionCall0Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(beexlParser.ID, 0); }
		public FunctionCall1Context functionCall1() {
			return getRuleContext(FunctionCall1Context.class,0);
		}
		public FunctionCall0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall0; }
	}

	public final FunctionCall0Context functionCall0() throws RecognitionException {
		FunctionCall0Context _localctx = new FunctionCall0Context(_ctx, getState());
		enterRule(_localctx, 148, RULE_functionCall0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(ID);
			setState(644);
			match(T__6);
			setState(645);
			functionCall1();
			setState(646);
			match(T__7);
			setState(647);
			match(T__0);
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

	public static class FunctionCall1Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(beexlParser.ID, 0); }
		public FunctionCall1Context functionCall1() {
			return getRuleContext(FunctionCall1Context.class,0);
		}
		public FunctionCall1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall1; }
	}

	public final FunctionCall1Context functionCall1() throws RecognitionException {
		FunctionCall1Context _localctx = new FunctionCall1Context(_ctx, getState());
		enterRule(_localctx, 150, RULE_functionCall1);
		try {
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				match(ID);
				setState(651);
				match(T__5);
				setState(652);
				functionCall1();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u0292\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\7\2\u009c\n\2\f\2\16\2\u009f\13\2\3\2"+
		"\3\2\7\2\u00a3\n\2\f\2\16\2\u00a6\13\2\3\2\3\2\7\2\u00aa\n\2\f\2\16\2"+
		"\u00ad\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u00b5\n\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u00c5\n\6\3\7\3\7\7\7\u00c9\n"+
		"\7\f\7\16\7\u00cc\13\7\3\7\3\7\3\7\3\b\3\b\3\t\7\t\u00d4\n\t\f\t\16\t"+
		"\u00d7\13\t\3\t\3\t\7\t\u00db\n\t\f\t\16\t\u00de\13\t\3\t\3\t\7\t\u00e2"+
		"\n\t\f\t\16\t\u00e5\13\t\3\t\3\t\7\t\u00e9\n\t\f\t\16\t\u00ec\13\t\3\t"+
		"\3\t\7\t\u00f0\n\t\f\t\16\t\u00f3\13\t\3\n\7\n\u00f6\n\n\f\n\16\n\u00f9"+
		"\13\n\3\n\3\n\7\n\u00fd\n\n\f\n\16\n\u0100\13\n\3\n\3\n\7\n\u0104\n\n"+
		"\f\n\16\n\u0107\13\n\3\n\3\n\3\13\3\13\5\13\u010d\n\13\3\f\3\f\3\f\7\f"+
		"\u0112\n\f\f\f\16\f\u0115\13\f\3\f\3\f\3\r\3\r\3\16\7\16\u011c\n\16\f"+
		"\16\16\16\u011f\13\16\3\16\3\16\7\16\u0123\n\16\f\16\16\16\u0126\13\16"+
		"\3\16\5\16\u0129\n\16\3\17\7\17\u012c\n\17\f\17\16\17\u012f\13\17\3\17"+
		"\3\17\7\17\u0133\n\17\f\17\16\17\u0136\13\17\3\17\3\17\7\17\u013a\n\17"+
		"\f\17\16\17\u013d\13\17\3\17\3\17\3\20\3\20\7\20\u0143\n\20\f\20\16\20"+
		"\u0146\13\20\3\20\3\20\7\20\u014a\n\20\f\20\16\20\u014d\13\20\3\20\5\20"+
		"\u0150\n\20\3\21\3\21\3\21\5\21\u0155\n\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u0160\n\24\3\25\3\25\5\25\u0164\n\25\3\26\3\26"+
		"\3\27\7\27\u0169\n\27\f\27\16\27\u016c\13\27\3\27\3\27\7\27\u0170\n\27"+
		"\f\27\16\27\u0173\13\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u017d"+
		"\n\30\3\31\3\31\3\31\3\31\7\31\u0183\n\31\f\31\16\31\u0186\13\31\3\31"+
		"\5\31\u0189\n\31\3\32\3\32\3\33\7\33\u018e\n\33\f\33\16\33\u0191\13\33"+
		"\3\33\3\33\7\33\u0195\n\33\f\33\16\33\u0198\13\33\3\33\3\33\7\33\u019c"+
		"\n\33\f\33\16\33\u019f\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5"+
		"\34\u01a9\n\34\3\35\7\35\u01ac\n\35\f\35\16\35\u01af\13\35\3\35\3\35\3"+
		"\35\3\35\3\35\7\35\u01b6\n\35\f\35\16\35\u01b9\13\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u01c0\n\35\3\36\3\36\3\36\3\36\5\36\u01c6\n\36\3\37\3\37"+
		"\3\37\5\37\u01cb\n\37\3 \3 \3 \3 \5 \u01d1\n \3!\3!\5!\u01d5\n!\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\6(\u01ef\n(\r(\16(\u01f0\3(\3(\3)\3)\3)\3*\3*\5*\u01fa\n*\3+\3+\3+\3"+
		",\3,\3-\3-\3-\3.\3.\5.\u0206\n.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62"+
		"\3\62\5\62\u0212\n\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66"+
		"\5\66\u021e\n\66\3\67\3\67\3\67\38\38\39\39\39\39\39\59\u022a\n9\3:\3"+
		":\3:\3:\3:\3:\3:\6:\u0233\n:\r:\16:\u0234\3:\3:\3;\3;\5;\u023b\n;\3<\3"+
		"<\3<\3<\3=\3=\3=\5=\u0244\n=\3>\3>\3>\3>\3?\3?\3@\3@\3@\3@\3A\3A\3A\5"+
		"A\u0253\nA\3B\3B\3B\3B\3C\3C\3D\3D\3D\3D\5D\u025f\nD\3E\3E\3E\5E\u0264"+
		"\nE\3F\3F\3F\3F\3G\3G\3H\3H\6H\u026e\nH\rH\16H\u026f\3H\3H\3I\3I\5I\u0276"+
		"\nI\3J\3J\3J\3J\3J\3J\3J\3K\6K\u0280\nK\rK\16K\u0281\3K\3K\3L\3L\3L\3"+
		"L\3L\3L\3M\3M\3M\3M\5M\u0290\nM\3M\2\2N\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\2\21\3\2\5\7\3\2 !\3\2@C\3\2\67<\3\2\65\66\3\2 \"\4\2 !==\4\2\"\"==\3"+
		"\2\20\21\3\2\22\26\3\2\27\30\3\2\31\32\3\2*+\3\2,/\3\2,.\2\u0289\2\u009d"+
		"\3\2\2\2\4\u00b4\3\2\2\2\6\u00b6\3\2\2\2\b\u00ba\3\2\2\2\n\u00c4\3\2\2"+
		"\2\f\u00c6\3\2\2\2\16\u00d0\3\2\2\2\20\u00d5\3\2\2\2\22\u00f7\3\2\2\2"+
		"\24\u010c\3\2\2\2\26\u010e\3\2\2\2\30\u0118\3\2\2\2\32\u0128\3\2\2\2\34"+
		"\u012d\3\2\2\2\36\u014f\3\2\2\2 \u0154\3\2\2\2\"\u0156\3\2\2\2$\u0158"+
		"\3\2\2\2&\u015f\3\2\2\2(\u0163\3\2\2\2*\u0165\3\2\2\2,\u016a\3\2\2\2."+
		"\u017c\3\2\2\2\60\u0188\3\2\2\2\62\u018a\3\2\2\2\64\u018f\3\2\2\2\66\u01a8"+
		"\3\2\2\28\u01bf\3\2\2\2:\u01c5\3\2\2\2<\u01ca\3\2\2\2>\u01d0\3\2\2\2@"+
		"\u01d4\3\2\2\2B\u01d6\3\2\2\2D\u01d8\3\2\2\2F\u01dd\3\2\2\2H\u01df\3\2"+
		"\2\2J\u01e1\3\2\2\2L\u01e5\3\2\2\2N\u01e8\3\2\2\2P\u01f4\3\2\2\2R\u01f9"+
		"\3\2\2\2T\u01fb\3\2\2\2V\u01fe\3\2\2\2X\u0200\3\2\2\2Z\u0205\3\2\2\2\\"+
		"\u0207\3\2\2\2^\u020a\3\2\2\2`\u020c\3\2\2\2b\u0211\3\2\2\2d\u0213\3\2"+
		"\2\2f\u0216\3\2\2\2h\u0218\3\2\2\2j\u021d\3\2\2\2l\u021f\3\2\2\2n\u0222"+
		"\3\2\2\2p\u0229\3\2\2\2r\u022b\3\2\2\2t\u023a\3\2\2\2v\u023c\3\2\2\2x"+
		"\u0243\3\2\2\2z\u0245\3\2\2\2|\u0249\3\2\2\2~\u024b\3\2\2\2\u0080\u0252"+
		"\3\2\2\2\u0082\u0254\3\2\2\2\u0084\u0258\3\2\2\2\u0086\u025e\3\2\2\2\u0088"+
		"\u0263\3\2\2\2\u008a\u0265\3\2\2\2\u008c\u0269\3\2\2\2\u008e\u026b\3\2"+
		"\2\2\u0090\u0275\3\2\2\2\u0092\u0277\3\2\2\2\u0094\u027f\3\2\2\2\u0096"+
		"\u0285\3\2\2\2\u0098\u028f\3\2\2\2\u009a\u009c\7E\2\2\u009b\u009a\3\2"+
		"\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a4\7\34\2\2\u00a1\u00a3\7"+
		"E\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00ab\5\4"+
		"\3\2\u00a8\u00aa\7E\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\u00af\5\n\6\2\u00af\3\3\2\2\2\u00b0\u00b1\7\35\2\2\u00b1\u00b5"+
		"\5\6\4\2\u00b2\u00b3\7\36\2\2\u00b3\u00b5\5\b\5\2\u00b4\u00b0\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b5\5\3\2\2\2\u00b6\u00b7\5\f\7\2\u00b7\u00b8\7"+
		"\3\2\2\u00b8\u00b9\5\26\f\2\u00b9\7\3\2\2\2\u00ba\u00bb\5\f\7\2\u00bb"+
		"\u00bc\7\3\2\2\u00bc\u00bd\5\20\t\2\u00bd\u00be\5\26\f\2\u00be\u00bf\5"+
		"\22\n\2\u00bf\t\3\2\2\2\u00c0\u00c1\5\64\33\2\u00c1\u00c2\5\n\6\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c5\5\u0094K\2\u00c4\u00c0\3\2\2\2\u00c4\u00c3"+
		"\3\2\2\2\u00c5\13\3\2\2\2\u00c6\u00ca\7\4\2\2\u00c7\u00c9\13\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\5\16\b\2\u00ce"+
		"\u00cf\7\4\2\2\u00cf\r\3\2\2\2\u00d0\u00d1\t\2\2\2\u00d1\17\3\2\2\2\u00d2"+
		"\u00d4\7E\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00dc\7\37\2\2\u00d9\u00db\7E\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e3\7?\2\2\u00e0\u00e2\7E\2\2\u00e1\u00e0\3\2\2"+
		"\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6"+
		"\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00ea\7\b\2\2\u00e7\u00e9\7E\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f1\7?\2\2\u00ee"+
		"\u00f0\7E\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\21\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f6"+
		"\7E\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fe\7$"+
		"\2\2\u00fb\u00fd\7E\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101\u0105\5\24\13\2\u0102\u0104\7E\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7\3\2\2\u0109\23\3\2\2\2\u010a\u010d"+
		"\5$\23\2\u010b\u010d\5\34\17\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2"+
		"\u010d\25\3\2\2\2\u010e\u010f\7#\2\2\u010f\u0113\5\30\r\2\u0110\u0112"+
		"\7E\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\3"+
		"\2\2\u0117\27\3\2\2\2\u0118\u0119\t\3\2\2\u0119\31\3\2\2\2\u011a\u011c"+
		"\7E\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0124\7\""+
		"\2\2\u0121\u0123\7E\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0129\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0127\u0129\5\30\r\2\u0128\u011d\3\2\2\2\u0128\u0127\3\2\2\2\u0129"+
		"\33\3\2\2\2\u012a\u012c\7E\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2"+
		"\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u0130\u0134\7!\2\2\u0131\u0133\7E\2\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0137\u013b\7\t\2\2\u0138\u013a\7E\2\2\u0139"+
		"\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\5\36\20\2\u013f"+
		"\35\3\2\2\2\u0140\u0150\5 \21\2\u0141\u0143\7E\2\2\u0142\u0141\3\2\2\2"+
		"\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u014b\7\n\2\2\u0148\u014a\7E\2\2\u0149"+
		"\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0150\7\3\2\2\u014f"+
		"\u0140\3\2\2\2\u014f\u0144\3\2\2\2\u0150\37\3\2\2\2\u0151\u0155\5\"\22"+
		"\2\u0152\u0155\7?\2\2\u0153\u0155\3\2\2\2\u0154\u0151\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0154\u0153\3\2\2\2\u0155!\3\2\2\2\u0156\u0157\t\4\2\2\u0157"+
		"#\3\2\2\2\u0158\u0159\7\13\2\2\u0159%\3\2\2\2\u015a\u015b\7>\2\2\u015b"+
		"\u0160\5(\25\2\u015c\u015d\5*\26\2\u015d\u015e\5(\25\2\u015e\u0160\3\2"+
		"\2\2\u015f\u015a\3\2\2\2\u015f\u015c\3\2\2\2\u0160\'\3\2\2\2\u0161\u0164"+
		"\5&\24\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164"+
		")\3\2\2\2\u0165\u0166\t\5\2\2\u0166+\3\2\2\2\u0167\u0169\7E\2\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0171\7\"\2\2\u016e"+
		"\u0170\7E\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174"+
		"\u0175\7\t\2\2\u0175\u0176\5.\30\2\u0176-\3\2\2\2\u0177\u0178\7?\2\2\u0178"+
		"\u017d\5\60\31\2\u0179\u017a\5\62\32\2\u017a\u017b\5\60\31\2\u017b\u017d"+
		"\3\2\2\2\u017c\u0177\3\2\2\2\u017c\u0179\3\2\2\2\u017d/\3\2\2\2\u017e"+
		"\u017f\7\b\2\2\u017f\u0189\5.\30\2\u0180\u0184\7\n\2\2\u0181\u0183\7E"+
		"\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0189\7\3"+
		"\2\2\u0188\u017e\3\2\2\2\u0188\u0180\3\2\2\2\u0189\61\3\2\2\2\u018a\u018b"+
		"\t\6\2\2\u018b\63\3\2\2\2\u018c\u018e\7E\2\2\u018d\u018c\3\2\2\2\u018e"+
		"\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2"+
		"\2\2\u0191\u018f\3\2\2\2\u0192\u0196\7%\2\2\u0193\u0195\7E\2\2\u0194\u0193"+
		"\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019d\7=\2\2\u019a\u019c\7E\2"+
		"\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e"+
		"\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\5\66\34\2"+
		"\u01a1\65\3\2\2\2\u01a2\u01a3\7 \2\2\u01a3\u01a9\58\35\2\u01a4\u01a5\7"+
		"!\2\2\u01a5\u01a9\58\35\2\u01a6\u01a7\7\"\2\2\u01a7\u01a9\5:\36\2\u01a8"+
		"\u01a2\3\2\2\2\u01a8\u01a4\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\67\3\2\2"+
		"\2\u01aa\u01ac\7E\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab"+
		"\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0"+
		"\u01b1\7\f\2\2\u01b1\u01b2\5\30\r\2\u01b2\u01b3\7\3\2\2\u01b3\u01c0\3"+
		"\2\2\2\u01b4\u01b6\7E\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b7\3\2"+
		"\2\2\u01ba\u01bb\7\f\2\2\u01bb\u01bc\5\30\r\2\u01bc\u01bd\5@!\2\u01bd"+
		"\u01be\7\3\2\2\u01be\u01c0\3\2\2\2\u01bf\u01ad\3\2\2\2\u01bf\u01b7\3\2"+
		"\2\2\u01c09\3\2\2\2\u01c1\u01c2\7\"\2\2\u01c2\u01c6\5@!\2\u01c3\u01c4"+
		"\7\"\2\2\u01c4\u01c6\7\3\2\2\u01c5\u01c1\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6"+
		";\3\2\2\2\u01c7\u01cb\5> \2\u01c8\u01cb\5N(\2\u01c9\u01cb\5r:\2\u01ca"+
		"\u01c7\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb=\3\2\2\2"+
		"\u01cc\u01d1\5D#\2\u01cd\u01d1\5J&\2\u01ce\u01d1\5L\'\2\u01cf\u01d1\5"+
		"\u0096L\2\u01d0\u01cc\3\2\2\2\u01d0\u01cd\3\2\2\2\u01d0\u01ce\3\2\2\2"+
		"\u01d0\u01cf\3\2\2\2\u01d1?\3\2\2\2\u01d2\u01d5\7\r\2\2\u01d3\u01d5\5"+
		"B\"\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5A\3\2\2\2\u01d6\u01d7"+
		"\t\7\2\2\u01d7C\3\2\2\2\u01d8\u01d9\7D\2\2\u01d9\u01da\5H%\2\u01da\u01db"+
		"\5F$\2\u01db\u01dc\7\3\2\2\u01dcE\3\2\2\2\u01dd\u01de\t\b\2\2\u01deG\3"+
		"\2\2\2\u01df\u01e0\t\t\2\2\u01e0I\3\2\2\2\u01e1\u01e2\7=\2\2\u01e2\u01e3"+
		"\5@!\2\u01e3\u01e4\7\3\2\2\u01e4K\3\2\2\2\u01e5\u01e6\7F\2\2\u01e6\u01e7"+
		"\7\3\2\2\u01e7M\3\2\2\2\u01e8\u01e9\7\60\2\2\u01e9\u01ea\7\t\2\2\u01ea"+
		"\u01eb\5P)\2\u01eb\u01ec\7\n\2\2\u01ec\u01ee\7\16\2\2\u01ed\u01ef\5> "+
		"\2\u01ee\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1"+
		"\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\7\17\2\2\u01f3O\3\2\2\2\u01f4"+
		"\u01f5\5X-\2\u01f5\u01f6\5R*\2\u01f6Q\3\2\2\2\u01f7\u01fa\5T+\2\u01f8"+
		"\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01faS\3\2\2\2"+
		"\u01fb\u01fc\5V,\2\u01fc\u01fd\5P)\2\u01fdU\3\2\2\2\u01fe\u01ff\t\n\2"+
		"\2\u01ffW\3\2\2\2\u0200\u0201\5`\61\2\u0201\u0202\5Z.\2\u0202Y\3\2\2\2"+
		"\u0203\u0206\5\\/\2\u0204\u0206\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0204"+
		"\3\2\2\2\u0206[\3\2\2\2\u0207\u0208\5^\60\2\u0208\u0209\5X-\2\u0209]\3"+
		"\2\2\2\u020a\u020b\t\13\2\2\u020b_\3\2\2\2\u020c\u020d\5h\65\2\u020d\u020e"+
		"\5b\62\2\u020ea\3\2\2\2\u020f\u0212\5d\63\2\u0210\u0212\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0211\u0210\3\2\2\2\u0212c\3\2\2\2\u0213\u0214\5f\64\2"+
		"\u0214\u0215\5`\61\2\u0215e\3\2\2\2\u0216\u0217\t\f\2\2\u0217g\3\2\2\2"+
		"\u0218\u0219\5p9\2\u0219\u021a\5j\66\2\u021ai\3\2\2\2\u021b\u021e\5l\67"+
		"\2\u021c\u021e\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021c\3\2\2\2\u021ek"+
		"\3\2\2\2\u021f\u0220\5n8\2\u0220\u0221\5h\65\2\u0221m\3\2\2\2\u0222\u0223"+
		"\t\r\2\2\u0223o\3\2\2\2\u0224\u022a\7=\2\2\u0225\u0226\7\t\2\2\u0226\u0227"+
		"\5X-\2\u0227\u0228\7\n\2\2\u0228\u022a\3\2\2\2\u0229\u0224\3\2\2\2\u0229"+
		"\u0225\3\2\2\2\u022aq\3\2\2\2\u022b\u022c\7\62\2\2\u022c\u022d\5t;\2\u022d"+
		"\u022e\7\63\2\2\u022e\u022f\5t;\2\u022f\u0230\7\64\2\2\u0230\u0232\7\16"+
		"\2\2\u0231\u0233\5> \2\u0232\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0232"+
		"\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\7\17\2\2"+
		"\u0237s\3\2\2\2\u0238\u023b\7\"\2\2\u0239\u023b\5\30\r\2\u023a\u0238\3"+
		"\2\2\2\u023a\u0239\3\2\2\2\u023bu\3\2\2\2\u023c\u023d\5x=\2\u023d\u023e"+
		"\5`\61\2\u023e\u023f\5x=\2\u023fw\3\2\2\2\u0240\u0244\7=\2\2\u0241\u0244"+
		"\7\"\2\2\u0242\u0244\5z>\2\u0243\u0240\3\2\2\2\u0243\u0241\3\2\2\2\u0243"+
		"\u0242\3\2\2\2\u0244y\3\2\2\2\u0245\u0246\7=\2\2\u0246\u0247\7\33\2\2"+
		"\u0247\u0248\5|?\2\u0248{\3\2\2\2\u0249\u024a\t\16\2\2\u024a}\3\2\2\2"+
		"\u024b\u024c\5\u0080A\2\u024c\u024d\5`\61\2\u024d\u024e\5\u0080A\2\u024e"+
		"\177\3\2\2\2\u024f\u0253\7=\2\2\u0250\u0253\7!\2\2\u0251\u0253\5\u0082"+
		"B\2\u0252\u024f\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0251\3\2\2\2\u0253"+
		"\u0081\3\2\2\2\u0254\u0255\7=\2\2\u0255\u0256\7\33\2\2\u0256\u0257\5\u0084"+
		"C\2\u0257\u0083\3\2\2\2\u0258\u0259\t\17\2\2\u0259\u0085\3\2\2\2\u025a"+
		"\u025b\5\u0088E\2\u025b\u025c\5`\61\2\u025c\u025f\3\2\2\2\u025d\u025f"+
		"\5\u0088E\2\u025e\u025a\3\2\2\2\u025e\u025d\3\2\2\2\u025f\u0087\3\2\2"+
		"\2\u0260\u0264\7=\2\2\u0261\u0264\7 \2\2\u0262\u0264\5\u008aF\2\u0263"+
		"\u0260\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0262\3\2\2\2\u0264\u0089\3\2"+
		"\2\2\u0265\u0266\7=\2\2\u0266\u0267\7\33\2\2\u0267\u0268\5\u008cG\2\u0268"+
		"\u008b\3\2\2\2\u0269\u026a\t\20\2\2\u026a\u008d\3\2\2\2\u026b\u026d\7"+
		"\16\2\2\u026c\u026e\5\u0090I\2\u026d\u026c\3\2\2\2\u026e\u026f\3\2\2\2"+
		"\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272"+
		"\7\17\2\2\u0272\u008f\3\2\2\2\u0273\u0276\7%\2\2\u0274\u0276\5<\37\2\u0275"+
		"\u0273\3\2\2\2\u0275\u0274\3\2\2\2\u0276\u0091\3\2\2\2\u0277\u0278\7&"+
		"\2\2\u0278\u0279\7\'\2\2\u0279\u027a\7(\2\2\u027a\u027b\7\t\2\2\u027b"+
		"\u027c\7\n\2\2\u027c\u027d\5\u008eH\2\u027d\u0093\3\2\2\2\u027e\u0280"+
		"\7&\2\2\u027f\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u027f\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\7(\2\2\u0284\u0095\3\2"+
		"\2\2\u0285\u0286\7=\2\2\u0286\u0287\7\t\2\2\u0287\u0288\5\u0098M\2\u0288"+
		"\u0289\7\n\2\2\u0289\u028a\7\3\2\2\u028a\u0097\3\2\2\2\u028b\u0290\7="+
		"\2\2\u028c\u028d\7=\2\2\u028d\u028e\7\b\2\2\u028e\u0290\5\u0098M\2\u028f"+
		"\u028b\3\2\2\2\u028f\u028c\3\2\2\2\u0290\u0099\3\2\2\2>\u009d\u00a4\u00ab"+
		"\u00b4\u00c4\u00ca\u00d5\u00dc\u00e3\u00ea\u00f1\u00f7\u00fe\u0105\u010c"+
		"\u0113\u011d\u0124\u0128\u012d\u0134\u013b\u0144\u014b\u014f\u0154\u015f"+
		"\u0163\u016a\u0171\u017c\u0184\u0188\u018f\u0196\u019d\u01a8\u01ad\u01b7"+
		"\u01bf\u01c5\u01ca\u01d0\u01d4\u01f0\u01f9\u0205\u0211\u021d\u0229\u0234"+
		"\u023a\u0243\u0252\u025e\u0263\u026f\u0275\u0281\u028f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}