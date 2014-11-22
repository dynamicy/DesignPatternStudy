public class PrototypeDemo
{
    public static void main(String args[])
    {
        Person person1 = new Person("Chris", "1234567");
        System.out.println(person1.displayInfo());

        Person person2 = (Person)person1.doClone();
        System.out.println(person2.displayInfo());

        Dog dog1 = new Dog("Bark");
        System.out.println(dog1.displaySound());

        Dog dog2 = (Dog)dog1.doClone();
        System.out.println(dog2.displaySound());
    }
}
