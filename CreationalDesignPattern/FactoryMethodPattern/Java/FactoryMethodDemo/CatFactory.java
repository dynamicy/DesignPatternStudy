/**
 * Created by chris on 12/3/14.
 */
public class CatFactory implements IAnimalFactory
{
    @Override
    public Animal createAnimal()
    {
        return new Cat();
    }
}
