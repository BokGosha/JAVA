package ru.mirea.lab3;

import java.util.Random;

public class task_3 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10, 99);
        }

        System.out.print("Массив: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                System.out.print("Массив не является строго возрастающей последовательностью");

                break;
            }
            if ((i + 2) == array.length) {
                System.out.print("Массив является строго возрастающей последовательностью");
            }
        }
    }
}
