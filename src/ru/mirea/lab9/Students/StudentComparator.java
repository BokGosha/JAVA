package ru.mirea.lab9.Students;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getMark().compareTo(student2.getMark());
    }
}