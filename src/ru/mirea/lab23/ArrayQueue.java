package ru.mirea.lab23;

import java.util.NoSuchElementException;

//******************************************** Инвариант структуры данных "очередь" **************************************************
// Размер очереди всегда неотрицателен и не превышает максимального размера (количество элементов, которое может содержаться в очереди);
// Если очередь пуста, то указатели на первый и последний элементы равны null;
// Если очередь не пуста, то указатели на первый и последний элементы указывают на соответствующие элементы в массиве данных.
//************************************************************************************************************************************

public class ArrayQueue extends AbstractQueue {
    private final int      MAX_SIZE = 10;                   // максимальный размер очереди
    private final Object[] queue = new Object[MAX_SIZE];    // очередь
    private int            front = -1;                      // указатель на первый элемент
    private int            rear = -1;                       // указатель на последний элемент

    // Предусловие: очередь может быть и пустой, и непустой;
    // Постусловие: состояние очереди не изменяется.
    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    // Предусловие: очередь не пуста;
    // Постусловие: новый элемент успешно вставлен в конец очереди.
    public void enQueue(Object element) {
        if (front == 0 && rear == MAX_SIZE - 1) {
            System.out.println("Queue is full! It cannot add more values");
            System.exit(1);
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;

            queue[rear] = element;

            System.out.println(element + " is inserted");
        }
    }

    // Предусловие: очередь не пуста;
    // Постусловие: первый элемент очереди успешно удален.
    public Object deQueue() {
        Object element;

        if (isEmpty()) {
            System.out.println("Queue is empty! It cannot be deleted");
            return 0;
        } else {
            element = queue[front];
            queue[front] = null;

            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(element + " is deleted");

            return element;
        }
    }

    // Предусловие: очередь не пуста;
    // Постусловие: состояние очереди не изменяется.
    public int size() {
        if (isEmpty()) {
            return 0;
        }

        return rear - front + 1;
    }

    // Предусловие: очередь не пуста;
    // Постусловие: состояние очереди не изменяется.
    public Object element() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            System.exit(1);
        }

        return queue[front];
    }

    // Предусловие: очередь может быть и пустой, и непустой;
    // Постусловие: все элементы очереди успешно удалены.
    public void clear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            System.exit(1);
        }

        for (int i = 0; i < size(); i++) {
            queue[i] = null;
        }

        rear = -1;
        front = -1;
    }
}
