public class Person implements Prototype
{
    String name;
    String id;

    public Person(String name, String id)
    {
        this.name = name;
        this.id = id;
    }

    // Make a copy from Prototype
    @Override
    public Prototype doClone()
    {
        return new Person(name, id);
    }

    public String displayInfo()
    {
        return "This person's name is:" + name + ", id:" + id;
    }
}
