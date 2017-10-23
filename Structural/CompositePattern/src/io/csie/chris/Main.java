package io.csie.chris;

import io.csie.chris.menu.CompositeMenu;
import io.csie.chris.menu.Item;

public class Main {

    public static void main(String args[]) {

        CompositeMenu breakfastMenu = new CompositeMenu();
        CompositeMenu luncuMenu = new CompositeMenu();

        CompositeMenu mainMenu = new CompositeMenu();

        breakfastMenu.add(new Item("Banana", 20));
        breakfastMenu.add(new Item("Apple", 50));

        luncuMenu.add(new Item("Pork", 100));
        luncuMenu.add(new Item("Beaf", 150));

        mainMenu.add(breakfastMenu);
        mainMenu.add(luncuMenu);

        mainMenu.print();
    }
}
