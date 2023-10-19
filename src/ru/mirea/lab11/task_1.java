package ru.mirea.lab11;

import java.util.Date;

public class task_1 {
    public static void main(String[] args) {
        String surname = "Бокоев";

        Date date = new Date();

        long currentTimeMillis = System.currentTimeMillis();
        Date deadline = new Date(currentTimeMillis + 86400000);

        System.out.println("Фамилия разработчика: " + surname);
        System.out.println("Дата получения задания: " + date);
        System.out.println("Дата сдачи задания: " + deadline);
    }
}