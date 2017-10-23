package io.csie.chris.container;

import io.csie.chris.iterator.Iterator;
import io.csie.chris.iterator.NameIterator;

public class NameRepository implements Container {

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
}
