package ru.mirea.lab1;

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число:");

        int number = sc.nextInt();

        System.out.print(fact(number));
    }
    public static int fact(int a) {
        int fact = 1;

        for (int i = 1; i <= a; i++) {
            fact *= i;
        }

        return fact;
    }
}
