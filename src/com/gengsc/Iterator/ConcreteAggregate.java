package com.gengsc.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<T> implements Aggregate {


    private List<T> items = new ArrayList<>();

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator(this);
    }

    /**
     * 总个数
     */
    public int size() {
        return items.size();
    }

    public T getItem(int index) {
        return items.get(index);
    }

    public void setItem(int index, T value) {
        items.set(index, value);
    }

    public void add(T value) {
        items.add(value);
    }


}
