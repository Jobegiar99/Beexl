// Generated from c:\Users\berna\OneDrive\Documents\Compiladores\beexl.g4 by ANTLR 4.8
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
		T__17=18, T__18=19, T__19=20, T__20=21, WS=22, FILENAME=23, READ=24, CREATE=25, 
		CANVAS=26, RGBA=27, VECTOR=28, FORMAT=29, BACKGROUND=30, VAR=31, FUNCTION=32, 
		VOID=33, MAIN=34, RETURN=35, PRINT=36, MAX_RED=37, MAX_BLUE=38, MAX_GREEN=39, 
		MAX_ALPHA=40, FILL=41, PNG=42, JPG=43, JPEG=44, X=45, Y=46, INT=47, FLOAT=48, 
		RED=49, GREEN=50, BLUE=51, ALPHA=52, IF=53, ELSE=54, FROM=55, TO=56, WHILE=57, 
		DO=58, CANVAS_WIDTH=59, CANVAS_HEIGHT=60, NUMBER=61, DECIMAL_NUMBER=62, 
		STRINGFILENAME=63, ID=64;
	public static final int
		RULE_fileconfig0 = 0, RULE_fileconfig1 = 1, RULE_canvas0 = 2, RULE_background0 = 3, 
		RULE_type0 = 4, RULE_rgba0 = 5, RULE_rgba1 = 6, RULE_cExtras0 = 7, RULE_vector0 = 8, 
		RULE_vector1 = 9, RULE_vExtras0 = 10, RULE_vars0 = 11, RULE_instruction0 = 12, 
		RULE_while0 = 13, RULE_while1 = 14, RULE_extras0 = 15, RULE_pixelFill0 = 16, 
		RULE_assignment0 = 17, RULE_print0 = 18, RULE_functionCall0 = 19, RULE_conditional0 = 20, 
		RULE_conditional1 = 21, RULE_conditional2 = 22, RULE_hyperExp0 = 23, RULE_hyperExp1 = 24, 
		RULE_superExp0 = 25, RULE_superExp1 = 26, RULE_exp0 = 27, RULE_exp1 = 28, 
		RULE_term0 = 29, RULE_term1 = 30, RULE_factor0 = 31, RULE_expressionRestart0 = 32, 
		RULE_vectorAttribute0 = 33, RULE_rgbaAttribute0 = 34, RULE_rgbaAttribute1 = 35, 
		RULE_block0 = 36, RULE_main0 = 37, RULE_body0 = 38, RULE_functionDefinition0 = 39, 
		RULE_functionDefinition1 = 40, RULE_functionDefinition2 = 41, RULE_functionDefinition3 = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"fileconfig0", "fileconfig1", "canvas0", "background0", "type0", "rgba0", 
			"rgba1", "cExtras0", "vector0", "vector1", "vExtras0", "vars0", "instruction0", 
			"while0", "while1", "extras0", "pixelFill0", "assignment0", "print0", 
			"functionCall0", "conditional0", "conditional1", "conditional2", "hyperExp0", 
			"hyperExp1", "superExp0", "superExp1", "exp0", "exp1", "term0", "term1", 
			"factor0", "expressionRestart0", "vectorAttribute0", "rgbaAttribute0", 
			"rgbaAttribute1", "block0", "main0", "body0", "functionDefinition0", 
			"functionDefinition1", "functionDefinition2", "functionDefinition3"
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
		public Body0Context body0() {
			return getRuleContext(Body0Context.class,0);
		}
		public List<Vars0Context> vars0() {
			return getRuleContexts(Vars0Context.class);
		}
		public Vars0Context vars0(int i) {
			return getRuleContext(Vars0Context.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(FILENAME);
			setState(87);
			fileconfig1();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(88);
				vars0();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			body0();
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
		public TerminalNode STRINGFILENAME() { return getToken(beexlParser.STRINGFILENAME, 0); }
		public TerminalNode CREATE() { return getToken(beexlParser.CREATE, 0); }
		public Canvas0Context canvas0() {
			return getRuleContext(Canvas0Context.class,0);
		}
		public Background0Context background0() {
			return getRuleContext(Background0Context.class,0);
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
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(READ);
				setState(97);
				match(STRINGFILENAME);
				setState(98);
				match(T__0);
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(CREATE);
				setState(100);
				match(STRINGFILENAME);
				setState(101);
				match(T__0);
				setState(102);
				canvas0();
				setState(103);
				background0();
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

	public static class Canvas0Context extends ParserRuleContext {
		public TerminalNode CANVAS() { return getToken(beexlParser.CANVAS, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(beexlParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(beexlParser.NUMBER, i);
		}
		public Canvas0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canvas0; }
	}

	public final Canvas0Context canvas0() throws RecognitionException {
		Canvas0Context _localctx = new Canvas0Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_canvas0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(CANVAS);
			setState(108);
			match(NUMBER);
			setState(109);
			match(T__1);
			setState(110);
			match(NUMBER);
			setState(111);
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

	public static class Background0Context extends ParserRuleContext {
		public TerminalNode BACKGROUND() { return getToken(beexlParser.BACKGROUND, 0); }
		public Rgba0Context rgba0() {
			return getRuleContext(Rgba0Context.class,0);
		}
		public Background0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_background0; }
	}

	public final Background0Context background0() throws RecognitionException {
		Background0Context _localctx = new Background0Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_background0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(BACKGROUND);
			setState(114);
			rgba0();
			setState(115);
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

	public static class Type0Context extends ParserRuleContext {
		public TerminalNode VECTOR() { return getToken(beexlParser.VECTOR, 0); }
		public TerminalNode RGBA() { return getToken(beexlParser.RGBA, 0); }
		public TerminalNode INT() { return getToken(beexlParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(beexlParser.FLOAT, 0); }
		public Type0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type0; }
	}

	public final Type0Context type0() throws RecognitionException {
		Type0Context _localctx = new Type0Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_type0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RGBA) | (1L << VECTOR) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
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

	public static class Rgba0Context extends ParserRuleContext {
		public TerminalNode RGBA() { return getToken(beexlParser.RGBA, 0); }
		public List<Rgba1Context> rgba1() {
			return getRuleContexts(Rgba1Context.class);
		}
		public Rgba1Context rgba1(int i) {
			return getRuleContext(Rgba1Context.class,i);
		}
		public Rgba0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgba0; }
	}

	public final Rgba0Context rgba0() throws RecognitionException {
		Rgba0Context _localctx = new Rgba0Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_rgba0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(RGBA);
			setState(120);
			match(T__2);
			setState(121);
			rgba1();
			setState(122);
			match(T__1);
			setState(123);
			rgba1();
			setState(124);
			match(T__1);
			setState(125);
			rgba1();
			setState(126);
			match(T__1);
			setState(127);
			rgba1();
			setState(128);
			match(T__3);
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
		public CExtras0Context cExtras0() {
			return getRuleContext(CExtras0Context.class,0);
		}
		public TerminalNode NUMBER() { return getToken(beexlParser.NUMBER, 0); }
		public Rgba1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgba1; }
	}

	public final Rgba1Context rgba1() throws RecognitionException {
		Rgba1Context _localctx = new Rgba1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_rgba1);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAX_RED:
			case MAX_BLUE:
			case MAX_GREEN:
			case MAX_ALPHA:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				cExtras0();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(NUMBER);
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
		enterRule(_localctx, 14, RULE_cExtras0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAX_RED) | (1L << MAX_BLUE) | (1L << MAX_GREEN) | (1L << MAX_ALPHA))) != 0)) ) {
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
		public List<Vector1Context> vector1() {
			return getRuleContexts(Vector1Context.class);
		}
		public Vector1Context vector1(int i) {
			return getRuleContext(Vector1Context.class,i);
		}
		public Vector0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector0; }
	}

	public final Vector0Context vector0() throws RecognitionException {
		Vector0Context _localctx = new Vector0Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_vector0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(VECTOR);
			setState(137);
			match(T__2);
			setState(138);
			vector1();
			setState(139);
			match(T__1);
			setState(140);
			vector1();
			setState(141);
			match(T__3);
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
		enterRule(_localctx, 18, RULE_vector1);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(NUMBER);
				}
				break;
			case CANVAS_WIDTH:
			case CANVAS_HEIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				vExtras0();
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
		enterRule(_localctx, 20, RULE_vExtras0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
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
		public Type0Context type0() {
			return getRuleContext(Type0Context.class,0);
		}
		public Vars0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars0; }
	}

	public final Vars0Context vars0() throws RecognitionException {
		Vars0Context _localctx = new Vars0Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_vars0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(VAR);
			setState(150);
			match(ID);
			setState(151);
			match(T__4);
			setState(152);
			type0();
			setState(153);
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

	public static class Instruction0Context extends ParserRuleContext {
		public Extras0Context extras0() {
			return getRuleContext(Extras0Context.class,0);
		}
		public Conditional0Context conditional0() {
			return getRuleContext(Conditional0Context.class,0);
		}
		public While0Context while0() {
			return getRuleContext(While0Context.class,0);
		}
		public Instruction0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction0; }
	}

	public final Instruction0Context instruction0() throws RecognitionException {
		Instruction0Context _localctx = new Instruction0Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_instruction0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
			case FILL:
			case ID:
				{
				setState(155);
				extras0();
				}
				break;
			case IF:
				{
				setState(156);
				conditional0();
				}
				break;
			case WHILE:
				{
				setState(157);
				while0();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class While0Context extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(beexlParser.WHILE, 0); }
		public HyperExp0Context hyperExp0() {
			return getRuleContext(HyperExp0Context.class,0);
		}
		public While1Context while1() {
			return getRuleContext(While1Context.class,0);
		}
		public While0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while0; }
	}

	public final While0Context while0() throws RecognitionException {
		While0Context _localctx = new While0Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_while0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(WHILE);
			setState(161);
			match(T__2);
			setState(162);
			hyperExp0();
			setState(163);
			match(T__3);
			setState(164);
			while1();
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

	public static class While1Context extends ParserRuleContext {
		public List<Extras0Context> extras0() {
			return getRuleContexts(Extras0Context.class);
		}
		public Extras0Context extras0(int i) {
			return getRuleContext(Extras0Context.class,i);
		}
		public While1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while1; }
	}

	public final While1Context while1() throws RecognitionException {
		While1Context _localctx = new While1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_while1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__5);
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				extras0();
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (PRINT - 36)) | (1L << (FILL - 36)) | (1L << (ID - 36)))) != 0) );
			setState(172);
			match(T__6);
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
		enterRule(_localctx, 30, RULE_extras0);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				pixelFill0();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				assignment0();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				print0();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
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

	public static class PixelFill0Context extends ParserRuleContext {
		public TerminalNode FILL() { return getToken(beexlParser.FILL, 0); }
		public List<TerminalNode> ID() { return getTokens(beexlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(beexlParser.ID, i);
		}
		public Vector0Context vector0() {
			return getRuleContext(Vector0Context.class,0);
		}
		public Rgba0Context rgba0() {
			return getRuleContext(Rgba0Context.class,0);
		}
		public PixelFill0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pixelFill0; }
	}

	public final PixelFill0Context pixelFill0() throws RecognitionException {
		PixelFill0Context _localctx = new PixelFill0Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_pixelFill0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(FILL);
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(181);
				match(ID);
				}
				break;
			case VECTOR:
				{
				setState(182);
				vector0();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(185);
			match(T__1);
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(186);
				match(ID);
				}
				break;
			case RGBA:
				{
				setState(187);
				rgba0();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(190);
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

	public static class Assignment0Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(beexlParser.ID, 0); }
		public HyperExp0Context hyperExp0() {
			return getRuleContext(HyperExp0Context.class,0);
		}
		public Vector0Context vector0() {
			return getRuleContext(Vector0Context.class,0);
		}
		public Rgba0Context rgba0() {
			return getRuleContext(Rgba0Context.class,0);
		}
		public Assignment0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment0; }
	}

	public final Assignment0Context assignment0() throws RecognitionException {
		Assignment0Context _localctx = new Assignment0Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ID);
			setState(193);
			match(T__7);
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case NUMBER:
			case DECIMAL_NUMBER:
			case ID:
				{
				setState(194);
				hyperExp0();
				}
				break;
			case VECTOR:
				{
				setState(195);
				vector0();
				}
				break;
			case RGBA:
				{
				setState(196);
				rgba0();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(199);
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
		enterRule(_localctx, 36, RULE_print0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(PRINT);
			setState(202);
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

	public static class FunctionCall0Context extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(beexlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(beexlParser.ID, i);
		}
		public FunctionCall0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall0; }
	}

	public final FunctionCall0Context functionCall0() throws RecognitionException {
		FunctionCall0Context _localctx = new FunctionCall0Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionCall0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(ID);
			setState(205);
			match(T__2);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				{
				setState(206);
				match(ID);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(207);
					match(T__1);
					setState(208);
					match(ID);
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(T__3);
			setState(220);
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
		public Conditional1Context conditional1() {
			return getRuleContext(Conditional1Context.class,0);
		}
		public Conditional0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional0; }
	}

	public final Conditional0Context conditional0() throws RecognitionException {
		Conditional0Context _localctx = new Conditional0Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_conditional0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(IF);
			setState(223);
			match(T__2);
			setState(224);
			hyperExp0();
			setState(225);
			match(T__3);
			setState(226);
			conditional1();
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

	public static class Conditional1Context extends ParserRuleContext {
		public List<Extras0Context> extras0() {
			return getRuleContexts(Extras0Context.class);
		}
		public Extras0Context extras0(int i) {
			return getRuleContext(Extras0Context.class,i);
		}
		public Conditional2Context conditional2() {
			return getRuleContext(Conditional2Context.class,0);
		}
		public Conditional1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional1; }
	}

	public final Conditional1Context conditional1() throws RecognitionException {
		Conditional1Context _localctx = new Conditional1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditional1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__5);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (PRINT - 36)) | (1L << (FILL - 36)) | (1L << (ID - 36)))) != 0)) {
				{
				{
				setState(229);
				extras0();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(T__6);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(236);
				conditional2();
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

	public static class Conditional2Context extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(beexlParser.ELSE, 0); }
		public List<Extras0Context> extras0() {
			return getRuleContexts(Extras0Context.class);
		}
		public Extras0Context extras0(int i) {
			return getRuleContext(Extras0Context.class,i);
		}
		public Conditional2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional2; }
	}

	public final Conditional2Context conditional2() throws RecognitionException {
		Conditional2Context _localctx = new Conditional2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_conditional2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(ELSE);
			setState(240);
			match(T__5);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (PRINT - 36)) | (1L << (FILL - 36)) | (1L << (ID - 36)))) != 0)) {
				{
				{
				setState(241);
				extras0();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(T__6);
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
		public HyperExp1Context hyperExp1() {
			return getRuleContext(HyperExp1Context.class,0);
		}
		public HyperExp0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hyperExp0; }
	}

	public final HyperExp0Context hyperExp0() throws RecognitionException {
		HyperExp0Context _localctx = new HyperExp0Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_hyperExp0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			superExp0();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__8 - 3)) | (1L << (T__9 - 3)) | (1L << (NUMBER - 3)) | (1L << (DECIMAL_NUMBER - 3)) | (1L << (ID - 3)))) != 0)) {
				{
				setState(250);
				hyperExp1();
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

	public static class HyperExp1Context extends ParserRuleContext {
		public HyperExp0Context hyperExp0() {
			return getRuleContext(HyperExp0Context.class,0);
		}
		public HyperExp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hyperExp1; }
	}

	public final HyperExp1Context hyperExp1() throws RecognitionException {
		HyperExp1Context _localctx = new HyperExp1Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_hyperExp1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(253);
				match(T__8);
				}
				break;
			case T__2:
			case NUMBER:
			case DECIMAL_NUMBER:
			case ID:
				{
				}
				break;
			case T__9:
				{
				setState(255);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(258);
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

	public static class SuperExp0Context extends ParserRuleContext {
		public Exp0Context exp0() {
			return getRuleContext(Exp0Context.class,0);
		}
		public SuperExp1Context superExp1() {
			return getRuleContext(SuperExp1Context.class,0);
		}
		public SuperExp0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superExp0; }
	}

	public final SuperExp0Context superExp0() throws RecognitionException {
		SuperExp0Context _localctx = new SuperExp0Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_superExp0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			exp0();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				setState(261);
				superExp1();
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

	public static class SuperExp1Context extends ParserRuleContext {
		public SuperExp0Context superExp0() {
			return getRuleContext(SuperExp0Context.class,0);
		}
		public SuperExp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superExp1; }
	}

	public final SuperExp1Context superExp1() throws RecognitionException {
		SuperExp1Context _localctx = new SuperExp1Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_superExp1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(265);
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

	public static class Exp0Context extends ParserRuleContext {
		public Term0Context term0() {
			return getRuleContext(Term0Context.class,0);
		}
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public Exp0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp0; }
	}

	public final Exp0Context exp0() throws RecognitionException {
		Exp0Context _localctx = new Exp0Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_exp0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			term0();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16 || _la==T__17) {
				{
				setState(268);
				exp1();
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

	public static class Exp1Context extends ParserRuleContext {
		public Exp0Context exp0() {
			return getRuleContext(Exp0Context.class,0);
		}
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_exp1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(272);
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

	public static class Term0Context extends ParserRuleContext {
		public Factor0Context factor0() {
			return getRuleContext(Factor0Context.class,0);
		}
		public Term1Context term1() {
			return getRuleContext(Term1Context.class,0);
		}
		public Term0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term0; }
	}

	public final Term0Context term0() throws RecognitionException {
		Term0Context _localctx = new Term0Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_term0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			factor0();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18 || _la==T__19) {
				{
				setState(275);
				term1();
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

	public static class Term1Context extends ParserRuleContext {
		public Term0Context term0() {
			return getRuleContext(Term0Context.class,0);
		}
		public Term1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term1; }
	}

	public final Term1Context term1() throws RecognitionException {
		Term1Context _localctx = new Term1Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_term1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__19) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(279);
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

	public static class Factor0Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(beexlParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(beexlParser.NUMBER, 0); }
		public TerminalNode DECIMAL_NUMBER() { return getToken(beexlParser.DECIMAL_NUMBER, 0); }
		public ExpressionRestart0Context expressionRestart0() {
			return getRuleContext(ExpressionRestart0Context.class,0);
		}
		public Factor0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor0; }
	}

	public final Factor0Context factor0() throws RecognitionException {
		Factor0Context _localctx = new Factor0Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_factor0);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(NUMBER);
				}
				break;
			case DECIMAL_NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(DECIMAL_NUMBER);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				expressionRestart0();
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

	public static class ExpressionRestart0Context extends ParserRuleContext {
		public HyperExp0Context hyperExp0() {
			return getRuleContext(HyperExp0Context.class,0);
		}
		public ExpressionRestart0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionRestart0; }
	}

	public final ExpressionRestart0Context expressionRestart0() throws RecognitionException {
		ExpressionRestart0Context _localctx = new ExpressionRestart0Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_expressionRestart0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__2);
			setState(288);
			hyperExp0();
			setState(289);
			match(T__3);
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
		public TerminalNode X() { return getToken(beexlParser.X, 0); }
		public TerminalNode Y() { return getToken(beexlParser.Y, 0); }
		public VectorAttribute0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorAttribute0; }
	}

	public final VectorAttribute0Context vectorAttribute0() throws RecognitionException {
		VectorAttribute0Context _localctx = new VectorAttribute0Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_vectorAttribute0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(ID);
			setState(292);
			match(T__20);
			setState(293);
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
		enterRule(_localctx, 68, RULE_rgbaAttribute0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(ID);
			setState(296);
			match(T__20);
			setState(297);
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
		enterRule(_localctx, 70, RULE_rgbaAttribute1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
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

	public static class Block0Context extends ParserRuleContext {
		public List<Vars0Context> vars0() {
			return getRuleContexts(Vars0Context.class);
		}
		public Vars0Context vars0(int i) {
			return getRuleContext(Vars0Context.class,i);
		}
		public List<Instruction0Context> instruction0() {
			return getRuleContexts(Instruction0Context.class);
		}
		public Instruction0Context instruction0(int i) {
			return getRuleContext(Instruction0Context.class,i);
		}
		public Block0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block0; }
	}

	public final Block0Context block0() throws RecognitionException {
		Block0Context _localctx = new Block0Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_block0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__5);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (VAR - 31)) | (1L << (PRINT - 31)) | (1L << (FILL - 31)) | (1L << (IF - 31)) | (1L << (WHILE - 31)) | (1L << (ID - 31)))) != 0)) {
				{
				setState(304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(302);
					vars0();
					}
					break;
				case PRINT:
				case FILL:
				case IF:
				case WHILE:
				case ID:
					{
					setState(303);
					instruction0();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			match(T__6);
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
		enterRule(_localctx, 74, RULE_main0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(FUNCTION);
			setState(312);
			match(VOID);
			setState(313);
			match(MAIN);
			setState(314);
			match(T__2);
			setState(315);
			match(T__3);
			setState(316);
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
		public Main0Context main0() {
			return getRuleContext(Main0Context.class,0);
		}
		public List<FunctionDefinition0Context> functionDefinition0() {
			return getRuleContexts(FunctionDefinition0Context.class);
		}
		public FunctionDefinition0Context functionDefinition0(int i) {
			return getRuleContext(FunctionDefinition0Context.class,i);
		}
		public Body0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body0; }
	}

	public final Body0Context body0() throws RecognitionException {
		Body0Context _localctx = new Body0Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_body0);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(318);
					functionDefinition0();
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(324);
			main0();
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

	public static class FunctionDefinition0Context extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(beexlParser.FUNCTION, 0); }
		public FunctionDefinition1Context functionDefinition1() {
			return getRuleContext(FunctionDefinition1Context.class,0);
		}
		public TerminalNode ID() { return getToken(beexlParser.ID, 0); }
		public FunctionDefinition3Context functionDefinition3() {
			return getRuleContext(FunctionDefinition3Context.class,0);
		}
		public List<FunctionDefinition2Context> functionDefinition2() {
			return getRuleContexts(FunctionDefinition2Context.class);
		}
		public FunctionDefinition2Context functionDefinition2(int i) {
			return getRuleContext(FunctionDefinition2Context.class,i);
		}
		public FunctionDefinition0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition0; }
	}

	public final FunctionDefinition0Context functionDefinition0() throws RecognitionException {
		FunctionDefinition0Context _localctx = new FunctionDefinition0Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionDefinition0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(FUNCTION);
			setState(327);
			functionDefinition1();
			setState(328);
			match(ID);
			setState(329);
			match(T__2);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(330);
				functionDefinition2();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(T__3);
			setState(337);
			functionDefinition3();
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

	public static class FunctionDefinition1Context extends ParserRuleContext {
		public Type0Context type0() {
			return getRuleContext(Type0Context.class,0);
		}
		public TerminalNode VOID() { return getToken(beexlParser.VOID, 0); }
		public FunctionDefinition1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition1; }
	}

	public final FunctionDefinition1Context functionDefinition1() throws RecognitionException {
		FunctionDefinition1Context _localctx = new FunctionDefinition1Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_functionDefinition1);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RGBA:
			case VECTOR:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				type0();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(VOID);
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

	public static class FunctionDefinition2Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(beexlParser.ID, 0); }
		public Type0Context type0() {
			return getRuleContext(Type0Context.class,0);
		}
		public FunctionDefinition2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition2; }
	}

	public final FunctionDefinition2Context functionDefinition2() throws RecognitionException {
		FunctionDefinition2Context _localctx = new FunctionDefinition2Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_functionDefinition2);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(ID);
				setState(344);
				match(T__4);
				setState(345);
				type0();
				setState(346);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(ID);
				setState(349);
				match(T__4);
				setState(350);
				type0();
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

	public static class FunctionDefinition3Context extends ParserRuleContext {
		public Block0Context block0() {
			return getRuleContext(Block0Context.class,0);
		}
		public FunctionDefinition3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition3; }
	}

	public final FunctionDefinition3Context functionDefinition3() throws RecognitionException {
		FunctionDefinition3Context _localctx = new FunctionDefinition3Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_functionDefinition3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u0166\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3l\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u0087\n\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u0094\n\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00a1\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\6\20\u00ab\n\20\r\20\16\20\u00ac\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\5\21\u00b5\n\21\3\22\3\22\3\22\5\22\u00ba\n\22\3\22"+
		"\3\22\3\22\5\22\u00bf\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00c8"+
		"\n\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u00d4\n\25"+
		"\f\25\16\25\u00d7\13\25\7\25\u00d9\n\25\f\25\16\25\u00dc\13\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\7\27\u00e9\n\27\f\27"+
		"\16\27\u00ec\13\27\3\27\3\27\5\27\u00f0\n\27\3\30\3\30\3\30\7\30\u00f5"+
		"\n\30\f\30\16\30\u00f8\13\30\3\30\3\30\3\31\3\31\5\31\u00fe\n\31\3\32"+
		"\3\32\3\32\5\32\u0103\n\32\3\32\3\32\3\33\3\33\5\33\u0109\n\33\3\34\3"+
		"\34\3\34\3\35\3\35\5\35\u0110\n\35\3\36\3\36\3\36\3\37\3\37\5\37\u0117"+
		"\n\37\3 \3 \3 \3!\3!\3!\3!\5!\u0120\n!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\3%\3%\3&\3&\3&\7&\u0133\n&\f&\16&\u0136\13&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3(\7(\u0142\n(\f(\16(\u0145\13(\3(\3(\3)\3)\3)\3)\3"+
		")\7)\u014e\n)\f)\16)\u0151\13)\3)\3)\3)\3*\3*\5*\u0158\n*\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\5+\u0162\n+\3,\3,\3,\2\2-\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\n\4\2\35\36\61\62\3\2\'"+
		"*\3\2=>\3\2\r\22\3\2\23\24\3\2\25\26\3\2/\60\3\2\63\66\2\u015c\2X\3\2"+
		"\2\2\4k\3\2\2\2\6m\3\2\2\2\bs\3\2\2\2\nw\3\2\2\2\fy\3\2\2\2\16\u0086\3"+
		"\2\2\2\20\u0088\3\2\2\2\22\u008a\3\2\2\2\24\u0093\3\2\2\2\26\u0095\3\2"+
		"\2\2\30\u0097\3\2\2\2\32\u00a0\3\2\2\2\34\u00a2\3\2\2\2\36\u00a8\3\2\2"+
		"\2 \u00b4\3\2\2\2\"\u00b6\3\2\2\2$\u00c2\3\2\2\2&\u00cb\3\2\2\2(\u00ce"+
		"\3\2\2\2*\u00e0\3\2\2\2,\u00e6\3\2\2\2.\u00f1\3\2\2\2\60\u00fb\3\2\2\2"+
		"\62\u0102\3\2\2\2\64\u0106\3\2\2\2\66\u010a\3\2\2\28\u010d\3\2\2\2:\u0111"+
		"\3\2\2\2<\u0114\3\2\2\2>\u0118\3\2\2\2@\u011f\3\2\2\2B\u0121\3\2\2\2D"+
		"\u0125\3\2\2\2F\u0129\3\2\2\2H\u012d\3\2\2\2J\u012f\3\2\2\2L\u0139\3\2"+
		"\2\2N\u0143\3\2\2\2P\u0148\3\2\2\2R\u0157\3\2\2\2T\u0161\3\2\2\2V\u0163"+
		"\3\2\2\2XY\7\31\2\2Y]\5\4\3\2Z\\\5\30\r\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2"+
		"\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\5N(\2a\3\3\2\2\2bc\7\32\2\2cd\7A\2"+
		"\2dl\7\3\2\2ef\7\33\2\2fg\7A\2\2gh\7\3\2\2hi\5\6\4\2ij\5\b\5\2jl\3\2\2"+
		"\2kb\3\2\2\2ke\3\2\2\2l\5\3\2\2\2mn\7\34\2\2no\7?\2\2op\7\4\2\2pq\7?\2"+
		"\2qr\7\3\2\2r\7\3\2\2\2st\7 \2\2tu\5\f\7\2uv\7\3\2\2v\t\3\2\2\2wx\t\2"+
		"\2\2x\13\3\2\2\2yz\7\35\2\2z{\7\5\2\2{|\5\16\b\2|}\7\4\2\2}~\5\16\b\2"+
		"~\177\7\4\2\2\177\u0080\5\16\b\2\u0080\u0081\7\4\2\2\u0081\u0082\5\16"+
		"\b\2\u0082\u0083\7\6\2\2\u0083\r\3\2\2\2\u0084\u0087\5\20\t\2\u0085\u0087"+
		"\7?\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\17\3\2\2\2\u0088"+
		"\u0089\t\3\2\2\u0089\21\3\2\2\2\u008a\u008b\7\36\2\2\u008b\u008c\7\5\2"+
		"\2\u008c\u008d\5\24\13\2\u008d\u008e\7\4\2\2\u008e\u008f\5\24\13\2\u008f"+
		"\u0090\7\6\2\2\u0090\23\3\2\2\2\u0091\u0094\7?\2\2\u0092\u0094\5\26\f"+
		"\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\25\3\2\2\2\u0095\u0096"+
		"\t\4\2\2\u0096\27\3\2\2\2\u0097\u0098\7!\2\2\u0098\u0099\7B\2\2\u0099"+
		"\u009a\7\7\2\2\u009a\u009b\5\n\6\2\u009b\u009c\7\3\2\2\u009c\31\3\2\2"+
		"\2\u009d\u00a1\5 \21\2\u009e\u00a1\5*\26\2\u009f\u00a1\5\34\17\2\u00a0"+
		"\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\33\3\2\2"+
		"\2\u00a2\u00a3\7;\2\2\u00a3\u00a4\7\5\2\2\u00a4\u00a5\5\60\31\2\u00a5"+
		"\u00a6\7\6\2\2\u00a6\u00a7\5\36\20\2\u00a7\35\3\2\2\2\u00a8\u00aa\7\b"+
		"\2\2\u00a9\u00ab\5 \21\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\t"+
		"\2\2\u00af\37\3\2\2\2\u00b0\u00b5\5\"\22\2\u00b1\u00b5\5$\23\2\u00b2\u00b5"+
		"\5&\24\2\u00b3\u00b5\5(\25\2\u00b4\u00b0\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5!\3\2\2\2\u00b6\u00b9\7+\2\2\u00b7"+
		"\u00ba\7B\2\2\u00b8\u00ba\5\22\n\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00be\7\4\2\2\u00bc\u00bf\7B\2\2\u00bd"+
		"\u00bf\5\f\7\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c1\7\3\2\2\u00c1#\3\2\2\2\u00c2\u00c3\7B\2\2\u00c3\u00c7"+
		"\7\n\2\2\u00c4\u00c8\5\60\31\2\u00c5\u00c8\5\22\n\2\u00c6\u00c8\5\f\7"+
		"\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00ca\7\3\2\2\u00ca%\3\2\2\2\u00cb\u00cc\7&\2\2\u00cc\u00cd"+
		"\7\3\2\2\u00cd\'\3\2\2\2\u00ce\u00cf\7B\2\2\u00cf\u00da\7\5\2\2\u00d0"+
		"\u00d5\7B\2\2\u00d1\u00d2\7\4\2\2\u00d2\u00d4\7B\2\2\u00d3\u00d1\3\2\2"+
		"\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00de\7\6\2\2\u00de\u00df\7\3\2\2\u00df)\3\2\2\2\u00e0\u00e1"+
		"\7\67\2\2\u00e1\u00e2\7\5\2\2\u00e2\u00e3\5\60\31\2\u00e3\u00e4\7\6\2"+
		"\2\u00e4\u00e5\5,\27\2\u00e5+\3\2\2\2\u00e6\u00ea\7\b\2\2\u00e7\u00e9"+
		"\5 \21\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\7\t"+
		"\2\2\u00ee\u00f0\5.\30\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"-\3\2\2\2\u00f1\u00f2\78\2\2\u00f2\u00f6\7\b\2\2\u00f3\u00f5\5 \21\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\t\2\2\u00fa"+
		"/\3\2\2\2\u00fb\u00fd\5\64\33\2\u00fc\u00fe\5\62\32\2\u00fd\u00fc\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\61\3\2\2\2\u00ff\u0103\7\13\2\2\u0100\u0103"+
		"\3\2\2\2\u0101\u0103\7\f\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\5\60\31\2\u0105\63\3\2"+
		"\2\2\u0106\u0108\58\35\2\u0107\u0109\5\66\34\2\u0108\u0107\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\65\3\2\2\2\u010a\u010b\t\5\2\2\u010b\u010c\5\64\33"+
		"\2\u010c\67\3\2\2\2\u010d\u010f\5<\37\2\u010e\u0110\5:\36\2\u010f\u010e"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u01109\3\2\2\2\u0111\u0112\t\6\2\2\u0112"+
		"\u0113\58\35\2\u0113;\3\2\2\2\u0114\u0116\5@!\2\u0115\u0117\5> \2\u0116"+
		"\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117=\3\2\2\2\u0118\u0119\t\7\2\2"+
		"\u0119\u011a\5<\37\2\u011a?\3\2\2\2\u011b\u0120\7B\2\2\u011c\u0120\7?"+
		"\2\2\u011d\u0120\7@\2\2\u011e\u0120\5B\"\2\u011f\u011b\3\2\2\2\u011f\u011c"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120A\3\2\2\2\u0121"+
		"\u0122\7\5\2\2\u0122\u0123\5\60\31\2\u0123\u0124\7\6\2\2\u0124C\3\2\2"+
		"\2\u0125\u0126\7B\2\2\u0126\u0127\7\27\2\2\u0127\u0128\t\b\2\2\u0128E"+
		"\3\2\2\2\u0129\u012a\7B\2\2\u012a\u012b\7\27\2\2\u012b\u012c\5H%\2\u012c"+
		"G\3\2\2\2\u012d\u012e\t\t\2\2\u012eI\3\2\2\2\u012f\u0134\7\b\2\2\u0130"+
		"\u0133\5\30\r\2\u0131\u0133\5\32\16\2\u0132\u0130\3\2\2\2\u0132\u0131"+
		"\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7\t\2\2\u0138K\3\2\2\2"+
		"\u0139\u013a\7\"\2\2\u013a\u013b\7#\2\2\u013b\u013c\7$\2\2\u013c\u013d"+
		"\7\5\2\2\u013d\u013e\7\6\2\2\u013e\u013f\5J&\2\u013fM\3\2\2\2\u0140\u0142"+
		"\5P)\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\5L"+
		"\'\2\u0147O\3\2\2\2\u0148\u0149\7\"\2\2\u0149\u014a\5R*\2\u014a\u014b"+
		"\7B\2\2\u014b\u014f\7\5\2\2\u014c\u014e\5T+\2\u014d\u014c\3\2\2\2\u014e"+
		"\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2"+
		"\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7\6\2\2\u0153\u0154\5V,\2\u0154Q"+
		"\3\2\2\2\u0155\u0158\5\n\6\2\u0156\u0158\7#\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0156\3\2\2\2\u0158S\3\2\2\2\u0159\u015a\7B\2\2\u015a\u015b\7\7\2\2\u015b"+
		"\u015c\5\n\6\2\u015c\u015d\7\4\2\2\u015d\u0162\3\2\2\2\u015e\u015f\7B"+
		"\2\2\u015f\u0160\7\7\2\2\u0160\u0162\5\n\6\2\u0161\u0159\3\2\2\2\u0161"+
		"\u015e\3\2\2\2\u0162U\3\2\2\2\u0163\u0164\5J&\2\u0164W\3\2\2\2\35]k\u0086"+
		"\u0093\u00a0\u00ac\u00b4\u00b9\u00be\u00c7\u00d5\u00da\u00ea\u00ef\u00f6"+
		"\u00fd\u0102\u0108\u010f\u0116\u011f\u0132\u0134\u0143\u014f\u0157\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}