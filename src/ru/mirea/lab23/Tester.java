package ru.mirea.lab23;

public class Tester {
    public static void main(String[] args) {
        ArrayQueueModule array = ArrayQueueModule.getInstance();

        array.enQueue(3);
        array.enQueue(5);
        array.enQueue(6);
        array.enQueue(9);
        array.enQueue(1);
        array.enQueue(2);

        System.out.println(array.element());

        System.out.println(array.size());

        System.out.println(array.deQueue());

        System.out.println(array.size());

        array.clear();

        System.out.println(array.size());
        
        ArrayQueue array_1 = new ArrayQueue();

        array_1.enQueue(3);
        array_1.enQueue(5);
        array_1.enQueue(6);
        array_1.enQueue(9);
        array_1.enQueue(1);
        array_1.enQueue(2);

        System.out.println(array_1.element());

        System.out.println(array_1.size());

        System.out.println(array_1.deQueue());

        System.out.println(array_1.size());

        array_1.clear();

        System.out.println(array.size());

        ArrayQueueADT queue = new ArrayQueueADT();

        ArrayQueueADT.enQueue(queue, "element1");
        ArrayQueueADT.enQueue(queue, "element2");

        System.out.println(ArrayQueueADT.deQueue(queue));

        System.out.println(ArrayQueueADT.element(queue));

        System.out.println(ArrayQueueADT.size(queue));

        System.out.println(ArrayQueueADT.isEmpty(queue));

        ArrayQueueADT.clear(queue);

        System.out.println(ArrayQueueADT.size(queue));

        System.out.println(ArrayQueueADT.isEmpty(queue));

        LinkedQueue queue_1 = new LinkedQueue();

        queue_1.enQueue("element1");
        queue_1.enQueue("element2");

        System.out.println(queue_1.deQueue());

        System.out.println(queue_1.element());

        System.out.println(queue_1.size());

        System.out.println(queue_1.isEmpty());

        queue_1.clear();

        System.out.println(queue_1.size());

        System.out.println(queue_1.isEmpty());
    }
}