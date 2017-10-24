package io.csie.chris;

import io.csie.chris.expression.*;

import java.util.Map;
import java.util.Stack;

public class Evaluator implements Expression {

    private Expression syntaxTree;

    Evaluator(final String expression) {

        final Stack<Expression> expressionStack = new Stack<>();

        for (final String token : expression.split(" ")) {
            switch (token) {
                case "+":
                    final Expression addExpression = new Plus(expressionStack.pop(), expressionStack.pop());
                    expressionStack.push(addExpression);
                    break;
                case "-":
                    // it's necessary remove first the right operand from the stack
                    final Expression right = expressionStack.pop();
                    // ..and after the left one
                    final Expression left = expressionStack.pop();
                    final Expression subExpression = new Minus(left, right);
                    expressionStack.push(subExpression);
                    break;
                case "*":
                    final Expression multiExpression = new Multiplication(expressionStack.pop(), expressionStack.pop());
                    expressionStack.push(multiExpression);
                    break;
                default:
                    expressionStack.push(new Variable(token));
                    break;
            }
        }
        syntaxTree = expressionStack.pop();
    }

    public int interpret(final Map<String, Expression> context) {
        return syntaxTree.interpret(context);
    }
}