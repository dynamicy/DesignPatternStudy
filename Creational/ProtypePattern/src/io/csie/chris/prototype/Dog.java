package io.csie.chris.prototype;

import io.csie.chris.prototype.common.IPrototype;

public class Dog implements IPrototype {

    private String sound;

    public Dog(String sound) {
        this.sound = sound;
    }

    @Override
    public IPrototype doClone() {
        return new Dog(sound);
    }

    public String displaySound() {
        return "This dog's sound is:" + sound;
    }
}
