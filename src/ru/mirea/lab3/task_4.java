package ru.mirea.lab3;

import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Введите количество элементов в массиве: ");

        int n = sc.nextInt();
        int[] array = new int[n];
        Vector<Integer> array_chet = new Vector<>(0);

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(0, n + 1);
        }

        System.out.print("Массив: ");

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                array_chet.add(array[i]);
            };
        }

        if (array_chet.size() != 0) {
            System.out.print("Массив из чётных элементов: ");

            for (int i = 0; i < array_chet.size(); i++) {
                System.out.print(array_chet.get(i) + " ");
            }
        }
        else {
            System.out.print("Чётных элементов нет");
        }
    }
}
