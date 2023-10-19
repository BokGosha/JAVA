package ru.mirea.lab9.Student;

import java.util.ArrayList;

public class StudentTester {
    public static void Sorting(ArrayList<Student> list) {
        for (int i = 1; i < list.size(); i++) {
            Student key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j).compareTo(key) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }

            list.set(j + 1, key);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("John", 123));
        students.add(new Student("Alice", 456));
        students.add(new Student("Bob", 789));
        students.add(new Student("Emily", 234));
        students.add(new Student("David", 567));

        Sorting(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}