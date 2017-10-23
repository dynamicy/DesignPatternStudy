package io.csie.chris.animal;

import io.csie.chris.animal.common.AnimalSound;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println(AnimalSound.Cat.getSound());
    }
}
