package io.csie.chris;

import io.csie.chris.expression.common.Expression;
import io.csie.chris.expression.operation.Number;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(final String[] args) {

        final String expression = "t u v w x z - + * / ^";

        final Evaluator sentence = new Evaluator(expression);

        final Map<String, Expression> variables = new HashMap<>();

        variables.put("t", new Number(3));
        variables.put("u", new Number(-108));
        variables.put("v", new Number(2));
        variables.put("w", new Number(5));
        variables.put("x", new Number(10));
        variables.put("z", new Number(42));

        final int result = sentence.interpret(variables);

        System.out.println(result);
    }
}
