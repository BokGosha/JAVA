package ru.mirea.lab22;

import java.util.Stack;
import static java.lang.Character.isDigit;

public class Calculate {
    private Stack<Double> stack;
    private double x;
    private double y;

    public Calculate() {
        stack = new Stack<>();
    }

    public void calculate(char a) {
        if (isDigit(a)) {
            stack.push((double) Character.getNumericValue(a));
        } else {
            x = stack.pop();
            y = stack.pop();

            if (a == '*') {
                stack.push(x * y);
            } else if (a == '+') {
                stack.push(x + y);
            } else if (a == '-') {
                stack.push(y - x);
            } else if (a == '/') {
                stack.push(y / x);
            }
        }
    }

    public void answer() {
        System.out.println(stack.pop());
    }
}