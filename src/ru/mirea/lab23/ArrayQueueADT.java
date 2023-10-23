package ru.mirea.lab23;

import java.util.NoSuchElementException;

//******************************************** Инвариант структуры данных "очередь" **************************************************
// Размер очереди всегда неотрицателен и не превышает максимального размера (количество элементов, которое может содержаться в очереди);
// Если очередь пуста, то указатели на первый и последний элементы равны null;
// Если очередь не пуста, то указатели на первый и последний элементы указывают на соответствующие элементы в массиве данных.
//************************************************************************************************************************************

public class ArrayQueueADT {
    private final int      MAX_SIZE = 10;                   // максимальный размер очереди
    private final Object[] queue = new Object[MAX_SIZE];    // очередь
    private int            front = -1;                      // указатель на первый элемент
    private int            rear = -1;                       // указатель на последний элемент

    // Предусловие: очередь может быть и пустой, и непустой;
    // Постусловие: состояние очереди не изменяется.
    public boolean isEmpty(ArrayQueueADT array) {
        return array.front == -1 && array.rear == -1;
    }

    // Предусловие: очередь не пуста;
    // Постусловие: новый элемент успешно вставлен в конец очереди.
    public void enQueue(ArrayQueueADT array, Object element) {
        if (array.front == 0 && array.rear == MAX_SIZE - 1) {
            throw new IllegalStateException("Queue is full");
        } else {
            if (array.front == -1) {
                array.front = 0;
            }
            array.rear++;

            array.queue[array.rear] = element;

            System.out.println("Insert " + element);
        }
    }

    // Предусловие: очередь не пуста;
    // Постусловие: первый элемент очереди успешно удален.
    public Object deQueue(ArrayQueueADT array) {
        Object element;

        if (isEmpty(array)) {
            throw new NoSuchElementException("Queue is empty");
        } else {
            element = array.queue[array.front];
            array.queue[array.front] = null;

            if (array.front >= array.rear) {
                array.front = -1;
                array.rear = -1;
            } else {
                array.front++;
            }
            System.out.println(element + " Deleted");

            return element;
        }
    }

    // Предусловие: очередь не пуста;
    // Постусловие: состояние очереди не изменяется.
    public int size(ArrayQueueADT array) {
        if (isEmpty(array)) {
            return 0;
        }

        if (array.front <= array.rear) {
            return array.rear - array.front + 1;
        } else {
            return MAX_SIZE - array.front + array.rear + 1;
        }
    }

    // Предусловие: очередь не пуста;
    // Постусловие: состояние очереди не изменяется.
    public Object element(ArrayQueueADT array) {
        if (isEmpty(array)) {
            throw new NoSuchElementException("Queue is empty");
        }

        return array.queue[array.front];
    }

    // Предусловие: очередь может быть и пустой, и непустой;
    // Постусловие: все элементы очереди успешно удалены.
    public void clear(ArrayQueueADT array) {
        if (isEmpty(array)) {
            return;
        }

        for (int i = 0; i < size(array); i++) {
            array.queue[i] = null;
        }

        array.rear = -1;
        array.front = -1;
    }
}