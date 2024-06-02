package expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

//#region
import antlr.MONTyPythonBaseVisitor;
import antlr.MONTyPythonParser.FloatDeclarationContext;
import antlr.MONTyPythonParser.FloatFunctionDeclarationContext;
import antlr.MONTyPythonParser.FloatListFunctionDeclContext;
import antlr.MONTyPythonParser.FlutuanteContext;
import antlr.MONTyPythonParser.ForInstructionContext;
import antlr.MONTyPythonParser.FuncCallContext;
import antlr.MONTyPythonParser.GroupExpContext;
import antlr.MONTyPythonParser.IfInstructionContext;
import antlr.MONTyPythonParser.InputFunctionContext;
import antlr.MONTyPythonParser.IntDeclarationContext;
import antlr.MONTyPythonParser.IntFunctionDeclarationContext;
import antlr.MONTyPythonParser.IntListFunctionDeclContext;
import antlr.MONTyPythonParser.InteiroContext;
import antlr.MONTyPythonParser.ListAddContext;
import antlr.MONTyPythonParser.ListAssignContext;
import antlr.MONTyPythonParser.ListDeclarationContext;
import antlr.MONTyPythonParser.ListIndexContext;
import antlr.MONTyPythonParser.ListRemoveContext;
import antlr.MONTyPythonParser.ListSizeContext;
import antlr.MONTyPythonParser.LogicalContext;
import antlr.MONTyPythonParser.MultDivContext;
import antlr.MONTyPythonParser.PowContext;
import antlr.MONTyPythonParser.PrintFunctionContext;
import antlr.MONTyPythonParser.RelationalContext;
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
    public Expression visitFloatDeclaration(FloatDeclarationContext ctx) 
    {
        Map<String, Number> values = new HashMap<>();

        for (int i = 0; i < ctx.ID().size(); i++)
        {
            Token idToken = ctx.ID(i).getSymbol();
            
            String id = idToken.getText();
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

            // Verifica se o ID declarado não está na última posição e podemos obter valor
            int idIndex = ctx.children.indexOf(ctx.ID(i));
            if (idIndex < ctx.children.size() - 2)
            {
                String possibleValue = ctx.getChild(idIndex + 2).getText();

                try 
                {
                    float numValue = Float.parseFloat(possibleValue);
                    
                    values.put(id, numValue);
                } 
                catch (NumberFormatException e) 
                {
                    values.put(id, 0);
                }
            }
        }

        return new FloatDeclaration(values);
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
        if (!vars.contains(id))
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
    public Expression visitGroupExp(GroupExpContext ctx)
    {
        String negado = ctx.NOT().getText();
        Expression expression = visit(ctx.expression());

        return new GroupExp(expression, !negado.isEmpty());
    }

    @Override
    public Expression visitIntDeclaration(IntDeclarationContext ctx) 
    {
        Map<String, Integer> values = new HashMap<>();

        for (int i = 0; i < ctx.ID().size(); i++)
        {
            Token idToken = ctx.ID(i).getSymbol();
            
            String id = idToken.getText();
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

            // Verifica se o ID declarado não está na última posição e podemos obter valor
            int idIndex = ctx.children.indexOf(ctx.ID(i));
            if (idIndex < ctx.children.size() - 1)
            {
                String possibleValue = ctx.getChild(idIndex + 2).getText();

                try 
                {
                    int intValue = Integer.parseInt(possibleValue);
                    
                    values.put(id, intValue);
                } 
                catch (NumberFormatException e) 
                {
                    values.put(id, 0);
                }
            }
        }

        return new IntDeclaration(values);
    }

    @Override
    public Expression visitFlutuante(FlutuanteContext ctx) 
    {
        String floatText = ctx.floatExpression().getText();
        float f = Float.parseFloat(floatText);
        return new Flutuante(f);
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
    public Expression visitPow(PowContext ctx)
    {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Pow(left, right);
    }

    @Override
    public Expression visitInputFunction(InputFunctionContext ctx) 
    {
        Token idToken = ctx.ID().getSymbol();
        String type = ctx.getChild(0).getText();

        String id = idToken.getText();
        if (vars.contains(id))
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
            vars.add(id);
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
        if (!vars.contains(id))
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

        if (!vars.contains(id))
        {
            // Se não tiver sido anteriormente declarado assume tipo float
            vars.add(id);
        }

        List<Number> values = new ArrayList<>();

        for (TerminalNode value : ctx.INT()) 
        {
            values.add(Integer.parseInt(value.getText()));
        }

        return new ListAssign(id, values);
    }

    @Override
    public Expression visitListIndex(ListIndexContext ctx) 
    {
        Token idToken = ctx.ID().getSymbol();

        String id = idToken.getText();
        if (!vars.contains(id))
        {
            int line = idToken.getLine();
            int column = idToken.getCharPositionInLine() + 1;
            semanticErrors.add("Error: variable " + id + " not declared (" + line + ", " + column + ")");
        }

        int index = Integer.parseInt(ctx.INT().getText());

        return new ListIndex(id, index);
    }

    @Override
    public Expression visitRelational(RelationalContext ctx)
    {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        String operator = ctx.RELATIONAL_OP().getText();

        return new Relational(left, right, operator);
    }

    @Override
    public Expression visitLogical(LogicalContext ctx)
    {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        String operator = ctx.LOGIC().getText();

        return new Logical(left, right, operator);
    }

    @Override
    public Expression visitListRemove(ListRemoveContext ctx) 
    {
        Token idToken = ctx.ID().getSymbol();

        String id = idToken.getText();
        if (!vars.contains(id))
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
        if (!vars.contains(id))
        {
            int line = idToken.getLine();
            int column = idToken.getCharPositionInLine() + 1;
            semanticErrors.add("Error: variable " + id + " not declared (" + line + ", " + column + ")");
        }

        return new ListSize(id);
    }

    @Override
    public Expression visitMultDiv(MultDivContext ctx)
    {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        String operator = ctx.op.getText();

        return new MultDiv(left, right, operator);
    }

    @Override
    public Expression visitInteiro(InteiroContext ctx) 
    {
        String intText = ctx.intExpression().getText();
        int f = Integer.parseInt(intText);
        return new Inteiro(f);
    }

    @Override
    public Expression visitPrintFunction(PrintFunctionContext ctx) 
    {
        Map<Integer, String> parametros1 = new HashMap<>();
        Map<Integer, Expression> parametros2 = new HashMap<>();

        for (TerminalNode n : ctx.STRING()) 
        {
            parametros1.put(ctx.children.indexOf(n), n.getText());
        }
        for (int i = 0; i < ctx.expression().size(); i++)
        {
            parametros2.put(ctx.children.indexOf(ctx.expression(i)), visit(ctx.expression(i)));
        }

        return new PrintFunction(parametros1, parametros2);
    }

    @Override
    public Expression visitUnaryOp(UnaryOpContext ctx)
    {
        Expression left = visit(ctx.getChild(1));
        Expression right = visit(ctx.getChild(2));
        String operator = ctx.UNARY().getText();

        return new Logical(left, right, operator);
    }

    @Override
    public Expression visitVariable(VariableContext ctx) 
    {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        String id = ctx.getChild(0).getText();
        if (!vars.contains(id))
        {
            semanticErrors.add("Error: variable " + id + " not declared (" + line + ", " + column + ")");
        }

        return new Variable(id);
    }

    @Override
    public Expression visitVariableAssign(VariableAssignContext ctx) 
    {
        Token idToken = ctx.ID().getSymbol();

        String id = idToken.getText();
        if (!vars.contains(id))
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
        Expression left = visit(ctx.expression(0));
        Expression right = visit(ctx.expression(1));
        String op = ctx.RELATIONAL_OP().getText();;

        return new WhileInstrunction(left, right, op);
    }
    
}
