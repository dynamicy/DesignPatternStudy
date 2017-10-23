package io.csie.chris.factory;

import io.csie.chris.animal.Animal;
import io.csie.chris.animal.Fox;

public class FoxFactory implements IAnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Fox();
    }
}
