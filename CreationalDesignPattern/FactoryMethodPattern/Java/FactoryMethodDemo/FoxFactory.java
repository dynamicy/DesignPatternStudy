public class FoxFactory implements IAnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Fox();
    }
}
