package ru.mirea.lab23;

public class LinkedQueue extends AbstractQueue {
    private Node front; // указатель на первый элемент
    private Node rear; // указатель на последний элемент
    private int size; // размер очереди

    private static class Node {
        Object element; // элемент узла
        Node next; // ссылка на следующий узел

        public Node(Object element) {
            this.element = element;
            this.next = null;
        }
    }

    @Override
    public void enQueue(Object element) {
        Node newNode = new Node(element);

        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;

        size++;

        System.out.println(element + " is inserted");
    }

    @Override
    public Object element() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            System.exit(1);
        }

        return front.element;
    }

    @Override
    public Object deQueue() {
        if (isEmpty()) {
            System.out.println("No items in the queue! It cannot delete");
            return 0;
        }
        Object dequeuedElement = front.element;
        System.out.println(dequeuedElement + " is deleted");

        front = front.next;
        size--;

        return dequeuedElement;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }
}
