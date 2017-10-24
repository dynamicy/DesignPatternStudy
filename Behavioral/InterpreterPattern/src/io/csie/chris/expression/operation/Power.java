package io.csie.chris.expression.operation;

import io.csie.chris.expression.common.Expression;

import java.util.Map;

public class Power implements Expression {

    private Expression leftOperand;

    private Expression rightOperand;

    public Power(final Expression left, final Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return (int) Math.pow((double) leftOperand.interpret(variables), (double) rightOperand.interpret(variables));
    }
}
