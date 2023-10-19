package ru.mirea.lab3.Circle;

import java.util.Arrays;

public class Tester {
    private static Circle[] circles;
    private static int count;

    public static void main(String[] args) {
        count = 10;
        circles = new Circle[count];

        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle();
        }

        System.out.println(Arrays.toString(circles));
        System.out.println("Наименьшая окружность: " + findMin());
        System.out.println("Наибольшая окружность: " + findMax());
        sort();
        System.out.println(Arrays.toString(circles));
    }

    public static void sort() {
        Circle temp;
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (circles[i].getRadius() > circles[j].getRadius()) {
                    temp = circles[j];
                    circles[j] = circles[i];
                    circles[i] = temp;
                }
            }
        }
    }

    public static Circle findMin() {
        Circle result = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() < result.getRadius())
                result = circles[i];
        }

        return result;
    }

    public static Circle findMax() {
        Circle result = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() > result.getRadius())
                result = circles[i];
        }

        return result;
    }
}