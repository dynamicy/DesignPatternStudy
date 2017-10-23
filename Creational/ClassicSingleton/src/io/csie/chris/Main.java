package io.csie.chris;

public class Main {

    public static void main(String[] args) {

        Singleton singletonInstance1 = Singleton.getInstance();

        Singleton singletonInstance2 = Singleton.getInstance();

        if (singletonInstance1 == singletonInstance2) {
            System.out.println("They're the same instance");
        }
    }
}
