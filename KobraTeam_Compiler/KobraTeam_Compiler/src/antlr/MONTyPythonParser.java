// Generated from MONTyPython.g4 by ANTLR 4.13.1
 package antlr; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MONTyPythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, UNARY=17, 
		LOGIC=18, NOT=19, COMMENT=20, INT_TYPE=21, FLOAT_TYPE=22, ID=23, INT=24, 
		FLOAT=25, MULT=26, DIV=27, PLUS=28, MINUS=29, MOD=30, DIV_INT=31, POW=32, 
		LBRACK=33, RBRACK=34, LPAREN=35, RPAREN=36, COMMA=37, STRING=38, AND=39, 
		OR=40, NOR=41, RELATIONAL_OP=42, WS=43;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_expression = 2, RULE_declaration = 3, 
		RULE_assignment = 4, RULE_varType = 5, RULE_list = 6, RULE_listFunction = 7, 
		RULE_functionCall = 8, RULE_parameter = 9, RULE_forLoop = 10, RULE_whileLoop = 11, 
		RULE_ifStatement = 12, RULE_inputStatement = 13, RULE_printStatement = 14, 
		RULE_returnStatement = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "expression", "declaration", "assignment", "varType", 
			"list", "listFunction", "functionCall", "parameter", "forLoop", "whileLoop", 
			"ifStatement", "inputStatement", "printStatement", "returnStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'def'", "':'", "'size'", "'add'", "'remove'", "'for'", 
			"'in'", "'range'", "'while'", "'if'", "'elif'", "'else'", "'input'", 
			"'print'", "'return'", null, null, "'not'", null, "'int'", "'float'", 
			null, null, null, "'*'", "'/'", "'+'", "'-'", "'%'", "'//'", "'**'", 
			"'['", "']'", "'('", "')'", "','", null, "'and'", "'or'", "'nor'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "UNARY", "LOGIC", "NOT", "COMMENT", "INT_TYPE", 
			"FLOAT_TYPE", "ID", "INT", "FLOAT", "MULT", "DIV", "PLUS", "MINUS", "MOD", 
			"DIV_INT", "POW", "LBRACK", "RBRACK", "LPAREN", "RPAREN", "COMMA", "STRING", 
			"AND", "OR", "NOR", "RELATIONAL_OP", "WS"
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
	public String getGrammarFileName() { return "MONTyPython.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MONTyPythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ProgramContext {
		public TerminalNode EOF() { return getToken(MONTyPythonParser.EOF, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ProgContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14781684L) != 0)) {
				{
				{
				setState(32);
				command();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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
	public static class CommandContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ListFunctionContext listFunction() {
			return getRuleContext(ListFunctionContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				listFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				forLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				whileLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				inputStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(47);
				printStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(48);
				ifStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(49);
				returnStatement();
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(MONTyPythonParser.ID, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode UNARY() { return getToken(MONTyPythonParser.UNARY, 0); }
		public UnaryOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ExpressionContext {
		public TerminalNode FLOAT() { return getToken(MONTyPythonParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(MONTyPythonParser.INT, 0); }
		public TerminalNode UNARY() { return getToken(MONTyPythonParser.UNARY, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupExpContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(MONTyPythonParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MONTyPythonParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(MONTyPythonParser.NOT, 0); }
		public GroupExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterGroupExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitGroupExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitGroupExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListIndexContext extends ExpressionContext {
		public List<TerminalNode> ID() { return getTokens(MONTyPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MONTyPythonParser.ID, i);
		}
		public TerminalNode LBRACK() { return getToken(MONTyPythonParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MONTyPythonParser.RBRACK, 0); }
		public ListIndexContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterListIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitListIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitListIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RELATIONAL_OP() { return getToken(MONTyPythonParser.RELATIONAL_OP, 0); }
		public RelationalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGIC() { return getToken(MONTyPythonParser.LOGIC, 0); }
		public LogicalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode POW() { return getToken(MONTyPythonParser.POW, 0); }
		public PowContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultDivContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(MONTyPythonParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(MONTyPythonParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MONTyPythonParser.MOD, 0); }
		public TerminalNode DIV_INT() { return getToken(MONTyPythonParser.DIV_INT, 0); }
		public MultDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new GroupExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(53);
					match(NOT);
					}
				}

				setState(56);
				match(LPAREN);
				setState(57);
				expression(0);
				setState(58);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ListIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(ID);
				setState(61);
				match(LBRACK);
				setState(62);
				match(ID);
				setState(63);
				match(RBRACK);
				}
				break;
			case 3:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNARY) {
					{
					setState(65);
					match(UNARY);
					}
				}

				setState(68);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(85);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(72);
						((MultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3422552064L) != 0)) ) {
							((MultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(73);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new UnaryOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(75);
						((UnaryOpContext)_localctx).op = match(UNARY);
						setState(76);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new RelationalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(77);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(78);
						match(RELATIONAL_OP);
						}
						setState(79);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new LogicalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(80);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(81);
						((LogicalContext)_localctx).op = match(LOGIC);
						setState(82);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new PowContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						{
						setState(84);
						match(POW);
						}
						}
						break;
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntDeclarationContext extends DeclarationContext {
		public TerminalNode INT_TYPE() { return getToken(MONTyPythonParser.INT_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(MONTyPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MONTyPythonParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(MONTyPythonParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MONTyPythonParser.INT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MONTyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MONTyPythonParser.COMMA, i);
		}
		public List<TerminalNode> UNARY() { return getTokens(MONTyPythonParser.UNARY); }
		public TerminalNode UNARY(int i) {
			return getToken(MONTyPythonParser.UNARY, i);
		}
		public IntDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterIntDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitIntDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitIntDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntFunctionDeclarationContext extends DeclarationContext {
		public TerminalNode INT_TYPE() { return getToken(MONTyPythonParser.INT_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(MONTyPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MONTyPythonParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(MONTyPythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MONTyPythonParser.RPAREN, 0); }
		public List<VarTypeContext> varType() {
			return getRuleContexts(VarTypeContext.class);
		}
		public VarTypeContext varType(int i) {
			return getRuleContext(VarTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MONTyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MONTyPythonParser.COMMA, i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public IntFunctionDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterIntFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitIntFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitIntFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatFunctionDeclarationContext extends DeclarationContext {
		public List<TerminalNode> ID() { return getTokens(MONTyPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MONTyPythonParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(MONTyPythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MONTyPythonParser.RPAREN, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(MONTyPythonParser.FLOAT_TYPE, 0); }
		public List<VarTypeContext> varType() {
			return getRuleContexts(VarTypeContext.class);
		}
		public VarTypeContext varType(int i) {
			return getRuleContext(VarTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MONTyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MONTyPythonParser.COMMA, i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public FloatFunctionDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterFloatFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitFloatFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitFloatFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntListFunctionDeclContext extends DeclarationContext {
		public TerminalNode INT_TYPE() { return getToken(MONTyPythonParser.INT_TYPE, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(MONTyPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MONTyPythonParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(MONTyPythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MONTyPythonParser.RPAREN, 0); }
		public List<VarTypeContext> varType() {
			return getRuleContexts(VarTypeContext.class);
		}
		public VarTypeContext varType(int i) {
			return getRuleContext(VarTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MONTyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MONTyPythonParser.COMMA, i);
		}
		public IntListFunctionDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterIntListFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitIntListFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitIntListFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListDeclarationContext extends DeclarationContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode ID() { return getToken(MONTyPythonParser.ID, 0); }
		public ListDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitListDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatDeclarationContext extends DeclarationContext {
		public TerminalNode FLOAT_TYPE() { return getToken(MONTyPythonParser.FLOAT_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(MONTyPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MONTyPythonParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MONTyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MONTyPythonParser.COMMA, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(MONTyPythonParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(MONTyPythonParser.FLOAT, i);
		}
		public List<TerminalNode> INT() { return getTokens(MONTyPythonParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MONTyPythonParser.INT, i);
		}
		public List<TerminalNode> UNARY() { return getTokens(MONTyPythonParser.UNARY); }
		public TerminalNode UNARY(int i) {
			return getToken(MONTyPythonParser.UNARY, i);
		}
		public FloatDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterFloatDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitFloatDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitFloatDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatListFunctionDeclContext extends DeclarationContext {
		public TerminalNode FLOAT_TYPE() { return getToken(MONTyPythonParser.FLOAT_TYPE, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(MONTyPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MONTyPythonParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(MONTyPythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MONTyPythonParser.RPAREN, 0); }
		public List<VarTypeContext> varType() {
			return getRuleContexts(VarTypeContext.class);
		}
		public VarTypeContext varType(int i) {
			return getRuleContext(VarTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MONTyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MONTyPythonParser.COMMA, i);
		}
		public FloatListFunctionDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterFloatListFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitFloatListFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitFloatListFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new FloatDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(FLOAT_TYPE);
				setState(91);
				match(ID);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(92);
					match(T__0);
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNARY) {
						{
						setState(93);
						match(UNARY);
						}
					}

					setState(96);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==FLOAT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(99);
					match(COMMA);
					setState(100);
					match(ID);
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(101);
						match(T__0);
						setState(103);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==UNARY) {
							{
							setState(102);
							match(UNARY);
							}
						}

						setState(105);
						_la = _input.LA(1);
						if ( !(_la==INT || _la==FLOAT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new IntDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(INT_TYPE);
				setState(114);
				match(ID);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(115);
					match(T__0);
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNARY) {
						{
						setState(116);
						match(UNARY);
						}
					}

					setState(119);
					match(INT);
					}
				}

				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(122);
					match(COMMA);
					setState(123);
					match(ID);
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(124);
						match(T__0);
						setState(126);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==UNARY) {
							{
							setState(125);
							match(UNARY);
							}
						}

						setState(128);
						match(INT);
						}
					}

					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new ListDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				varType();
				setState(137);
				list();
				setState(138);
				match(ID);
				}
				break;
			case 4:
				_localctx = new FloatFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(T__1);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FLOAT_TYPE) {
					{
					setState(141);
					match(FLOAT_TYPE);
					}
				}

				setState(144);
				match(ID);
				setState(145);
				match(LPAREN);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) {
					{
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INT_TYPE || _la==FLOAT_TYPE) {
						{
						setState(146);
						varType();
						setState(148);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LBRACK) {
							{
							setState(147);
							list();
							}
						}

						}
					}

					setState(152);
					match(ID);
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(153);
						match(COMMA);
						setState(158);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INT_TYPE || _la==FLOAT_TYPE) {
							{
							setState(154);
							varType();
							setState(156);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LBRACK) {
								{
								setState(155);
								list();
								}
							}

							}
						}

						setState(160);
						match(ID);
						}
						}
						setState(165);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(168);
				match(RPAREN);
				setState(169);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new IntFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				match(T__1);
				setState(171);
				match(INT_TYPE);
				setState(172);
				match(ID);
				setState(173);
				match(LPAREN);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) {
					{
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INT_TYPE || _la==FLOAT_TYPE) {
						{
						setState(174);
						varType();
						setState(176);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LBRACK) {
							{
							setState(175);
							list();
							}
						}

						}
					}

					setState(180);
					match(ID);
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(181);
						match(COMMA);
						setState(186);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INT_TYPE || _la==FLOAT_TYPE) {
							{
							setState(182);
							varType();
							setState(184);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LBRACK) {
								{
								setState(183);
								list();
								}
							}

							}
						}

						setState(188);
						match(ID);
						}
						}
						setState(193);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(196);
				match(RPAREN);
				setState(197);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new IntListFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				match(T__1);
				setState(199);
				match(INT_TYPE);
				setState(200);
				list();
				setState(201);
				match(ID);
				setState(202);
				match(LPAREN);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) {
					{
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INT_TYPE || _la==FLOAT_TYPE) {
						{
						setState(203);
						varType();
						setState(205);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LBRACK) {
							{
							setState(204);
							list();
							}
						}

						}
					}

					setState(209);
					match(ID);
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(210);
						match(COMMA);
						setState(215);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INT_TYPE || _la==FLOAT_TYPE) {
							{
							setState(211);
							varType();
							setState(213);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LBRACK) {
								{
								setState(212);
								list();
								}
							}

							}
						}

						setState(217);
						match(ID);
						}
						}
						setState(222);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(225);
				match(RPAREN);
				setState(226);
				match(T__2);
				}
				break;
			case 7:
				_localctx = new FloatListFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(228);
				match(T__1);
				setState(229);
				match(FLOAT_TYPE);
				setState(230);
				list();
				setState(231);
				match(ID);
				setState(232);
				match(LPAREN);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) {
					{
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INT_TYPE || _la==FLOAT_TYPE) {
						{
						setState(233);
						varType();
						setState(235);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LBRACK) {
							{
							setState(234);
							list();
							}
						}

						}
					}

					setState(239);
					match(ID);
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(240);
						match(COMMA);
						setState(245);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INT_TYPE || _la==FLOAT_TYPE) {
							{
							setState(241);
							varType();
							setState(243);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LBRACK) {
								{
								setState(242);
								list();
								}
							}

							}
						}

						setState(247);
						match(ID);
						}
						}
						setState(252);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(255);
				match(RPAREN);
				setState(256);
				match(T__2);
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
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListAssignContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(MONTyPythonParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(MONTyPythonParser.LBRACK, 0); }
		public List<TerminalNode> INT() { return getTokens(MONTyPythonParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MONTyPythonParser.INT, i);
		}
		public TerminalNode RBRACK() { return getToken(MONTyPythonParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MONTyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MONTyPythonParser.COMMA, i);
		}
		public ListAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterListAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitListAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitListAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(MONTyPythonParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterVariableAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitVariableAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitVariableAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new VariableAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(ID);
				setState(261);
				match(T__0);
				setState(262);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ListAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(ID);
				setState(264);
				match(T__0);
				setState(265);
				match(LBRACK);
				setState(266);
				match(INT);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(267);
					match(COMMA);
					setState(268);
					match(INT);
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(274);
				match(RBRACK);
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
	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode FLOAT_TYPE() { return getToken(MONTyPythonParser.FLOAT_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(MONTyPythonParser.INT_TYPE, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !(_la==INT_TYPE || _la==FLOAT_TYPE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(MONTyPythonParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MONTyPythonParser.RBRACK, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(LBRACK);
			setState(280);
			match(RBRACK);
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
	public static class ListFunctionContext extends ParserRuleContext {
		public ListFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listFunction; }
	 
		public ListFunctionContext() { }
		public void copyFrom(ListFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListSizeContext extends ListFunctionContext {
		public TerminalNode LPAREN() { return getToken(MONTyPythonParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(MONTyPythonParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(MONTyPythonParser.RPAREN, 0); }
		public ListSizeContext(ListFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterListSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitListSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitListSize(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListAddContext extends ListFunctionContext {
		public TerminalNode LPAREN() { return getToken(MONTyPythonParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MONTyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MONTyPythonParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(MONTyPythonParser.RPAREN, 0); }
		public ListAddContext(ListFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterListAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitListAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitListAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListRemoveContext extends ListFunctionContext {
		public TerminalNode LPAREN() { return getToken(MONTyPythonParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(MONTyPythonParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(MONTyPythonParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MONTyPythonParser.RPAREN, 0); }
		public ListRemoveContext(ListFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterListRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitListRemove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitListRemove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListFunctionContext listFunction() throws RecognitionException {
		ListFunctionContext _localctx = new ListFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listFunction);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new ListSizeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(T__3);
				setState(283);
				match(LPAREN);
				setState(284);
				match(ID);
				setState(285);
				match(RPAREN);
				}
				break;
			case T__4:
				_localctx = new ListAddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(T__4);
				setState(287);
				match(LPAREN);
				setState(288);
				expression(0);
				setState(289);
				match(COMMA);
				setState(290);
				expression(0);
				setState(291);
				match(COMMA);
				setState(292);
				expression(0);
				setState(293);
				match(RPAREN);
				}
				break;
			case T__5:
				_localctx = new ListRemoveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				match(T__5);
				setState(296);
				match(LPAREN);
				setState(297);
				match(ID);
				setState(298);
				match(COMMA);
				setState(299);
				expression(0);
				setState(300);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends FunctionCallContext {
		public TerminalNode ID() { return getToken(MONTyPythonParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MONTyPythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MONTyPythonParser.RPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MONTyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MONTyPythonParser.COMMA, i);
		}
		public FuncCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		int _la;
		try {
			_localctx = new FuncCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(ID);
			setState(305);
			match(LPAREN);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34425405440L) != 0)) {
				{
				setState(306);
				parameter();
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(307);
					match(COMMA);
					setState(308);
					parameter();
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(316);
			match(RPAREN);
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
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MONTyPythonParser.ID, 0); }
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter);
		int _la;
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT_TYPE || _la==FLOAT_TYPE) {
					{
					setState(318);
					varType();
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LBRACK) {
						{
						setState(319);
						list();
						}
					}

					}
				}

				setState(324);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				expression(0);
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
	public static class ForLoopContext extends ParserRuleContext {
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	 
		public ForLoopContext() { }
		public void copyFrom(ForLoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInstructionContext extends ForLoopContext {
		public List<TerminalNode> ID() { return getTokens(MONTyPythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MONTyPythonParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(MONTyPythonParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MONTyPythonParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MONTyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MONTyPythonParser.COMMA, i);
		}
		public ForInstructionContext(ForLoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterForInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitForInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitForInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forLoop);
		int _la;
		try {
			_localctx = new ForInstructionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__6);
			setState(329);
			match(ID);
			setState(330);
			match(T__7);
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(331);
				match(ID);
				}
				break;
			case T__8:
				{
				setState(332);
				match(T__8);
				setState(333);
				match(LPAREN);
				setState(334);
				expression(0);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(335);
					match(COMMA);
					setState(336);
					expression(0);
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(342);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(346);
			match(T__2);
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
	public static class WhileLoopContext extends ParserRuleContext {
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	 
		public WhileLoopContext() { }
		public void copyFrom(WhileLoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileInstrunctionContext extends WhileLoopContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileInstrunctionContext(WhileLoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterWhileInstrunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitWhileInstrunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitWhileInstrunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileLoop);
		try {
			_localctx = new WhileInstrunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(T__9);
			setState(349);
			expression(0);
			setState(350);
			match(T__2);
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
	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfInstructionContext extends IfStatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IfInstructionContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterIfInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitIfInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitIfInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		int _la;
		try {
			_localctx = new IfInstructionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(T__10);
			setState(353);
			expression(0);
			setState(354);
			match(T__2);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(355);
				match(T__11);
				setState(356);
				expression(0);
				setState(357);
				match(T__2);
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(364);
				match(T__12);
				setState(365);
				match(T__2);
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
	public static class InputStatementContext extends ParserRuleContext {
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
	 
		public InputStatementContext() { }
		public void copyFrom(InputStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputFunctionContext extends InputStatementContext {
		public TerminalNode ID() { return getToken(MONTyPythonParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MONTyPythonParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(MONTyPythonParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(MONTyPythonParser.RPAREN, 0); }
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public InputFunctionContext(InputStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterInputFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitInputFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitInputFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inputStatement);
		int _la;
		try {
			_localctx = new InputFunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_TYPE || _la==FLOAT_TYPE) {
				{
				setState(368);
				varType();
				}
			}

			setState(371);
			match(ID);
			setState(372);
			match(T__0);
			setState(373);
			match(T__13);
			setState(374);
			match(LPAREN);
			setState(375);
			match(STRING);
			setState(376);
			match(RPAREN);
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
	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	 
		public PrintStatementContext() { }
		public void copyFrom(PrintStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintFunctionContext extends PrintStatementContext {
		public TerminalNode LPAREN() { return getToken(MONTyPythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MONTyPythonParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(MONTyPythonParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MONTyPythonParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MONTyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MONTyPythonParser.COMMA, i);
		}
		public PrintFunctionContext(PrintStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterPrintFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitPrintFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitPrintFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_printStatement);
		int _la;
		try {
			_localctx = new PrintFunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(T__14);
			setState(379);
			match(LPAREN);
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNARY:
			case NOT:
			case ID:
			case INT:
			case FLOAT:
			case LPAREN:
				{
				setState(380);
				expression(0);
				}
				break;
			case STRING:
				{
				setState(381);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(384);
				match(COMMA);
				setState(387);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNARY:
				case NOT:
				case ID:
				case INT:
				case FLOAT:
				case LPAREN:
					{
					setState(385);
					expression(0);
					}
					break;
				case STRING:
					{
					setState(386);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			match(RPAREN);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnFuncionContext extends ReturnStatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MONTyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MONTyPythonParser.COMMA, i);
		}
		public ReturnFuncionContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterReturnFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitReturnFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitReturnFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_returnStatement);
		int _la;
		try {
			_localctx = new ReturnFuncionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(T__15);
			{
			setState(397);
			expression(0);
			}
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(398);
				match(COMMA);
				{
				setState(399);
				expression(0);
				}
				}
				}
				setState(404);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0196\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"3\b\u0001\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0002\u0003"+
		"\u0002F\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002V\b\u0002\n\u0002"+
		"\f\u0002Y\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003_\b\u0003\u0001\u0003\u0003\u0003b\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003h\b\u0003\u0001\u0003\u0003\u0003"+
		"k\b\u0003\u0005\u0003m\b\u0003\n\u0003\f\u0003p\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003v\b\u0003\u0001\u0003\u0003"+
		"\u0003y\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u007f\b\u0003\u0001\u0003\u0003\u0003\u0082\b\u0003\u0005\u0003"+
		"\u0084\b\u0003\n\u0003\f\u0003\u0087\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008f\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0095\b\u0003\u0003"+
		"\u0003\u0097\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u009d\b\u0003\u0003\u0003\u009f\b\u0003\u0001\u0003\u0005\u0003"+
		"\u00a2\b\u0003\n\u0003\f\u0003\u00a5\t\u0003\u0003\u0003\u00a7\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00b1\b\u0003\u0003\u0003\u00b3\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00b9"+
		"\b\u0003\u0003\u0003\u00bb\b\u0003\u0001\u0003\u0005\u0003\u00be\b\u0003"+
		"\n\u0003\f\u0003\u00c1\t\u0003\u0003\u0003\u00c3\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00ce\b\u0003\u0003\u0003\u00d0\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00d6\b\u0003"+
		"\u0003\u0003\u00d8\b\u0003\u0001\u0003\u0005\u0003\u00db\b\u0003\n\u0003"+
		"\f\u0003\u00de\t\u0003\u0003\u0003\u00e0\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00ec\b\u0003\u0003\u0003\u00ee\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00f4"+
		"\b\u0003\u0003\u0003\u00f6\b\u0003\u0001\u0003\u0005\u0003\u00f9\b\u0003"+
		"\n\u0003\f\u0003\u00fc\t\u0003\u0003\u0003\u00fe\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0103\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u010e\b\u0004\n\u0004\f\u0004\u0111\t\u0004\u0001\u0004"+
		"\u0003\u0004\u0114\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u012f\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0136\b\b\n\b\f\b\u0139\t\b\u0003"+
		"\b\u013b\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u0141\b\t\u0003\t"+
		"\u0143\b\t\u0001\t\u0001\t\u0003\t\u0147\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0152\b\n\n\n\f\n\u0155"+
		"\t\n\u0001\n\u0001\n\u0003\n\u0159\b\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0005\f\u0168\b\f\n\f\f\f\u016b\t\f\u0001\f\u0001\f\u0003"+
		"\f\u016f\b\f\u0001\r\u0003\r\u0172\b\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u017f\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0184\b\u000e\u0005\u000e\u0186\b\u000e\n\u000e\f\u000e\u0189\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u0191\b\u000f\n\u000f\f\u000f\u0194\t\u000f\u0001\u000f\u0000"+
		"\u0001\u0004\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e\u0000\u0003\u0001\u0000\u0018\u0019\u0002"+
		"\u0000\u001a\u001b\u001e\u001f\u0001\u0000\u0015\u0016\u01d4\u0000#\u0001"+
		"\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000"+
		"\u0000\u0006\u0102\u0001\u0000\u0000\u0000\b\u0113\u0001\u0000\u0000\u0000"+
		"\n\u0115\u0001\u0000\u0000\u0000\f\u0117\u0001\u0000\u0000\u0000\u000e"+
		"\u012e\u0001\u0000\u0000\u0000\u0010\u0130\u0001\u0000\u0000\u0000\u0012"+
		"\u0146\u0001\u0000\u0000\u0000\u0014\u0148\u0001\u0000\u0000\u0000\u0016"+
		"\u015c\u0001\u0000\u0000\u0000\u0018\u0160\u0001\u0000\u0000\u0000\u001a"+
		"\u0171\u0001\u0000\u0000\u0000\u001c\u017a\u0001\u0000\u0000\u0000\u001e"+
		"\u018c\u0001\u0000\u0000\u0000 \"\u0003\u0002\u0001\u0000! \u0001\u0000"+
		"\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000"+
		"&\'\u0005\u0000\u0000\u0001\'\u0001\u0001\u0000\u0000\u0000(3\u0003\u0006"+
		"\u0003\u0000)3\u0003\b\u0004\u0000*3\u0003\u0010\b\u0000+3\u0003\u000e"+
		"\u0007\u0000,3\u0003\u0014\n\u0000-3\u0003\u0016\u000b\u0000.3\u0003\u001a"+
		"\r\u0000/3\u0003\u001c\u000e\u000003\u0003\u0018\f\u000013\u0003\u001e"+
		"\u000f\u00002(\u0001\u0000\u0000\u00002)\u0001\u0000\u0000\u00002*\u0001"+
		"\u0000\u0000\u00002+\u0001\u0000\u0000\u00002,\u0001\u0000\u0000\u0000"+
		"2-\u0001\u0000\u0000\u00002.\u0001\u0000\u0000\u00002/\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u00003\u0003\u0001"+
		"\u0000\u0000\u000046\u0006\u0002\uffff\uffff\u000057\u0005\u0013\u0000"+
		"\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u000089\u0005#\u0000\u00009:\u0003\u0004\u0002\u0000:;\u0005$\u0000"+
		"\u0000;F\u0001\u0000\u0000\u0000<=\u0005\u0017\u0000\u0000=>\u0005!\u0000"+
		"\u0000>?\u0005\u0017\u0000\u0000?F\u0005\"\u0000\u0000@F\u0005\u0017\u0000"+
		"\u0000AC\u0005\u0011\u0000\u0000BA\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DF\u0007\u0000\u0000\u0000E4\u0001"+
		"\u0000\u0000\u0000E<\u0001\u0000\u0000\u0000E@\u0001\u0000\u0000\u0000"+
		"EB\u0001\u0000\u0000\u0000FW\u0001\u0000\u0000\u0000GH\n\u0007\u0000\u0000"+
		"HI\u0007\u0001\u0000\u0000IV\u0003\u0004\u0002\bJK\n\u0006\u0000\u0000"+
		"KL\u0005\u0011\u0000\u0000LV\u0003\u0004\u0002\u0007MN\n\u0005\u0000\u0000"+
		"NO\u0005*\u0000\u0000OV\u0003\u0004\u0002\u0006PQ\n\u0004\u0000\u0000"+
		"QR\u0005\u0012\u0000\u0000RV\u0003\u0004\u0002\u0005ST\n\b\u0000\u0000"+
		"TV\u0005 \u0000\u0000UG\u0001\u0000\u0000\u0000UJ\u0001\u0000\u0000\u0000"+
		"UM\u0001\u0000\u0000\u0000UP\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000X\u0005\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"Z[\u0005\u0016\u0000\u0000[a\u0005\u0017\u0000\u0000\\^\u0005\u0001\u0000"+
		"\u0000]_\u0005\u0011\u0000\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0007\u0000\u0000\u0000a\\\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bn\u0001\u0000\u0000\u0000"+
		"cd\u0005%\u0000\u0000dj\u0005\u0017\u0000\u0000eg\u0005\u0001\u0000\u0000"+
		"fh\u0005\u0011\u0000\u0000gf\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000ik\u0007\u0000\u0000\u0000je\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000lc\u0001"+
		"\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000o\u0103\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000qr\u0005\u0015\u0000\u0000rx\u0005\u0017\u0000\u0000su\u0005"+
		"\u0001\u0000\u0000tv\u0005\u0011\u0000\u0000ut\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0005\u0018\u0000"+
		"\u0000xs\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0085\u0001"+
		"\u0000\u0000\u0000z{\u0005%\u0000\u0000{\u0081\u0005\u0017\u0000\u0000"+
		"|~\u0005\u0001\u0000\u0000}\u007f\u0005\u0011\u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0082\u0005\u0018\u0000\u0000\u0081|\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000"+
		"\u0083z\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0103\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0003\n\u0005\u0000\u0089\u008a\u0003\f\u0006\u0000\u008a\u008b"+
		"\u0005\u0017\u0000\u0000\u008b\u0103\u0001\u0000\u0000\u0000\u008c\u008e"+
		"\u0005\u0002\u0000\u0000\u008d\u008f\u0005\u0016\u0000\u0000\u008e\u008d"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0017\u0000\u0000\u0091\u00a6"+
		"\u0005#\u0000\u0000\u0092\u0094\u0003\n\u0005\u0000\u0093\u0095\u0003"+
		"\f\u0006\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0092\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098\u00a3\u0005\u0017\u0000\u0000\u0099\u009e\u0005%\u0000"+
		"\u0000\u009a\u009c\u0003\n\u0005\u0000\u009b\u009d\u0003\f\u0006\u0000"+
		"\u009c\u009b\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009a\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a2\u0005\u0017\u0000\u0000\u00a1\u0099\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u0096\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0005$\u0000\u0000\u00a9\u0103\u0005\u0003\u0000\u0000\u00aa"+
		"\u00ab\u0005\u0002\u0000\u0000\u00ab\u00ac\u0005\u0015\u0000\u0000\u00ac"+
		"\u00ad\u0005\u0017\u0000\u0000\u00ad\u00c2\u0005#\u0000\u0000\u00ae\u00b0"+
		"\u0003\n\u0005\u0000\u00af\u00b1\u0003\f\u0006\u0000\u00b0\u00af\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00bf\u0005"+
		"\u0017\u0000\u0000\u00b5\u00ba\u0005%\u0000\u0000\u00b6\u00b8\u0003\n"+
		"\u0005\u0000\u00b7\u00b9\u0003\f\u0006\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00be\u0005\u0017\u0000"+
		"\u0000\u00bd\u00b5\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c2\u00b2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005$\u0000\u0000"+
		"\u00c5\u0103\u0005\u0003\u0000\u0000\u00c6\u00c7\u0005\u0002\u0000\u0000"+
		"\u00c7\u00c8\u0005\u0015\u0000\u0000\u00c8\u00c9\u0003\f\u0006\u0000\u00c9"+
		"\u00ca\u0005\u0017\u0000\u0000\u00ca\u00df\u0005#\u0000\u0000\u00cb\u00cd"+
		"\u0003\n\u0005\u0000\u00cc\u00ce\u0003\f\u0006\u0000\u00cd\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cb\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00dc\u0005"+
		"\u0017\u0000\u0000\u00d2\u00d7\u0005%\u0000\u0000\u00d3\u00d5\u0003\n"+
		"\u0005\u0000\u00d4\u00d6\u0003\f\u0006\u0000\u00d5\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d3\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00db\u0005\u0017\u0000"+
		"\u0000\u00da\u00d2\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000"+
		"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000"+
		"\u0000\u00df\u00cf\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005$\u0000\u0000"+
		"\u00e2\u00e3\u0005\u0003\u0000\u0000\u00e3\u0103\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0005\u0002\u0000\u0000\u00e5\u00e6\u0005\u0016\u0000\u0000"+
		"\u00e6\u00e7\u0003\f\u0006\u0000\u00e7\u00e8\u0005\u0017\u0000\u0000\u00e8"+
		"\u00fd\u0005#\u0000\u0000\u00e9\u00eb\u0003\n\u0005\u0000\u00ea\u00ec"+
		"\u0003\f\u0006\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ef\u00fa\u0005\u0017\u0000\u0000\u00f0\u00f5\u0005"+
		"%\u0000\u0000\u00f1\u00f3\u0003\n\u0005\u0000\u00f2\u00f4\u0003\f\u0006"+
		"\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f9\u0005\u0017\u0000\u0000\u00f8\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00ed\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005$\u0000\u0000\u0100\u0101\u0005\u0003\u0000\u0000"+
		"\u0101\u0103\u0001\u0000\u0000\u0000\u0102Z\u0001\u0000\u0000\u0000\u0102"+
		"q\u0001\u0000\u0000\u0000\u0102\u0088\u0001\u0000\u0000\u0000\u0102\u008c"+
		"\u0001\u0000\u0000\u0000\u0102\u00aa\u0001\u0000\u0000\u0000\u0102\u00c6"+
		"\u0001\u0000\u0000\u0000\u0102\u00e4\u0001\u0000\u0000\u0000\u0103\u0007"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0017\u0000\u0000\u0105\u0106"+
		"\u0005\u0001\u0000\u0000\u0106\u0114\u0003\u0004\u0002\u0000\u0107\u0108"+
		"\u0005\u0017\u0000\u0000\u0108\u0109\u0005\u0001\u0000\u0000\u0109\u010a"+
		"\u0005!\u0000\u0000\u010a\u010f\u0005\u0018\u0000\u0000\u010b\u010c\u0005"+
		"%\u0000\u0000\u010c\u010e\u0005\u0018\u0000\u0000\u010d\u010b\u0001\u0000"+
		"\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0112\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0114\u0005\"\u0000"+
		"\u0000\u0113\u0104\u0001\u0000\u0000\u0000\u0113\u0107\u0001\u0000\u0000"+
		"\u0000\u0114\t\u0001\u0000\u0000\u0000\u0115\u0116\u0007\u0002\u0000\u0000"+
		"\u0116\u000b\u0001\u0000\u0000\u0000\u0117\u0118\u0005!\u0000\u0000\u0118"+
		"\u0119\u0005\"\u0000\u0000\u0119\r\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0005\u0004\u0000\u0000\u011b\u011c\u0005#\u0000\u0000\u011c\u011d\u0005"+
		"\u0017\u0000\u0000\u011d\u012f\u0005$\u0000\u0000\u011e\u011f\u0005\u0005"+
		"\u0000\u0000\u011f\u0120\u0005#\u0000\u0000\u0120\u0121\u0003\u0004\u0002"+
		"\u0000\u0121\u0122\u0005%\u0000\u0000\u0122\u0123\u0003\u0004\u0002\u0000"+
		"\u0123\u0124\u0005%\u0000\u0000\u0124\u0125\u0003\u0004\u0002\u0000\u0125"+
		"\u0126\u0005$\u0000\u0000\u0126\u012f\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0005\u0006\u0000\u0000\u0128\u0129\u0005#\u0000\u0000\u0129\u012a\u0005"+
		"\u0017\u0000\u0000\u012a\u012b\u0005%\u0000\u0000\u012b\u012c\u0003\u0004"+
		"\u0002\u0000\u012c\u012d\u0005$\u0000\u0000\u012d\u012f\u0001\u0000\u0000"+
		"\u0000\u012e\u011a\u0001\u0000\u0000\u0000\u012e\u011e\u0001\u0000\u0000"+
		"\u0000\u012e\u0127\u0001\u0000\u0000\u0000\u012f\u000f\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0005\u0017\u0000\u0000\u0131\u013a\u0005#\u0000\u0000"+
		"\u0132\u0137\u0003\u0012\t\u0000\u0133\u0134\u0005%\u0000\u0000\u0134"+
		"\u0136\u0003\u0012\t\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u0139"+
		"\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u0137"+
		"\u0001\u0000\u0000\u0000\u013a\u0132\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d"+
		"\u0005$\u0000\u0000\u013d\u0011\u0001\u0000\u0000\u0000\u013e\u0140\u0003"+
		"\n\u0005\u0000\u013f\u0141\u0003\f\u0006\u0000\u0140\u013f\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0143\u0001\u0000"+
		"\u0000\u0000\u0142\u013e\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0147\u0005\u0017"+
		"\u0000\u0000\u0145\u0147\u0003\u0004\u0002\u0000\u0146\u0142\u0001\u0000"+
		"\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147\u0013\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0005\u0007\u0000\u0000\u0149\u014a\u0005\u0017"+
		"\u0000\u0000\u014a\u0158\u0005\b\u0000\u0000\u014b\u0159\u0005\u0017\u0000"+
		"\u0000\u014c\u014d\u0005\t\u0000\u0000\u014d\u014e\u0005#\u0000\u0000"+
		"\u014e\u0153\u0003\u0004\u0002\u0000\u014f\u0150\u0005%\u0000\u0000\u0150"+
		"\u0152\u0003\u0004\u0002\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152"+
		"\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153"+
		"\u0154\u0001\u0000\u0000\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155"+
		"\u0153\u0001\u0000\u0000\u0000\u0156\u0157\u0005$\u0000\u0000\u0157\u0159"+
		"\u0001\u0000\u0000\u0000\u0158\u014b\u0001\u0000\u0000\u0000\u0158\u014c"+
		"\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015b"+
		"\u0005\u0003\u0000\u0000\u015b\u0015\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0005\n\u0000\u0000\u015d\u015e\u0003\u0004\u0002\u0000\u015e\u015f\u0005"+
		"\u0003\u0000\u0000\u015f\u0017\u0001\u0000\u0000\u0000\u0160\u0161\u0005"+
		"\u000b\u0000\u0000\u0161\u0162\u0003\u0004\u0002\u0000\u0162\u0169\u0005"+
		"\u0003\u0000\u0000\u0163\u0164\u0005\f\u0000\u0000\u0164\u0165\u0003\u0004"+
		"\u0002\u0000\u0165\u0166\u0005\u0003\u0000\u0000\u0166\u0168\u0001\u0000"+
		"\u0000\u0000\u0167\u0163\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000"+
		"\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000"+
		"\u0000\u0000\u016a\u016e\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0005\r\u0000\u0000\u016d\u016f\u0005\u0003\u0000"+
		"\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000"+
		"\u0000\u016f\u0019\u0001\u0000\u0000\u0000\u0170\u0172\u0003\n\u0005\u0000"+
		"\u0171\u0170\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000"+
		"\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0005\u0017\u0000\u0000"+
		"\u0174\u0175\u0005\u0001\u0000\u0000\u0175\u0176\u0005\u000e\u0000\u0000"+
		"\u0176\u0177\u0005#\u0000\u0000\u0177\u0178\u0005&\u0000\u0000\u0178\u0179"+
		"\u0005$\u0000\u0000\u0179\u001b\u0001\u0000\u0000\u0000\u017a\u017b\u0005"+
		"\u000f\u0000\u0000\u017b\u017e\u0005#\u0000\u0000\u017c\u017f\u0003\u0004"+
		"\u0002\u0000\u017d\u017f\u0005&\u0000\u0000\u017e\u017c\u0001\u0000\u0000"+
		"\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017f\u0187\u0001\u0000\u0000"+
		"\u0000\u0180\u0183\u0005%\u0000\u0000\u0181\u0184\u0003\u0004\u0002\u0000"+
		"\u0182\u0184\u0005&\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183"+
		"\u0182\u0001\u0000\u0000\u0000\u0184\u0186\u0001\u0000\u0000\u0000\u0185"+
		"\u0180\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187"+
		"\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188"+
		"\u018a\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0005$\u0000\u0000\u018b\u001d\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0005\u0010\u0000\u0000\u018d\u0192\u0003\u0004\u0002\u0000\u018e\u018f"+
		"\u0005%\u0000\u0000\u018f\u0191\u0003\u0004\u0002\u0000\u0190\u018e\u0001"+
		"\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000\u0000\u0192\u0190\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u001f\u0001"+
		"\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000<#26BEUW^agjnux"+
		"~\u0081\u0085\u008e\u0094\u0096\u009c\u009e\u00a3\u00a6\u00b0\u00b2\u00b8"+
		"\u00ba\u00bf\u00c2\u00cd\u00cf\u00d5\u00d7\u00dc\u00df\u00eb\u00ed\u00f3"+
		"\u00f5\u00fa\u00fd\u0102\u010f\u0113\u012e\u0137\u013a\u0140\u0142\u0146"+
		"\u0153\u0158\u0169\u016e\u0171\u017e\u0183\u0187\u0192";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}