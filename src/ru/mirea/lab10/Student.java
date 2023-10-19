package ru.mirea.lab10;

public class Student {
    private String name;
    private String surname;
    private int course;
    private int group;
    private String spec;
    private int mark;

    public Integer getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public Student(String name, String surname, int course, int group, String spec, int mark) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.group = group;
        this.spec = spec;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                ", spec='" + spec + '\'' +
                ", mark=" + mark +
                 '}';
    }
}