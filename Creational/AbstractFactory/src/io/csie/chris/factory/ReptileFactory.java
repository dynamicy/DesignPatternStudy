package io.csie.chris.factory;

import io.csie.chris.animal.Animal;
import io.csie.chris.animal.common.AnimalType;
import io.csie.chris.animal.Snake;
import io.csie.chris.animal.Tyrannosaurus;

public class ReptileFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String animalType) {
        if (AnimalType.Snake.name().equals(animalType)) {
            return new Snake();
        } else {
            return new Tyrannosaurus();
        }
    }
}
