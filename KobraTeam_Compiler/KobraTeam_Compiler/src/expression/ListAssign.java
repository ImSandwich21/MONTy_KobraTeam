package expression;

import java.util.List;

public class ListAssign extends Expression
{
    public String id;
    public List<Integer> values;

    public ListAssign(String id, List<Integer> values)
    {
        this.id = id;
        this.values = values;
    }

    private String getValuesString()
    {
        StringBuilder sb = new StringBuilder();
        for (Integer value : values) {
            sb.append(value).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());

        return sb.toString();
    }

    @Override
    public String toString() 
    {
        return id + " = [" + getValuesString() + "]";
    }

    
}
