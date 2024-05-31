package expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpressionProcessor 
{
    List<Expression> list;
    public Map<String, Number> variaveisValor;
    public Map<String, String> variaveisTipo;
    public Map<String, List<Number>> variaveisLista;

    public List<String> codigoIntermediario;

    public ExpressionProcessor(List<Expression> list)
    {
        this.list = list;
        variaveisValor = new HashMap<>();
        variaveisTipo = new HashMap<>();
        variaveisLista = new HashMap<>();
        codigoIntermediario = new ArrayList<>();
    }

    public List<String> getEvaluationResults()
    {
        List<String> evaluations = new ArrayList<>();

        for (Expression e: list)
        {
            if (e instanceof IntDeclaration)
            {
                IntDeclaration decl = (IntDeclaration) e;
                for(Map.Entry<String, Integer> variavel: decl.variaveis.entrySet())
                {
                    variaveisValor.put(variavel.getKey(), variavel.getValue());
                    variaveisTipo.put(variavel.getKey(), "int");
                }
                
                evaluations.add(decl.toString());
            }
            else if(e instanceof FloatDeclaration)
            {
                FloatDeclaration decl = (FloatDeclaration) e;
                for(Map.Entry<String, Number> variavel: decl.variaveis.entrySet())
                {
                    variaveisValor.put(variavel.getKey(), variavel.getValue());
                    variaveisTipo.put(variavel.getKey(), "float");
                }
                evaluations.add(decl.toString());
            }
            else if(e instanceof ListDeclaration)
            {
                ListDeclaration decl = (ListDeclaration) e;

                variaveisTipo.put(decl.id, decl.type + "[]");
                variaveisLista.put(decl.id, new ArrayList<>());
            }
            else if(e instanceof VariableAssign)
            {
                VariableAssign va = (VariableAssign) e;

                if (!variaveisTipo.containsKey(va.id))
                {
                    variaveisTipo.put(va.id, "float");
                }
                Number resultado = getEvalResult(va.value, evaluations);
                variaveisValor.put(va.id, variaveisTipo.get(va.id) == "int" ? resultado.intValue() : resultado);
            }
            else if(e instanceof ListAssign)
            {
                ListAssign la = (ListAssign) e;

                if (!variaveisTipo.containsKey(la.id))
                {
                    variaveisTipo.put(la.id, "float[]");
                }
                variaveisLista.put(la.id, la.values);
            }
            else if(e instanceof ListAdd)
            {
                ListAdd la = (ListAdd) e;

                int posicao = getEvalResult(la.position, evaluations).intValue();
                int valor = getEvalResult(la.value, evaluations).intValue();

                if (posicao == variaveisLista.get(la.id).size())
                {
                    variaveisLista.get(la.id).add(valor);
                }
                else if (posicao < variaveisLista.get(la.id).size() && posicao >= 0)
                {
                    variaveisLista.get(la.id).set(posicao, valor);
                }
                else
                {
                    evaluations.add("Value of " + posicao + " is out of range.");
                }
            }
            else if(e instanceof ListRemove)
            {
                ListRemove lr = (ListRemove) e;

                int posicao = lr.position;

                if (posicao >= 0 && posicao < variaveisLista.get(lr.id).size())
                {
                    variaveisLista.get(lr.id).remove(posicao);
                }
                else
                {
                    evaluations.add("Value of " + posicao + " is out of range.");
                }
            }
            else if(e instanceof InputFunction)
            {
                InputFunction iFunc = (InputFunction) e;
                
                if (!variaveisTipo.containsKey(iFunc.id))
                {
                    variaveisTipo.put(iFunc.id, "float");
                }

                variaveisValor.put(iFunc.id, 0);
            }
        }

        return null;
    }

    private Number getEvalResult(Expression e, List<String> evaluations)
    {
        Number result = 0;

        if (e instanceof Inteiro)
        {
            Inteiro i = (Inteiro) e;
            result = i.value;
        }
        else if (e instanceof Flutuante)
        {
            Flutuante f = (Flutuante) e;
            result = f.value;
        }
        else if (e instanceof Variable)
        {
            Variable v = (Variable) e;
            result = variaveisValor.get(v.id);
        }
        else if (e instanceof ListIndex)
        {
            ListIndex li = (ListIndex) e;

            if (li.index < 0 || li.index >= variaveisLista.get(li.id).size())
            {
                evaluations.add("Value of " + li.index + " out of range.");
            }
            else
            {
                result = variaveisLista.get(li.id).get(li.index);
            }
        }
        else if (e instanceof Logical)
        {
            Logical l = (Logical) e;

            Number left = getEvalResult(l.left, evaluations);
            Number right = getEvalResult(l.right, evaluations);

            if (l.operator == "AND")
            {
                return (left.intValue() > 0 && right.intValue() > 0) ? 1 : 0;
            }
            else
            {
                return (left.intValue() > 0 || right.intValue() > 0) ? 1 : 0;
            }
        }
        else if (e instanceof Relational)
        {
            Relational r = (Relational) e;
            Number left = getEvalResult(r.left, evaluations);
            Number right = getEvalResult(r.right, evaluations);

            switch (r.operator) 
            {
                case "<":
                    return left.intValue() < right.intValue() ? 1 : 0;
                case "<=":
                    return left.intValue() <= right.intValue() ? 1 : 0;
                case ">":
                    return left.intValue() > right.intValue() ? 1 : 0;
                case ">=":
                    return left.intValue() >= right.intValue() ? 1 : 0;
                case "!=": 
                    return left.intValue() != right.intValue() ? 1 : 0;
                case "==":
                    return left.intValue() == right.intValue() ? 1 : 0;            
                default:
                    break;
            }
        }
        else if (e instanceof UnaryOp)
        {
            UnaryOp u = (UnaryOp) e;
            Number left = getEvalResult(u.left, evaluations);
            Number right = getEvalResult(u.right, evaluations);

            if (u.operator == "-")
            {
                return (left.floatValue() - right.floatValue());
            }
            else
            {
                return (left.floatValue() + right.floatValue());
            }
        }
        else if (e instanceof MultDiv)
        {
            MultDiv md = (MultDiv) e;
            Number left = getEvalResult(md.left, evaluations);
            Number right = getEvalResult(md.right, evaluations);

            switch (md.operator) 
            {
                case "*":
                    return left.floatValue() * right.floatValue();
                case "/":
                    return left.floatValue() / right.floatValue();
                case "%":
                    if (left instanceof Integer && right instanceof Integer)
                    {
                        return (Integer) (left.intValue() % right.intValue());
                    }
                    else
                    {
                        evaluations.add("Both values must be of Type Integer (" + left.toString() + ", " + right.toString() + ")");
                    }
                case "//":
                    if (left instanceof Integer && right instanceof Integer)
                    {
                        return (Integer) (left.intValue() / right.intValue());
                    }
                    else
                    {
                        evaluations.add("Both values must be of Type Integer (" + left.toString() + ", " + right.toString() + ")");
                    }
                default:
                    break;
            }
        }
        else if (e instanceof Pow)
        {
            Pow p = (Pow) e;
            Number left = getEvalResult(p.left, evaluations);
            Number right = getEvalResult(p.rigth, evaluations);

            return Math.pow(left.doubleValue(), right.doubleValue());
        }
        else if (e instanceof GroupExp)
        {
            GroupExp ge = (GroupExp) e;

            if (ge.negado)
            {
                return (getEvalResult(ge.expression, evaluations).intValue() > 0 ? 0 : 1);
            }
            else
            {
                return getEvalResult(ge.expression, evaluations);
            }
        }

        return result;
    }
}
