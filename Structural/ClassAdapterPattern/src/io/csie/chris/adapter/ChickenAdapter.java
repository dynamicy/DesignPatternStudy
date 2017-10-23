package io.csie.chris.adapter;

import io.csie.chris.animal.Animal;
import io.csie.chris.animal.Chicken;

public class ChickenAdapter extends Chicken implements Animal {

    @Override
    public void makeSound() {
        chickenSound();
    }
}
