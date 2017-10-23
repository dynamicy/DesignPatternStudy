package io.csie.chris.animal.common;

public enum AnimalType {

    Cat("Meow", SpeciesType.Mammal),

    Dog("Bark", SpeciesType.Mammal),

    Lion("Howl", SpeciesType.Mammal),

    Snake("Hsi", SpeciesType.Reptile),

    Tyrannosaurus("Haou", SpeciesType.Reptile);

    private String sound;

    private SpeciesType speciesType;

    AnimalType(String sound, SpeciesType speciesType) {
        this.sound = sound;
        this.speciesType = speciesType;
    }

    public String getSound() {
        return this.sound;
    }

    public SpeciesType getSpeciesType() {
        return speciesType;
    }
}
