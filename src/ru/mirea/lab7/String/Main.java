package ru.mirea.lab7.String;

public class Main {
    public static void main(String[] args) {
        StringInterf str = new StringFunc("abdfjshfj");

        System.out.println(str.count());
        System.out.println(str.invert());
        System.out.println(str.nechet());
    }
}
