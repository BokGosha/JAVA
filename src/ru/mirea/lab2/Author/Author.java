package ru.mirea.lab2.Author;

public class Author {
    public String name;
    public String email;
    public char gender;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name = '" + name + '\'' +
                ", email = '" + email + '\'' +
                ", gender = " + gender +
                '}';
    }
}