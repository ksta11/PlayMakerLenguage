// Generated from c:/Users/plays/Documents/Paradigmas/mplsoccer/ANTLR4/Lenguage.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LenguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SIZE=8, IF=9, 
		ELSE=10, POSITION=11, PROCNAME=12, ASSIGN=13, ADD=14, LB=15, RB=16, LP=17, 
		RP=18, LS=19, RS=20, SUM=21, MIN=22, MUL=23, DIV=24, MOD=25, EQ=26, NEQ=27, 
		GT=28, LT=29, GET=30, LET=31, VAR=32, NUM=33, FLOAT=34, STRING=35, WS=36;
	public static final int
		RULE_root = 0, RULE_inss = 1, RULE_ins = 2, RULE_input_ = 3, RULE_output_ = 4, 
		RULE_condition = 5, RULE_while_ = 6, RULE_siz = 7, RULE_tactics = 8, RULE_tacticName = 9, 
		RULE_position = 10, RULE_procDef = 11, RULE_proc = 12, RULE_assign = 13, 
		RULE_paramsId = 14, RULE_paramsExpr = 15, RULE_consult = 16, RULE_add = 17, 
		RULE_lista = 18, RULE_expr = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "inss", "ins", "input_", "output_", "condition", "while_", "siz", 
			"tactics", "tacticName", "position", "procDef", "proc", "assign", "paramsId", 
			"paramsExpr", "consult", "add", "lista", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<i>'", "'<o>'", "'while'", "'tactic'", "','", "'{'", "'}'", "'#'", 
			"'if'", "'else'", null, null, "'::'", "'<-'", "'<<'", "'>>'", "'('", 
			"')'", "'['", "']'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'/='", 
			"'>'", "'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "SIZE", "IF", "ELSE", 
			"POSITION", "PROCNAME", "ASSIGN", "ADD", "LB", "RB", "LP", "RP", "LS", 
			"RS", "SUM", "MIN", "MUL", "DIV", "MOD", "EQ", "NEQ", "GT", "LT", "GET", 
			"LET", "VAR", "NUM", "FLOAT", "STRING", "WS"
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
	public String getGrammarFileName() { return "Lenguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LenguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LenguageParser.EOF, 0); }
		public List<ProcDefContext> procDef() {
			return getRuleContexts(ProcDefContext.class);
		}
		public ProcDefContext procDef(int i) {
			return getRuleContext(ProcDefContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCNAME) {
				{
				{
				setState(40);
				procDef();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InssContext extends ParserRuleContext {
		public List<InsContext> ins() {
			return getRuleContexts(InsContext.class);
		}
		public InsContext ins(int i) {
			return getRuleContext(InsContext.class,i);
		}
		public InssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inss; }
	}

	public final InssContext inss() throws RecognitionException {
		InssContext _localctx = new InssContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294971934L) != 0)) {
				{
				{
				setState(48);
				ins();
				}
				}
				setState(53);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InsContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public Input_Context input_() {
			return getRuleContext(Input_Context.class,0);
		}
		public Output_Context output_() {
			return getRuleContext(Output_Context.class,0);
		}
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public TacticsContext tactics() {
			return getRuleContext(TacticsContext.class,0);
		}
		public InsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ins; }
	}

	public final InsContext ins() throws RecognitionException {
		InsContext _localctx = new InsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ins);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(54);
					condition();
					}
					break;
				case T__2:
					{
					setState(55);
					while_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(58);
					input_();
					}
					break;
				case T__1:
					{
					setState(59);
					output_();
					}
					break;
				case PROCNAME:
					{
					setState(60);
					proc();
					}
					break;
				case VAR:
					{
					setState(61);
					assign();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(64);
				add();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				tactics();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Input_Context extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LenguageParser.VAR, 0); }
		public Input_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_; }
	}

	public final Input_Context input_() throws RecognitionException {
		Input_Context _localctx = new Input_Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_input_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__0);
			setState(69);
			match(VAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Output_Context extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Output_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_; }
	}

	public final Output_Context output_() throws RecognitionException {
		Output_Context _localctx = new Output_Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_output_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72);
					expr(0);
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LenguageParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> LB() { return getTokens(LenguageParser.LB); }
		public TerminalNode LB(int i) {
			return getToken(LenguageParser.LB, i);
		}
		public List<InssContext> inss() {
			return getRuleContexts(InssContext.class);
		}
		public InssContext inss(int i) {
			return getRuleContext(InssContext.class,i);
		}
		public List<TerminalNode> RB() { return getTokens(LenguageParser.RB); }
		public TerminalNode RB(int i) {
			return getToken(LenguageParser.RB, i);
		}
		public TerminalNode ELSE() { return getToken(LenguageParser.ELSE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(IF);
			setState(79);
			expr(0);
			setState(80);
			match(LB);
			setState(81);
			inss();
			setState(82);
			match(RB);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(83);
				match(ELSE);
				setState(84);
				match(LB);
				setState(85);
				inss();
				setState(86);
				match(RB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LB() { return getToken(LenguageParser.LB, 0); }
		public InssContext inss() {
			return getRuleContext(InssContext.class,0);
		}
		public TerminalNode RB() { return getToken(LenguageParser.RB, 0); }
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__2);
			setState(91);
			expr(0);
			setState(92);
			match(LB);
			setState(93);
			inss();
			setState(94);
			match(RB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SizContext extends ParserRuleContext {
		public TerminalNode SIZE() { return getToken(LenguageParser.SIZE, 0); }
		public TerminalNode VAR() { return getToken(LenguageParser.VAR, 0); }
		public SizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siz; }
	}

	public final SizContext siz() throws RecognitionException {
		SizContext _localctx = new SizContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_siz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(SIZE);
			setState(97);
			match(VAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TacticsContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(LenguageParser.LB, 0); }
		public TacticNameContext tacticName() {
			return getRuleContext(TacticNameContext.class,0);
		}
		public TerminalNode LP() { return getToken(LenguageParser.LP, 0); }
		public List<PositionContext> position() {
			return getRuleContexts(PositionContext.class);
		}
		public PositionContext position(int i) {
			return getRuleContext(PositionContext.class,i);
		}
		public TerminalNode RP() { return getToken(LenguageParser.RP, 0); }
		public TerminalNode RB() { return getToken(LenguageParser.RB, 0); }
		public TacticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tactics; }
	}

	public final TacticsContext tactics() throws RecognitionException {
		TacticsContext _localctx = new TacticsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tactics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__3);
			setState(100);
			match(LB);
			setState(101);
			tacticName();
			setState(102);
			match(LP);
			setState(103);
			position();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(104);
				match(T__4);
				setState(105);
				position();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(RP);
			setState(112);
			match(RB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TacticNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LenguageParser.STRING, 0); }
		public TacticNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tacticName; }
	}

	public final TacticNameContext tacticName() throws RecognitionException {
		TacticNameContext _localctx = new TacticNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tacticName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PositionContext extends ParserRuleContext {
		public TerminalNode POSITION() { return getToken(LenguageParser.POSITION, 0); }
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(POSITION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProcDefContext extends ParserRuleContext {
		public TerminalNode PROCNAME() { return getToken(LenguageParser.PROCNAME, 0); }
		public ParamsIdContext paramsId() {
			return getRuleContext(ParamsIdContext.class,0);
		}
		public TerminalNode LB() { return getToken(LenguageParser.LB, 0); }
		public InssContext inss() {
			return getRuleContext(InssContext.class,0);
		}
		public TerminalNode RB() { return getToken(LenguageParser.RB, 0); }
		public ProcDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procDef; }
	}

	public final ProcDefContext procDef() throws RecognitionException {
		ProcDefContext _localctx = new ProcDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_procDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(PROCNAME);
			setState(119);
			paramsId();
			setState(120);
			match(LB);
			setState(121);
			inss();
			setState(122);
			match(RB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProcContext extends ParserRuleContext {
		public TerminalNode PROCNAME() { return getToken(LenguageParser.PROCNAME, 0); }
		public ParamsExprContext paramsExpr() {
			return getRuleContext(ParamsExprContext.class,0);
		}
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_proc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(PROCNAME);
			setState(125);
			paramsExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LenguageParser.VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(LenguageParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(VAR);
			setState(128);
			match(ASSIGN);
			setState(129);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsIdContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(LenguageParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(LenguageParser.VAR, i);
		}
		public ParamsIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsId; }
	}

	public final ParamsIdContext paramsId() throws RecognitionException {
		ParamsIdContext _localctx = new ParamsIdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_paramsId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(131);
				match(VAR);
				}
				}
				setState(136);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ParamsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsExpr; }
	}

	public final ParamsExprContext paramsExpr() throws RecognitionException {
		ParamsExprContext _localctx = new ParamsExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_paramsExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					expr(0);
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConsultContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LenguageParser.VAR, 0); }
		public TerminalNode LS() { return getToken(LenguageParser.LS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RS() { return getToken(LenguageParser.RS, 0); }
		public ConsultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consult; }
	}

	public final ConsultContext consult() throws RecognitionException {
		ConsultContext _localctx = new ConsultContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_consult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(VAR);
			setState(144);
			match(LS);
			setState(145);
			expr(0);
			setState(146);
			match(RS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LenguageParser.VAR, 0); }
		public TerminalNode ADD() { return getToken(LenguageParser.ADD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(VAR);
			setState(149);
			match(ADD);
			setState(150);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__5);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 64424640832L) != 0)) {
				{
				{
				setState(153);
				expr(0);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(LenguageParser.MOD, 0); }
		public ModContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LenguageParser.MUL, 0); }
		public MulContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ExprContext {
		public TerminalNode VAR() { return getToken(LenguageParser.VAR, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public TerminalNode LP() { return getToken(LenguageParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(LenguageParser.RP, 0); }
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ExprContext {
		public TerminalNode NUM() { return getToken(LenguageParser.NUM, 0); }
		public NumContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SzContext extends ExprContext {
		public SizContext siz() {
			return getRuleContext(SizContext.class,0);
		}
		public SzContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(LenguageParser.LT, 0); }
		public LtContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUM() { return getToken(LenguageParser.SUM, 0); }
		public SumContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(LenguageParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LstContext extends ExprContext {
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public LstContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(LenguageParser.EQ, 0); }
		public EqContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(LenguageParser.GT, 0); }
		public GtContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(LenguageParser.DIV, 0); }
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(LenguageParser.FLOAT, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MIN() { return getToken(LenguageParser.MIN, 0); }
		public MinContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConsulContext extends ExprContext {
		public ConsultContext consult() {
			return getRuleContext(ConsultContext.class,0);
		}
		public ConsulContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GET() { return getToken(LenguageParser.GET, 0); }
		public GetContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LET() { return getToken(LenguageParser.LET, 0); }
		public LetContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NeqContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(LenguageParser.NEQ, 0); }
		public NeqContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(162);
				match(NUM);
				}
				break;
			case 2:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(FLOAT);
				}
				break;
			case 3:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(VAR);
				}
				break;
			case 4:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(STRING);
				}
				break;
			case 5:
				{
				_localctx = new LstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				lista();
				}
				break;
			case 6:
				{
				_localctx = new SzContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				siz();
				}
				break;
			case 7:
				{
				_localctx = new ConsulContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				consult();
				}
				break;
			case 8:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(LP);
				setState(170);
				expr(0);
				setState(171);
				match(RP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(176);
						match(MUL);
						setState(177);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(179);
						match(DIV);
						setState(180);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(182);
						match(MOD);
						setState(183);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new SumContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(185);
						match(SUM);
						setState(186);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new MinContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(188);
						match(MIN);
						setState(189);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new GtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(191);
						match(GT);
						setState(192);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new GetContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(193);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(194);
						match(GET);
						setState(195);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new LtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(196);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(197);
						match(LT);
						setState(198);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new LetContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(199);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(200);
						match(LET);
						setState(201);
						expr(5);
						}
						break;
					case 10:
						{
						_localctx = new EqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(202);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(203);
						match(EQ);
						setState(204);
						expr(4);
						}
						break;
					case 11:
						{
						_localctx = new NeqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(205);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(206);
						match(NEQ);
						setState(207);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u00d6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0005\u0000*\b\u0000\n\u0000\f\u0000"+
		"-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u00012\b\u0001\n\u0001"+
		"\f\u00015\t\u0001\u0001\u0002\u0001\u0002\u0003\u00029\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002?\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0005\u0004J\b\u0004\n\u0004\f\u0004M\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005Y\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\bk\b\b\n\b\f\bn\t\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0005\u000e\u0085\b\u000e\n\u000e\f\u000e\u0088"+
		"\t\u000e\u0001\u000f\u0005\u000f\u008b\b\u000f\n\u000f\f\u000f\u008e\t"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u009b\b\u0012\n\u0012\f\u0012\u009e\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00ae\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00d1\b\u0013\n\u0013\f\u0013\u00d4\t\u0013\u0001\u0013\u0000\u0001&"+
		"\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&\u0000\u0000\u00e2\u0000+\u0001\u0000\u0000\u0000"+
		"\u00023\u0001\u0000\u0000\u0000\u0004B\u0001\u0000\u0000\u0000\u0006D"+
		"\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000\u0000\nN\u0001\u0000\u0000"+
		"\u0000\fZ\u0001\u0000\u0000\u0000\u000e`\u0001\u0000\u0000\u0000\u0010"+
		"c\u0001\u0000\u0000\u0000\u0012r\u0001\u0000\u0000\u0000\u0014t\u0001"+
		"\u0000\u0000\u0000\u0016v\u0001\u0000\u0000\u0000\u0018|\u0001\u0000\u0000"+
		"\u0000\u001a\u007f\u0001\u0000\u0000\u0000\u001c\u0086\u0001\u0000\u0000"+
		"\u0000\u001e\u008c\u0001\u0000\u0000\u0000 \u008f\u0001\u0000\u0000\u0000"+
		"\"\u0094\u0001\u0000\u0000\u0000$\u0098\u0001\u0000\u0000\u0000&\u00ad"+
		"\u0001\u0000\u0000\u0000(*\u0003\u0016\u000b\u0000)(\u0001\u0000\u0000"+
		"\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005"+
		"\u0000\u0000\u0001/\u0001\u0001\u0000\u0000\u000002\u0003\u0004\u0002"+
		"\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u00004\u0003\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u000069\u0003\n\u0005\u000079\u0003\f\u0006\u0000"+
		"86\u0001\u0000\u0000\u000087\u0001\u0000\u0000\u00009C\u0001\u0000\u0000"+
		"\u0000:?\u0003\u0006\u0003\u0000;?\u0003\b\u0004\u0000<?\u0003\u0018\f"+
		"\u0000=?\u0003\u001a\r\u0000>:\u0001\u0000\u0000\u0000>;\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?C\u0001\u0000"+
		"\u0000\u0000@C\u0003\"\u0011\u0000AC\u0003\u0010\b\u0000B8\u0001\u0000"+
		"\u0000\u0000B>\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BA\u0001"+
		"\u0000\u0000\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0005\u0001\u0000"+
		"\u0000EF\u0005 \u0000\u0000F\u0007\u0001\u0000\u0000\u0000GK\u0005\u0002"+
		"\u0000\u0000HJ\u0003&\u0013\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\t\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NO\u0005\t\u0000\u0000OP\u0003"+
		"&\u0013\u0000PQ\u0005\u000f\u0000\u0000QR\u0003\u0002\u0001\u0000RX\u0005"+
		"\u0010\u0000\u0000ST\u0005\n\u0000\u0000TU\u0005\u000f\u0000\u0000UV\u0003"+
		"\u0002\u0001\u0000VW\u0005\u0010\u0000\u0000WY\u0001\u0000\u0000\u0000"+
		"XS\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u000b\u0001\u0000"+
		"\u0000\u0000Z[\u0005\u0003\u0000\u0000[\\\u0003&\u0013\u0000\\]\u0005"+
		"\u000f\u0000\u0000]^\u0003\u0002\u0001\u0000^_\u0005\u0010\u0000\u0000"+
		"_\r\u0001\u0000\u0000\u0000`a\u0005\b\u0000\u0000ab\u0005 \u0000\u0000"+
		"b\u000f\u0001\u0000\u0000\u0000cd\u0005\u0004\u0000\u0000de\u0005\u000f"+
		"\u0000\u0000ef\u0003\u0012\t\u0000fg\u0005\u0011\u0000\u0000gl\u0003\u0014"+
		"\n\u0000hi\u0005\u0005\u0000\u0000ik\u0003\u0014\n\u0000jh\u0001\u0000"+
		"\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"op\u0005\u0012\u0000\u0000pq\u0005\u0010\u0000\u0000q\u0011\u0001\u0000"+
		"\u0000\u0000rs\u0005#\u0000\u0000s\u0013\u0001\u0000\u0000\u0000tu\u0005"+
		"\u000b\u0000\u0000u\u0015\u0001\u0000\u0000\u0000vw\u0005\f\u0000\u0000"+
		"wx\u0003\u001c\u000e\u0000xy\u0005\u000f\u0000\u0000yz\u0003\u0002\u0001"+
		"\u0000z{\u0005\u0010\u0000\u0000{\u0017\u0001\u0000\u0000\u0000|}\u0005"+
		"\f\u0000\u0000}~\u0003\u001e\u000f\u0000~\u0019\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005 \u0000\u0000\u0080\u0081\u0005\r\u0000\u0000\u0081"+
		"\u0082\u0003&\u0013\u0000\u0082\u001b\u0001\u0000\u0000\u0000\u0083\u0085"+
		"\u0005 \u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u001d\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0089\u008b\u0003&\u0013\u0000\u008a\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u001f\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0005 \u0000"+
		"\u0000\u0090\u0091\u0005\u0013\u0000\u0000\u0091\u0092\u0003&\u0013\u0000"+
		"\u0092\u0093\u0005\u0014\u0000\u0000\u0093!\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005 \u0000\u0000\u0095\u0096\u0005\u000e\u0000\u0000\u0096\u0097"+
		"\u0003&\u0013\u0000\u0097#\u0001\u0000\u0000\u0000\u0098\u009c\u0005\u0006"+
		"\u0000\u0000\u0099\u009b\u0003&\u0013\u0000\u009a\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000"+
		"\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0007\u0000"+
		"\u0000\u00a0%\u0001\u0000\u0000\u0000\u00a1\u00a2\u0006\u0013\uffff\uffff"+
		"\u0000\u00a2\u00ae\u0005!\u0000\u0000\u00a3\u00ae\u0005\"\u0000\u0000"+
		"\u00a4\u00ae\u0005 \u0000\u0000\u00a5\u00ae\u0005#\u0000\u0000\u00a6\u00ae"+
		"\u0003$\u0012\u0000\u00a7\u00ae\u0003\u000e\u0007\u0000\u00a8\u00ae\u0003"+
		" \u0010\u0000\u00a9\u00aa\u0005\u0011\u0000\u0000\u00aa\u00ab\u0003&\u0013"+
		"\u0000\u00ab\u00ac\u0005\u0012\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ad\u00a1\u0001\u0000\u0000\u0000\u00ad\u00a3\u0001\u0000\u0000"+
		"\u0000\u00ad\u00a4\u0001\u0000\u0000\u0000\u00ad\u00a5\u0001\u0000\u0000"+
		"\u0000\u00ad\u00a6\u0001\u0000\u0000\u0000\u00ad\u00a7\u0001\u0000\u0000"+
		"\u0000\u00ad\u00a8\u0001\u0000\u0000\u0000\u00ad\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ae\u00d2\u0001\u0000\u0000\u0000\u00af\u00b0\n\f\u0000\u0000"+
		"\u00b0\u00b1\u0005\u0017\u0000\u0000\u00b1\u00d1\u0003&\u0013\r\u00b2"+
		"\u00b3\n\u000b\u0000\u0000\u00b3\u00b4\u0005\u0018\u0000\u0000\u00b4\u00d1"+
		"\u0003&\u0013\f\u00b5\u00b6\n\n\u0000\u0000\u00b6\u00b7\u0005\u0019\u0000"+
		"\u0000\u00b7\u00d1\u0003&\u0013\u000b\u00b8\u00b9\n\t\u0000\u0000\u00b9"+
		"\u00ba\u0005\u0015\u0000\u0000\u00ba\u00d1\u0003&\u0013\n\u00bb\u00bc"+
		"\n\b\u0000\u0000\u00bc\u00bd\u0005\u0016\u0000\u0000\u00bd\u00d1\u0003"+
		"&\u0013\t\u00be\u00bf\n\u0007\u0000\u0000\u00bf\u00c0\u0005\u001c\u0000"+
		"\u0000\u00c0\u00d1\u0003&\u0013\b\u00c1\u00c2\n\u0006\u0000\u0000\u00c2"+
		"\u00c3\u0005\u001e\u0000\u0000\u00c3\u00d1\u0003&\u0013\u0007\u00c4\u00c5"+
		"\n\u0005\u0000\u0000\u00c5\u00c6\u0005\u001d\u0000\u0000\u00c6\u00d1\u0003"+
		"&\u0013\u0006\u00c7\u00c8\n\u0004\u0000\u0000\u00c8\u00c9\u0005\u001f"+
		"\u0000\u0000\u00c9\u00d1\u0003&\u0013\u0005\u00ca\u00cb\n\u0003\u0000"+
		"\u0000\u00cb\u00cc\u0005\u001a\u0000\u0000\u00cc\u00d1\u0003&\u0013\u0004"+
		"\u00cd\u00ce\n\u0002\u0000\u0000\u00ce\u00cf\u0005\u001b\u0000\u0000\u00cf"+
		"\u00d1\u0003&\u0013\u0003\u00d0\u00af\u0001\u0000\u0000\u0000\u00d0\u00b2"+
		"\u0001\u0000\u0000\u0000\u00d0\u00b5\u0001\u0000\u0000\u0000\u00d0\u00b8"+
		"\u0001\u0000\u0000\u0000\u00d0\u00bb\u0001\u0000\u0000\u0000\u00d0\u00be"+
		"\u0001\u0000\u0000\u0000\u00d0\u00c1\u0001\u0000\u0000\u0000\u00d0\u00c4"+
		"\u0001\u0000\u0000\u0000\u00d0\u00c7\u0001\u0000\u0000\u0000\u00d0\u00ca"+
		"\u0001\u0000\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d1\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\'\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u000e+38>BKXl\u0086\u008c\u009c\u00ad\u00d0\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}