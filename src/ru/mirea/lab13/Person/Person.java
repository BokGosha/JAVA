package ru.mirea.lab13.Person;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getPerson() {
        if (Objects.equals(name, "")) {
            return surname + " " + patronymic.charAt(0) + '.';
        }
        else if (Objects.equals(patronymic, "")) {
            return surname + " " + name.charAt(0) + '.';
        }
        else {
            return surname + " " + name.charAt(0) + '.' + patronymic.charAt(0) + '.';
        }
    }
}
