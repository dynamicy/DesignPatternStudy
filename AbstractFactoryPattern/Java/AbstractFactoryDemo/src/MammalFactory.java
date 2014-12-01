public class MammalFactory extends SpeciesFactory
{
    @Override
    public Animal getAnimal(String animalType)
    {
        if ("dog".equals(animalType))
        {
            return new Dog();
        }
        else
        {
            return new Cat();
        }
    }
}
