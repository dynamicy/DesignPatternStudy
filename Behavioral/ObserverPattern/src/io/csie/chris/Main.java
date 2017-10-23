package io.csie.chris;

public class Main {

    public static void main(String args[]) {

        EventSource eventSource = new EventSource();

        eventSource.addObserver((o, arg) -> System.out.println(arg));

        new Thread(eventSource).start();
    }
}
