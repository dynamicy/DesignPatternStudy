public class DogFactory implements IAnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
