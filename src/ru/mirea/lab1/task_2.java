package ru.mirea.lab1;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        int i = 0;
        int sum = 0;

        do {
            System.out.println("Введите " + (i + 1) + "-ый элемент массива:");

            array[i] = sc.nextInt();
            sum += array[i];
            i++;
        }
        while (i < array.length);
        System.out.println("Сумма элементов массива: " + sum);

        int z = 0;
        int max = array[0];
        while (z < array.length) {
            if (max < array[z]) {
                max = array[z];
            }
            z++;
        }
        System.out.println("Максимальный элемент массива: " + max);

        int min = array[0];
        for (int q = 0; q < array.length; q++) {
            if (min > array[q]) {
                min = array[q];
            }
        }
        System.out.println("Минимальный элемент массива: " + min);
    }
}