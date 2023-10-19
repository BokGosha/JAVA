package ru.mirea.lab9.Student;

public class Student implements Comparable<Student> {
    private int IDNumber;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, int IDNumber) {
        this.name = name;
        this.IDNumber = IDNumber;
    }

    public Integer getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    @Override
    public int compareTo(Student student) {
        return this.getIDNumber().compareTo(student.getIDNumber());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", IDNumber=" + IDNumber +
                '}';
    }
}