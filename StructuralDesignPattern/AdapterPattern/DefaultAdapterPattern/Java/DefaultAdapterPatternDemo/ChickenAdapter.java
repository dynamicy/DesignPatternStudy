public class ChickenAdapter extends Animal {
    private Chicken chicken = new Chicken();

    @Override
    public void makeSound() {
        chicken.chickenSound();
    }
}
