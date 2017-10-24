package io.csie.chris;

import io.csie.chris.operation.AddOperation;
import io.csie.chris.operation.DividOperation;
import io.csie.chris.operation.MultipleOperation;
import io.csie.chris.operation.SubstractOperation;
import io.csie.chris.operation.common.Context;

public class Main {

    public static void main(String args[]) {

        int number1 = 10, number2 = 5, result;

        // Add
        Context context = new Context(new AddOperation());
        result = context.doStrategy(number1, number2);
        System.out.println("Result: " + result);

        // Sub
        context = new Context(new SubstractOperation());
        result = context.doStrategy(number1, number2);
        System.out.println("Result: " + result);

        // Multiplication
        context = new Context(new MultipleOperation());
        result = context.doStrategy(number1, number2);
        System.out.println("Result: " + result);

        // Divide
        context = new Context(new DividOperation());
        result = context.doStrategy(number1, number2);
        System.out.println("Result: " + result);
    }
}
