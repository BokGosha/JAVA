package ru.mirea.lab2.Book;

public class BookTester {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Понедельник начинается в субботу", "Братья Стругацкие", 1978),
                new Book("Пикник на обочине", "Братья Стругацкие", 1988),
                new Book("1984", "Оруэлл", 1948)};

        BookShelf shelf = new BookShelf(books);

        System.out.println("Самая ранняя книга: " + shelf.getEarliest());
        System.out.println("Самая поздняя книга: " + shelf.getLatest());
        shelf.sortBooks();
        System.out.println(shelf);
    }
}