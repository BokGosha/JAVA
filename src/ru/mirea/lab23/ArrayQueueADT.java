package ru.mirea.lab23;

import javax.lang.model.element.Element;
import java.util.NoSuchElementException;

public class ArrayQueueADT {
    private final int MAX_SIZE = 10;
    private final Object[] queue = new Object[MAX_SIZE];
    private int front = -1;
    private int rear = -1;

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(Element element) {
        if (front == 0 && rear == MAX_SIZE - 1) {
            throw new IllegalStateException("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;

            queue[rear] = element;

            System.out.println("Insert " + element);
        }
    }

    public Element dequeue() {
        Element element;

        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        } else {
            element = (Element) queue[front];
            queue[front] = null;

            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(element + " Deleted");

            return element;
        }
    }

    public Integer size() {
        if (isEmpty()) {
            return 0;
        }
        if (front <= rear) {
            return rear - front + 1;
        } else {
            return MAX_SIZE - front + rear + 1;
        }
    }

    public Element element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        return (Element) queue[front];
    }

    public void clear() {
        if (isEmpty()) {
            return;
        }

        for (int i = 0; i < size(); i++) {
            queue[i] = null;
        }

        rear = -1;
        front = -1;
    }
}
