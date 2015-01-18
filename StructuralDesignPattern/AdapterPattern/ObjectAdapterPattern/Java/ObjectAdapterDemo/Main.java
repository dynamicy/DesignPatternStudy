public class Main
{
    public static void main(String args[])
    {
        Cat cat = new Cat();
        cat.makeSound();
        
        ChickenAdapter chickenAdapter = new ChickenAdapter();
        chickenAdapter.makeSound();
    }
}
