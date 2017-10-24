package io.csie.chris.expression;

import java.util.Map;

public class Multiplication implements Expression{

    private Expression leftOperand;

    private Expression rightOperand;

    public Multiplication(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return leftOperand.interpret(variables) * rightOperand.interpret(variables);
    }
}
