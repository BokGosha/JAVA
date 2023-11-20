package ru.mirea.lab3;

import java.util.Random;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        double[] array = new double[5];

        System.out.println("Выберите способ заполнения массива:\n" +
                "0 - метод random() класса Math;\n" +
                "1 - класс Random;");

        int z = sc.nextInt();

        if (z == 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = Math.random();
            }
        }
        else {
            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextDouble(100);
            }
        }

        System.out.print("Массив: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        double temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.print("Отсортированный массив: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}