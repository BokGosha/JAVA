package ru.mirea.lab2.Author;

public class AuthorTester {
    public static void main(String[] args) {
        Author author = new Author("Ленин", "lenin@yandex.com", 'm');

        author.setEmail("lenin@yandex.ru");

        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        System.out.println(author.getName());
        System.out.println(author);
    }
}