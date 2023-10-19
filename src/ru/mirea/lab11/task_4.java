package ru.mirea.lab11;

import java.util.*;

public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные для создания объекта Date (гггг мм дд): ");

        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        Date date = createDate(year, month, day);
        System.out.println("Созданный объект Date: " + date);

        System.out.println("Введите данные для создания объекта Calendar (часы минуты): ");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        Calendar calendar = createCalendar(hours, minutes);
        System.out.println("Созданный объект Calendar: " + calendar.getTime());
    }

    private static Date createDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);

        return calendar.getTime();
    }

    private static Calendar createCalendar(int hours, int minutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.HOUR_OF_DAY, hours);
        calendar.set(Calendar.MINUTE, minutes);

        return calendar;
    }
}