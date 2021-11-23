package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 1);
        Book book2 = new Book("100 idea", 100);
        Book book3 = new Book("Three rules", 3);
        Book book4 = new Book("Dictionary", 52);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        Book rst = books[0];
        books[0] = books[3];
        books[3] = rst;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        for (Book bk : books) {
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getCount());
            }
        }

    }
}
