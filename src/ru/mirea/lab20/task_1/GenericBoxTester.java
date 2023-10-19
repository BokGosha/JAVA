package ru.mirea.lab20.task_1;

public class GenericBoxTester {
    public static void main(String[] args) {
        GenericBox<String, Integer, Boolean> myObject = new GenericBox<>(10, "Hello", true);

        System.out.println(myObject);
    }
}