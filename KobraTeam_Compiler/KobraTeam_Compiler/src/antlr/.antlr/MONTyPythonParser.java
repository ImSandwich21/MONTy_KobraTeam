// Generated from c:/Users/Daniel/Desktop/MONTY_Python/MONTy_KobraTeam/KobraTeam_Compiler/KobraTeam_Compiler/src/antlr/MONTyPython.g4 by ANTLR 4.13.1
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
		RULE_functionCall = 8, RULE_forLoop = 9, RULE_whileLoop = 10, RULE_ifStatement = 11, 
		RULE_inputStatement = 12, RULE_printStatement = 13, RULE_returnStatement = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "expression", "declaration", "assignment", "varType", 
			"list", "listFunction", "functionCall", "forLoop", "whileLoop", "ifStatement", 
			"inputStatement", "printStatement", "returnStatement"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14781684L) != 0)) {
				{
				{
				setState(30);
				command();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				listFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				forLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				whileLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				inputStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(45);
				printStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(46);
				ifStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(47);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ExpressionContext {
		public TerminalNode FLOAT() { return getToken(MONTyPythonParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(MONTyPythonParser.INT, 0); }
		public TerminalNode UNARY() { return getToken(MONTyPythonParser.UNARY, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode POW() { return getToken(MONTyPythonParser.POW, 0); }
		public PowContext(ExpressionContext ctx) { copyFrom(ctx); }
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
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new GroupExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(51);
					match(NOT);
					}
				}

				setState(54);
				match(LPAREN);
				setState(55);
				expression(0);
				setState(56);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ListIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(ID);
				setState(59);
				match(LBRACK);
				setState(60);
				match(ID);
				setState(61);
				match(RBRACK);
				}
				break;
			case 3:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNARY) {
					{
					setState(63);
					match(UNARY);
					}
				}

				setState(66);
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
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(83);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(69);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(70);
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
						setState(71);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new UnaryOpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(72);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(73);
						((UnaryOpContext)_localctx).op = match(UNARY);
						setState(74);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new RelationalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(75);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(76);
						match(RELATIONAL_OP);
						}
						setState(77);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new LogicalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(78);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(79);
						((LogicalContext)_localctx).op = match(LOGIC);
						setState(80);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new PowContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(81);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						{
						setState(82);
						match(POW);
						}
						}
						break;
					}
					} 
				}
				setState(87);
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
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new FloatDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(FLOAT_TYPE);
				setState(89);
				match(ID);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(90);
					match(T__0);
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNARY) {
						{
						setState(91);
						match(UNARY);
						}
					}

					setState(94);
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

				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(97);
					match(COMMA);
					setState(98);
					match(ID);
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(99);
						match(T__0);
						setState(101);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==UNARY) {
							{
							setState(100);
							match(UNARY);
							}
						}

						setState(103);
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
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new IntDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(INT_TYPE);
				setState(112);
				match(ID);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(113);
					match(T__0);
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNARY) {
						{
						setState(114);
						match(UNARY);
						}
					}

					setState(117);
					match(INT);
					}
				}

				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(120);
					match(COMMA);
					setState(121);
					match(ID);
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(122);
						match(T__0);
						setState(124);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==UNARY) {
							{
							setState(123);
							match(UNARY);
							}
						}

						setState(126);
						match(INT);
						}
					}

					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new ListDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				varType();
				setState(135);
				list();
				setState(136);
				match(ID);
				}
				break;
			case 4:
				_localctx = new FloatFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(T__1);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FLOAT_TYPE) {
					{
					setState(139);
					match(FLOAT_TYPE);
					}
				}

				setState(142);
				match(ID);
				setState(143);
				match(LPAREN);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) {
					{
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INT_TYPE || _la==FLOAT_TYPE) {
						{
						setState(144);
						varType();
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LBRACK) {
							{
							setState(145);
							list();
							}
						}

						}
					}

					setState(150);
					match(ID);
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(151);
						match(COMMA);
						setState(156);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INT_TYPE || _la==FLOAT_TYPE) {
							{
							setState(152);
							varType();
							setState(154);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LBRACK) {
								{
								setState(153);
								list();
								}
							}

							}
						}

						setState(158);
						match(ID);
						}
						}
						setState(163);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(166);
				match(RPAREN);
				setState(167);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new IntFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				match(T__1);
				setState(169);
				match(INT_TYPE);
				setState(170);
				match(ID);
				setState(171);
				match(LPAREN);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) {
					{
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INT_TYPE || _la==FLOAT_TYPE) {
						{
						setState(172);
						varType();
						setState(174);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LBRACK) {
							{
							setState(173);
							list();
							}
						}

						}
					}

					setState(178);
					match(ID);
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(179);
						match(COMMA);
						setState(184);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INT_TYPE || _la==FLOAT_TYPE) {
							{
							setState(180);
							varType();
							setState(182);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LBRACK) {
								{
								setState(181);
								list();
								}
							}

							}
						}

						setState(186);
						match(ID);
						}
						}
						setState(191);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(194);
				match(RPAREN);
				setState(195);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new IntListFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				match(T__1);
				setState(197);
				match(INT_TYPE);
				setState(198);
				list();
				setState(199);
				match(ID);
				setState(200);
				match(LPAREN);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) {
					{
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INT_TYPE || _la==FLOAT_TYPE) {
						{
						setState(201);
						varType();
						setState(203);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LBRACK) {
							{
							setState(202);
							list();
							}
						}

						}
					}

					setState(207);
					match(ID);
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(208);
						match(COMMA);
						setState(213);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INT_TYPE || _la==FLOAT_TYPE) {
							{
							setState(209);
							varType();
							setState(211);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LBRACK) {
								{
								setState(210);
								list();
								}
							}

							}
						}

						setState(215);
						match(ID);
						}
						}
						setState(220);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(223);
				match(RPAREN);
				setState(224);
				match(T__2);
				}
				break;
			case 7:
				_localctx = new FloatListFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(226);
				match(T__1);
				setState(227);
				match(FLOAT_TYPE);
				setState(228);
				list();
				setState(229);
				match(ID);
				setState(230);
				match(LPAREN);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) {
					{
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INT_TYPE || _la==FLOAT_TYPE) {
						{
						setState(231);
						varType();
						setState(233);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LBRACK) {
							{
							setState(232);
							list();
							}
						}

						}
					}

					setState(237);
					match(ID);
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(238);
						match(COMMA);
						setState(243);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INT_TYPE || _la==FLOAT_TYPE) {
							{
							setState(239);
							varType();
							setState(241);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LBRACK) {
								{
								setState(240);
								list();
								}
							}

							}
						}

						setState(245);
						match(ID);
						}
						}
						setState(250);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(253);
				match(RPAREN);
				setState(254);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(MONTyPythonParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new VariableAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(ID);
				setState(259);
				match(T__0);
				setState(260);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ListAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(ID);
				setState(262);
				match(T__0);
				setState(263);
				match(LBRACK);
				setState(264);
				match(INT);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(265);
					match(COMMA);
					setState(266);
					match(INT);
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
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
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(LBRACK);
			setState(278);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListRemoveContext extends ListFunctionContext {
		public TerminalNode LPAREN() { return getToken(MONTyPythonParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(MONTyPythonParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(MONTyPythonParser.COMMA, 0); }
		public TerminalNode INT() { return getToken(MONTyPythonParser.INT, 0); }
		public TerminalNode RPAREN() { return getToken(MONTyPythonParser.RPAREN, 0); }
		public ListRemoveContext(ListFunctionContext ctx) { copyFrom(ctx); }
	}

	public final ListFunctionContext listFunction() throws RecognitionException {
		ListFunctionContext _localctx = new ListFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listFunction);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new ListSizeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(T__3);
				setState(281);
				match(LPAREN);
				setState(282);
				match(ID);
				setState(283);
				match(RPAREN);
				}
				break;
			case T__4:
				_localctx = new ListAddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(T__4);
				setState(285);
				match(LPAREN);
				setState(286);
				match(ID);
				setState(287);
				match(COMMA);
				setState(288);
				expression(0);
				setState(289);
				match(COMMA);
				setState(290);
				expression(0);
				setState(291);
				match(RPAREN);
				}
				break;
			case T__5:
				_localctx = new ListRemoveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(T__5);
				setState(294);
				match(LPAREN);
				setState(295);
				match(ID);
				setState(296);
				match(COMMA);
				setState(297);
				match(INT);
				setState(298);
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
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		int _la;
		try {
			_localctx = new FuncCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(ID);
			setState(302);
			match(LPAREN);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34419113984L) != 0)) {
				{
				setState(303);
				expression(0);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(304);
					match(COMMA);
					setState(305);
					expression(0);
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(313);
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
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forLoop);
		int _la;
		try {
			_localctx = new ForInstructionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__6);
			setState(316);
			match(ID);
			setState(317);
			match(T__7);
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(318);
				match(ID);
				}
				break;
			case T__8:
				{
				setState(319);
				match(T__8);
				setState(320);
				match(LPAREN);
				setState(321);
				match(INT);
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(322);
					match(COMMA);
					setState(323);
					match(INT);
					}
					break;
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(326);
					match(COMMA);
					setState(327);
					match(INT);
					}
				}

				setState(330);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(333);
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
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileLoop);
		try {
			_localctx = new WhileInstrunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(T__9);
			setState(336);
			expression(0);
			setState(337);
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		int _la;
		try {
			_localctx = new IfInstructionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(T__10);
			setState(340);
			expression(0);
			setState(341);
			match(T__2);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(342);
				match(T__11);
				setState(343);
				expression(0);
				setState(344);
				match(T__2);
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(351);
				match(T__12);
				setState(352);
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
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inputStatement);
		int _la;
		try {
			_localctx = new InputFunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_TYPE || _la==FLOAT_TYPE) {
				{
				setState(355);
				varType();
				}
			}

			setState(358);
			match(ID);
			setState(359);
			match(T__0);
			setState(360);
			match(T__13);
			setState(361);
			match(LPAREN);
			setState(362);
			match(STRING);
			setState(363);
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
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printStatement);
		int _la;
		try {
			_localctx = new PrintFunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__14);
			setState(366);
			match(LPAREN);
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNARY:
			case NOT:
			case ID:
			case INT:
			case FLOAT:
			case LPAREN:
				{
				setState(367);
				expression(0);
				}
				break;
			case STRING:
				{
				setState(368);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(371);
				match(COMMA);
				setState(374);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNARY:
				case NOT:
				case ID:
				case INT:
				case FLOAT:
				case LPAREN:
					{
					setState(372);
					expression(0);
					}
					break;
				case STRING:
					{
					setState(373);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381);
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
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStatement);
		int _la;
		try {
			_localctx = new ReturnFuncionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(T__15);
			{
			setState(384);
			expression(0);
			}
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(385);
				match(COMMA);
				{
				setState(386);
				expression(0);
				}
				}
				}
				setState(391);
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
		"\u0004\u0001+\u0189\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u00025\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002A\b\u0002\u0001\u0002\u0003\u0002D\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002T\b\u0002\n\u0002\f\u0002W\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003]\b\u0003\u0001"+
		"\u0003\u0003\u0003`\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003f\b\u0003\u0001\u0003\u0003\u0003i\b\u0003\u0005\u0003"+
		"k\b\u0003\n\u0003\f\u0003n\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003t\b\u0003\u0001\u0003\u0003\u0003w\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003}\b\u0003\u0001"+
		"\u0003\u0003\u0003\u0080\b\u0003\u0005\u0003\u0082\b\u0003\n\u0003\f\u0003"+
		"\u0085\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u008d\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u0093\b\u0003\u0003\u0003\u0095\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u009b\b\u0003\u0003"+
		"\u0003\u009d\b\u0003\u0001\u0003\u0005\u0003\u00a0\b\u0003\n\u0003\f\u0003"+
		"\u00a3\t\u0003\u0003\u0003\u00a5\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00af\b\u0003\u0003\u0003\u00b1\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00b7\b\u0003\u0003\u0003\u00b9\b"+
		"\u0003\u0001\u0003\u0005\u0003\u00bc\b\u0003\n\u0003\f\u0003\u00bf\t\u0003"+
		"\u0003\u0003\u00c1\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00cc\b\u0003\u0003\u0003\u00ce\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00d4\b\u0003\u0003\u0003\u00d6\b\u0003"+
		"\u0001\u0003\u0005\u0003\u00d9\b\u0003\n\u0003\f\u0003\u00dc\t\u0003\u0003"+
		"\u0003\u00de\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00ea\b\u0003\u0003\u0003\u00ec\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00f2\b\u0003\u0003\u0003\u00f4\b"+
		"\u0003\u0001\u0003\u0005\u0003\u00f7\b\u0003\n\u0003\f\u0003\u00fa\t\u0003"+
		"\u0003\u0003\u00fc\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u0101\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u010c\b\u0004"+
		"\n\u0004\f\u0004\u010f\t\u0004\u0001\u0004\u0003\u0004\u0112\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u012c\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0133"+
		"\b\b\n\b\f\b\u0136\t\b\u0003\b\u0138\b\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0145"+
		"\b\t\u0001\t\u0001\t\u0003\t\u0149\b\t\u0001\t\u0003\t\u014c\b\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u015b"+
		"\b\u000b\n\u000b\f\u000b\u015e\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0162\b\u000b\u0001\f\u0003\f\u0165\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0172"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u0177\b\r\u0005\r\u0179\b\r\n\r\f"+
		"\r\u017c\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0184\b\u000e\n\u000e\f\u000e\u0187\t\u000e\u0001\u000e"+
		"\u0000\u0001\u0004\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u0000\u0003\u0001\u0000\u0018\u0019\u0002"+
		"\u0000\u001a\u001b\u001e\u001f\u0001\u0000\u0015\u0016\u01c6\u0000!\u0001"+
		"\u0000\u0000\u0000\u00020\u0001\u0000\u0000\u0000\u0004C\u0001\u0000\u0000"+
		"\u0000\u0006\u0100\u0001\u0000\u0000\u0000\b\u0111\u0001\u0000\u0000\u0000"+
		"\n\u0113\u0001\u0000\u0000\u0000\f\u0115\u0001\u0000\u0000\u0000\u000e"+
		"\u012b\u0001\u0000\u0000\u0000\u0010\u012d\u0001\u0000\u0000\u0000\u0012"+
		"\u013b\u0001\u0000\u0000\u0000\u0014\u014f\u0001\u0000\u0000\u0000\u0016"+
		"\u0153\u0001\u0000\u0000\u0000\u0018\u0164\u0001\u0000\u0000\u0000\u001a"+
		"\u016d\u0001\u0000\u0000\u0000\u001c\u017f\u0001\u0000\u0000\u0000\u001e"+
		" \u0003\u0002\u0001\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001"+
		"\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005\u0000"+
		"\u0000\u0001%\u0001\u0001\u0000\u0000\u0000&1\u0003\u0006\u0003\u0000"+
		"\'1\u0003\b\u0004\u0000(1\u0003\u0010\b\u0000)1\u0003\u000e\u0007\u0000"+
		"*1\u0003\u0012\t\u0000+1\u0003\u0014\n\u0000,1\u0003\u0018\f\u0000-1\u0003"+
		"\u001a\r\u0000.1\u0003\u0016\u000b\u0000/1\u0003\u001c\u000e\u00000&\u0001"+
		"\u0000\u0000\u00000\'\u0001\u0000\u0000\u00000(\u0001\u0000\u0000\u0000"+
		"0)\u0001\u0000\u0000\u00000*\u0001\u0000\u0000\u00000+\u0001\u0000\u0000"+
		"\u00000,\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u00000.\u0001\u0000"+
		"\u0000\u00000/\u0001\u0000\u0000\u00001\u0003\u0001\u0000\u0000\u0000"+
		"24\u0006\u0002\uffff\uffff\u000035\u0005\u0013\u0000\u000043\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0005"+
		"#\u0000\u000078\u0003\u0004\u0002\u000089\u0005$\u0000\u00009D\u0001\u0000"+
		"\u0000\u0000:;\u0005\u0017\u0000\u0000;<\u0005!\u0000\u0000<=\u0005\u0017"+
		"\u0000\u0000=D\u0005\"\u0000\u0000>D\u0005\u0017\u0000\u0000?A\u0005\u0011"+
		"\u0000\u0000@?\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BD\u0007\u0000\u0000\u0000C2\u0001\u0000\u0000\u0000"+
		"C:\u0001\u0000\u0000\u0000C>\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000"+
		"\u0000DU\u0001\u0000\u0000\u0000EF\n\u0007\u0000\u0000FG\u0007\u0001\u0000"+
		"\u0000GT\u0003\u0004\u0002\bHI\n\u0006\u0000\u0000IJ\u0005\u0011\u0000"+
		"\u0000JT\u0003\u0004\u0002\u0007KL\n\u0005\u0000\u0000LM\u0005*\u0000"+
		"\u0000MT\u0003\u0004\u0002\u0006NO\n\u0004\u0000\u0000OP\u0005\u0012\u0000"+
		"\u0000PT\u0003\u0004\u0002\u0005QR\n\b\u0000\u0000RT\u0005 \u0000\u0000"+
		"SE\u0001\u0000\u0000\u0000SH\u0001\u0000\u0000\u0000SK\u0001\u0000\u0000"+
		"\u0000SN\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TW\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0005"+
		"\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005\u0016\u0000"+
		"\u0000Y_\u0005\u0017\u0000\u0000Z\\\u0005\u0001\u0000\u0000[]\u0005\u0011"+
		"\u0000\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^`\u0007\u0000\u0000\u0000_Z\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`l\u0001\u0000\u0000\u0000ab\u0005%\u0000\u0000"+
		"bh\u0005\u0017\u0000\u0000ce\u0005\u0001\u0000\u0000df\u0005\u0011\u0000"+
		"\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gi\u0007\u0000\u0000\u0000hc\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000ja\u0001\u0000\u0000\u0000"+
		"kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000m\u0101\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0005"+
		"\u0015\u0000\u0000pv\u0005\u0017\u0000\u0000qs\u0005\u0001\u0000\u0000"+
		"rt\u0005\u0011\u0000\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uw\u0005\u0018\u0000\u0000vq\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0083\u0001\u0000\u0000\u0000"+
		"xy\u0005%\u0000\u0000y\u007f\u0005\u0017\u0000\u0000z|\u0005\u0001\u0000"+
		"\u0000{}\u0005\u0011\u0000\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0005\u0018\u0000\u0000"+
		"\u007fz\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0082\u0001\u0000\u0000\u0000\u0081x\u0001\u0000\u0000\u0000\u0082\u0085"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0101\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0003\n\u0005\u0000\u0087\u0088\u0003"+
		"\f\u0006\u0000\u0088\u0089\u0005\u0017\u0000\u0000\u0089\u0101\u0001\u0000"+
		"\u0000\u0000\u008a\u008c\u0005\u0002\u0000\u0000\u008b\u008d\u0005\u0016"+
		"\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0017"+
		"\u0000\u0000\u008f\u00a4\u0005#\u0000\u0000\u0090\u0092\u0003\n\u0005"+
		"\u0000\u0091\u0093\u0003\f\u0006\u0000\u0092\u0091\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000"+
		"\u0094\u0090\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u00a1\u0005\u0017\u0000\u0000"+
		"\u0097\u009c\u0005%\u0000\u0000\u0098\u009a\u0003\n\u0005\u0000\u0099"+
		"\u009b\u0003\f\u0006\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u0098"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u00a0\u0005\u0017\u0000\u0000\u009f\u0097"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u0094"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005$\u0000\u0000\u00a7\u0101\u0005"+
		"\u0003\u0000\u0000\u00a8\u00a9\u0005\u0002\u0000\u0000\u00a9\u00aa\u0005"+
		"\u0015\u0000\u0000\u00aa\u00ab\u0005\u0017\u0000\u0000\u00ab\u00c0\u0005"+
		"#\u0000\u0000\u00ac\u00ae\u0003\n\u0005\u0000\u00ad\u00af\u0003\f\u0006"+
		"\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ac\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u00bd\u0005\u0017\u0000\u0000\u00b3\u00b8\u0005%\u0000\u0000"+
		"\u00b4\u00b6\u0003\n\u0005\u0000\u00b5\u00b7\u0003\f\u0006\u0000\u00b6"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b4\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bc\u0005\u0017\u0000\u0000\u00bb\u00b3\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c0\u00b0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005$\u0000\u0000\u00c3\u0101\u0005\u0003\u0000\u0000\u00c4\u00c5"+
		"\u0005\u0002\u0000\u0000\u00c5\u00c6\u0005\u0015\u0000\u0000\u00c6\u00c7"+
		"\u0003\f\u0006\u0000\u00c7\u00c8\u0005\u0017\u0000\u0000\u00c8\u00dd\u0005"+
		"#\u0000\u0000\u00c9\u00cb\u0003\n\u0005\u0000\u00ca\u00cc\u0003\f\u0006"+
		"\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u00da\u0005\u0017\u0000\u0000\u00d0\u00d5\u0005%\u0000\u0000"+
		"\u00d1\u00d3\u0003\n\u0005\u0000\u00d2\u00d4\u0003\f\u0006\u0000\u00d3"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d1\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d9\u0005\u0017\u0000\u0000\u00d8\u00d0\u0001\u0000\u0000\u0000\u00d9"+
		"\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc"+
		"\u00da\u0001\u0000\u0000\u0000\u00dd\u00cd\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005$\u0000\u0000\u00e0\u00e1\u0005\u0003\u0000\u0000\u00e1\u0101"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0002\u0000\u0000\u00e3\u00e4"+
		"\u0005\u0016\u0000\u0000\u00e4\u00e5\u0003\f\u0006\u0000\u00e5\u00e6\u0005"+
		"\u0017\u0000\u0000\u00e6\u00fb\u0005#\u0000\u0000\u00e7\u00e9\u0003\n"+
		"\u0005\u0000\u00e8\u00ea\u0003\f\u0006\u0000\u00e9\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ec\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e7\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00f8\u0005\u0017\u0000"+
		"\u0000\u00ee\u00f3\u0005%\u0000\u0000\u00ef\u00f1\u0003\n\u0005\u0000"+
		"\u00f0\u00f2\u0003\f\u0006\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0005\u0017\u0000\u0000\u00f6"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb"+
		"\u00eb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005$\u0000\u0000\u00fe\u00ff"+
		"\u0005\u0003\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100X\u0001"+
		"\u0000\u0000\u0000\u0100o\u0001\u0000\u0000\u0000\u0100\u0086\u0001\u0000"+
		"\u0000\u0000\u0100\u008a\u0001\u0000\u0000\u0000\u0100\u00a8\u0001\u0000"+
		"\u0000\u0000\u0100\u00c4\u0001\u0000\u0000\u0000\u0100\u00e2\u0001\u0000"+
		"\u0000\u0000\u0101\u0007\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u0017"+
		"\u0000\u0000\u0103\u0104\u0005\u0001\u0000\u0000\u0104\u0112\u0003\u0004"+
		"\u0002\u0000\u0105\u0106\u0005\u0017\u0000\u0000\u0106\u0107\u0005\u0001"+
		"\u0000\u0000\u0107\u0108\u0005!\u0000\u0000\u0108\u010d\u0005\u0018\u0000"+
		"\u0000\u0109\u010a\u0005%\u0000\u0000\u010a\u010c\u0005\u0018\u0000\u0000"+
		"\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000"+
		"\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000"+
		"\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000"+
		"\u0110\u0112\u0005\"\u0000\u0000\u0111\u0102\u0001\u0000\u0000\u0000\u0111"+
		"\u0105\u0001\u0000\u0000\u0000\u0112\t\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0007\u0002\u0000\u0000\u0114\u000b\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0005!\u0000\u0000\u0116\u0117\u0005\"\u0000\u0000\u0117\r\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0005\u0004\u0000\u0000\u0119\u011a\u0005#\u0000"+
		"\u0000\u011a\u011b\u0005\u0017\u0000\u0000\u011b\u012c\u0005$\u0000\u0000"+
		"\u011c\u011d\u0005\u0005\u0000\u0000\u011d\u011e\u0005#\u0000\u0000\u011e"+
		"\u011f\u0005\u0017\u0000\u0000\u011f\u0120\u0005%\u0000\u0000\u0120\u0121"+
		"\u0003\u0004\u0002\u0000\u0121\u0122\u0005%\u0000\u0000\u0122\u0123\u0003"+
		"\u0004\u0002\u0000\u0123\u0124\u0005$\u0000\u0000\u0124\u012c\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0005\u0006\u0000\u0000\u0126\u0127\u0005#\u0000"+
		"\u0000\u0127\u0128\u0005\u0017\u0000\u0000\u0128\u0129\u0005%\u0000\u0000"+
		"\u0129\u012a\u0005\u0018\u0000\u0000\u012a\u012c\u0005$\u0000\u0000\u012b"+
		"\u0118\u0001\u0000\u0000\u0000\u012b\u011c\u0001\u0000\u0000\u0000\u012b"+
		"\u0125\u0001\u0000\u0000\u0000\u012c\u000f\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0005\u0017\u0000\u0000\u012e\u0137\u0005#\u0000\u0000\u012f\u0134"+
		"\u0003\u0004\u0002\u0000\u0130\u0131\u0005%\u0000\u0000\u0131\u0133\u0003"+
		"\u0004\u0002\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0136\u0001"+
		"\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001"+
		"\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001"+
		"\u0000\u0000\u0000\u0137\u012f\u0001\u0000\u0000\u0000\u0137\u0138\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013a\u0005"+
		"$\u0000\u0000\u013a\u0011\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u0007"+
		"\u0000\u0000\u013c\u013d\u0005\u0017\u0000\u0000\u013d\u014b\u0005\b\u0000"+
		"\u0000\u013e\u014c\u0005\u0017\u0000\u0000\u013f\u0140\u0005\t\u0000\u0000"+
		"\u0140\u0141\u0005#\u0000\u0000\u0141\u0144\u0005\u0018\u0000\u0000\u0142"+
		"\u0143\u0005%\u0000\u0000\u0143\u0145\u0005\u0018\u0000\u0000\u0144\u0142"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0148"+
		"\u0001\u0000\u0000\u0000\u0146\u0147\u0005%\u0000\u0000\u0147\u0149\u0005"+
		"\u0018\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014c\u0005"+
		"$\u0000\u0000\u014b\u013e\u0001\u0000\u0000\u0000\u014b\u013f\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0005\u0003"+
		"\u0000\u0000\u014e\u0013\u0001\u0000\u0000\u0000\u014f\u0150\u0005\n\u0000"+
		"\u0000\u0150\u0151\u0003\u0004\u0002\u0000\u0151\u0152\u0005\u0003\u0000"+
		"\u0000\u0152\u0015\u0001\u0000\u0000\u0000\u0153\u0154\u0005\u000b\u0000"+
		"\u0000\u0154\u0155\u0003\u0004\u0002\u0000\u0155\u015c\u0005\u0003\u0000"+
		"\u0000\u0156\u0157\u0005\f\u0000\u0000\u0157\u0158\u0003\u0004\u0002\u0000"+
		"\u0158\u0159\u0005\u0003\u0000\u0000\u0159\u015b\u0001\u0000\u0000\u0000"+
		"\u015a\u0156\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000"+
		"\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000"+
		"\u015d\u0161\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0005\r\u0000\u0000\u0160\u0162\u0005\u0003\u0000\u0000\u0161"+
		"\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162"+
		"\u0017\u0001\u0000\u0000\u0000\u0163\u0165\u0003\n\u0005\u0000\u0164\u0163"+
		"\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0001\u0000\u0000\u0000\u0166\u0167\u0005\u0017\u0000\u0000\u0167\u0168"+
		"\u0005\u0001\u0000\u0000\u0168\u0169\u0005\u000e\u0000\u0000\u0169\u016a"+
		"\u0005#\u0000\u0000\u016a\u016b\u0005&\u0000\u0000\u016b\u016c\u0005$"+
		"\u0000\u0000\u016c\u0019\u0001\u0000\u0000\u0000\u016d\u016e\u0005\u000f"+
		"\u0000\u0000\u016e\u0171\u0005#\u0000\u0000\u016f\u0172\u0003\u0004\u0002"+
		"\u0000\u0170\u0172\u0005&\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000"+
		"\u0171\u0170\u0001\u0000\u0000\u0000\u0172\u017a\u0001\u0000\u0000\u0000"+
		"\u0173\u0176\u0005%\u0000\u0000\u0174\u0177\u0003\u0004\u0002\u0000\u0175"+
		"\u0177\u0005&\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176\u0175"+
		"\u0001\u0000\u0000\u0000\u0177\u0179\u0001\u0000\u0000\u0000\u0178\u0173"+
		"\u0001\u0000\u0000\u0000\u0179\u017c\u0001\u0000\u0000\u0000\u017a\u0178"+
		"\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017d"+
		"\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d\u017e"+
		"\u0005$\u0000\u0000\u017e\u001b\u0001\u0000\u0000\u0000\u017f\u0180\u0005"+
		"\u0010\u0000\u0000\u0180\u0185\u0003\u0004\u0002\u0000\u0181\u0182\u0005"+
		"%\u0000\u0000\u0182\u0184\u0003\u0004\u0002\u0000\u0183\u0181\u0001\u0000"+
		"\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u001d\u0001\u0000"+
		"\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000:!04@CSU\\_ehlsv|\u007f"+
		"\u0083\u008c\u0092\u0094\u009a\u009c\u00a1\u00a4\u00ae\u00b0\u00b6\u00b8"+
		"\u00bd\u00c0\u00cb\u00cd\u00d3\u00d5\u00da\u00dd\u00e9\u00eb\u00f1\u00f3"+
		"\u00f8\u00fb\u0100\u010d\u0111\u012b\u0134\u0137\u0144\u0148\u014b\u015c"+
		"\u0161\u0164\u0171\u0176\u017a\u0185";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}