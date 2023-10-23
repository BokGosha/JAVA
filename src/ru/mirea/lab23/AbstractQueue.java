package ru.mirea.lab23;

public abstract class AbstractQueue implements Queue {
    @Override
    abstract public void enQueue(Object element);

    @Override
    abstract public Object element();

    @Override
    abstract public Object deQueue();

    @Override
    abstract public int size();

    @Override
    abstract public boolean isEmpty();

    @Override
    abstract public void clear();
}
