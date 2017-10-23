package io.csie.chris.animal.common;

public enum AnimalType {

    Cat("feline", "Meow"),

    Dog("canine", "Bark"),

    Fox("vulpine", "Ssbb"),

    Monster("xxxxxxx", "Unknown");

    private String sound;

    private String name;

    AnimalType(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getSound() {
        return this.sound;
    }

    public String getName() {
        return this.name;
    }
}
