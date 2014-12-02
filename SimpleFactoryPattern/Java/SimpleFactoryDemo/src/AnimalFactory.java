import com.sun.istack.internal.Nullable;

public class AnimalFactory
{
    // Create the instance by parameter, and it's a static method
    public static Animal createAnimal(String animalType)
    {
        Animal animal = null;

        if (animalType.equals("canine"))
        {
            animal = new Dog();
        }
        else if (animalType.equals("feline"))
        {
            animal = new Cat();
        }
        else if (animalType.equals("vulpine"))
        {
            animal = new Fox();
        }
        else
        {
            animal = new Monster();
        }
        return animal;
    }
}
