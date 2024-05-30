package expression;

import java.util.List;

public class FuncCall extends Expression 
{
    public String id;
    public List<Expression> parametros;

    public FuncCall(String id, List<Expression> parametros)
    {
        this.id = id;
        this.parametros = parametros;
    }

    private String getParametersString()
    {
        StringBuilder sb = new StringBuilder();
        for (Expression parametro : parametros) {
            sb.append(parametro.toString()).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());

        return sb.toString();
    }

    @Override
    public String toString() 
    {
        return id + "(" + getParametersString() + ")";
    }

    
}
