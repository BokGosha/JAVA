package ru.mirea.lab23;

public abstract class AbstractQueue implements Queue {
    abstract public void enQueue(Object element);

    abstract public Object element();

    abstract public Object deQueue();

    abstract public int size();

    abstract public boolean isEmpty();

    abstract public void clear();
}