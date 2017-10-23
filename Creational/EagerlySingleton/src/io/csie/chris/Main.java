package io.csie.chris;

public class Main {

    public static void main(String[] args) {

        ESingleton singletonInstance1 = ESingleton.getInstance();

        ESingleton singletonInstance2 = ESingleton.getInstance();

        if (singletonInstance1 == singletonInstance2) {
            System.out.println("They're the same instance");
        }
    }
}
