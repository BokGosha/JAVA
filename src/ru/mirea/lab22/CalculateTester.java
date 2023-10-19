package ru.mirea.lab22;

public class CalculateTester {
    public static void main(String[] args) {
        Calculate stack = new Calculate();

        char[] array = {'2', '3', '*', '4', '5', '*', '+'};

        for (char i : array) {
            stack.calculate(i);
        }

        stack.answer();
    }
}
