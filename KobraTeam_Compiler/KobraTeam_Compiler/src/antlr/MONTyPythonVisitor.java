// Generated from MONTyPython.g4 by ANTLR 4.13.1
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MONTyPythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MONTyPythonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Prog}
	 * labeled alternative in {@link MONTyPythonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MONTyPythonParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MONTyPythonParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(MONTyPythonParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MONTyPythonParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryOp}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(MONTyPythonParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(MONTyPythonParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GroupExp}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupExp(MONTyPythonParser.GroupExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListIndex}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListIndex(MONTyPythonParser.ListIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(MONTyPythonParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Logical}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical(MONTyPythonParser.LogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(MONTyPythonParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link MONTyPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(MONTyPythonParser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatDeclaration}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatDeclaration(MONTyPythonParser.FloatDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntDeclaration}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDeclaration(MONTyPythonParser.IntDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListDeclaration}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDeclaration(MONTyPythonParser.ListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatFunctionDeclaration}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatFunctionDeclaration(MONTyPythonParser.FloatFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntFunctionDeclaration}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntFunctionDeclaration(MONTyPythonParser.IntFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntListFunctionDecl}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntListFunctionDecl(MONTyPythonParser.IntListFunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatListFunctionDecl}
	 * labeled alternative in {@link MONTyPythonParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatListFunctionDecl(MONTyPythonParser.FloatListFunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableAssign}
	 * labeled alternative in {@link MONTyPythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssign(MONTyPythonParser.VariableAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListAssign}
	 * labeled alternative in {@link MONTyPythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAssign(MONTyPythonParser.ListAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MONTyPythonParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(MONTyPythonParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MONTyPythonParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(MONTyPythonParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListSize}
	 * labeled alternative in {@link MONTyPythonParser#listFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListSize(MONTyPythonParser.ListSizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListAdd}
	 * labeled alternative in {@link MONTyPythonParser#listFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAdd(MONTyPythonParser.ListAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListRemove}
	 * labeled alternative in {@link MONTyPythonParser#listFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListRemove(MONTyPythonParser.ListRemoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link MONTyPythonParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(MONTyPythonParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInstruction}
	 * labeled alternative in {@link MONTyPythonParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInstruction(MONTyPythonParser.ForInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileInstrunction}
	 * labeled alternative in {@link MONTyPythonParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileInstrunction(MONTyPythonParser.WhileInstrunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfInstruction}
	 * labeled alternative in {@link MONTyPythonParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfInstruction(MONTyPythonParser.IfInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputFunction}
	 * labeled alternative in {@link MONTyPythonParser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputFunction(MONTyPythonParser.InputFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintFunction}
	 * labeled alternative in {@link MONTyPythonParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunction(MONTyPythonParser.PrintFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnFuncion}
	 * labeled alternative in {@link MONTyPythonParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFuncion(MONTyPythonParser.ReturnFuncionContext ctx);
}