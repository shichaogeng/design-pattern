package com.gengsc.Iterator;

public class ConcreteIterator<T> implements Iterator<T> {


    private ConcreteAggregate<T> aggregate;

    private int current = 0;

    public ConcreteIterator(ConcreteAggregate<T> aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public T first() {
        return aggregate.getItem(0);
    }

    @Override
    public T next() {
        T ret = null;
        current++;
        if (current < aggregate.size()) {
            ret = aggregate.getItem(current);
        }
        return ret;
    }

    @Override
    public boolean isDown() {
        return current >= aggregate.size() ? true : false;
    }

    @Override
    public T currentItem() {
        return aggregate.getItem(current);
    }
}
