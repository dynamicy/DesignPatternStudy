package io.csie.chris;

import io.csie.chris.adapter.ChickenAdapter;
import io.csie.chris.animal.Cat;

public class Main {

    public static void main(String args[]) {

        Cat cat = new Cat();
        cat.makeSound();

        ChickenAdapter chickenAdapter = new ChickenAdapter();
        chickenAdapter.makeSound();
    }
}
