package expression;

import java.util.Map;

public class IntDeclaration extends Expression
{
    public Map<String, Integer> variaveis;

    public IntDeclaration(Map<String, Integer> variaveis)
    {
        this.variaveis = variaveis;
    }

    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> value : variaveis.entrySet()) 
        {
            sb.append("int ").append(value.getKey()).append(" = ").append(value.getValue()).append("\n");
        }
        sb.delete(sb.length() - 1, sb.length()); // Remover último 'ENTER'

        return sb.toString();
    }
}
