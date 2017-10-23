public class ChickenAdapter implements Animal {
    Chicken chicken;

    public ChickenAdapter() {
        chicken = new Chicken();
    }

    @Override
    public void makeSound() {
        chicken.chickenSound();
    }
}
