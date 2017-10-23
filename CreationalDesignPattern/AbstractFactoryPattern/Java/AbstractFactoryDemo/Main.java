public class Main {
    public static void main(String args[]) {
        AbstractFactory abstractFactory = new AbstractFactory();

        SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory("reptile");
        Animal animal1 = speciesFactory1.getAnimal("tyrannosaurus");
        System.out.println("Animal1: " + animal1.makeSound());
        Animal animal2 = speciesFactory1.getAnimal("snake");
        System.out.println("Animal2: " + animal2.makeSound());

        SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory("mammal");
        Animal animal3 = speciesFactory2.getAnimal("dog");
        System.out.println("Animal3: " + animal3.makeSound());
        Animal animal4 = speciesFactory2.getAnimal("cat");
        System.out.println("Animal4: " + animal4.makeSound());
    }
}
