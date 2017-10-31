package com.gengsc.Iterator;

public interface Iterator<T> {

    T first();

    T next();

    boolean isDown();

    T currentItem();
}
