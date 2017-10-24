package io.csie.chris.expression.operation;

import io.csie.chris.expression.common.Expression;

import java.util.Map;

public class Minus implements Expression {

    private Expression leftOperand;

    private Expression rightOperand;

    public Minus(final Expression left, final Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    public int interpret(final Map<String, Expression> variables) {
        return leftOperand.interpret(variables) - rightOperand.interpret(variables);
    }
}
