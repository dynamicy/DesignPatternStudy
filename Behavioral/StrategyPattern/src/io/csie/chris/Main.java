package io.csie.chris;

import io.csie.chris.operation.AddOperation;
import io.csie.chris.operation.SubstractOperation;
import io.csie.chris.operation.common.Context;

public class Main {

    public static void main(String args[]) {

        int number1 = 10, number2 = 5, result;
        Context context = new Context(new AddOperation());
        result = context.doStrategy(number1, number2);

        System.out.println("Result: " + result);


        context = new Context(new SubstractOperation());
        context.doStrategy(number1, number2);
        result = context.doStrategy(number1, number2);

        System.out.println("Result: " + result);
    }
}
