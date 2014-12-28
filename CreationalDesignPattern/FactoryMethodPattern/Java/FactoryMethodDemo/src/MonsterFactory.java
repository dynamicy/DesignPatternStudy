public class MonsterFactory implements IAnimalFactory
{
    @Override
    public Animal createAnimal()
    {
        return new Monster();
    }
}
