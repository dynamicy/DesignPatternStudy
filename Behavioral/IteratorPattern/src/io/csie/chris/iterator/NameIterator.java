package io.csie.chris.iterator;

public class NameIterator implements Iterator {

    private String names[] = {"Apple", "Banana", "Car", "Dog", "Elephant", "Fork"};

    private int index;

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return names[index++];
        }
        return null;
    }
}
