package io.csie.chris.animal;

import io.csie.chris.animal.common.AnimalType;

public class Cat extends Animal {

    @Override
    public String makeSound() {
        return AnimalType.Cat.getSound();
    }
}
