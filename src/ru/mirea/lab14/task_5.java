package ru.mirea.lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_5 {
    public static void main(String[] args) {
        String regex = "\\b(0[1-9]|[12]\\d|3[01])+/(0[1-9]|1[0-2])+/(19\\d{2}|[2-9]\\d{3})\\b";

        String s = "31-03-2034";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(s);

        if (matcher.find()) {
            System.out.println("Строчка является датой");
        }
        else {
            System.out.println("Строчка не является датой");
        }
    }
}