package io.csie.chris.animal;

import io.csie.chris.animal.common.AnimalType;

public class Lion extends Animal {

    @Override
    public String makeSound() {
        return AnimalType.Lion.getSound();
    }
}
