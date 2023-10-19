package ru.mirea.lab11.task_3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date birthDate = new Date(95, 5, 20);
        Student student = new Student("Иван", "Петров", birthDate);

        System.out.println(student);
        System.out.println("Дата рождения (короткий формат): " + student.getFormattedBirthDate("short"));
        System.out.println("Дата рождения (средний формат): " + student.getFormattedBirthDate("medium"));
        System.out.println("Дата рождения (полный формат): " + student.getFormattedBirthDate("full"));
    }
}