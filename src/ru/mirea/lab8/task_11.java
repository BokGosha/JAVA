package ru.mirea.lab8;

import java.util.Scanner;

public class task_11 {
    public static int countOnes(Scanner sc) {
        int num = sc.nextInt();

        if (num == 0) {
            int number = sc.nextInt();

            if (number == 0) {
                return 0;
            }
            else {
                if (number == 1) {
                    return countOnes(sc) + 1;
                }
                else {
                    return countOnes(sc);
                }
            }
        }
        else {
            if (num == 1) {
                return countOnes(sc) + 1;
            }
            else {
                return countOnes(sc);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(countOnes(sc));
    }
}