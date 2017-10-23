package io.csie.chris;

import io.csie.chris.animal.Animal;
import io.csie.chris.animal.common.AnimalType;
import io.csie.chris.animal.common.SpeciesType;
import io.csie.chris.factory.AbstractFactory;
import io.csie.chris.factory.SpeciesFactory;

public class Main {
    public static void main(String args[]) {
        AbstractFactory abstractFactory = new AbstractFactory();

        SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(SpeciesType.Reptile.name());
        Animal animal1 = speciesFactory1.getAnimal(AnimalType.Tyrannosaurus.name());
        System.out.println("Animal1: " + animal1.makeSound());

        Animal animal2 = speciesFactory1.getAnimal(AnimalType.Snake.name());
        System.out.println("Animal2: " + animal2.makeSound());

        SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(SpeciesType.Mammal.name());
        Animal animal3 = speciesFactory2.getAnimal(AnimalType.Dog.name());
        System.out.println("Animal3: " + animal3.makeSound());

        Animal animal4 = speciesFactory2.getAnimal(AnimalType.Cat.name());
        System.out.println("Animal4: " + animal4.makeSound());
    }
}
