package io.csie.chris;

public class Singleton {

    private static Singleton instance;

    // Prevent creating new instance from other class.
    private Singleton() {
    }

    // If other memebers want to get instance, they have to use this method.
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
