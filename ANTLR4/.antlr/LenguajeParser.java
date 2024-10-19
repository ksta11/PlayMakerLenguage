// Generated from c:/Users/plays/Documents/Paradigmas/mplsoccer/ANTLR4/Lenguaje.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SIZE=8, TACTIC=9, 
		PROCNAME=10, ASSIGN=11, AGREGADO=12, LB=13, RB=14, LP=15, RP=16, LS=17, 
		RS=18, SUM=19, MIN=20, MUL=21, DIV=22, MOD=23, EQ=24, NEQ=25, GT=26, LT=27, 
		GET=28, LET=29, VAR=30, NUM=31, STRING=32, WS=33;
	public static final int
		RULE_root = 0, RULE_inss = 1, RULE_ins = 2, RULE_input_ = 3, RULE_output_ = 4, 
		RULE_condition = 5, RULE_while_ = 6, RULE_siz = 7, RULE_procDef = 8, RULE_proc = 9, 
		RULE_assign = 10, RULE_paramsId = 11, RULE_paramsExpr = 12, RULE_consult = 13, 
		RULE_agregado = 14, RULE_lista = 15, RULE_expr = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "inss", "ins", "input_", "output_", "condition", "while_", "siz", 
			"procDef", "proc", "assign", "paramsId", "paramsExpr", "consult", "agregado", 
			"lista", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<i>'", "'<o>'", "'if'", "'else'", "'while'", "'{'", "'}'", "'#'", 
			null, null, "'::'", "'<-'", "'<<'", "'>>'", "'('", "')'", "'['", "']'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'/='", "'>'", "'<'", "'>='", 
			"'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "SIZE", "TACTIC", "PROCNAME", 
			"ASSIGN", "AGREGADO", "LB", "RB", "LP", "RP", "LS", "RS", "SUM", "MIN", 
			"MUL", "DIV", "MOD", "EQ", "NEQ", "GT", "LT", "GET", "LET", "VAR", "NUM", 
			"STRING", "WS"
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
	public String getGrammarFileName() { return "Lenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LenguajeParser.EOF, 0); }
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCNAME) {
				{
				{
				setState(34);
				procDef();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1073742894L) != 0)) {
				{
				{
				setState(42);
				ins();
				}
				}
				setState(47);
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
		public AgregadoContext agregado() {
			return getRuleContext(AgregadoContext.class,0);
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
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(48);
					condition();
					}
					break;
				case T__4:
					{
					setState(49);
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
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(52);
					input_();
					}
					break;
				case T__1:
					{
					setState(53);
					output_();
					}
					break;
				case PROCNAME:
					{
					setState(54);
					proc();
					}
					break;
				case VAR:
					{
					setState(55);
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
				setState(58);
				agregado();
				}
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
		public TerminalNode VAR() { return getToken(LenguajeParser.VAR, 0); }
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
			setState(61);
			match(T__0);
			setState(62);
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
			setState(64);
			match(T__1);
			setState(66); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(65);
					expr(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(68); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> LB() { return getTokens(LenguajeParser.LB); }
		public TerminalNode LB(int i) {
			return getToken(LenguajeParser.LB, i);
		}
		public List<InssContext> inss() {
			return getRuleContexts(InssContext.class);
		}
		public InssContext inss(int i) {
			return getRuleContext(InssContext.class,i);
		}
		public List<TerminalNode> RB() { return getTokens(LenguajeParser.RB); }
		public TerminalNode RB(int i) {
			return getToken(LenguajeParser.RB, i);
		}
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
			setState(70);
			match(T__2);
			setState(71);
			expr(0);
			setState(72);
			match(LB);
			setState(73);
			inss();
			setState(74);
			match(RB);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(75);
				match(T__3);
				setState(76);
				match(LB);
				setState(77);
				inss();
				setState(78);
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
		public TerminalNode LB() { return getToken(LenguajeParser.LB, 0); }
		public InssContext inss() {
			return getRuleContext(InssContext.class,0);
		}
		public TerminalNode RB() { return getToken(LenguajeParser.RB, 0); }
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
			setState(82);
			match(T__4);
			setState(83);
			expr(0);
			setState(84);
			match(LB);
			setState(85);
			inss();
			setState(86);
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
		public TerminalNode SIZE() { return getToken(LenguajeParser.SIZE, 0); }
		public TerminalNode VAR() { return getToken(LenguajeParser.VAR, 0); }
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
			setState(88);
			match(SIZE);
			setState(89);
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
	public static class ProcDefContext extends ParserRuleContext {
		public TerminalNode PROCNAME() { return getToken(LenguajeParser.PROCNAME, 0); }
		public ParamsIdContext paramsId() {
			return getRuleContext(ParamsIdContext.class,0);
		}
		public TerminalNode LB() { return getToken(LenguajeParser.LB, 0); }
		public InssContext inss() {
			return getRuleContext(InssContext.class,0);
		}
		public TerminalNode RB() { return getToken(LenguajeParser.RB, 0); }
		public ProcDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procDef; }
	}

	public final ProcDefContext procDef() throws RecognitionException {
		ProcDefContext _localctx = new ProcDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_procDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(PROCNAME);
			setState(92);
			paramsId();
			setState(93);
			match(LB);
			setState(94);
			inss();
			setState(95);
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
		public TerminalNode PROCNAME() { return getToken(LenguajeParser.PROCNAME, 0); }
		public ParamsExprContext paramsExpr() {
			return getRuleContext(ParamsExprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_proc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(PROCNAME);
			setState(98);
			paramsExpr();
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					expr(0);
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LenguajeParser.VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(LenguajeParser.ASSIGN, 0); }
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
		enterRule(_localctx, 20, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(VAR);
			setState(106);
			match(ASSIGN);
			setState(107);
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
		public List<TerminalNode> VAR() { return getTokens(LenguajeParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(LenguajeParser.VAR, i);
		}
		public ParamsIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsId; }
	}

	public final ParamsIdContext paramsId() throws RecognitionException {
		ParamsIdContext _localctx = new ParamsIdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_paramsId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(109);
				match(VAR);
				}
				}
				setState(114);
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
		enterRule(_localctx, 24, RULE_paramsExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					expr(0);
					}
					} 
				}
				setState(120);
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
		public TerminalNode VAR() { return getToken(LenguajeParser.VAR, 0); }
		public TerminalNode LS() { return getToken(LenguajeParser.LS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RS() { return getToken(LenguajeParser.RS, 0); }
		public ConsultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consult; }
	}

	public final ConsultContext consult() throws RecognitionException {
		ConsultContext _localctx = new ConsultContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_consult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(VAR);
			setState(122);
			match(LS);
			setState(123);
			expr(0);
			setState(124);
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
	public static class AgregadoContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LenguajeParser.VAR, 0); }
		public TerminalNode AGREGADO() { return getToken(LenguajeParser.AGREGADO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AgregadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agregado; }
	}

	public final AgregadoContext agregado() throws RecognitionException {
		AgregadoContext _localctx = new AgregadoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_agregado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(VAR);
			setState(127);
			match(AGREGADO);
			setState(128);
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
		enterRule(_localctx, 30, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__5);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516226368L) != 0)) {
				{
				{
				setState(131);
				expr(0);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
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
		public TerminalNode MOD() { return getToken(LenguajeParser.MOD, 0); }
		public ModContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TacticContext extends ExprContext {
		public TerminalNode TACTIC() { return getToken(LenguajeParser.TACTIC, 0); }
		public TacticContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LenguajeParser.MUL, 0); }
		public MulContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ExprContext {
		public TerminalNode VAR() { return getToken(LenguajeParser.VAR, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public TerminalNode LP() { return getToken(LenguajeParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(LenguajeParser.RP, 0); }
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ExprContext {
		public TerminalNode NUM() { return getToken(LenguajeParser.NUM, 0); }
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
		public TerminalNode LT() { return getToken(LenguajeParser.LT, 0); }
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
		public TerminalNode SUM() { return getToken(LenguajeParser.SUM, 0); }
		public SumContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(LenguajeParser.STRING, 0); }
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
		public TerminalNode EQ() { return getToken(LenguajeParser.EQ, 0); }
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
		public TerminalNode GT() { return getToken(LenguajeParser.GT, 0); }
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
		public TerminalNode DIV() { return getToken(LenguajeParser.DIV, 0); }
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MIN() { return getToken(LenguajeParser.MIN, 0); }
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
		public TerminalNode GET() { return getToken(LenguajeParser.GET, 0); }
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
		public TerminalNode LET() { return getToken(LenguajeParser.LET, 0); }
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
		public TerminalNode NEQ() { return getToken(LenguajeParser.NEQ, 0); }
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(140);
				match(VAR);
				}
				break;
			case 2:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(STRING);
				}
				break;
			case 3:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(NUM);
				}
				break;
			case 4:
				{
				_localctx = new LstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				lista();
				}
				break;
			case 5:
				{
				_localctx = new SzContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				siz();
				}
				break;
			case 6:
				{
				_localctx = new ConsulContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				consult();
				}
				break;
			case 7:
				{
				_localctx = new TacticContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(TACTIC);
				}
				break;
			case 8:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(LP);
				setState(148);
				expr(0);
				setState(149);
				match(RP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(154);
						match(MUL);
						setState(155);
						expr(20);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(157);
						match(DIV);
						setState(158);
						expr(19);
						}
						break;
					case 3:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(160);
						match(MOD);
						setState(161);
						expr(18);
						}
						break;
					case 4:
						{
						_localctx = new SumContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(163);
						match(SUM);
						setState(164);
						expr(17);
						}
						break;
					case 5:
						{
						_localctx = new MinContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(166);
						match(MIN);
						setState(167);
						expr(16);
						}
						break;
					case 6:
						{
						_localctx = new GtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(169);
						match(GT);
						setState(170);
						expr(15);
						}
						break;
					case 7:
						{
						_localctx = new GetContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(172);
						match(GET);
						setState(173);
						expr(14);
						}
						break;
					case 8:
						{
						_localctx = new LtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(175);
						match(LT);
						setState(176);
						expr(13);
						}
						break;
					case 9:
						{
						_localctx = new LetContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(178);
						match(LET);
						setState(179);
						expr(12);
						}
						break;
					case 10:
						{
						_localctx = new EqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(181);
						match(EQ);
						setState(182);
						expr(11);
						}
						break;
					case 11:
						{
						_localctx = new NeqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(184);
						match(NEQ);
						setState(185);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(190);
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
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001!\u00c0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001,\b\u0001\n"+
		"\u0001\f\u0001/\t\u0001\u0001\u0002\u0001\u0002\u0003\u00023\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00029\b\u0002\u0001"+
		"\u0002\u0003\u0002<\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0004\u0004C\b\u0004\u000b\u0004\f\u0004D\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005Q\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0005\te\b\t\n\t\f\th\t\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0005\u000bo\b\u000b\n\u000b\f\u000br\t\u000b\u0001"+
		"\f\u0005\fu\b\f\n\f\f\fx\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0085\b\u000f\n\u000f\f\u000f\u0088\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0098\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u00bb\b\u0010\n\u0010\f\u0010\u00be\t\u0010\u0001\u0010\u0000\u0001 "+
		"\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \u0000\u0000\u00ce\u0000%\u0001\u0000\u0000\u0000\u0002"+
		"-\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000\u0000\u0006=\u0001"+
		"\u0000\u0000\u0000\b@\u0001\u0000\u0000\u0000\nF\u0001\u0000\u0000\u0000"+
		"\fR\u0001\u0000\u0000\u0000\u000eX\u0001\u0000\u0000\u0000\u0010[\u0001"+
		"\u0000\u0000\u0000\u0012a\u0001\u0000\u0000\u0000\u0014i\u0001\u0000\u0000"+
		"\u0000\u0016p\u0001\u0000\u0000\u0000\u0018v\u0001\u0000\u0000\u0000\u001a"+
		"y\u0001\u0000\u0000\u0000\u001c~\u0001\u0000\u0000\u0000\u001e\u0082\u0001"+
		"\u0000\u0000\u0000 \u0097\u0001\u0000\u0000\u0000\"$\u0003\u0010\b\u0000"+
		"#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000"+
		"\u0000\u0000()\u0005\u0000\u0000\u0001)\u0001\u0001\u0000\u0000\u0000"+
		"*,\u0003\u0004\u0002\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0003\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u000003\u0003\n\u0005\u000013\u0003"+
		"\f\u0006\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u00003<\u0001"+
		"\u0000\u0000\u000049\u0003\u0006\u0003\u000059\u0003\b\u0004\u000069\u0003"+
		"\u0012\t\u000079\u0003\u0014\n\u000084\u0001\u0000\u0000\u000085\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u000087\u0001\u0000\u0000\u0000"+
		"9<\u0001\u0000\u0000\u0000:<\u0003\u001c\u000e\u0000;2\u0001\u0000\u0000"+
		"\u0000;8\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<\u0005\u0001"+
		"\u0000\u0000\u0000=>\u0005\u0001\u0000\u0000>?\u0005\u001e\u0000\u0000"+
		"?\u0007\u0001\u0000\u0000\u0000@B\u0005\u0002\u0000\u0000AC\u0003 \u0010"+
		"\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000E\t\u0001\u0000\u0000\u0000FG\u0005"+
		"\u0003\u0000\u0000GH\u0003 \u0010\u0000HI\u0005\r\u0000\u0000IJ\u0003"+
		"\u0002\u0001\u0000JP\u0005\u000e\u0000\u0000KL\u0005\u0004\u0000\u0000"+
		"LM\u0005\r\u0000\u0000MN\u0003\u0002\u0001\u0000NO\u0005\u000e\u0000\u0000"+
		"OQ\u0001\u0000\u0000\u0000PK\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000Q\u000b\u0001\u0000\u0000\u0000RS\u0005\u0005\u0000\u0000ST\u0003"+
		" \u0010\u0000TU\u0005\r\u0000\u0000UV\u0003\u0002\u0001\u0000VW\u0005"+
		"\u000e\u0000\u0000W\r\u0001\u0000\u0000\u0000XY\u0005\b\u0000\u0000YZ"+
		"\u0005\u001e\u0000\u0000Z\u000f\u0001\u0000\u0000\u0000[\\\u0005\n\u0000"+
		"\u0000\\]\u0003\u0016\u000b\u0000]^\u0005\r\u0000\u0000^_\u0003\u0002"+
		"\u0001\u0000_`\u0005\u000e\u0000\u0000`\u0011\u0001\u0000\u0000\u0000"+
		"ab\u0005\n\u0000\u0000bf\u0003\u0018\f\u0000ce\u0003 \u0010\u0000dc\u0001"+
		"\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000g\u0013\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000ij\u0005\u001e\u0000\u0000jk\u0005\u000b\u0000\u0000kl\u0003"+
		" \u0010\u0000l\u0015\u0001\u0000\u0000\u0000mo\u0005\u001e\u0000\u0000"+
		"nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000q\u0017\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000su\u0003 \u0010\u0000ts\u0001\u0000\u0000\u0000ux\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"w\u0019\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005\u001e"+
		"\u0000\u0000z{\u0005\u0011\u0000\u0000{|\u0003 \u0010\u0000|}\u0005\u0012"+
		"\u0000\u0000}\u001b\u0001\u0000\u0000\u0000~\u007f\u0005\u001e\u0000\u0000"+
		"\u007f\u0080\u0005\f\u0000\u0000\u0080\u0081\u0003 \u0010\u0000\u0081"+
		"\u001d\u0001\u0000\u0000\u0000\u0082\u0086\u0005\u0006\u0000\u0000\u0083"+
		"\u0085\u0003 \u0010\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0007\u0000\u0000\u008a\u001f"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0006\u0010\uffff\uffff\u0000\u008c"+
		"\u0098\u0005\u001e\u0000\u0000\u008d\u0098\u0005 \u0000\u0000\u008e\u0098"+
		"\u0005\u001f\u0000\u0000\u008f\u0098\u0003\u001e\u000f\u0000\u0090\u0098"+
		"\u0003\u000e\u0007\u0000\u0091\u0098\u0003\u001a\r\u0000\u0092\u0098\u0005"+
		"\t\u0000\u0000\u0093\u0094\u0005\u000f\u0000\u0000\u0094\u0095\u0003 "+
		"\u0010\u0000\u0095\u0096\u0005\u0010\u0000\u0000\u0096\u0098\u0001\u0000"+
		"\u0000\u0000\u0097\u008b\u0001\u0000\u0000\u0000\u0097\u008d\u0001\u0000"+
		"\u0000\u0000\u0097\u008e\u0001\u0000\u0000\u0000\u0097\u008f\u0001\u0000"+
		"\u0000\u0000\u0097\u0090\u0001\u0000\u0000\u0000\u0097\u0091\u0001\u0000"+
		"\u0000\u0000\u0097\u0092\u0001\u0000\u0000\u0000\u0097\u0093\u0001\u0000"+
		"\u0000\u0000\u0098\u00bc\u0001\u0000\u0000\u0000\u0099\u009a\n\u0013\u0000"+
		"\u0000\u009a\u009b\u0005\u0015\u0000\u0000\u009b\u00bb\u0003 \u0010\u0014"+
		"\u009c\u009d\n\u0012\u0000\u0000\u009d\u009e\u0005\u0016\u0000\u0000\u009e"+
		"\u00bb\u0003 \u0010\u0013\u009f\u00a0\n\u0011\u0000\u0000\u00a0\u00a1"+
		"\u0005\u0017\u0000\u0000\u00a1\u00bb\u0003 \u0010\u0012\u00a2\u00a3\n"+
		"\u0010\u0000\u0000\u00a3\u00a4\u0005\u0013\u0000\u0000\u00a4\u00bb\u0003"+
		" \u0010\u0011\u00a5\u00a6\n\u000f\u0000\u0000\u00a6\u00a7\u0005\u0014"+
		"\u0000\u0000\u00a7\u00bb\u0003 \u0010\u0010\u00a8\u00a9\n\u000e\u0000"+
		"\u0000\u00a9\u00aa\u0005\u001a\u0000\u0000\u00aa\u00bb\u0003 \u0010\u000f"+
		"\u00ab\u00ac\n\r\u0000\u0000\u00ac\u00ad\u0005\u001c\u0000\u0000\u00ad"+
		"\u00bb\u0003 \u0010\u000e\u00ae\u00af\n\f\u0000\u0000\u00af\u00b0\u0005"+
		"\u001b\u0000\u0000\u00b0\u00bb\u0003 \u0010\r\u00b1\u00b2\n\u000b\u0000"+
		"\u0000\u00b2\u00b3\u0005\u001d\u0000\u0000\u00b3\u00bb\u0003 \u0010\f"+
		"\u00b4\u00b5\n\n\u0000\u0000\u00b5\u00b6\u0005\u0018\u0000\u0000\u00b6"+
		"\u00bb\u0003 \u0010\u000b\u00b7\u00b8\n\t\u0000\u0000\u00b8\u00b9\u0005"+
		"\u0019\u0000\u0000\u00b9\u00bb\u0003 \u0010\n\u00ba\u0099\u0001\u0000"+
		"\u0000\u0000\u00ba\u009c\u0001\u0000\u0000\u0000\u00ba\u009f\u0001\u0000"+
		"\u0000\u0000\u00ba\u00a2\u0001\u0000\u0000\u0000\u00ba\u00a5\u0001\u0000"+
		"\u0000\u0000\u00ba\u00a8\u0001\u0000\u0000\u0000\u00ba\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ba\u00ae\u0001\u0000\u0000\u0000\u00ba\u00b1\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b4\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001\u0000"+
		"\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd!\u0001\u0000\u0000"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u000e%-28;DPfpv\u0086\u0097"+
		"\u00ba\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}