package ru.mirea.lab10;

import java.util.Comparator;
import java.util.Scanner;

public class StudentComparator implements Comparator<Student> {
    private int v;

    public void setV(int v) {
        this.v = v;
    }

    @Override
    public int compare(Student student1, Student student2) {
        if (v == 0) {
            return student1.getCourse().compareTo(student2.getCourse());
        }
        else if (v == 1) {
            return student1.getMark().compareTo(student2.getMark());
        }
        else {
            return student1.getGroup().compareTo(student2.getGroup());
        }
    }
}