package io.csie.chris;

import io.csie.chris.animal.Animal;
import io.csie.chris.animal.common.AnimalType;
import io.csie.chris.factory.AnimalFactory;

public class Main {

    public static void main(String args[]) {

        Animal animal1 = AnimalFactory.createAnimal(AnimalType.Dog.getName());
        System.out.println(animal1.makeSound());

        Animal animal2 = AnimalFactory.createAnimal(AnimalType.Cat.getName());
        System.out.println(animal2.makeSound());

        Animal animal3 = AnimalFactory.createAnimal(AnimalType.Fox.getName());
        System.out.println(animal3.makeSound());

        Animal animal4 = AnimalFactory.createAnimal(AnimalType.Monster.getName());
        System.out.println(animal4.makeSound());
    }
}
