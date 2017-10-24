package io.csie.chris;

import io.csie.chris.expression.*;
import io.csie.chris.expression.common.Expression;
import io.csie.chris.expression.operation.*;

import java.util.Map;
import java.util.Stack;

public class Evaluator implements Expression {

    private Expression syntaxTree;

    Evaluator(final String expression) {

        final Stack<Expression> expressionStack = new Stack<>();

        Expression rightOperand;
        Expression leftOperand;
        Expression subExpression;

        for (final String token : expression.split(" ")) {
            switch (token) {
                case "+":
                    subExpression = new Plus(expressionStack.pop(), expressionStack.pop());
                    expressionStack.push(subExpression);
                    break;
                case "-":
                    rightOperand = expressionStack.pop();
                    leftOperand = expressionStack.pop();
                    subExpression = new Minus(leftOperand, rightOperand);
                    expressionStack.push(subExpression);
                    break;
                case "*":
                    subExpression = new Multiplication(expressionStack.pop(), expressionStack.pop());
                    expressionStack.push(subExpression);
                    break;
                case  "/":
                    rightOperand = expressionStack.pop();
                    leftOperand = expressionStack.pop();
                    subExpression = new Divide(leftOperand, rightOperand);
                    expressionStack.push(subExpression);
                    break;
                case "^":
                    rightOperand = expressionStack.pop();
                    leftOperand = expressionStack.pop();
                    subExpression = new Power(leftOperand, rightOperand);
                    expressionStack.push(subExpression);
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