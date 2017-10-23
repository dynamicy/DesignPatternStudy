public class Main {
    public static void main(String args[]) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal1 = animalFactory.createAnimal("canine");
        System.out.println(animal1.makeSound());

        Animal animal2 = animalFactory.createAnimal("feline");
        System.out.println(animal2.makeSound());

        Animal animal3 = animalFactory.createAnimal("vulpine");
        System.out.println(animal3.makeSound());

        Animal animal4 = animalFactory.createAnimal("xxxxxxx");
        System.out.println(animal4.makeSound());
    }
}
