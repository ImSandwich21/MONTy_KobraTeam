package expression;

public class InputFunction extends Expression
{
    public String type;
    public String id;
    public String msg;

    public InputFunction(String type, String id, String msg)
    {
        this.type = type;
        this.id = id;
        this.msg = msg;
    }

    @Override
    public String toString() 
    {
        return  type + (type.isEmpty() ? "": " ") + id +  " = (" + msg + ")";
    }

    
}
