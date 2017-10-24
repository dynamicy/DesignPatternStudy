package io.csie.chris;

import io.csie.chris.animal.Animal;
import io.csie.chris.factory.*;

public class Main {

    public static void main(String args[]) {

        IAnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        System.out.println(dog.makeSound());

        IAnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        System.out.println(cat.makeSound());

        IAnimalFactory foxFactory = new FoxFactory();
        Animal fox = foxFactory.createAnimal();
        System.out.println(fox.makeSound());

        IAnimalFactory monsterFactory = new MonsterFactory();
        Animal monster = monsterFactory.createAnimal();
        System.out.println(monster.makeSound());
    }
}