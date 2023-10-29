package edu.hw3.task8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Task8<T> implements Iterator<T> {
    private final ListIterator<T> listIterator;

    public Task8(Collection<T> collection) {
        this.listIterator = (ListIterator<T>) ((List<T>) List.copyOf(collection)).listIterator(collection.size());
    }

    @Override
    public boolean hasNext() {
        return listIterator.hasPrevious();
    }

    @Override
    public T next() {
        return listIterator.previous();
    }
}
