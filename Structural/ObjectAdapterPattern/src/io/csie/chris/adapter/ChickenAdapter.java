package io.csie.chris.adapter;

import io.csie.chris.animal.Animal;
import io.csie.chris.animal.Chicken;

public class ChickenAdapter implements Animal {

    private Chicken chicken;

    public ChickenAdapter() {
        chicken = new Chicken();
    }

    @Override
    public void makeSound() {
        chicken.chickenSound();
    }
}
