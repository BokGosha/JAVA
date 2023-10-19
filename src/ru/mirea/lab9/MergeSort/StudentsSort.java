package ru.mirea.lab9.MergeSort;

import java.util.ArrayList;
import java.util.List;

public class StudentsSort {
    public static void main(String[] args) {
        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(new Student("John", 20));
        students1.add(new Student("Alice", 19));
        students1.add(new Student("Bob", 21));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("David", 22));
        students2.add(new Student("Eve", 18));
        students2.add(new Student("Frank", 20));

        List<Student> mergedList = mergeSort(students1, students2);

        for (Student student : mergedList) {
            System.out.println(student);
        }
    }

    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        if (list1.size() <= 1 && list2.size() <= 1) {
            return merge(list1, list2);
        }

        int mid1 = list1.size() / 2;
        List<Student> left1 = list1.subList(0, mid1);
        List<Student> right1 = list1.subList(mid1, list1.size());

        int mid2 = list2.size() / 2;
        List<Student> left2 = list2.subList(0, mid2);
        List<Student> right2 = list2.subList(mid2, list2.size());

        List<Student> sortedLeft = mergeSort(left1, left2);
        List<Student> sortedRight = mergeSort(right1, right2);

        return merge(sortedLeft, sortedRight);
    }

    public static List<Student> merge(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).compareTo(list2.get(j)) < 0) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}