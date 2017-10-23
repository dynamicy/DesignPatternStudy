package io.csie.chris;

import java.util.Observable;
import java.util.Observer;

public class Main {

    public static void main(String args[]) {

        EventSource eventSource = new EventSource();

        eventSource.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println(arg);
            }
        });

        new Thread(eventSource).start();
    }
}
