public class AnimalFactory
{
    // Create the instance by parameter
    public Animal getAnimal(String animalType)
    {
        if("canine".equals(animalType))
        {
            return new Dog();
        }
        else if("feline".equals(animalType))
        {
            return new Cat();
        }
        else
        {
            return new Lion();
        }
    }
}
