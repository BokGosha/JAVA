package ru.mirea.lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingStudentsByGPA {
    static StudentComparator comparator = new StudentComparator();
    private List<Student> studentList;

    public SortingStudentsByGPA() {
        studentList = new ArrayList<>();
    }

    public void setArray(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void outArray() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public void quickSort() {
        quickSort(studentList, 0, studentList.size() - 1);
    }

    private void quickSort(List<Student> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    private int partition(List<Student> list, int low, int high) {
        Student pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(list.get(j), pivot) > 0) {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);

        return i + 1;
    }

    private void swap(List<Student> list, int i, int j) {
        Student temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public void mergeSort() {
        studentList = mergeSort(studentList);
    }

    private List<Student> mergeSort(List<Student> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        List<Student> left = list.subList(0, mid);
        List<Student> right = list.subList(mid, list.size());

        return merge(mergeSort(left), mergeSort(right));
    }

    public List<Student> mergeSort_2(List<Student> list1, List<Student> list2) {
        if (list1.size() <= 1 && list2.size() <= 1) {
            return merge(list1, list2);
        }

        int mid1 = list1.size() / 2;
        List<Student> left1 = list1.subList(0, mid1);
        List<Student> right1 = list1.subList(mid1, list1.size());

        int mid2 = list2.size() / 2;
        List<Student> left2 = list2.subList(0, mid2);
        List<Student> right2 = list2.subList(mid2, list2.size());

        List<Student> sortedLeft = mergeSort_2(left1, left2);
        List<Student> sortedRight = mergeSort_2(right1, right2);

        return merge(sortedLeft, sortedRight);
    }

    private List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (comparator.compare(left.get(i), right.get(j)) > 0) {
                mergedList.add(left.get(i));
                i++;
            } else {
                mergedList.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            mergedList.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            mergedList.add(right.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alex", "Ivanov", 1, 47, "IT", 25));
        studentList.add(new Student("Ivan", "Bokoev", 2, 34, "IT", 56));
        studentList.add(new Student("Georgy", "Dmitrov", 3, 23, "IT", 26));

        SortingStudentsByGPA students_1 = new SortingStudentsByGPA();

        students_1.setArray(studentList);

        Scanner sc = new Scanner(System.in);

        System.out.println("По какому полю вы хотите сортировать:");
        System.out.println("0 - Курс;");
        System.out.println("1 - Средний балл;");
        System.out.println("2 - Группа");

        int v = sc.nextInt();
        comparator.setV(v);

        students_1.quickSort();
        students_1.outArray();

        students_1.setArray(studentList);

        System.out.println("По какому полю вы хотите сортировать:");
        System.out.println("0 - Курс;");
        System.out.println("1 - Средний балл;");
        System.out.println("2 - Группа");

        v = sc.nextInt();
        comparator.setV(v);

        students_1.mergeSort();
        students_1.outArray();
    }
}