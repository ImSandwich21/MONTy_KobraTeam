package expression;

import java.util.ArrayList;
import java.util.List;

public class Prog 
{
    public List<Expression> expressions;

    public Prog()
    {
        this.expressions = new ArrayList<>();
    }

    public void addExpression(Expression e)
    {
        expressions.add(e);
    }
}
