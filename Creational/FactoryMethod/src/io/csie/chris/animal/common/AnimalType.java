package io.csie.chris.animal.common;

public enum AnimalType {

    Cat("Meow"),

    Dog("Bark"),

    Fox("Ssbb"),

    Monster("Unknown");

    private String sound;

    private AnimalType(String sound){
        this.sound = sound;
    }

    public String getSound() {
        return this.sound;
    }
}
