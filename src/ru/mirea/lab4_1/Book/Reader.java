package ru.mirea.lab4_1.Book;

public class Reader {
    private String fullName;
    private int ticketNum;
    private String faculty;
    private int birthDate;
    private int tel;

    public String getFullname() {
        return fullName;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getTicketNum() {
        return ticketNum;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public int getTel() {
        return tel;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    void takeBook(int booktaken) {
        System.out.println(getFullname() + " взял " + booktaken + " книги");
    }

    void takeBook(Book[] books) {
        System.out.print(getFullname() + " взял книги: ");

        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getBookName());

            if (i != books.length - 1) {
                System.out.print(", ");
            }
        }
    }

    void returnBook(int bookTaken) {
        System.out.println(getFullname() + " вернул " + bookTaken + " книги");
    }

    void returnBook(Book[] books) {
        System.out.print(getFullname() + " вернул книги: ");

        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getBookName());

            if (i != books.length - 1) {
                System.out.print(", ");
            }
        };
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", ticketNum=" + ticketNum +
                ", faculty='" + faculty + '\'' +
                ", birthDate=" + birthDate +
                ", tel=" + tel +
                '}';
    }
}
