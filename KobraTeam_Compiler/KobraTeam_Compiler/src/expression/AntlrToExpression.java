package expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.parse.ANTLRParser.elementOptions_return;
import org.antlr.v4.parse.ANTLRParser.id_return;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

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
import antlr.MONTyPythonParser.PowContext;
import antlr.MONTyPythonParser.PrintFunctionContext;
import antlr.MONTyPythonParser.UnaryOpContext;
import antlr.MONTyPythonParser.VariableAssignContext;
import antlr.MONTyPythonParser.VariableContext;
import antlr.MONTyPythonParser.WhileInstrunctionContext;
//#endregion

public class AntlrToExpression extends MONTyPythonBaseVisitor<Expression>
{
    private Map<String, String> vars;
    private List<String> semanticErrors;

    public AntlrToExpression(List<String> _semanticErros)
    {
        vars = new HashMap<>();
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
    public Expression visitFuncCall(FuncCallContext ctx) 
    {
        Token idToken = ctx.ID().getSymbol();

        String id = idToken.getText();
        if (!vars.containsKey(id))
        {
            int line = idToken.getLine();
            int column = idToken.getCharPositionInLine() + 1;
            semanticErrors.add("Error: function " + id + " not declared (" + line + ", " + column + ")");
        }

        List<Expression> parametros = new ArrayList<>();

        for (int i = 0; i < ctx.expression().size(); i++) 
        {
            parametros.add(visit(ctx.expression(i)));
        }

        return new FuncCall(id, parametros);
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
            if (vars.containsKey(id))
            {
                semanticErrors.add("Error: variable " + id + " already declared.");
            }
            else
            {
                vars.put(id, type);
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
        if (vars.containsKey(id))
        {
            int line = idToken.getLine();
            int column = idToken.getCharPositionInLine() + 1;
            semanticErrors.add("Error: variable " + id + " already declared (" + line + ", " + column + ")");
        }
        else
        {
            vars.put(id, type);
        }

        return new ListDeclaration(type, id);
    }

    @Override
    public Expression visitIfInstruction(IfInstructionContext arg0) {
        return super.visitIfInstruction(arg0);
    }

    @Override
    public Expression visitInputFunction(InputFunctionContext ctx) 
    {
        Token idToken = ctx.ID().getSymbol();
        String type = ctx.getChild(0).getText();

        String id = idToken.getText();
        if (vars.containsKey(id))
        {
            if (type != id)
            {
                int line = idToken.getLine();
                int column = idToken.getCharPositionInLine() + 1;
                semanticErrors.add("Error: variable " + id + " already declared (" + line + ", " + column + ")");
            }
        }
        else
        {
            if (type == id)
            {
                vars.put(id,"float");
            }
            else
            {
                vars.put(id,type);
            }
        }

        String msg = ctx.STRING().getText();

        return new InputFunction((type == id ? "float" : type), id, msg);
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
    public Expression visitListAdd(ListAddContext ctx) 
    {
        Token idToken = ctx.ID().getSymbol();

        String id = idToken.getText();
        if (!vars.containsKey(id))
        {
            int line = idToken.getLine();
            int column = idToken.getCharPositionInLine() + 1;
            semanticErrors.add("Error: variable " + id + " not declared (" + line + ", " + column + ")");
        }

        Expression possition = visit(ctx.getChild(4));
        Expression value = visit(ctx.getChild(6));

        return new ListAdd(id, possition, value);
    }

    @Override
    public Expression visitListAssign(ListAssignContext ctx) 
    {
        String id = ctx.ID().getText();

        if (!vars.containsKey(id))
        {
            // Se não tiver sido anteriormente declarado assume tipo float
            vars.put("float", id);
        }

        List<Integer> values = new ArrayList<>();

        for (TerminalNode value : ctx.INT()) 
        {
            values.add(Integer.parseInt(value.getText()));
        }

        return new ListAssign(id, values);
    }

    @Override
    public Expression visitListIndex(ListIndexContext arg0) {
        return super.visitListIndex(arg0);
    }

    @Override
    public Expression visitListRemove(ListRemoveContext ctx) 
    {
        Token idToken = ctx.ID().getSymbol();

        String id = idToken.getText();
        if (!vars.containsKey(id))
        {
            int line = idToken.getLine();
            int column = idToken.getCharPositionInLine() + 1;
            semanticErrors.add("Error: variable " + id + " not declared (" + line + ", " + column + ")");
        }

        Integer position = Integer.parseInt(ctx.getChild(4).getText());

        return new ListRemove(id, position);
    }

    @Override
    public Expression visitListSize(ListSizeContext ctx) 
    {
        Token idToken = ctx.ID().getSymbol();
        
        String id = idToken.getText();
        if (!vars.containsKey(id))
        {
            int line = idToken.getLine();
            int column = idToken.getCharPositionInLine() + 1;
            semanticErrors.add("Error: variable " + id + " not declared (" + line + ", " + column + ")");
        }

        return new ListSize(id);
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
    public Expression visitPow(PowContext arg0) {
        return super.visitPow(arg0);
    }

    @Override
    public Expression visitPrintFunction(PrintFunctionContext ctx) 
    {
        

        return new PrintFunction();
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
    public Expression visitVariableAssign(VariableAssignContext ctx) 
    {
        Token idToken = ctx.ID().getSymbol();

        String id = idToken.getText();
        if (!vars.containsKey(id))
        {
            int line = idToken.getLine();
            int column = idToken.getCharPositionInLine() + 1;
            semanticErrors.add("Error: variable " + id + " not declared (" + line + ", " + column + ")");
        }

        Expression value = visit(ctx.getChild(2));

        return new VariableAssign(id, value);
    }

    @Override
    public Expression visitWhileInstrunction(WhileInstrunctionContext ctx) 
    {
        Expression condicao = visit(ctx.expression());

        return new WhileInstrunction(condicao);
    }

    
}
