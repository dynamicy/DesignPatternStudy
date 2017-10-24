package io.csie.chris.expression;

import io.csie.chris.expression.common.Expression;

import java.util.Map;

public class Variable implements Expression {

    private String name;

    public Variable(final String name) {
        this.name = name;
    }

    public int interpret(final Map<String, Expression> variables) {
        if (null == variables.get(name))
            return 0; // Either return new Number(0).

        return variables.get(name).interpret(variables);
    }
}