package io.csie.chris;

import io.csie.chris.expression.*;
import io.csie.chris.expression.common.Expression;
import io.csie.chris.expression.operation.Divide;
import io.csie.chris.expression.operation.Minus;
import io.csie.chris.expression.operation.Multiplication;
import io.csie.chris.expression.operation.Plus;

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
                case  "/":
                    final Expression rightOperand = expressionStack.pop();
                    final Expression leftOperand = expressionStack.pop();
                    final Expression divideExpression = new Divide(leftOperand, rightOperand);
                    expressionStack.push(divideExpression);
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