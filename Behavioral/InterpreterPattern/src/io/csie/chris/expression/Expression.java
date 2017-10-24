package io.csie.chris.expression;

import java.util.Map;

public interface Expression {

    int interpret(final Map<String, Expression> variables);
}