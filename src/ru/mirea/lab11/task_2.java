package ru.mirea.lab11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) throws ParseException {
        Date currentDate = new Date();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату (в формате дд.мм.гггг чч:мм): ");
        String dateString = scanner.nextLine();

        Date userDate = parseDate(dateString);

        int comparisonResult = currentDate.compareTo(userDate);

        if (comparisonResult < 0) {
            System.out.println("Текущая дата и время раньше введенной даты");
        } else if (comparisonResult > 0) {
            System.out.println("Текущая дата и время позже введенной даты");
        } else {
            System.out.println("Текущая дата и время совпадают с введенной датой");
        }
    }

    private static Date parseDate(String dateString) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        return format.parse(dateString);
    }
}