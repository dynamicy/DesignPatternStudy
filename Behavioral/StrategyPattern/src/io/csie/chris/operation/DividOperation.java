package io.csie.chris.operation;

import io.csie.chris.operation.common.IStrategy;

public class DividOperation implements IStrategy {

    @Override
    public int doOperation(int number1, int number2) {
        return number1 / number2;
    }
}
