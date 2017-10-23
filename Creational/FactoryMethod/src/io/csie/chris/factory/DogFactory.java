package io.csie.chris.factory;

import io.csie.chris.animal.Animal;
import io.csie.chris.animal.Dog;

public class DogFactory implements IAnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
