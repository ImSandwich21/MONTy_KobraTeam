package interfaces;

import expression.FloatDeclaration;
import expression.Flutuante;
import expression.FuncCall;
import expression.InputFunction;
import expression.IntDeclaration;
import expression.Inteiro;
import expression.ListDeclaration;
import expression.PrintFunction;
import expression.VariableAssign;
import expression.WhileInstrunction;
import expression.GroupExp;
import expression.ListIndex;
import expression.Logical;
import expression.MultDiv;
import expression.Pow;
import expression.Relational;
import expression.UnaryOp;
import expression.Variable;

public interface ExpressionVisitor<T> {
    T visitFuncCall(FuncCall funcCall);
    T visitIntDeclaration(IntDeclaration intDeclaration);
    T visitFloatDeclaration(FloatDeclaration floatDeclaration);
    T visitListDeclaration(ListDeclaration listDeclaration);
    T visitInputFunction(InputFunction inputFunction);
    T visitVariableAssign(VariableAssign variableAssign);
    T visitPrintFunction(PrintFunction printFunction);
    T visitUnaryOp(UnaryOp unaryOp);
    T visitVariable(Variable variable);
    T visitMultDiv(MultDiv multDiv);
    T visitPow(Pow pow);
    T visitGroupExp(GroupExp groupExp);
    T visitWhileInstrunction(WhileInstrunction whileInstrunction);
    T visitRelational(Relational relational);
    T visitLogical(Logical logical);
    T visitListIndex(ListIndex listIndex);
    T visitFlutuante(Flutuante flutuante);
    T visitInteiro(Inteiro inteiro);
}
