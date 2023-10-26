package ru.mirea.lab23;

//******************************************** Инвариант структуры данных "очередь" **************************************************
// Размер очереди всегда неотрицателен и не превышает максимального размера (количество элементов, которое может содержаться в очереди);
// Если очередь пуста, то указатели на первый и последний элементы равны null;
// Если очередь не пуста, то указатели на первый и последний элементы указывают на соответствующие элементы в массиве данных.
//************************************************************************************************************************************

public class ArrayQueueModule {
    private final int      MAX_SIZE = 10;                   // максимальный размер очереди
    private final Object[] array = new Object[MAX_SIZE];    // очередь
    private int            front = -1;                      // указатель на первый элемент
    private int            rear = -1;                       // указатель на последний элемент
    private static ArrayQueueModule queue;

    public static ArrayQueueModule getInstance() {
        if (queue == null) {
            queue = new ArrayQueueModule();
        }

        return queue;
    }

    // Предусловие: очередь может быть и пустой, и непустой;
    // Постусловие: состояние очереди не изменяется.
    public boolean isEmpty() {
        return queue.rear == -1 && queue.front == -1;
    }

    // Предусловие: очередь не пуста;
    // Постусловие: новый элемент успешно вставлен в конец очереди.
    public void enQueue(Object element) {
        if (queue.front == 0 && queue.rear == queue.MAX_SIZE - 1) {
            System.out.println("Queue is full! It cannot add more values");
            System.exit(1);
        } else {
            if (queue.front == -1) {
                queue.front = 0;
            }
            queue.rear++;

            queue.array[queue.rear] = element;

            System.out.println(element + " is inserted");
        }
    }

    // Предусловие: очередь не пуста;
    // Постусловие: первый элемент очереди успешно удален.
    public Object deQueue() {
        Object element;

        if (isEmpty()) {
            System.out.println("No items in the queue! It cannot delete");
            return 0;
        } else {
            element = queue.array[queue.front];
            queue.array[queue.front] = null;

            if (queue.front >= queue.rear) {
                queue.front = -1;
                queue.rear = -1;
            } else {
                queue.front++;
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

        return queue.rear - queue.front + 1;
    }

    // Предусловие: очередь не пуста;
    // Постусловие: состояние очереди не изменяется.
    public Object element() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            System.exit(1);
        }

        return queue.array[queue.front];
    }

    // Предусловие: очередь может быть и пустой, и непустой;
    // Постусловие: все элементы очереди успешно удалены.
    public void clear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            System.exit(1);
        }

        for (int i = 0; i < size(); i++) {
            queue.array[i] = null;
        }

        queue.rear = -1;
        queue.front = -1;
    }
}
