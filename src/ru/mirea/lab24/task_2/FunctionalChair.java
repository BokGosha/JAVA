package ru.mirea.lab24.task_2;

public class FunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return "functional chair";
    }
}