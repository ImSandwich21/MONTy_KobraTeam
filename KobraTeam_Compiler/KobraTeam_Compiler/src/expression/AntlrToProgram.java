package expression;

import java.util.ArrayList;
import java.util.List;

import antlr.MONTyPythonBaseVisitor;
import antlr.MONTyPythonParser.ProgContext;

public class AntlrToProgram extends MONTyPythonBaseVisitor<Prog>
{
    public List<String> semanticErros; // Obter erros semanticos encontrados

    @Override
    public Prog visitProg(ProgContext ctx) 
    {
        Prog prog = new Prog();
        semanticErros = new ArrayList<>();

        AntlrToExpression exprVisitor = new AntlrToExpression(semanticErros);

        for (int i = 0; i < ctx.getChildCount() - 1; i++)
        {
            prog.addExpression(exprVisitor.visit(ctx.getChild(i)));
        }

        return prog;
    }
    
}
