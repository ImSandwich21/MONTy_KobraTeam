package expression;

import java.util.Map;
import java.util.TreeMap;

public class PrintFunction extends Expression
{
    public Map<Integer, String> parametros1;
    public Map<Integer, Expression> parametros2;

    public PrintFunction(Map<Integer, String> parametros1, Map<Integer, Expression> parametros2)
    {
        this.parametros1 = parametros1;
        this.parametros2 = parametros2;
    }

    private String getParametrosString()
    {
        TreeMap<Integer, String> params = new TreeMap<>();

        for (Map.Entry<Integer, String> param : parametros1.entrySet()) 
        {
            params.put(param.getKey(), param.getValue());
        }
        for (Map.Entry<Integer, Expression> param : parametros2.entrySet()) 
        {
            params.put(param.getKey(), param.getValue().toString());
        }

        StringBuilder sb = new StringBuilder();
        for (String value : params.values()) {
            sb.append(value).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());

        return sb.toString();
    }

    @Override
    public String toString() 
    {
        return "print (" + getParametrosString() + ")";
    }

    
}
