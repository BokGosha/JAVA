package ru.mirea.lab23;

public interface Queue {
    void enQueue(Object element);

    Object element();

    Object deQueue();

    int size();

    boolean isEmpty();

    void clear();
}