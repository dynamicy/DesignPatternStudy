package io.csie.chris.animal;

import io.csie.chris.animal.common.AnimalType;

/**
 * Created by chris on 12/1/14.
 */
public class Snake extends Animal {

    @Override
    public String makeSound() {
        return AnimalType.Snake.getSound();
    }
}
