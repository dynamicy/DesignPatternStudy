package io.csie.chris.menu;

import java.util.ArrayList;
import java.util.List;

public class CompositeMenu implements IMenu {

    // Collection of Menu items
    private List<IMenu> menuList = new ArrayList<>();

    @Override
    public void print() {
        for (IMenu item : menuList) {
            item.print();
        }
    }

    public void add(IMenu item) {
        menuList.add(item);
    }

    public void remove(IMenu item) {
        menuList.remove(item);
    }
}
