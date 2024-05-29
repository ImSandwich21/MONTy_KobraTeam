package expression;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.parse.ANTLRParser.elementOptions_return;
import org.antlr.v4.parse.ANTLRParser.id_return;
import org.antlr.v4.runtime.Token;

//#region
import antlr.MONTyPythonBaseVisitor;
import antlr.MONTyPythonParser.FloatDeclarationContext;
import antlr.MONTyPythonParser.FloatFunctionDeclarationContext;
import antlr.MONTyPythonParser.FloatListFunctionDeclContext;
import antlr.MONTyPythonParser.ForInstructionContext;
import antlr.MONTyPythonParser.FuncCallContext;
import antlr.MONTyPythonParser.GroupExpContext;
import antlr.MONTyPythonParser.IfInstructionContext;
import antlr.MONTyPythonParser.InputFunctionContext;
import antlr.MONTyPythonParser.IntDeclarationContext;
import antlr.MONTyPythonParser.IntFunctionDeclarationContext;
import antlr.MONTyPythonParser.IntListFunctionDeclContext;
import antlr.MONTyPythonParser.ListAddContext;
import antlr.MONTyPythonParser.ListAssignContext;
import antlr.MONTyPythonParser.ListDeclarationContext;
import antlr.MONTyPythonParser.ListIndexContext;
import antlr.MONTyPythonParser.ListRemoveContext;
import antlr.MONTyPythonParser.ListSizeContext;
import antlr.MONTyPythonParser.MultDivContext;
import antlr.MONTyPythonParser.NumberContext;
import antlr.MONTyPythonParser.ParameterContext;
import antlr.MONTyPythonParser.PowContext;
import antlr.MONTyPythonParser.PrintFunctionContext;
import antlr.MONTyPythonParser.UnaryOpContext;
import antlr.MONTyPythonParser.VariableAssignContext;
import antlr.MONTyPythonParser.VariableContext;
import antlr.MONTyPythonParser.WhileInstrunctionContext;
//#endregion

public class AntlrToExpression extends MONTyPythonBaseVisitor<Expression>
{
    private List<String> vars;
    private List<String> semanticErrors;

    public AntlrToExpression(List<String> _semanticErros)
    {
        vars = new ArrayList<>();
        this.semanticErrors = _semanticErros;
    }

    @Override
    public Expression visitFloatDeclaration(FloatDeclarationContext arg0) {
        
        return super.visitFloatDeclaration(arg0);
    }

    @Override
    public Expression visitFloatFunctionDeclaration(FloatFunctionDeclarationContext arg0) {
        return super.visitFloatFunctionDeclaration(arg0);
    }

    @Override
    public Expression visitFloatListFunctionDecl(FloatListFunctionDeclContext arg0) {
        return super.visitFloatListFunctionDecl(arg0);
    }

    @Override
    public Expression visitForInstruction(ForInstructionContext arg0) {
        return super.visitForInstruction(arg0);
    }

    @Override
    public Expression visitFuncCall(FuncCallContext arg0) {
        return super.visitFuncCall(arg0);
    }

    @Override
    public Expression visitGroupExp(GroupExpContext arg0) {
        return super.visitGroupExp(arg0);
    }

    @Override
    public Expression visitIntDeclaration(IntDeclarationContext ctx) 
    {
        String type = ctx.getChild(0).getText();
        
        for (int i = 0; i < ctx.ID().size() - 1; i++)
        {
            String id = ctx.ID(i).getText();
            //int index = ctx.children.indexOf(id);
            if (vars.contains(id))
            {
                semanticErrors.add("Error: variable " + id + " already declared.");
            }
            else
            {
                vars.add(id);
            }
        }
        // int x, y = 1, z

        return new IntDeclaration(type, "teste", 0);
    }

    @Override
    public Expression visitListDeclaration(ListDeclarationContext ctx) 
    {
        String type = ctx.getChild(0).getText();
        Token idToken = ctx.ID().getSymbol();

        String id = ctx.getChild(0).getText();
        if (vars.contains(id))
        {
            int line = idToken.getLine();
            int column = idToken.getCharPositionInLine() + 1;
            semanticErrors.add("Error: variable " + id + " already declared (" + line + ", " + column + ")");
        }
        else
        {
            vars.add(id);
        }

        return new ListDeclaration(type, id);
    }

    @Override
    public Expression visitIfInstruction(IfInstructionContext arg0) {
        return super.visitIfInstruction(arg0);
    }

    @Override
    public Expression visitInputFunction(InputFunctionContext arg0) {
        return super.visitInputFunction(arg0);
    }

    @Override
    public Expression visitIntFunctionDeclaration(IntFunctionDeclarationContext arg0) {
        return super.visitIntFunctionDeclaration(arg0);
    }

    @Override
    public Expression visitIntListFunctionDecl(IntListFunctionDeclContext arg0) {
        return super.visitIntListFunctionDecl(arg0);
    }

    @Override
    public Expression visitListAdd(ListAddContext arg0) {
        return super.visitListAdd(arg0);
    }

    @Override
    public Expression visitListAssign(ListAssignContext arg0) {
        return super.visitListAssign(arg0);
    }

    @Override
    public Expression visitListIndex(ListIndexContext arg0) {
        return super.visitListIndex(arg0);
    }

    @Override
    public Expression visitListRemove(ListRemoveContext arg0) {
        return super.visitListRemove(arg0);
    }

    @Override
    public Expression visitListSize(ListSizeContext arg0) {
        return super.visitListSize(arg0);
    }

    @Override
    public Expression visitMultDiv(MultDivContext arg0) {
        return super.visitMultDiv(arg0);
    }

    @Override
    public Expression visitNumber(NumberContext arg0) {
        return super.visitNumber(arg0);
    }

    @Override
    public Expression visitParameter(ParameterContext arg0) {
        return super.visitParameter(arg0);
    }

    @Override
    public Expression visitPow(PowContext arg0) {
        return super.visitPow(arg0);
    }

    @Override
    public Expression visitPrintFunction(PrintFunctionContext arg0) {
        return super.visitPrintFunction(arg0);
    }

    @Override
    public Expression visitUnaryOp(UnaryOpContext arg0) {
        return super.visitUnaryOp(arg0);
    }

    @Override
    public Expression visitVariable(VariableContext arg0) {
        return super.visitVariable(arg0);
    }

    @Override
    public Expression visitVariableAssign(VariableAssignContext arg0) {
        return super.visitVariableAssign(arg0);
    }

    @Override
    public Expression visitWhileInstrunction(WhileInstrunctionContext arg0) {
        return super.visitWhileInstrunction(arg0);
    }

    
}
