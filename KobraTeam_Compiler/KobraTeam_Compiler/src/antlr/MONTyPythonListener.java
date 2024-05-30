// Generated from MONTyPython.g4 by ANTLR 4.13.1
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MONTyPythonParser}.
 */
public interface MONTyPythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Prog}
	 * labeled alternative in {@link MONTyPythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProg(MONTyPythonParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Prog}
	 * labeled alternative in {@link MONTyPythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProg(MONTyPythonParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONTyPythonParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(MONTyPythonParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONTyPythonParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(MONTyPythonParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Flutuante}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFlutuante(MONTyPythonParser.FlutuanteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Flutuante}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFlutuante(MONTyPythonParser.FlutuanteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MONTyPythonParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MONTyPythonParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryOp}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(MONTyPythonParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryOp}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(MONTyPythonParser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GroupExp}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGroupExp(MONTyPythonParser.GroupExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GroupExp}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGroupExp(MONTyPythonParser.GroupExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListIndex}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListIndex(MONTyPythonParser.ListIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListIndex}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListIndex(MONTyPythonParser.ListIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational(MONTyPythonParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational(MONTyPythonParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPow(MONTyPythonParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPow(MONTyPythonParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Logical}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical(MONTyPythonParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Logical}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical(MONTyPythonParser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Inteiro}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInteiro(MONTyPythonParser.InteiroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Inteiro}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInteiro(MONTyPythonParser.InteiroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(MONTyPythonParser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(MONTyPythonParser.MultDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONTyPythonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MONTyPythonParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONTyPythonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MONTyPythonParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONTyPythonParser#intExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntExpression(MONTyPythonParser.IntExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONTyPythonParser#intExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntExpression(MONTyPythonParser.IntExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONTyPythonParser#floatExpression}.
	 * @param ctx the parse tree
	 */
	void enterFloatExpression(MONTyPythonParser.FloatExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONTyPythonParser#floatExpression}.
	 * @param ctx the parse tree
	 */
	void exitFloatExpression(MONTyPythonParser.FloatExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatDeclaration}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterFloatDeclaration(MONTyPythonParser.FloatDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatDeclaration}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitFloatDeclaration(MONTyPythonParser.FloatDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntDeclaration}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterIntDeclaration(MONTyPythonParser.IntDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntDeclaration}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitIntDeclaration(MONTyPythonParser.IntDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListDeclaration}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterListDeclaration(MONTyPythonParser.ListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListDeclaration}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitListDeclaration(MONTyPythonParser.ListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatFunctionDeclaration}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterFloatFunctionDeclaration(MONTyPythonParser.FloatFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatFunctionDeclaration}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitFloatFunctionDeclaration(MONTyPythonParser.FloatFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntFunctionDeclaration}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterIntFunctionDeclaration(MONTyPythonParser.IntFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntFunctionDeclaration}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitIntFunctionDeclaration(MONTyPythonParser.IntFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntListFunctionDecl}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterIntListFunctionDecl(MONTyPythonParser.IntListFunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntListFunctionDecl}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitIntListFunctionDecl(MONTyPythonParser.IntListFunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatListFunctionDecl}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterFloatListFunctionDecl(MONTyPythonParser.FloatListFunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatListFunctionDecl}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitFloatListFunctionDecl(MONTyPythonParser.FloatListFunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableAssign}
	 * labeled alternative in {@link MONTyPythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssign(MONTyPythonParser.VariableAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableAssign}
	 * labeled alternative in {@link MONTyPythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssign(MONTyPythonParser.VariableAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListAssign}
	 * labeled alternative in {@link MONTyPythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterListAssign(MONTyPythonParser.ListAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListAssign}
	 * labeled alternative in {@link MONTyPythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitListAssign(MONTyPythonParser.ListAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONTyPythonParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(MONTyPythonParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONTyPythonParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(MONTyPythonParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONTyPythonParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(MONTyPythonParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONTyPythonParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(MONTyPythonParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListSize}
	 * labeled alternative in {@link MONTyPythonParser#listFunction}.
	 * @param ctx the parse tree
	 */
	void enterListSize(MONTyPythonParser.ListSizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListSize}
	 * labeled alternative in {@link MONTyPythonParser#listFunction}.
	 * @param ctx the parse tree
	 */
	void exitListSize(MONTyPythonParser.ListSizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListAdd}
	 * labeled alternative in {@link MONTyPythonParser#listFunction}.
	 * @param ctx the parse tree
	 */
	void enterListAdd(MONTyPythonParser.ListAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListAdd}
	 * labeled alternative in {@link MONTyPythonParser#listFunction}.
	 * @param ctx the parse tree
	 */
	void exitListAdd(MONTyPythonParser.ListAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListRemove}
	 * labeled alternative in {@link MONTyPythonParser#listFunction}.
	 * @param ctx the parse tree
	 */
	void enterListRemove(MONTyPythonParser.ListRemoveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListRemove}
	 * labeled alternative in {@link MONTyPythonParser#listFunction}.
	 * @param ctx the parse tree
	 */
	void exitListRemove(MONTyPythonParser.ListRemoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link MONTyPythonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(MONTyPythonParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link MONTyPythonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(MONTyPythonParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInstruction}
	 * labeled alternative in {@link MONTyPythonParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForInstruction(MONTyPythonParser.ForInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInstruction}
	 * labeled alternative in {@link MONTyPythonParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForInstruction(MONTyPythonParser.ForInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileInstrunction}
	 * labeled alternative in {@link MONTyPythonParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileInstrunction(MONTyPythonParser.WhileInstrunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileInstrunction}
	 * labeled alternative in {@link MONTyPythonParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileInstrunction(MONTyPythonParser.WhileInstrunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfInstruction}
	 * labeled alternative in {@link MONTyPythonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfInstruction(MONTyPythonParser.IfInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfInstruction}
	 * labeled alternative in {@link MONTyPythonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfInstruction(MONTyPythonParser.IfInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputFunction}
	 * labeled alternative in {@link MONTyPythonParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputFunction(MONTyPythonParser.InputFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputFunction}
	 * labeled alternative in {@link MONTyPythonParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputFunction(MONTyPythonParser.InputFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintFunction}
	 * labeled alternative in {@link MONTyPythonParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunction(MONTyPythonParser.PrintFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintFunction}
	 * labeled alternative in {@link MONTyPythonParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunction(MONTyPythonParser.PrintFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnFuncion}
	 * labeled alternative in {@link MONTyPythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnFuncion(MONTyPythonParser.ReturnFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnFuncion}
	 * labeled alternative in {@link MONTyPythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnFuncion(MONTyPythonParser.ReturnFuncionContext ctx);
}