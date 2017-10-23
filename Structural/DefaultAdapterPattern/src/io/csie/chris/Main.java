package io.csie.chris;

import io.csie.chris.adapte.ChickenAdapter;
import io.csie.chris.animal.Animal;
import io.csie.chris.animal.Cat;
import io.csie.chris.animal.Lion;

public class Main {

    public static void main(String args[]) {

        Animal lion = new Lion();
        lion.makeSound();

        Animal cat = new Cat();
        cat.makeSound();

        Animal chickenAdapter = new ChickenAdapter();
        chickenAdapter.makeSound();
    }
}
