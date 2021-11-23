package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Clean code", 1);
        books[1] = new Book("100 idea", 100);
        books[2] = new Book("Three rules", 3);
        books[3] = new Book("Dictionary", 52);
        printBook(books, null);
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        printBook(books, null);
        printBook(books, "Clean code");
    }

    private static void printBook(Book[] books, String bookName) {
        for (Book book : books) {
            if (bookName == null || book.getName().equals(bookName)) {
                System.out.println(book.getName() + " - " + book.getCount());
            }
        }
    }
}
