package ru.mirea.lab2.Book;

import java.util.Arrays;

public class BookShelf {
    private Book[] books;

    public BookShelf(Book[] books) {
        this.books = books;
    }

    public Book getLatest() {
        Book latest = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].getYear() > latest.getYear()) {
                latest = books[i];
            }
        }

        return latest;
    }

    public Book getEarliest() {
        Book earliest = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].getYear() < earliest.getYear()) {
                earliest = books[i];
            }
        }

        return earliest;
    }

    public void sortBooks() {
        Book temp;
        for (int i = 0; i < books.length; i++) {
            for (int j = i; j < books.length; j++) {
                if (books[i].getYear() > books[j].getYear()) {
                    temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}