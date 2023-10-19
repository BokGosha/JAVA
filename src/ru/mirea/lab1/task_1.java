package ru.mirea.lab1;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + "-ый элемент массива:");

            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println("Сумма элементов массива: " + sum);

        double sr = sum * 1.0 / array.length;
        System.out.println("Среднее арифметическое элементов массива: " + sr);
    }
}