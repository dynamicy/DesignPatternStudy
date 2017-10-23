public class Main {
    public static void main(String args[]) {
        Person person1 = new Person("Chris", "1234567", 25);
        System.out.println(person1.displayInfo());

        Person person2 = (Person) person1.doClone();
        person2.setAge(29);
        person2.setId("7473821");
        System.out.println(person2.displayInfo());

        Person person3 = (Person) person1.doClone();
        person3.setName("John");
        person3.setId("8763541");
        System.out.println(person3.displayInfo());

        Dog dog1 = new Dog("Bark");
        System.out.println(dog1.displaySound());

        Dog dog2 = (Dog) dog1.doClone();
        System.out.println(dog2.displaySound());
    }
}
