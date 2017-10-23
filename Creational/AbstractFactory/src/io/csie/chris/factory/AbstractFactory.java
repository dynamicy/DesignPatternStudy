package io.csie.chris.factory;

import io.csie.chris.animal.common.SpeciesType;

public class AbstractFactory {

    public SpeciesFactory getSpeciesFactory(String type) {
        if (SpeciesType.Mammal.name().equals(type)) {
            return new MammalFactory();
        } else {
            return new ReptileFactory();
        }
    }
}
