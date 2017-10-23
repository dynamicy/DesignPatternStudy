package io.csie.chris.animal;

import io.csie.chris.animal.common.AnimalType;

public class Dog extends Animal {

    @Override
    public String makeSound() {
        return AnimalType.Dog.getSound();
    }
}