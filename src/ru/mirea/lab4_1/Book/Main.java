package ru.mirea.lab4_1.Book;

public class Main {
    public static void main(String[] args) {
        Book math = new Book("Математика");

        Reader user1 = new Reader();
        Reader user2 = new Reader();
        Reader users[] = new Reader[2];

        users[0] = user1;
        users[1] = user2;

        userSet1(user1);
        userSet2(user2);

        System.out.println("Читатели библиотеки:");
        for (Reader user : users) {
            System.out.println(user);
        }

        Book[] books = new Book[2];
        books[0] = new Book("Кино");
        books[1] = new Book("Словарь");

        user1.takeBook(books.length);
        user1.takeBook(books);
        System.out.println();
        user1.returnBook(books);
        System.out.println();
        user1.returnBook(books.length);
    }

    private static void userSet1(Reader user) {
        user.setFullName("Петров В. В.");
        user.setFaculty("экономический");
        user.setTicketNum(3);
        user.setBirthDate(1992);
        user.setTel(067);
    }

    private static void userSet2(Reader user) {
        user.setFullName("Иванов М. П.");
        user.setFaculty("технический");
        user.setTicketNum(2);
        user.setBirthDate(1993);
        user.setTel(067);
    }
}
