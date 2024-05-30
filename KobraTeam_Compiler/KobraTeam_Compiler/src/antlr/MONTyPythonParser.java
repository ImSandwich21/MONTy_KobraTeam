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
		RULE_program = 0, RULE_command = 1, RULE_expression = 2, RULE_number = 3, 
		RULE_intExpression = 4, RULE_floatExpression = 5, RULE_declaration = 6, 
		RULE_assignment = 7, RULE_varType = 8, RULE_list = 9, RULE_listFunction = 10, 
		RULE_functionCall = 11, RULE_forLoop = 12, RULE_whileLoop = 13, RULE_ifStatement = 14, 
		RULE_inputStatement = 15, RULE_printStatement = 16, RULE_returnStatement = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "expression", "number", "intExpression", "floatExpression", 
			"declaration", "assignment", "varType", "list", "listFunction", "functionCall", 
			"forLoop", "whileLoop", "ifStatement", "inputStatement", "printStatement", 
			"returnStatement"
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14781684L) != 0)) {
				{
				{
				setState(36);
				command();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				listFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				forLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				whileLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(50);
				inputStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(51);
				printStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(52);
				ifStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(53);
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
	public static class FlutuanteContext extends ExpressionContext {
		public FloatExpressionContext floatExpression() {
			return getRuleContext(FloatExpressionContext.class,0);
		}
		public FlutuanteContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterFlutuante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitFlutuante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitFlutuante(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode ID() { return getToken(MONTyPythonParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(MONTyPythonParser.LBRACK, 0); }
		public TerminalNode INT() { return getToken(MONTyPythonParser.INT, 0); }
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
	public static class PowContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
	public static class InteiroContext extends ExpressionContext {
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public InteiroContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitInteiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitInteiro(this);
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
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new GroupExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(57);
					match(NOT);
					}
				}

				setState(60);
				match(LPAREN);
				setState(61);
				expression(0);
				setState(62);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ListIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(ID);
				setState(65);
				match(LBRACK);
				setState(66);
				match(INT);
				setState(67);
				match(RBRACK);
				}
				break;
			case 3:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new FlutuanteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				floatExpression();
				}
				break;
			case 5:
				{
				_localctx = new InteiroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				intExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(88);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(73);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(74);
						match(POW);
						setState(75);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new MultDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(76);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(77);
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
						setState(78);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new UnaryOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(79);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(80);
						((UnaryOpContext)_localctx).op = match(UNARY);
						setState(81);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new RelationalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(82);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						{
						setState(83);
						match(RELATIONAL_OP);
						}
						setState(84);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new LogicalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(85);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(86);
						((LogicalContext)_localctx).op = match(LOGIC);
						setState(87);
						expression(6);
						}
						break;
					}
					} 
				}
				setState(92);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public FloatExpressionContext floatExpression() {
			return getRuleContext(FloatExpressionContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
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

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(93);
				intExpression();
				}
				break;
			case 2:
				{
				setState(94);
				floatExpression();
				}
				break;
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
	public static class IntExpressionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MONTyPythonParser.INT, 0); }
		public TerminalNode UNARY() { return getToken(MONTyPythonParser.UNARY, 0); }
		public IntExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterIntExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitIntExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitIntExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntExpressionContext intExpression() throws RecognitionException {
		IntExpressionContext _localctx = new IntExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNARY) {
				{
				setState(97);
				match(UNARY);
				}
			}

			setState(100);
			match(INT);
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
	public static class FloatExpressionContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(MONTyPythonParser.FLOAT, 0); }
		public TerminalNode UNARY() { return getToken(MONTyPythonParser.UNARY, 0); }
		public FloatExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).enterFloatExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONTyPythonListener ) ((MONTyPythonListener)listener).exitFloatExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MONTyPythonVisitor ) return ((MONTyPythonVisitor<? extends T>)visitor).visitFloatExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatExpressionContext floatExpression() throws RecognitionException {
		FloatExpressionContext _localctx = new FloatExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_floatExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			match(FLOAT);
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
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MONTyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MONTyPythonParser.COMMA, i);
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MONTyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MONTyPythonParser.COMMA, i);
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
		enterRule(_localctx, 12, RULE_declaration);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new FloatDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(FLOAT_TYPE);
				setState(108);
				match(ID);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(109);
					match(T__0);
					setState(110);
					number();
					}
				}

				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(113);
					match(COMMA);
					setState(114);
					match(ID);
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(115);
						match(T__0);
						setState(116);
						number();
						}
					}

					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new IntDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(INT_TYPE);
				setState(125);
				match(ID);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(126);
					match(T__0);
					setState(127);
					intExpression();
					}
				}

				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(130);
					match(COMMA);
					setState(131);
					match(ID);
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(132);
						match(T__0);
						setState(133);
						intExpression();
						}
					}

					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new ListDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				varType();
				setState(142);
				list();
				setState(143);
				match(ID);
				}
				break;
			case 4:
				_localctx = new FloatFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(T__1);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FLOAT_TYPE) {
					{
					setState(146);
					match(FLOAT_TYPE);
					}
				}

				setState(149);
				match(ID);
				setState(150);
				match(LPAREN);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) {
					{
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INT_TYPE || _la==FLOAT_TYPE) {
						{
						setState(151);
						varType();
						setState(153);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LBRACK) {
							{
							setState(152);
							list();
							}
						}

						}
					}

					setState(157);
					match(ID);
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(158);
						match(COMMA);
						setState(163);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INT_TYPE || _la==FLOAT_TYPE) {
							{
							setState(159);
							varType();
							setState(161);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LBRACK) {
								{
								setState(160);
								list();
								}
							}

							}
						}

						setState(165);
						match(ID);
						}
						}
						setState(170);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(173);
				match(RPAREN);
				setState(174);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new IntFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				match(T__1);
				setState(176);
				match(INT_TYPE);
				setState(177);
				match(ID);
				setState(178);
				match(LPAREN);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) {
					{
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INT_TYPE || _la==FLOAT_TYPE) {
						{
						setState(179);
						varType();
						setState(181);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LBRACK) {
							{
							setState(180);
							list();
							}
						}

						}
					}

					setState(185);
					match(ID);
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(186);
						match(COMMA);
						setState(191);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INT_TYPE || _la==FLOAT_TYPE) {
							{
							setState(187);
							varType();
							setState(189);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LBRACK) {
								{
								setState(188);
								list();
								}
							}

							}
						}

						setState(193);
						match(ID);
						}
						}
						setState(198);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(201);
				match(RPAREN);
				setState(202);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new IntListFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				match(T__1);
				setState(204);
				match(INT_TYPE);
				setState(205);
				list();
				setState(206);
				match(ID);
				setState(207);
				match(LPAREN);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) {
					{
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INT_TYPE || _la==FLOAT_TYPE) {
						{
						setState(208);
						varType();
						setState(210);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LBRACK) {
							{
							setState(209);
							list();
							}
						}

						}
					}

					setState(214);
					match(ID);
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(215);
						match(COMMA);
						setState(220);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INT_TYPE || _la==FLOAT_TYPE) {
							{
							setState(216);
							varType();
							setState(218);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LBRACK) {
								{
								setState(217);
								list();
								}
							}

							}
						}

						setState(222);
						match(ID);
						}
						}
						setState(227);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(230);
				match(RPAREN);
				setState(231);
				match(T__2);
				}
				break;
			case 7:
				_localctx = new FloatListFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(233);
				match(T__1);
				setState(234);
				match(FLOAT_TYPE);
				setState(235);
				list();
				setState(236);
				match(ID);
				setState(237);
				match(LPAREN);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) {
					{
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INT_TYPE || _la==FLOAT_TYPE) {
						{
						setState(238);
						varType();
						setState(240);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LBRACK) {
							{
							setState(239);
							list();
							}
						}

						}
					}

					setState(244);
					match(ID);
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(245);
						match(COMMA);
						setState(250);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INT_TYPE || _la==FLOAT_TYPE) {
							{
							setState(246);
							varType();
							setState(248);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LBRACK) {
								{
								setState(247);
								list();
								}
							}

							}
						}

						setState(252);
						match(ID);
						}
						}
						setState(257);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(260);
				match(RPAREN);
				setState(261);
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
		enterRule(_localctx, 14, RULE_assignment);
		int _la;
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new VariableAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(ID);
				setState(266);
				match(T__0);
				setState(267);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ListAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(ID);
				setState(269);
				match(T__0);
				setState(270);
				match(LBRACK);
				setState(271);
				match(INT);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(272);
					match(COMMA);
					setState(273);
					match(INT);
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(279);
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
		enterRule(_localctx, 16, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
		enterRule(_localctx, 18, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(LBRACK);
			setState(285);
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
		public TerminalNode ID() { return getToken(MONTyPythonParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MONTyPythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MONTyPythonParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		public TerminalNode INT() { return getToken(MONTyPythonParser.INT, 0); }
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
		enterRule(_localctx, 20, RULE_listFunction);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new ListSizeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(T__3);
				setState(288);
				match(LPAREN);
				setState(289);
				match(ID);
				setState(290);
				match(RPAREN);
				}
				break;
			case T__4:
				_localctx = new ListAddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(T__4);
				setState(292);
				match(LPAREN);
				setState(293);
				match(ID);
				setState(294);
				match(COMMA);
				setState(295);
				expression(0);
				setState(296);
				match(COMMA);
				setState(297);
				expression(0);
				setState(298);
				match(RPAREN);
				}
				break;
			case T__5:
				_localctx = new ListRemoveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(T__5);
				setState(301);
				match(LPAREN);
				setState(302);
				match(ID);
				setState(303);
				match(COMMA);
				setState(304);
				match(INT);
				setState(305);
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
		enterRule(_localctx, 22, RULE_functionCall);
		int _la;
		try {
			_localctx = new FuncCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(ID);
			setState(309);
			match(LPAREN);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34419113984L) != 0)) {
				{
				setState(310);
				expression(0);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(311);
					match(COMMA);
					setState(312);
					expression(0);
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(320);
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
		public List<TerminalNode> INT() { return getTokens(MONTyPythonParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MONTyPythonParser.INT, i);
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
		enterRule(_localctx, 24, RULE_forLoop);
		int _la;
		try {
			_localctx = new ForInstructionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__6);
			setState(323);
			match(ID);
			setState(324);
			match(T__7);
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(325);
				match(ID);
				}
				break;
			case T__8:
				{
				setState(326);
				match(T__8);
				setState(327);
				match(LPAREN);
				setState(328);
				match(INT);
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(329);
					match(COMMA);
					setState(330);
					match(INT);
					}
					break;
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(333);
					match(COMMA);
					setState(334);
					match(INT);
					}
				}

				setState(337);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(340);
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
		enterRule(_localctx, 26, RULE_whileLoop);
		try {
			_localctx = new WhileInstrunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(T__9);
			setState(343);
			expression(0);
			setState(344);
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
		enterRule(_localctx, 28, RULE_ifStatement);
		int _la;
		try {
			_localctx = new IfInstructionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(T__10);
			setState(347);
			expression(0);
			setState(348);
			match(T__2);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(349);
				match(T__11);
				setState(350);
				expression(0);
				setState(351);
				match(T__2);
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(358);
				match(T__12);
				setState(359);
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
		enterRule(_localctx, 30, RULE_inputStatement);
		int _la;
		try {
			_localctx = new InputFunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_TYPE || _la==FLOAT_TYPE) {
				{
				setState(362);
				varType();
				}
			}

			setState(365);
			match(ID);
			setState(366);
			match(T__0);
			setState(367);
			match(T__13);
			setState(368);
			match(LPAREN);
			setState(369);
			match(STRING);
			setState(370);
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
		enterRule(_localctx, 32, RULE_printStatement);
		int _la;
		try {
			_localctx = new PrintFunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(T__14);
			setState(373);
			match(LPAREN);
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNARY:
			case NOT:
			case ID:
			case INT:
			case FLOAT:
			case LPAREN:
				{
				setState(374);
				expression(0);
				}
				break;
			case STRING:
				{
				setState(375);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(378);
				match(COMMA);
				setState(381);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNARY:
				case NOT:
				case ID:
				case INT:
				case FLOAT:
				case LPAREN:
					{
					setState(379);
					expression(0);
					}
					break;
				case STRING:
					{
					setState(380);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388);
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
		enterRule(_localctx, 34, RULE_returnStatement);
		int _la;
		try {
			_localctx = new ReturnFuncionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(T__15);
			{
			setState(391);
			expression(0);
			}
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(392);
				match(COMMA);
				{
				setState(393);
				expression(0);
				}
				}
				}
				setState(398);
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
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0190\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0005\u0000"+
		"&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002H\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002Y\b\u0002\n\u0002\f\u0002\\\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003`\b\u0003\u0001\u0004\u0003\u0004c\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0003\u0005h\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006p\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006v\b"+
		"\u0006\u0005\u0006x\b\u0006\n\u0006\f\u0006{\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0081\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0087\b\u0006\u0005\u0006\u0089"+
		"\b\u0006\n\u0006\f\u0006\u008c\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0094\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009a\b\u0006\u0003\u0006"+
		"\u009c\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00a2\b\u0006\u0003\u0006\u00a4\b\u0006\u0001\u0006\u0005\u0006\u00a7"+
		"\b\u0006\n\u0006\f\u0006\u00aa\t\u0006\u0003\u0006\u00ac\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00b6\b\u0006\u0003\u0006\u00b8\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00be\b\u0006"+
		"\u0003\u0006\u00c0\b\u0006\u0001\u0006\u0005\u0006\u00c3\b\u0006\n\u0006"+
		"\f\u0006\u00c6\t\u0006\u0003\u0006\u00c8\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00d3\b\u0006\u0003\u0006\u00d5\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00db\b\u0006\u0003"+
		"\u0006\u00dd\b\u0006\u0001\u0006\u0005\u0006\u00e0\b\u0006\n\u0006\f\u0006"+
		"\u00e3\t\u0006\u0003\u0006\u00e5\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00f1\b\u0006\u0003\u0006\u00f3\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00f9\b\u0006"+
		"\u0003\u0006\u00fb\b\u0006\u0001\u0006\u0005\u0006\u00fe\b\u0006\n\u0006"+
		"\f\u0006\u0101\t\u0006\u0003\u0006\u0103\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0108\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0113\b\u0007\n\u0007\f\u0007\u0116\t\u0007\u0001\u0007\u0003"+
		"\u0007\u0119\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0133\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u013a\b\u000b\n\u000b\f\u000b\u013d\t\u000b\u0003\u000b\u013f"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u014c\b\f\u0001\f\u0001\f\u0003"+
		"\f\u0150\b\f\u0001\f\u0003\f\u0153\b\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0162\b\u000e\n\u000e\f\u000e"+
		"\u0165\t\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0169\b\u000e\u0001"+
		"\u000f\u0003\u000f\u016c\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0179\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u017e\b\u0010\u0005\u0010\u0180\b\u0010\n\u0010\f\u0010"+
		"\u0183\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u018b\b\u0011\n\u0011\f\u0011\u018e\t\u0011\u0001"+
		"\u0011\u0000\u0001\u0004\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0002\u0002\u0000"+
		"\u001a\u001b\u001e\u001f\u0001\u0000\u0015\u0016\u01c9\u0000\'\u0001\u0000"+
		"\u0000\u0000\u00026\u0001\u0000\u0000\u0000\u0004G\u0001\u0000\u0000\u0000"+
		"\u0006_\u0001\u0000\u0000\u0000\bb\u0001\u0000\u0000\u0000\ng\u0001\u0000"+
		"\u0000\u0000\f\u0107\u0001\u0000\u0000\u0000\u000e\u0118\u0001\u0000\u0000"+
		"\u0000\u0010\u011a\u0001\u0000\u0000\u0000\u0012\u011c\u0001\u0000\u0000"+
		"\u0000\u0014\u0132\u0001\u0000\u0000\u0000\u0016\u0134\u0001\u0000\u0000"+
		"\u0000\u0018\u0142\u0001\u0000\u0000\u0000\u001a\u0156\u0001\u0000\u0000"+
		"\u0000\u001c\u015a\u0001\u0000\u0000\u0000\u001e\u016b\u0001\u0000\u0000"+
		"\u0000 \u0174\u0001\u0000\u0000\u0000\"\u0186\u0001\u0000\u0000\u0000"+
		"$&\u0003\u0002\u0001\u0000%$\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000"+
		"\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(*\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0005\u0000\u0000\u0001+\u0001"+
		"\u0001\u0000\u0000\u0000,7\u0003\f\u0006\u0000-7\u0003\u000e\u0007\u0000"+
		".7\u0003\u0016\u000b\u0000/7\u0003\u0014\n\u000007\u0003\u0018\f\u0000"+
		"17\u0003\u001a\r\u000027\u0003\u001e\u000f\u000037\u0003 \u0010\u0000"+
		"47\u0003\u001c\u000e\u000057\u0003\"\u0011\u00006,\u0001\u0000\u0000\u0000"+
		"6-\u0001\u0000\u0000\u00006.\u0001\u0000\u0000\u00006/\u0001\u0000\u0000"+
		"\u000060\u0001\u0000\u0000\u000061\u0001\u0000\u0000\u000062\u0001\u0000"+
		"\u0000\u000063\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000065\u0001"+
		"\u0000\u0000\u00007\u0003\u0001\u0000\u0000\u00008:\u0006\u0002\uffff"+
		"\uffff\u00009;\u0005\u0013\u0000\u0000:9\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0005#\u0000\u0000=>\u0003"+
		"\u0004\u0002\u0000>?\u0005$\u0000\u0000?H\u0001\u0000\u0000\u0000@A\u0005"+
		"\u0017\u0000\u0000AB\u0005!\u0000\u0000BC\u0005\u0018\u0000\u0000CH\u0005"+
		"\"\u0000\u0000DH\u0005\u0017\u0000\u0000EH\u0003\n\u0005\u0000FH\u0003"+
		"\b\u0004\u0000G8\u0001\u0000\u0000\u0000G@\u0001\u0000\u0000\u0000GD\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000"+
		"HZ\u0001\u0000\u0000\u0000IJ\n\t\u0000\u0000JK\u0005 \u0000\u0000KY\u0003"+
		"\u0004\u0002\nLM\n\b\u0000\u0000MN\u0007\u0000\u0000\u0000NY\u0003\u0004"+
		"\u0002\tOP\n\u0007\u0000\u0000PQ\u0005\u0011\u0000\u0000QY\u0003\u0004"+
		"\u0002\bRS\n\u0006\u0000\u0000ST\u0005*\u0000\u0000TY\u0003\u0004\u0002"+
		"\u0007UV\n\u0005\u0000\u0000VW\u0005\u0012\u0000\u0000WY\u0003\u0004\u0002"+
		"\u0006XI\u0001\u0000\u0000\u0000XL\u0001\u0000\u0000\u0000XO\u0001\u0000"+
		"\u0000\u0000XR\u0001\u0000\u0000\u0000XU\u0001\u0000\u0000\u0000Y\\\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[\u0005\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]`\u0003\b\u0004"+
		"\u0000^`\u0003\n\u0005\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000"+
		"\u0000`\u0007\u0001\u0000\u0000\u0000ac\u0005\u0011\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"de\u0005\u0018\u0000\u0000e\t\u0001\u0000\u0000\u0000fh\u0005\u0011\u0000"+
		"\u0000gf\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ij\u0005\u0019\u0000\u0000j\u000b\u0001\u0000\u0000\u0000"+
		"kl\u0005\u0016\u0000\u0000lo\u0005\u0017\u0000\u0000mn\u0005\u0001\u0000"+
		"\u0000np\u0003\u0006\u0003\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000py\u0001\u0000\u0000\u0000qr\u0005%\u0000\u0000ru\u0005\u0017"+
		"\u0000\u0000st\u0005\u0001\u0000\u0000tv\u0003\u0006\u0003\u0000us\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000"+
		"wq\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z\u0108\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000|}\u0005\u0015\u0000\u0000}\u0080\u0005\u0017\u0000"+
		"\u0000~\u007f\u0005\u0001\u0000\u0000\u007f\u0081\u0003\b\u0004\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u008a\u0001\u0000\u0000\u0000\u0082\u0083\u0005%\u0000\u0000\u0083\u0086"+
		"\u0005\u0017\u0000\u0000\u0084\u0085\u0005\u0001\u0000\u0000\u0085\u0087"+
		"\u0003\b\u0004\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0082\u0001"+
		"\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0108\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0003"+
		"\u0010\b\u0000\u008e\u008f\u0003\u0012\t\u0000\u008f\u0090\u0005\u0017"+
		"\u0000\u0000\u0090\u0108\u0001\u0000\u0000\u0000\u0091\u0093\u0005\u0002"+
		"\u0000\u0000\u0092\u0094\u0005\u0016\u0000\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005\u0017\u0000\u0000\u0096\u00ab\u0005#\u0000"+
		"\u0000\u0097\u0099\u0003\u0010\b\u0000\u0098\u009a\u0003\u0012\t\u0000"+
		"\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0097\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u00a8\u0005\u0017\u0000\u0000\u009e\u00a3\u0005%\u0000\u0000\u009f"+
		"\u00a1\u0003\u0010\b\u0000\u00a0\u00a2\u0003\u0012\t\u0000\u00a1\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7"+
		"\u0005\u0017\u0000\u0000\u00a6\u009e\u0001\u0000\u0000\u0000\u00a7\u00aa"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ab\u009b\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0005$\u0000\u0000\u00ae\u0108\u0005\u0003\u0000\u0000\u00af\u00b0\u0005"+
		"\u0002\u0000\u0000\u00b0\u00b1\u0005\u0015\u0000\u0000\u00b1\u00b2\u0005"+
		"\u0017\u0000\u0000\u00b2\u00c7\u0005#\u0000\u0000\u00b3\u00b5\u0003\u0010"+
		"\b\u0000\u00b4\u00b6\u0003\u0012\t\u0000\u00b5\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b3\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00c4\u0005\u0017\u0000"+
		"\u0000\u00ba\u00bf\u0005%\u0000\u0000\u00bb\u00bd\u0003\u0010\b\u0000"+
		"\u00bc\u00be\u0003\u0012\t\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0001\u0000\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0005\u0017\u0000\u0000\u00c2"+
		"\u00ba\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7"+
		"\u00b7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005$\u0000\u0000\u00ca\u0108"+
		"\u0005\u0003\u0000\u0000\u00cb\u00cc\u0005\u0002\u0000\u0000\u00cc\u00cd"+
		"\u0005\u0015\u0000\u0000\u00cd\u00ce\u0003\u0012\t\u0000\u00ce\u00cf\u0005"+
		"\u0017\u0000\u0000\u00cf\u00e4\u0005#\u0000\u0000\u00d0\u00d2\u0003\u0010"+
		"\b\u0000\u00d1\u00d3\u0003\u0012\t\u0000\u00d2\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d0\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00e1\u0005\u0017\u0000"+
		"\u0000\u00d7\u00dc\u0005%\u0000\u0000\u00d8\u00da\u0003\u0010\b\u0000"+
		"\u00d9\u00db\u0003\u0012\t\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc"+
		"\u00d8\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00de\u00e0\u0005\u0017\u0000\u0000\u00df"+
		"\u00d7\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1"+
		"\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4"+
		"\u00d4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005$\u0000\u0000\u00e7\u00e8"+
		"\u0005\u0003\u0000\u0000\u00e8\u0108\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0005\u0002\u0000\u0000\u00ea\u00eb\u0005\u0016\u0000\u0000\u00eb\u00ec"+
		"\u0003\u0012\t\u0000\u00ec\u00ed\u0005\u0017\u0000\u0000\u00ed\u0102\u0005"+
		"#\u0000\u0000\u00ee\u00f0\u0003\u0010\b\u0000\u00ef\u00f1\u0003\u0012"+
		"\t\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00ff\u0005\u0017\u0000\u0000\u00f5\u00fa\u0005%\u0000\u0000"+
		"\u00f6\u00f8\u0003\u0010\b\u0000\u00f7\u00f9\u0003\u0012\t\u0000\u00f8"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f6\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fe\u0005\u0017\u0000\u0000\u00fd\u00f5\u0001\u0000\u0000\u0000\u00fe"+
		"\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101"+
		"\u00ff\u0001\u0000\u0000\u0000\u0102\u00f2\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0005$\u0000\u0000\u0105\u0106\u0005\u0003\u0000\u0000\u0106\u0108"+
		"\u0001\u0000\u0000\u0000\u0107k\u0001\u0000\u0000\u0000\u0107|\u0001\u0000"+
		"\u0000\u0000\u0107\u008d\u0001\u0000\u0000\u0000\u0107\u0091\u0001\u0000"+
		"\u0000\u0000\u0107\u00af\u0001\u0000\u0000\u0000\u0107\u00cb\u0001\u0000"+
		"\u0000\u0000\u0107\u00e9\u0001\u0000\u0000\u0000\u0108\r\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0005\u0017\u0000\u0000\u010a\u010b\u0005\u0001\u0000"+
		"\u0000\u010b\u0119\u0003\u0004\u0002\u0000\u010c\u010d\u0005\u0017\u0000"+
		"\u0000\u010d\u010e\u0005\u0001\u0000\u0000\u010e\u010f\u0005!\u0000\u0000"+
		"\u010f\u0114\u0005\u0018\u0000\u0000\u0110\u0111\u0005%\u0000\u0000\u0111"+
		"\u0113\u0005\u0018\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113"+
		"\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0001\u0000\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116"+
		"\u0114\u0001\u0000\u0000\u0000\u0117\u0119\u0005\"\u0000\u0000\u0118\u0109"+
		"\u0001\u0000\u0000\u0000\u0118\u010c\u0001\u0000\u0000\u0000\u0119\u000f"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0007\u0001\u0000\u0000\u011b\u0011"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0005!\u0000\u0000\u011d\u011e\u0005"+
		"\"\u0000\u0000\u011e\u0013\u0001\u0000\u0000\u0000\u011f\u0120\u0005\u0004"+
		"\u0000\u0000\u0120\u0121\u0005#\u0000\u0000\u0121\u0122\u0005\u0017\u0000"+
		"\u0000\u0122\u0133\u0005$\u0000\u0000\u0123\u0124\u0005\u0005\u0000\u0000"+
		"\u0124\u0125\u0005#\u0000\u0000\u0125\u0126\u0005\u0017\u0000\u0000\u0126"+
		"\u0127\u0005%\u0000\u0000\u0127\u0128\u0003\u0004\u0002\u0000\u0128\u0129"+
		"\u0005%\u0000\u0000\u0129\u012a\u0003\u0004\u0002\u0000\u012a\u012b\u0005"+
		"$\u0000\u0000\u012b\u0133\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u0006"+
		"\u0000\u0000\u012d\u012e\u0005#\u0000\u0000\u012e\u012f\u0005\u0017\u0000"+
		"\u0000\u012f\u0130\u0005%\u0000\u0000\u0130\u0131\u0005\u0018\u0000\u0000"+
		"\u0131\u0133\u0005$\u0000\u0000\u0132\u011f\u0001\u0000\u0000\u0000\u0132"+
		"\u0123\u0001\u0000\u0000\u0000\u0132\u012c\u0001\u0000\u0000\u0000\u0133"+
		"\u0015\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u0017\u0000\u0000\u0135"+
		"\u013e\u0005#\u0000\u0000\u0136\u013b\u0003\u0004\u0002\u0000\u0137\u0138"+
		"\u0005%\u0000\u0000\u0138\u013a\u0003\u0004\u0002\u0000\u0139\u0137\u0001"+
		"\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013f\u0001"+
		"\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u0136\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140\u0141\u0005$\u0000\u0000\u0141\u0017\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0005\u0007\u0000\u0000\u0143\u0144\u0005\u0017"+
		"\u0000\u0000\u0144\u0152\u0005\b\u0000\u0000\u0145\u0153\u0005\u0017\u0000"+
		"\u0000\u0146\u0147\u0005\t\u0000\u0000\u0147\u0148\u0005#\u0000\u0000"+
		"\u0148\u014b\u0005\u0018\u0000\u0000\u0149\u014a\u0005%\u0000\u0000\u014a"+
		"\u014c\u0005\u0018\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0005%\u0000\u0000\u014e\u0150\u0005\u0018\u0000\u0000\u014f\u014d"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0001\u0000\u0000\u0000\u0151\u0153\u0005$\u0000\u0000\u0152\u0145\u0001"+
		"\u0000\u0000\u0000\u0152\u0146\u0001\u0000\u0000\u0000\u0153\u0154\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u0005\u0003\u0000\u0000\u0155\u0019\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0005\n\u0000\u0000\u0157\u0158\u0003\u0004"+
		"\u0002\u0000\u0158\u0159\u0005\u0003\u0000\u0000\u0159\u001b\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0005\u000b\u0000\u0000\u015b\u015c\u0003\u0004"+
		"\u0002\u0000\u015c\u0163\u0005\u0003\u0000\u0000\u015d\u015e\u0005\f\u0000"+
		"\u0000\u015e\u015f\u0003\u0004\u0002\u0000\u015f\u0160\u0005\u0003\u0000"+
		"\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u015d\u0001\u0000\u0000"+
		"\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000"+
		"\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0168\u0001\u0000\u0000"+
		"\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u0167\u0005\r\u0000\u0000"+
		"\u0167\u0169\u0005\u0003\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000"+
		"\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u001d\u0001\u0000\u0000\u0000"+
		"\u016a\u016c\u0003\u0010\b\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d"+
		"\u016e\u0005\u0017\u0000\u0000\u016e\u016f\u0005\u0001\u0000\u0000\u016f"+
		"\u0170\u0005\u000e\u0000\u0000\u0170\u0171\u0005#\u0000\u0000\u0171\u0172"+
		"\u0005&\u0000\u0000\u0172\u0173\u0005$\u0000\u0000\u0173\u001f\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0005\u000f\u0000\u0000\u0175\u0178\u0005#\u0000"+
		"\u0000\u0176\u0179\u0003\u0004\u0002\u0000\u0177\u0179\u0005&\u0000\u0000"+
		"\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0177\u0001\u0000\u0000\u0000"+
		"\u0179\u0181\u0001\u0000\u0000\u0000\u017a\u017d\u0005%\u0000\u0000\u017b"+
		"\u017e\u0003\u0004\u0002\u0000\u017c\u017e\u0005&\u0000\u0000\u017d\u017b"+
		"\u0001\u0000\u0000\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e\u0180"+
		"\u0001\u0000\u0000\u0000\u017f\u017a\u0001\u0000\u0000\u0000\u0180\u0183"+
		"\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0001\u0000\u0000\u0000\u0182\u0184\u0001\u0000\u0000\u0000\u0183\u0181"+
		"\u0001\u0000\u0000\u0000\u0184\u0185\u0005$\u0000\u0000\u0185!\u0001\u0000"+
		"\u0000\u0000\u0186\u0187\u0005\u0010\u0000\u0000\u0187\u018c\u0003\u0004"+
		"\u0002\u0000\u0188\u0189\u0005%\u0000\u0000\u0189\u018b\u0003\u0004\u0002"+
		"\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000"+
		"\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000"+
		"\u0000\u018d#\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000"+
		"8\'6:GXZ_bgouy\u0080\u0086\u008a\u0093\u0099\u009b\u00a1\u00a3\u00a8\u00ab"+
		"\u00b5\u00b7\u00bd\u00bf\u00c4\u00c7\u00d2\u00d4\u00da\u00dc\u00e1\u00e4"+
		"\u00f0\u00f2\u00f8\u00fa\u00ff\u0102\u0107\u0114\u0118\u0132\u013b\u013e"+
		"\u014b\u014f\u0152\u0163\u0168\u016b\u0178\u017d\u0181\u018c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}