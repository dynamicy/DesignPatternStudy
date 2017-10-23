package io.csie.chris.adapte;

import io.csie.chris.animal.Animal;
import io.csie.chris.animal.Chicken;

public class ChickenAdapter extends Animal {

    private Chicken chicken = new Chicken();

    @Override
    public void makeSound() {
        chicken.chickenSound();
    }
}
