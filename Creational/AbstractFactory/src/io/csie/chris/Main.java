package io.csie.chris;

import io.csie.chris.animal.Animal;
import io.csie.chris.animal.common.AnimalType;
import io.csie.chris.animal.common.SpeciesType;
import io.csie.chris.factory.AbstractFactory;
import io.csie.chris.factory.SpeciesFactory;

public class Main {

    public static void main(String args[]) {

        AbstractFactory abstractFactory = new AbstractFactory();

        SpeciesFactory reptileFactory = abstractFactory.getSpeciesFactory(SpeciesType.Reptile.name());
        Animal tyrannosaurus = reptileFactory.getAnimal(AnimalType.Tyrannosaurus.name());
        System.out.println("Animal1: " + tyrannosaurus.makeSound());

        Animal snake = reptileFactory.getAnimal(AnimalType.Snake.name());
        System.out.println("Animal2: " + snake.makeSound());

        SpeciesFactory mammalFactory = abstractFactory.getSpeciesFactory(SpeciesType.Mammal.name());
        Animal dog = mammalFactory.getAnimal(AnimalType.Dog.name());
        System.out.println("Animal3: " + dog.makeSound());

        Animal cat = mammalFactory.getAnimal(AnimalType.Cat.name());
        System.out.println("Animal4: " + cat.makeSound());
    }
}
