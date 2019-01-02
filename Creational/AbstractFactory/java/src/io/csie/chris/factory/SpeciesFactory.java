package io.csie.chris.factory;

import io.csie.chris.animal.Animal;

public abstract class SpeciesFactory {

    public abstract Animal getAnimal(String animalType);
}
