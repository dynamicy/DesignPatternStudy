package io.csie.chris;

import io.csie.chris.container.NameRepository;
import io.csie.chris.iterator.Iterator;

public class Main {

    public static void main(String args[]) {

        NameRepository namesRepository = new NameRepository();

        for (Iterator iterator = namesRepository.getIterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}
