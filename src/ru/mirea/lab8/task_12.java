package ru.mirea.lab8;

import java.util.Scanner;

public class task_12 {
    public static String countNechet(Scanner sc) {
        int num = sc.nextInt();

        if (num == 0) {
            return "";
        }

        if (num % 2 != 0) {
            return num + countNechet(sc);
        }
        else {
            return countNechet(sc);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(countNechet(sc));
    }
}