package io.csie.chris.expression.operation;

import io.csie.chris.expression.common.Expression;

import java.util.Map;

public class Divide implements Expression {

    private Expression leftOperand;

    private Expression rightOperand;

    public Divide(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return leftOperand.interpret(variables) / rightOperand.interpret(variables);
    }
}
