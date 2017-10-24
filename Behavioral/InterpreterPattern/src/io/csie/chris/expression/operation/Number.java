package io.csie.chris.expression.operation;

import io.csie.chris.expression.common.Expression;

import java.util.Map;

public class Number implements Expression {

    private int number;

    public Number(final int number) {
        this.number = number;
    }

    public int interpret(final Map<String, Expression> variables) {
        return number;
    }
}