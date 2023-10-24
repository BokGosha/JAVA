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
    public static boolean isEmpty(ArrayQueueADT array) {
        return array.rear == -1 && array.front == -1;
    }

    // Предусловие: очередь не пуста;
    // Постусловие: новый элемент успешно вставлен в конец очереди.
    public static void enQueue(ArrayQueueADT array, Object element) {
        if (array.front == 0 && array.rear == array.MAX_SIZE - 1) {
            System.out.println("Queue is full! It cannot add more values");
            System.exit(1);
        } else {
            if (array.front == -1) {
                array.front = 0;
            }
            array.rear++;

            array.queue[array.rear] = element;

            System.out.println(element + " is inserted");
        }
    }

    // Предусловие: очередь не пуста;
    // Постусловие: первый элемент очереди успешно удален.
    public static Object deQueue(ArrayQueueADT array) {
        Object element;

        if (isEmpty(array)) {
            System.out.println("No items in the queue! It cannot delete");
            return 0;
        } else {
            element = array.queue[array.front];
            array.queue[array.front] = null;

            if (array.front >= array.rear) {
                array.front = -1;
                array.rear = -1;
            } else {
                array.front++;
            }
            System.out.println(element + " is deleted");

            return element;
        }
    }

    // Предусловие: очередь не пуста;
    // Постусловие: состояние очереди не изменяется.
    public static int size(ArrayQueueADT array) {
        if (isEmpty(array)) {
            return 0;
        }

        return array.rear - array.front + 1;
    }

    // Предусловие: очередь не пуста;
    // Постусловие: состояние очереди не изменяется.
    public static Object element(ArrayQueueADT array) {
        if (isEmpty(array)) {
            System.out.println("Queue is empty!");
            System.exit(1);
        }

        return array.queue[array.front];
    }

    // Предусловие: очередь может быть и пустой, и непустой;
    // Постусловие: все элементы очереди успешно удалены.
    public static void clear(ArrayQueueADT array) {
        if (isEmpty(array)) {
            System.out.println("Queue is empty!");
            System.exit(1);
        }

        for (int i = 0; i < size(array); i++) {
            array.queue[i] = null;
        }

        array.rear = -1;
        array.front = -1;
    }
}