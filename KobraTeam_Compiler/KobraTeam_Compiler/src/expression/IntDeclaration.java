package expression;

public class IntDeclaration extends Expression
{
    public String type;
    public String id;
    public int value;

    public IntDeclaration(String type, String id, int value)
    {
        this.id = id;
        this.type = type;
        this.value = value;
    }
}
