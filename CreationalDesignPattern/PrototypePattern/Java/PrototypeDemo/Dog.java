public class Dog implements IPrototype {
    private String sound;

    public Dog(String sound) {
        this.sound = sound;
    }

    // Make a copy from IPrototype
    @Override
    public IPrototype doClone() {
        return new Dog(sound);
    }

    public String displaySound() {
        return "This dog's sound is:" + sound;
    }
}
