package io.csie.chris.expression;

import java.util.Map;

public class Plus implements Expression {

    private Expression leftOperand;

    private Expression rightOperand;

    public Plus(final Expression left, final Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    public int interpret(final Map<String, Expression> variables) {
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}