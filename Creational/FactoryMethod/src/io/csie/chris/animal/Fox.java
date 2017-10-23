package io.csie.chris.animal;

import io.csie.chris.animal.common.AnimalType;

public class Fox extends Animal {

    @Override
    public String makeSound() {
        return AnimalType.Fox.getSound();
    }
}