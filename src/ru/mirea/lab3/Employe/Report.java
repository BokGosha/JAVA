package ru.mirea.lab3.Employe;

import java.text.NumberFormat;
import java.util.Locale;

public class Report {
    public static void generateReport(Employe[] employe) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        for (Employe e : employe) {
            System.out.printf("Зарплата работника %1$-25s %2$1s\n", e.getFullname() + ":",
                    numberFormat.format(Double.parseDouble(String.format(Locale.UK, "%1$.2f", e.getSalary()))));
            System.out.println();
        }
    }
}