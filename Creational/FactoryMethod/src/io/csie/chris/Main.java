package io.csie.chris;

import io.csie.chris.animal.Animal;
import io.csie.chris.factory.*;

public class Main {

    public static void main(String args[]) {

        // Created by io.csie.chris.animal.Dog factory
        IAnimalFactory animalFactory1 = new DogFactory();
        Animal animal1 = animalFactory1.createAnimal();
        System.out.println(animal1.makeSound());

        // Created by io.csie.chris.animal.Cat factory
        IAnimalFactory animalFactory2 = new CatFactory();
        Animal animal2 = animalFactory2.createAnimal();
        System.out.println(animal2.makeSound());

        // Created by io.csie.chris.animal.Fox factory
        IAnimalFactory animalFactory3 = new FoxFactory();
        Animal animal3 = animalFactory3.createAnimal();
        System.out.println(animal3.makeSound());

        // Created by io.csie.chris.animal.Monster factory
        IAnimalFactory animalFactory4 = new MonsterFactory();
        Animal animal4 = animalFactory4.createAnimal();
        System.out.println(animal4.makeSound());
    }
}