package ru.mirea.lab13.Person;

import ru.mirea.lab13.Person.Person;

public class PersonTester {
    public static void main(String[] args) {
        Person person = new Person("Бокоев", "Георгий", "Русланович");

        System.out.println(person.getPerson());
    }
}