package io.csie.chris.animal;

import io.csie.chris.animal.common.AnimalType;

public class Tyrannosaurus extends Animal {

    @Override
    public String makeSound() {
        return AnimalType.Tyrannosaurus.getSound();
    }
}
