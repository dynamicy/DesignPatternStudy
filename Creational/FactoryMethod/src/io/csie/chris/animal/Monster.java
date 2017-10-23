package io.csie.chris.animal;

import io.csie.chris.animal.common.AnimalType;

public class Monster extends Animal {

    @Override
    public String makeSound() {
        return AnimalType.Monster.getSound();
    }
}
