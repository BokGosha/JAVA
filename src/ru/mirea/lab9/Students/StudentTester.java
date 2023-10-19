package ru.mirea.lab9.Students;

import java.util.ArrayList;

public class StudentTester {
    public static void quickSort(ArrayList<Student> array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(ArrayList<Student> array, int low, int high) {
        StudentComparator comparator = new StudentComparator();

        Student pivot = array.get(high);

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(array.get(j), pivot) < 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);

        return i + 1;
    }

    public static void swap(ArrayList<Student> array, int i, int j) {
        Student temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("John", 123));
        students.add(new Student("Alice", 456));
        students.add(new Student("Bob", 789));
        students.add(new Student("Emily", 234));
        students.add(new Student("David", 567));

        quickSort(students, 0, students.size() - 1);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}