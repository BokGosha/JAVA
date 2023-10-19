package ru.mirea.lab11.task_3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Student(String name, String surname, Date date) {
        this.name = name;
        this.surname = surname;
        this.date = date;
    }

    public String getFormattedBirthDate(String format) {
        SimpleDateFormat dateFormat = null;

        if (format.equals("short")) {
            dateFormat = new SimpleDateFormat("dd.MM.yy");
        } else if (format.equals("medium")) {
            dateFormat = new SimpleDateFormat("dd MMM yyyy");
        } else if (format.equals("full")) {
            dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        }

        return dateFormat.format(date);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + getFormattedBirthDate("full") +
                '}';
    }
}