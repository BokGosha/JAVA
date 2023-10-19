package ru.mirea.lab2.Dog;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int convertToHuman() {
        return age * 7;
    }

    @Override
    public String toString() {
        return String.format("Собака возрастом %1$d лет с кличкой %2$s", age, name);
    }
}