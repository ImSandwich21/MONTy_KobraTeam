package app;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.MONTyPythonLexer;
import antlr.MONTyPythonParser;
import expression.AntlrToProgram;
import expression.ExpressionProcessor;
import expression.MyErroListener;
import expression.Prog;

public class MONTyPythonApp 
{
    public static void main(String[] args)
    {
        if (args.length != 1)
        {
            System.err.println("Usage: file name");;
        }
        else
        {
            String fileName = args[0];
            MONTyPythonParser parser = getParser(fileName);

            ParseTree antlrAST = parser.program();
            
            if(!MyErroListener.hasError)
            {
                // Create a visitor for converting the parse tree into Program/Expression object
                AntlrToProgram progVisitor = new AntlrToProgram();
                Prog prog = progVisitor.visit(antlrAST);

                if(progVisitor.semanticErros.isEmpty())
                {
                    ExpressionProcessor ep = new ExpressionProcessor(prog.expressions);

                    for(String evaluation: ep.getEvaluationResults())
                    {
                        System.out.println(evaluation);
                    }
                }
                else
                {
                    for(String err: progVisitor.semanticErros)
                    {
                        System.out.println(err);
                    }
                }
            }
        }
    }

    private static MONTyPythonParser getParser(String fileName)
    {
        MONTyPythonParser parser = null;

        try
        {
            CharStream input = CharStreams.fromFileName(fileName);
            MONTyPythonLexer lexer = new MONTyPythonLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new MONTyPythonParser(tokens);

            parser.removeErrorListeners();
            parser.addErrorListener(new MyErroListener());

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        return parser;
    }
}
