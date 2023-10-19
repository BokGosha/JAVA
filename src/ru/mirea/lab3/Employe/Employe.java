package ru.mirea.lab3.Employe;

public class Employe {
    private String fullname;
    private double salary;

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employe(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}