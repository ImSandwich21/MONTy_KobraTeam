package expression;

public class ListDeclaration extends Expression
{
    public String type;
    public String id;

    public ListDeclaration(String type, String id)
    {
        this.type = type;
        this.id = id;
    }

    @Override
    public String toString() 
    {
        return type + "[]" + " " + id;
    }

}
