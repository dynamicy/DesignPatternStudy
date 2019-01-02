package io.csie.chris.factory;

import io.csie.chris.animal.Animal;
import io.csie.chris.animal.common.AnimalType;
import io.csie.chris.animal.Cat;
import io.csie.chris.animal.Dog;

public class MammalFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String animalType) {
        if (AnimalType.Dog.name().equals(animalType)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
