public class Dog implements Prototype
{
    String sound;

    public Dog(String sound)
    {
        this.sound = sound;
    }

    // Make a copy from Prototype
    @Override
    public Prototype doClone()
    {
        return new Dog(sound);
    }

    public String displaySound()
    {
        return "This dog's sound is:" + sound;
    }
}
