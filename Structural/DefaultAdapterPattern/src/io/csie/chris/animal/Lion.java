package io.csie.chris.animal;

import io.csie.chris.animal.common.AnimalSound;

public class Lion extends Animal {

    @Override
    public void makeSound() {
        System.out.println(AnimalSound.Lion.getSound());
    }
}
