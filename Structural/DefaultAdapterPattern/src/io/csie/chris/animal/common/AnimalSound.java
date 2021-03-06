package io.csie.chris.animal.common;

public enum AnimalSound {

    Cat("Meow!"),

    Chicken("Go go go!"),

    Lion("Howl!");

    private String sound;

    AnimalSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return this.sound;
    }
}
