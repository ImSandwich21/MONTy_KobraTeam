package expression;

import java.util.Map;

public class FloatDeclaration extends Expression 
{
    public Map<String, Number> variaveis;

    public FloatDeclaration(Map<String, Number> variaveis)
    {
        this.variaveis = variaveis;
    }

    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Number> value : variaveis.entrySet()) 
        {
            sb.append("float ").append(value.getKey()).append(" = ").append(value.getValue()).append("\n");
        }
        sb.delete(sb.length() - 1, sb.length()); // Remover último 'ENTER'

        return sb.toString();
    }
}
