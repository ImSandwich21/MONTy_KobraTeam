package app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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

            System.out.println("\nCódigo de origem");
            ImprimirConteudoFicheiro(fileName);

            if(!MyErroListener.hasError)
            {
                // Create a visitor for converting the parse tree into Program/Expression object
                AntlrToProgram progVisitor = new AntlrToProgram();
                Prog prog = progVisitor.visit(antlrAST);

                if(progVisitor.semanticErros.isEmpty())
                {

                    ExpressionProcessor ep = new ExpressionProcessor(prog.expressions);

                    System.out.println("\nCódigo intermediário");
                    for(String codIntermediadrio: ep.getMiddleCode())
                    {
                        System.out.println(codIntermediadrio);
                    }

                    System.out.println("\nCódigo compilado");

                    for(String evaluation: ep.getEvaluationResults())
                    {
                        System.out.println(evaluation);
                    }

                    System.out.println("\n**** Código Assembly ****");

                    for (String assembly : ep.getAssemblyCode(ep.getEvaluationResults())) 
                    {
                        System.out.println(assembly);
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

    private static void ImprimirConteudoFicheiro(String fileName)
    {
        try 
        {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) 
            {
                System.out.println(line);
            }

            bufferedReader.close();
            reader.close();
        }
        catch (FileNotFoundException e)
        {
            System.err.println("Error: File not found: " + fileName);
        }
        catch (IOException e)
        {
            System.err.println("Error reading file: " + fileName);
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
