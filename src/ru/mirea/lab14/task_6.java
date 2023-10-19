package ru.mirea.lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_6 {
    public static void main(String[] args) {
        String regex = "\\b([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})\\b";

        String s = "example_email.19+example@example.com";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(s);

        if (matcher.find()) {
            System.out.println("Данная строчка является допустимым (корректным) е-mail адресом согласно RFC под номером 2822");
        }
        else {
            System.out.println("Данная строчка не является допустимым (корректным) е-mail адресом согласно RFC под номером 2822");
        }
    }
}
