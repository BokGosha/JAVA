package ru.mirea.lab21.task_2;

import java.util.ArrayList;

public class KeepArray<T> {
    private T[] array;

    public KeepArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T getElement(int i) {
        return array[i];
    }

    public void printArray() {
        System.out.print(array.getClass() + " Массив объектов " + ": ");
        for (Object i : array) {
            System.out.print(i + " ");
        }
    }
}
