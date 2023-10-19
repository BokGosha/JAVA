package ru.mirea.lab8;

public class task_10 {
    public static int recursion(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        }

        return (int) (n % 10 * Math.pow(10, (int) Math.log10(n))) + recursion(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(recursion(12345786));
    }
}