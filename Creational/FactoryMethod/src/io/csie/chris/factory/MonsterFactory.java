package io.csie.chris.factory;

import io.csie.chris.animal.Animal;
import io.csie.chris.animal.Monster;

public class MonsterFactory implements IAnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Monster();
    }
}
