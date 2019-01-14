// Generated from Slick.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SlickParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, COMMENT=49, EXPO=50, PROVE=51, RULENUM=52, 
		EVAR=53, VAR=54, TYPE=55, NUM=56, ADDOP=57, RELOP=58, JOP=59, IMPOP=60, 
		EQOP=61, QUANTIFIER=62, WS=63, END=64;
	public static final int
		RULE_doc = 0, RULE_proof = 1, RULE_standardProof = 2, RULE_startExpo = 3, 
		RULE_endExpo = 4, RULE_proofHead = 5, RULE_sep = 6, RULE_header = 7, RULE_theorem = 8, 
		RULE_method = 9, RULE_methodName = 10, RULE_caseProof = 11, RULE_caseVariable = 12, 
		RULE_caseList = 13, RULE_case1 = 14, RULE_case2 = 15, RULE_caseProof1 = 16, 
		RULE_caseProof2 = 17, RULE_step = 18, RULE_expr = 19, RULE_hint = 20, 
		RULE_hintOp = 21, RULE_varlist = 22, RULE_exprlist = 23, RULE_emptyRangeExpr = 24, 
		RULE_quantifiedExpr = 25, RULE_setEnumeration = 26, RULE_setComprehension = 27, 
		RULE_inverseCall = 28, RULE_functionCall = 29, RULE_typedVar = 30;
	public static final String[] ruleNames = {
		"doc", "proof", "standardProof", "startExpo", "endExpo", "proofHead", 
		"sep", "header", "theorem", "method", "methodName", "caseProof", "caseVariable", 
		"caseList", "case1", "case2", "caseProof1", "caseProof2", "step", "expr", 
		"hint", "hintOp", "varlist", "exprlist", "emptyRangeExpr", "quantifiedExpr", 
		"setEnumeration", "setComprehension", "inverseCall", "functionCall", "typedVar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'Proof'", "'-'", "'Exercise'", "'('", "')'", "'by'", "'showing'", 
		"'equivalence'", "'to'", "'previous'", "'theorem'", "'the'", "'LHS'", 
		"'is'", "'equivalent'", "'RHS'", "'implies'", "'follows'", "'from'", "'assuming'", 
		"'conjuncts'", "'of'", "'antecedent'", "'contradiction'", "'proving'", 
		"'contrapositive'", "'case'", "'analysis'", "'on'", "'anlaysis'", "'Must'", 
		"'prove'", "'(1)'", "'(2)'", "'['", "'\u2254'", "']'", "','", "'\u00AC'", 
		"'%'", "'true'", "'false'", "'|'", "'{'", "'}'", "'inv'", "'.'", null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'\u2571\u2571'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "COMMENT", "EXPO", "PROVE", "RULENUM", "EVAR", "VAR", "TYPE", "NUM", 
		"ADDOP", "RELOP", "JOP", "IMPOP", "EQOP", "QUANTIFIER", "WS", "END"
	};
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
	public String getGrammarFileName() { return "Slick.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SlickParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocContext extends ParserRuleContext {
		public List<ProofContext> proof() {
			return getRuleContexts(ProofContext.class);
		}
		public ProofContext proof(int i) {
			return getRuleContext(ProofContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_doc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			proof();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(63);
				sep();
				setState(64);
				proof();
				}
				}
				setState(70);
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

	public static class ProofContext extends ParserRuleContext {
		public StandardProofContext standardProof() {
			return getRuleContext(StandardProofContext.class,0);
		}
		public CaseProofContext caseProof() {
			return getRuleContext(CaseProofContext.class,0);
		}
		public ProofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterProof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitProof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitProof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProofContext proof() throws RecognitionException {
		ProofContext _localctx = new ProofContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_proof);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				standardProof();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				caseProof();
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

	public static class StandardProofContext extends ParserRuleContext {
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public StartExpoContext startExpo() {
			return getRuleContext(StartExpoContext.class,0);
		}
		public ProofHeadContext proofHead() {
			return getRuleContext(ProofHeadContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public TerminalNode END() { return getToken(SlickParser.END, 0); }
		public EndExpoContext endExpo() {
			return getRuleContext(EndExpoContext.class,0);
		}
		public StandardProofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardProof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterStandardProof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitStandardProof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitStandardProof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardProofContext standardProof() throws RecognitionException {
		StandardProofContext _localctx = new StandardProofContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_standardProof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==PROVE) {
				{
				setState(75);
				header();
				}
			}

			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPO) {
				{
				setState(78);
				startExpo();
				}
			}

			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(81);
				proofHead();
				}
			}

			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(84);
				match(T__0);
				}
			}

			setState(87);
			step();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELOP) | (1L << IMPOP) | (1L << EQOP))) != 0)) {
				{
				{
				setState(88);
				hint();
				setState(89);
				step();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END) {
				{
				setState(96);
				match(END);
				}
			}

			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPO) {
				{
				setState(99);
				endExpo();
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

	public static class StartExpoContext extends ParserRuleContext {
		public TerminalNode EXPO() { return getToken(SlickParser.EXPO, 0); }
		public StartExpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startExpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterStartExpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitStartExpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitStartExpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartExpoContext startExpo() throws RecognitionException {
		StartExpoContext _localctx = new StartExpoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_startExpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(EXPO);
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

	public static class EndExpoContext extends ParserRuleContext {
		public TerminalNode EXPO() { return getToken(SlickParser.EXPO, 0); }
		public EndExpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endExpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterEndExpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitEndExpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitEndExpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndExpoContext endExpo() throws RecognitionException {
		EndExpoContext _localctx = new EndExpoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_endExpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(EXPO);
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

	public static class ProofHeadContext extends ParserRuleContext {
		public ProofHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proofHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterProofHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitProofHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitProofHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProofHeadContext proofHead() throws RecognitionException {
		ProofHeadContext _localctx = new ProofHeadContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proofHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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

	public static class SepContext extends ParserRuleContext {
		public SepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitSep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitSep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SepContext sep() throws RecognitionException {
		SepContext _localctx = new SepContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__2);
			setState(109);
			match(T__2);
			setState(110);
			match(T__2);
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				match(T__2);
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
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

	public static class HeaderContext extends ParserRuleContext {
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
	 
		public HeaderContext() { }
		public void copyFrom(HeaderContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TheoremHeaderContext extends HeaderContext {
		public TheoremContext theorem() {
			return getRuleContext(TheoremContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public TheoremHeaderContext(HeaderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterTheoremHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitTheoremHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitTheoremHeader(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExerciseHeaderContext extends HeaderContext {
		public TerminalNode RULENUM() { return getToken(SlickParser.RULENUM, 0); }
		public ExerciseHeaderContext(HeaderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterExerciseHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitExerciseHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitExerciseHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_header);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROVE:
				_localctx = new TheoremHeaderContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(116);
				theorem();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(117);
					method();
					}
				}

				}
				}
				break;
			case T__3:
				_localctx = new ExerciseHeaderContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(T__3);
				setState(121);
				match(RULENUM);
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

	public static class TheoremContext extends ParserRuleContext {
		public TheoremContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theorem; }
	 
		public TheoremContext() { }
		public void copyFrom(TheoremContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdHocTheoremContext extends TheoremContext {
		public TerminalNode PROVE() { return getToken(SlickParser.PROVE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AdHocTheoremContext(TheoremContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterAdHocTheorem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitAdHocTheorem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitAdHocTheorem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BibleTheoremContext extends TheoremContext {
		public TerminalNode PROVE() { return getToken(SlickParser.PROVE, 0); }
		public TerminalNode RULENUM() { return getToken(SlickParser.RULENUM, 0); }
		public BibleTheoremContext(TheoremContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterBibleTheorem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitBibleTheorem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitBibleTheorem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheoremContext theorem() throws RecognitionException {
		TheoremContext _localctx = new TheoremContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_theorem);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new BibleTheoremContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(PROVE);
				setState(125);
				match(T__4);
				setState(126);
				match(RULENUM);
				setState(127);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new AdHocTheoremContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(PROVE);
				setState(129);
				expr(0);
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

	public static class MethodContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__6);
			setState(133);
			methodName();
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

	public static class MethodNameContext extends ParserRuleContext {
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
	 
		public MethodNameContext() { }
		public void copyFrom(MethodNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PreviousTheoremMethodContext extends MethodNameContext {
		public PreviousTheoremMethodContext(MethodNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterPreviousTheoremMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitPreviousTheoremMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitPreviousTheoremMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RightEquivalesLeftMethodContext extends MethodNameContext {
		public RightEquivalesLeftMethodContext(MethodNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterRightEquivalesLeftMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitRightEquivalesLeftMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitRightEquivalesLeftMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RightFollowsLeftMethodContext extends MethodNameContext {
		public RightFollowsLeftMethodContext(MethodNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterRightFollowsLeftMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitRightFollowsLeftMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitRightFollowsLeftMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftEquivalesRightMethodContext extends MethodNameContext {
		public LeftEquivalesRightMethodContext(MethodNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterLeftEquivalesRightMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitLeftEquivalesRightMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitLeftEquivalesRightMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContrapositiveMethodContext extends MethodNameContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ContrapositiveMethodContext(MethodNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterContrapositiveMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitContrapositiveMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitContrapositiveMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssumingConjunctsMethodContext extends MethodNameContext {
		public AssumingConjunctsMethodContext(MethodNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterAssumingConjunctsMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitAssumingConjunctsMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitAssumingConjunctsMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftImpliesRightMethodContext extends MethodNameContext {
		public LeftImpliesRightMethodContext(MethodNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterLeftImpliesRightMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitLeftImpliesRightMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitLeftImpliesRightMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContradictionMethodContext extends MethodNameContext {
		public ContradictionMethodContext(MethodNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterContradictionMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitContradictionMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitContradictionMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodName);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new PreviousTheoremMethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__7);
				setState(136);
				match(T__8);
				setState(137);
				match(T__9);
				setState(138);
				match(T__10);
				setState(139);
				match(T__11);
				}
				break;
			case 2:
				_localctx = new LeftEquivalesRightMethodContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(T__7);
				setState(141);
				match(T__12);
				setState(142);
				match(T__13);
				setState(143);
				match(T__14);
				setState(144);
				match(T__15);
				setState(145);
				match(T__9);
				setState(146);
				match(T__12);
				setState(147);
				match(T__16);
				}
				break;
			case 3:
				_localctx = new RightEquivalesLeftMethodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(T__7);
				setState(149);
				match(T__12);
				setState(150);
				match(T__16);
				setState(151);
				match(T__14);
				setState(152);
				match(T__15);
				setState(153);
				match(T__9);
				setState(154);
				match(T__12);
				setState(155);
				match(T__13);
				}
				break;
			case 4:
				_localctx = new LeftImpliesRightMethodContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(T__7);
				setState(157);
				match(T__12);
				setState(158);
				match(T__13);
				setState(159);
				match(T__17);
				setState(160);
				match(T__12);
				setState(161);
				match(T__16);
				}
				break;
			case 5:
				_localctx = new RightFollowsLeftMethodContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				match(T__7);
				setState(163);
				match(T__12);
				setState(164);
				match(T__16);
				setState(165);
				match(T__18);
				setState(166);
				match(T__19);
				setState(167);
				match(T__12);
				setState(168);
				match(T__13);
				}
				break;
			case 6:
				_localctx = new AssumingConjunctsMethodContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(T__20);
				setState(170);
				match(T__12);
				setState(171);
				match(T__21);
				setState(172);
				match(T__22);
				setState(173);
				match(T__12);
				setState(174);
				match(T__23);
				}
				break;
			case 7:
				_localctx = new ContradictionMethodContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
				match(T__24);
				}
				break;
			case 8:
				_localctx = new ContrapositiveMethodContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(176);
				match(T__25);
				setState(177);
				match(T__12);
				setState(178);
				match(T__26);
				setState(179);
				match(T__0);
				setState(180);
				expr(0);
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

	public static class CaseProofContext extends ParserRuleContext {
		public TheoremContext theorem() {
			return getRuleContext(TheoremContext.class,0);
		}
		public TerminalNode VAR() { return getToken(SlickParser.VAR, 0); }
		public CaseListContext caseList() {
			return getRuleContext(CaseListContext.class,0);
		}
		public CaseProof1Context caseProof1() {
			return getRuleContext(CaseProof1Context.class,0);
		}
		public CaseProof2Context caseProof2() {
			return getRuleContext(CaseProof2Context.class,0);
		}
		public CaseProofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseProof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterCaseProof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitCaseProof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitCaseProof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseProofContext caseProof() throws RecognitionException {
		CaseProofContext _localctx = new CaseProofContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_caseProof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			theorem();
			setState(184);
			match(T__6);
			setState(185);
			match(T__27);
			setState(186);
			match(T__28);
			setState(187);
			match(T__29);
			setState(188);
			match(VAR);
			setState(189);
			caseList();
			setState(190);
			caseProof1();
			setState(191);
			caseProof2();
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

	public static class CaseVariableContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SlickParser.VAR, 0); }
		public CaseVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterCaseVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitCaseVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitCaseVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseVariableContext caseVariable() throws RecognitionException {
		CaseVariableContext _localctx = new CaseVariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_caseVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__6);
			setState(194);
			match(T__27);
			setState(195);
			match(T__30);
			setState(196);
			match(T__29);
			setState(197);
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

	public static class CaseListContext extends ParserRuleContext {
		public Case1Context case1() {
			return getRuleContext(Case1Context.class,0);
		}
		public Case2Context case2() {
			return getRuleContext(Case2Context.class,0);
		}
		public CaseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterCaseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitCaseList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitCaseList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseListContext caseList() throws RecognitionException {
		CaseListContext _localctx = new CaseListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_caseList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__31);
			setState(200);
			match(T__32);
			setState(201);
			case1();
			setState(202);
			case2();
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

	public static class Case1Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Case1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterCase1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitCase1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitCase1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case1Context case1() throws RecognitionException {
		Case1Context _localctx = new Case1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_case1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__33);
			setState(205);
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

	public static class Case2Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Case2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterCase2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitCase2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitCase2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case2Context case2() throws RecognitionException {
		Case2Context _localctx = new Case2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_case2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__34);
			setState(208);
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

	public static class CaseProof1Context extends ParserRuleContext {
		public StandardProofContext standardProof() {
			return getRuleContext(StandardProofContext.class,0);
		}
		public CaseProof1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseProof1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterCaseProof1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitCaseProof1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitCaseProof1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseProof1Context caseProof1() throws RecognitionException {
		CaseProof1Context _localctx = new CaseProof1Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_caseProof1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__33);
			setState(211);
			standardProof();
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

	public static class CaseProof2Context extends ParserRuleContext {
		public StandardProofContext standardProof() {
			return getRuleContext(StandardProofContext.class,0);
		}
		public CaseProof2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseProof2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterCaseProof2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitCaseProof2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitCaseProof2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseProof2Context caseProof2() throws RecognitionException {
		CaseProof2Context _localctx = new CaseProof2Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_caseProof2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__34);
			setState(214);
			standardProof();
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

	public static class StepContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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
	public static class ImplicationExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IMPOP() { return getToken(SlickParser.IMPOP, 0); }
		public ImplicationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterImplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitImplicationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitImplicationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EquivalenceExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQOP() { return getToken(SlickParser.EQOP, 0); }
		public EquivalenceExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterEquivalenceExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitEquivalenceExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitEquivalenceExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomContext extends ExprContext {
		public TerminalNode EVAR() { return getToken(SlickParser.EVAR, 0); }
		public TerminalNode VAR() { return getToken(SlickParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(SlickParser.NUM, 0); }
		public AtomContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelativeExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RELOP() { return getToken(SlickParser.RELOP, 0); }
		public RelativeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterRelativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitRelativeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitRelativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetEnumExprContext extends ExprContext {
		public SetEnumerationContext setEnumeration() {
			return getRuleContext(SetEnumerationContext.class,0);
		}
		public SetEnumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterSetEnumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitSetEnumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitSetEnumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExprContext {
		public TerminalNode VAR() { return getToken(SlickParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExprContext extends ExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterFunctionCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitFunctionCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADDOP() { return getToken(SlickParser.ADDOP, 0); }
		public AdditionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterAdditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitAdditionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitAdditionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeibnizExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode VAR() { return getToken(SlickParser.VAR, 0); }
		public LeibnizExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterLeibnizExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitLeibnizExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitLeibnizExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetCompExprContext extends ExprContext {
		public SetComprehensionContext setComprehension() {
			return getRuleContext(SetComprehensionContext.class,0);
		}
		public SetCompExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterSetCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitSetCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitSetCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GeneralExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GeneralExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterGeneralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitGeneralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitGeneralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InverseCallExprContext extends ExprContext {
		public InverseCallContext inverseCall() {
			return getRuleContext(InverseCallContext.class,0);
		}
		public InverseCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterInverseCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitInverseCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitInverseCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuantExprContext extends ExprContext {
		public QuantifiedExprContext quantifiedExpr() {
			return getRuleContext(QuantifiedExprContext.class,0);
		}
		public QuantExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterQuantExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitQuantExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitQuantExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JunctionExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode JOP() { return getToken(SlickParser.JOP, 0); }
		public JunctionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterJunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitJunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitJunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TSExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TSExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterTSExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitTSExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitTSExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryPrefixExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryPrefixExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterUnaryPrefixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitUnaryPrefixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitUnaryPrefixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyRExprContext extends ExprContext {
		public EmptyRangeExprContext emptyRangeExpr() {
			return getRuleContext(EmptyRangeExprContext.class,0);
		}
		public EmptyRExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterEmptyRExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitEmptyRExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitEmptyRExpr(this);
			else return visitor.visitChildren(this);
		}
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
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(219);
				match(VAR);
				setState(220);
				match(T__35);
				setState(221);
				expr(0);
				setState(222);
				match(T__37);
				}
				break;
			case 2:
				{
				_localctx = new QuantExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				quantifiedExpr();
				}
				break;
			case 3:
				{
				_localctx = new InverseCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				inverseCall();
				}
				break;
			case 4:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				functionCall();
				}
				break;
			case 5:
				{
				_localctx = new UnaryPrefixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(T__39);
				setState(228);
				expr(17);
				}
				break;
			case 6:
				{
				_localctx = new EmptyRExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				emptyRangeExpr();
				}
				break;
			case 7:
				{
				_localctx = new QuantExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				quantifiedExpr();
				}
				break;
			case 8:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				match(EVAR);
				}
				break;
			case 9:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				match(VAR);
				}
				break;
			case 10:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				match(T__41);
				}
				break;
			case 11:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				match(T__42);
				}
				break;
			case 12:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				match(NUM);
				}
				break;
			case 13:
				{
				_localctx = new SetEnumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				setEnumeration();
				}
				break;
			case 14:
				{
				_localctx = new SetCompExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				setComprehension();
				}
				break;
			case 15:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				match(T__4);
				setState(239);
				expr(0);
				setState(240);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(276);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(245);
						match(ADDOP);
						setState(246);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new GeneralExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(248);
						match(T__40);
						setState(249);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new RelativeExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(251);
						match(RELOP);
						setState(252);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new JunctionExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(254);
						match(JOP);
						setState(255);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ImplicationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(256);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(257);
						match(IMPOP);
						setState(258);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new EquivalenceExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(260);
						match(EQOP);
						setState(261);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new TSExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(263);
						match(T__35);
						setState(264);
						varlist();
						setState(265);
						match(T__36);
						setState(266);
						exprlist();
						setState(267);
						match(T__37);
						}
						break;
					case 8:
						{
						_localctx = new LeibnizExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(269);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(270);
						match(T__35);
						setState(271);
						match(VAR);
						setState(272);
						match(T__38);
						setState(273);
						expr(0);
						setState(274);
						match(T__37);
						}
						break;
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class HintContext extends ParserRuleContext {
		public HintOpContext hintOp() {
			return getRuleContext(HintOpContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SlickParser.COMMENT, 0); }
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_hint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			hintOp();
			setState(282);
			match(COMMENT);
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

	public static class HintOpContext extends ParserRuleContext {
		public TerminalNode RELOP() { return getToken(SlickParser.RELOP, 0); }
		public TerminalNode IMPOP() { return getToken(SlickParser.IMPOP, 0); }
		public TerminalNode EQOP() { return getToken(SlickParser.EQOP, 0); }
		public HintOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterHintOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitHintOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitHintOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintOpContext hintOp() throws RecognitionException {
		HintOpContext _localctx = new HintOpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_hintOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELOP) | (1L << IMPOP) | (1L << EQOP))) != 0)) ) {
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

	public static class VarlistContext extends ParserRuleContext {
		public List<TypedVarContext> typedVar() {
			return getRuleContexts(TypedVarContext.class);
		}
		public TypedVarContext typedVar(int i) {
			return getRuleContext(TypedVarContext.class,i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			typedVar();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(287);
				match(T__38);
				setState(288);
				typedVar();
				}
				}
				setState(293);
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

	public static class ExprlistContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitExprlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exprlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			expr(0);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(295);
				match(T__38);
				setState(296);
				expr(0);
				}
				}
				setState(301);
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

	public static class EmptyRangeExprContext extends ParserRuleContext {
		public TerminalNode QUANTIFIER() { return getToken(SlickParser.QUANTIFIER, 0); }
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EmptyRangeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyRangeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterEmptyRangeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitEmptyRangeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitEmptyRangeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyRangeExprContext emptyRangeExpr() throws RecognitionException {
		EmptyRangeExprContext _localctx = new EmptyRangeExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_emptyRangeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__4);
			setState(303);
			match(QUANTIFIER);
			setState(304);
			varlist();
			setState(305);
			match(T__43);
			setState(306);
			match(T__0);
			setState(307);
			expr(0);
			setState(308);
			match(T__5);
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

	public static class QuantifiedExprContext extends ParserRuleContext {
		public TerminalNode QUANTIFIER() { return getToken(SlickParser.QUANTIFIER, 0); }
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public QuantifiedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifiedExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterQuantifiedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitQuantifiedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitQuantifiedExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifiedExprContext quantifiedExpr() throws RecognitionException {
		QuantifiedExprContext _localctx = new QuantifiedExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_quantifiedExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__4);
			setState(311);
			match(QUANTIFIER);
			setState(312);
			varlist();
			setState(313);
			match(T__43);
			setState(314);
			expr(0);
			setState(315);
			match(T__0);
			setState(316);
			expr(0);
			setState(317);
			match(T__5);
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

	public static class SetEnumerationContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SetEnumerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setEnumeration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterSetEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitSetEnumeration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitSetEnumeration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetEnumerationContext setEnumeration() throws RecognitionException {
		SetEnumerationContext _localctx = new SetEnumerationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_setEnumeration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__44);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__44) | (1L << T__46) | (1L << EVAR) | (1L << VAR) | (1L << NUM))) != 0)) {
				{
				setState(320);
				expr(0);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__38) {
					{
					{
					setState(321);
					match(T__38);
					setState(322);
					expr(0);
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(330);
			match(T__45);
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

	public static class SetComprehensionContext extends ParserRuleContext {
		public TypedVarContext typedVar() {
			return getRuleContext(TypedVarContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SetComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterSetComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitSetComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitSetComprehension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetComprehensionContext setComprehension() throws RecognitionException {
		SetComprehensionContext _localctx = new SetComprehensionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_setComprehension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__44);
			setState(333);
			typedVar();
			setState(334);
			match(T__43);
			setState(335);
			expr(0);
			setState(336);
			match(T__0);
			setState(337);
			expr(0);
			setState(338);
			match(T__45);
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

	public static class InverseCallContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public InverseCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inverseCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterInverseCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitInverseCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitInverseCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InverseCallContext inverseCall() throws RecognitionException {
		InverseCallContext _localctx = new InverseCallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_inverseCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__46);
			setState(341);
			match(T__47);
			setState(342);
			functionCall();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDotContext extends FunctionCallContext {
		public TerminalNode VAR() { return getToken(SlickParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionDotContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterFunctionDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitFunctionDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitFunctionDot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionParenContext extends FunctionCallContext {
		public TerminalNode VAR() { return getToken(SlickParser.VAR, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public FunctionParenContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterFunctionParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitFunctionParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitFunctionParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionCall);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new FunctionDotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(VAR);
				setState(345);
				match(T__47);
				setState(346);
				expr(0);
				}
				break;
			case 2:
				_localctx = new FunctionParenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(VAR);
				setState(348);
				match(T__4);
				setState(349);
				exprlist();
				setState(350);
				match(T__5);
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

	public static class TypedVarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SlickParser.VAR, 0); }
		public TerminalNode TYPE() { return getToken(SlickParser.TYPE, 0); }
		public TypedVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).enterTypedVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlickListener ) ((SlickListener)listener).exitTypedVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlickVisitor ) return ((SlickVisitor<? extends T>)visitor).visitTypedVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedVarContext typedVar() throws RecognitionException {
		TypedVarContext _localctx = new TypedVarContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typedVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(VAR);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(355);
				match(T__0);
				setState(356);
				match(TYPE);
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
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 23);
		case 7:
			return precpred(_ctx, 22);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u016a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\3\3\3\5\3L\n\3\3\4\5\4O\n\4\3\4"+
		"\5\4R\n\4\3\4\5\4U\n\4\3\4\5\4X\n\4\3\4\3\4\3\4\3\4\7\4^\n\4\f\4\16\4"+
		"a\13\4\3\4\5\4d\n\4\3\4\5\4g\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\6\bs\n\b\r\b\16\bt\3\t\3\t\5\ty\n\t\3\t\3\t\5\t}\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u0085\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u00b8\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f5\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u0117\n\25\f\25\16\25\u011a\13\25\3\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\7\30\u0124\n\30\f\30\16\30\u0127\13\30\3\31\3\31\3\31\7\31"+
		"\u012c\n\31\f\31\16\31\u012f\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\7\34\u0146\n\34\f\34\16\34\u0149\13\34\5\34\u014b\n\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u0163\n\37\3 \3 \3 \5 \u0168\n \3 \2\3"+
		"(!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\3"+
		"\4\2<<>?\2\u017a\2@\3\2\2\2\4K\3\2\2\2\6N\3\2\2\2\bh\3\2\2\2\nj\3\2\2"+
		"\2\fl\3\2\2\2\16n\3\2\2\2\20|\3\2\2\2\22\u0084\3\2\2\2\24\u0086\3\2\2"+
		"\2\26\u00b7\3\2\2\2\30\u00b9\3\2\2\2\32\u00c3\3\2\2\2\34\u00c9\3\2\2\2"+
		"\36\u00ce\3\2\2\2 \u00d1\3\2\2\2\"\u00d4\3\2\2\2$\u00d7\3\2\2\2&\u00da"+
		"\3\2\2\2(\u00f4\3\2\2\2*\u011b\3\2\2\2,\u011e\3\2\2\2.\u0120\3\2\2\2\60"+
		"\u0128\3\2\2\2\62\u0130\3\2\2\2\64\u0138\3\2\2\2\66\u0141\3\2\2\28\u014e"+
		"\3\2\2\2:\u0156\3\2\2\2<\u0162\3\2\2\2>\u0164\3\2\2\2@F\5\4\3\2AB\5\16"+
		"\b\2BC\5\4\3\2CE\3\2\2\2DA\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\3\3"+
		"\2\2\2HF\3\2\2\2IL\5\6\4\2JL\5\30\r\2KI\3\2\2\2KJ\3\2\2\2L\5\3\2\2\2M"+
		"O\5\20\t\2NM\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PR\5\b\5\2QP\3\2\2\2QR\3\2\2\2"+
		"RT\3\2\2\2SU\5\f\7\2TS\3\2\2\2TU\3\2\2\2UW\3\2\2\2VX\7\3\2\2WV\3\2\2\2"+
		"WX\3\2\2\2XY\3\2\2\2Y_\5&\24\2Z[\5*\26\2[\\\5&\24\2\\^\3\2\2\2]Z\3\2\2"+
		"\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2\2a_\3\2\2\2bd\7B\2\2cb\3\2\2"+
		"\2cd\3\2\2\2df\3\2\2\2eg\5\n\6\2fe\3\2\2\2fg\3\2\2\2g\7\3\2\2\2hi\7\64"+
		"\2\2i\t\3\2\2\2jk\7\64\2\2k\13\3\2\2\2lm\7\4\2\2m\r\3\2\2\2no\7\5\2\2"+
		"op\7\5\2\2pr\7\5\2\2qs\7\5\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2"+
		"u\17\3\2\2\2vx\5\22\n\2wy\5\24\13\2xw\3\2\2\2xy\3\2\2\2y}\3\2\2\2z{\7"+
		"\6\2\2{}\7\66\2\2|v\3\2\2\2|z\3\2\2\2}\21\3\2\2\2~\177\7\65\2\2\177\u0080"+
		"\7\7\2\2\u0080\u0081\7\66\2\2\u0081\u0085\7\b\2\2\u0082\u0083\7\65\2\2"+
		"\u0083\u0085\5(\25\2\u0084~\3\2\2\2\u0084\u0082\3\2\2\2\u0085\23\3\2\2"+
		"\2\u0086\u0087\7\t\2\2\u0087\u0088\5\26\f\2\u0088\25\3\2\2\2\u0089\u008a"+
		"\7\n\2\2\u008a\u008b\7\13\2\2\u008b\u008c\7\f\2\2\u008c\u008d\7\r\2\2"+
		"\u008d\u00b8\7\16\2\2\u008e\u008f\7\n\2\2\u008f\u0090\7\17\2\2\u0090\u0091"+
		"\7\20\2\2\u0091\u0092\7\21\2\2\u0092\u0093\7\22\2\2\u0093\u0094\7\f\2"+
		"\2\u0094\u0095\7\17\2\2\u0095\u00b8\7\23\2\2\u0096\u0097\7\n\2\2\u0097"+
		"\u0098\7\17\2\2\u0098\u0099\7\23\2\2\u0099\u009a\7\21\2\2\u009a\u009b"+
		"\7\22\2\2\u009b\u009c\7\f\2\2\u009c\u009d\7\17\2\2\u009d\u00b8\7\20\2"+
		"\2\u009e\u009f\7\n\2\2\u009f\u00a0\7\17\2\2\u00a0\u00a1\7\20\2\2\u00a1"+
		"\u00a2\7\24\2\2\u00a2\u00a3\7\17\2\2\u00a3\u00b8\7\23\2\2\u00a4\u00a5"+
		"\7\n\2\2\u00a5\u00a6\7\17\2\2\u00a6\u00a7\7\23\2\2\u00a7\u00a8\7\25\2"+
		"\2\u00a8\u00a9\7\26\2\2\u00a9\u00aa\7\17\2\2\u00aa\u00b8\7\20\2\2\u00ab"+
		"\u00ac\7\27\2\2\u00ac\u00ad\7\17\2\2\u00ad\u00ae\7\30\2\2\u00ae\u00af"+
		"\7\31\2\2\u00af\u00b0\7\17\2\2\u00b0\u00b8\7\32\2\2\u00b1\u00b8\7\33\2"+
		"\2\u00b2\u00b3\7\34\2\2\u00b3\u00b4\7\17\2\2\u00b4\u00b5\7\35\2\2\u00b5"+
		"\u00b6\7\3\2\2\u00b6\u00b8\5(\25\2\u00b7\u0089\3\2\2\2\u00b7\u008e\3\2"+
		"\2\2\u00b7\u0096\3\2\2\2\u00b7\u009e\3\2\2\2\u00b7\u00a4\3\2\2\2\u00b7"+
		"\u00ab\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b8\27\3\2\2"+
		"\2\u00b9\u00ba\5\22\n\2\u00ba\u00bb\7\t\2\2\u00bb\u00bc\7\36\2\2\u00bc"+
		"\u00bd\7\37\2\2\u00bd\u00be\7 \2\2\u00be\u00bf\78\2\2\u00bf\u00c0\5\34"+
		"\17\2\u00c0\u00c1\5\"\22\2\u00c1\u00c2\5$\23\2\u00c2\31\3\2\2\2\u00c3"+
		"\u00c4\7\t\2\2\u00c4\u00c5\7\36\2\2\u00c5\u00c6\7!\2\2\u00c6\u00c7\7 "+
		"\2\2\u00c7\u00c8\78\2\2\u00c8\33\3\2\2\2\u00c9\u00ca\7\"\2\2\u00ca\u00cb"+
		"\7#\2\2\u00cb\u00cc\5\36\20\2\u00cc\u00cd\5 \21\2\u00cd\35\3\2\2\2\u00ce"+
		"\u00cf\7$\2\2\u00cf\u00d0\5(\25\2\u00d0\37\3\2\2\2\u00d1\u00d2\7%\2\2"+
		"\u00d2\u00d3\5(\25\2\u00d3!\3\2\2\2\u00d4\u00d5\7$\2\2\u00d5\u00d6\5\6"+
		"\4\2\u00d6#\3\2\2\2\u00d7\u00d8\7%\2\2\u00d8\u00d9\5\6\4\2\u00d9%\3\2"+
		"\2\2\u00da\u00db\5(\25\2\u00db\'\3\2\2\2\u00dc\u00dd\b\25\1\2\u00dd\u00de"+
		"\78\2\2\u00de\u00df\7&\2\2\u00df\u00e0\5(\25\2\u00e0\u00e1\7(\2\2\u00e1"+
		"\u00f5\3\2\2\2\u00e2\u00f5\5\64\33\2\u00e3\u00f5\5:\36\2\u00e4\u00f5\5"+
		"<\37\2\u00e5\u00e6\7*\2\2\u00e6\u00f5\5(\25\23\u00e7\u00f5\5\62\32\2\u00e8"+
		"\u00f5\5\64\33\2\u00e9\u00f5\7\67\2\2\u00ea\u00f5\78\2\2\u00eb\u00f5\7"+
		",\2\2\u00ec\u00f5\7-\2\2\u00ed\u00f5\7:\2\2\u00ee\u00f5\5\66\34\2\u00ef"+
		"\u00f5\58\35\2\u00f0\u00f1\7\7\2\2\u00f1\u00f2\5(\25\2\u00f2\u00f3\7\b"+
		"\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00dc\3\2\2\2\u00f4\u00e2\3\2\2\2\u00f4"+
		"\u00e3\3\2\2\2\u00f4\u00e4\3\2\2\2\u00f4\u00e5\3\2\2\2\u00f4\u00e7\3\2"+
		"\2\2\u00f4\u00e8\3\2\2\2\u00f4\u00e9\3\2\2\2\u00f4\u00ea\3\2\2\2\u00f4"+
		"\u00eb\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00ed\3\2\2\2\u00f4\u00ee\3\2"+
		"\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f5\u0118\3\2\2\2\u00f6"+
		"\u00f7\f\20\2\2\u00f7\u00f8\7;\2\2\u00f8\u0117\5(\25\21\u00f9\u00fa\f"+
		"\17\2\2\u00fa\u00fb\7+\2\2\u00fb\u0117\5(\25\20\u00fc\u00fd\f\16\2\2\u00fd"+
		"\u00fe\7<\2\2\u00fe\u0117\5(\25\17\u00ff\u0100\f\r\2\2\u0100\u0101\7="+
		"\2\2\u0101\u0117\5(\25\16\u0102\u0103\f\f\2\2\u0103\u0104\7>\2\2\u0104"+
		"\u0117\5(\25\r\u0105\u0106\f\13\2\2\u0106\u0107\7?\2\2\u0107\u0117\5("+
		"\25\f\u0108\u0109\f\31\2\2\u0109\u010a\7&\2\2\u010a\u010b\5.\30\2\u010b"+
		"\u010c\7\'\2\2\u010c\u010d\5\60\31\2\u010d\u010e\7(\2\2\u010e\u0117\3"+
		"\2\2\2\u010f\u0110\f\30\2\2\u0110\u0111\7&\2\2\u0111\u0112\78\2\2\u0112"+
		"\u0113\7)\2\2\u0113\u0114\5(\25\2\u0114\u0115\7(\2\2\u0115\u0117\3\2\2"+
		"\2\u0116\u00f6\3\2\2\2\u0116\u00f9\3\2\2\2\u0116\u00fc\3\2\2\2\u0116\u00ff"+
		"\3\2\2\2\u0116\u0102\3\2\2\2\u0116\u0105\3\2\2\2\u0116\u0108\3\2\2\2\u0116"+
		"\u010f\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119)\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\5,\27\2\u011c\u011d"+
		"\7\63\2\2\u011d+\3\2\2\2\u011e\u011f\t\2\2\2\u011f-\3\2\2\2\u0120\u0125"+
		"\5> \2\u0121\u0122\7)\2\2\u0122\u0124\5> \2\u0123\u0121\3\2\2\2\u0124"+
		"\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126/\3\2\2\2"+
		"\u0127\u0125\3\2\2\2\u0128\u012d\5(\25\2\u0129\u012a\7)\2\2\u012a\u012c"+
		"\5(\25\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\61\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7\7\2"+
		"\2\u0131\u0132\7@\2\2\u0132\u0133\5.\30\2\u0133\u0134\7.\2\2\u0134\u0135"+
		"\7\3\2\2\u0135\u0136\5(\25\2\u0136\u0137\7\b\2\2\u0137\63\3\2\2\2\u0138"+
		"\u0139\7\7\2\2\u0139\u013a\7@\2\2\u013a\u013b\5.\30\2\u013b\u013c\7.\2"+
		"\2\u013c\u013d\5(\25\2\u013d\u013e\7\3\2\2\u013e\u013f\5(\25\2\u013f\u0140"+
		"\7\b\2\2\u0140\65\3\2\2\2\u0141\u014a\7/\2\2\u0142\u0147\5(\25\2\u0143"+
		"\u0144\7)\2\2\u0144\u0146\5(\25\2\u0145\u0143\3\2\2\2\u0146\u0149\3\2"+
		"\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u0142\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014d\7\60\2\2\u014d\67\3\2\2\2\u014e\u014f\7/\2\2\u014f\u0150"+
		"\5> \2\u0150\u0151\7.\2\2\u0151\u0152\5(\25\2\u0152\u0153\7\3\2\2\u0153"+
		"\u0154\5(\25\2\u0154\u0155\7\60\2\2\u01559\3\2\2\2\u0156\u0157\7\61\2"+
		"\2\u0157\u0158\7\62\2\2\u0158\u0159\5<\37\2\u0159;\3\2\2\2\u015a\u015b"+
		"\78\2\2\u015b\u015c\7\62\2\2\u015c\u0163\5(\25\2\u015d\u015e\78\2\2\u015e"+
		"\u015f\7\7\2\2\u015f\u0160\5\60\31\2\u0160\u0161\7\b\2\2\u0161\u0163\3"+
		"\2\2\2\u0162\u015a\3\2\2\2\u0162\u015d\3\2\2\2\u0163=\3\2\2\2\u0164\u0167"+
		"\78\2\2\u0165\u0166\7\3\2\2\u0166\u0168\79\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168?\3\2\2\2\31FKNQTW_cftx|\u0084\u00b7\u00f4\u0116\u0118"+
		"\u0125\u012d\u0147\u014a\u0162\u0167";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}