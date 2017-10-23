package io.csie.chris.factory;

import io.csie.chris.animal.*;
import io.csie.chris.animal.common.AnimalType;

public class AnimalFactory {

    // Create the instance by parameter, and it's a static method
    public static Animal createAnimal(String animalType) {

        Animal animal;

        if (animalType.equals(AnimalType.Dog.getName())) {
            animal = new Dog();
        } else if (animalType.equals(AnimalType.Cat.getName())) {
            animal = new Cat();
        } else if (animalType.equals(AnimalType.Fox.getName())) {
            animal = new Fox();
        } else {
            animal = new Monster();
        }

        return animal;
    }
}
