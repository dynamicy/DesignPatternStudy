public class Main {
    public static void main(String args[]) {
        Animal lion = new Lion();
        lion.makeSound();

        Animal chickenAdapter = new ChickenAdapter();
        chickenAdapter.makeSound();
    }
}
