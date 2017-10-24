package io.csie.chris.expression.common;

import java.util.Map;

public interface Expression {

    int interpret(final Map<String, Expression> variables);
}