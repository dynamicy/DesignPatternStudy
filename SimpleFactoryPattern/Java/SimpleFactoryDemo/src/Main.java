public class Main
{
    public static void main(String args[])
    {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal1 = animalFactory.getAnimal("canine");
        System.out.println(animal1.makeSound());

        Animal animal2 = animalFactory.getAnimal("feline");
        System.out.println(animal2.makeSound());

        Animal animal3 = animalFactory.getAnimal("xxxxxx");
        System.out.println(animal3.makeSound());
    }
}
