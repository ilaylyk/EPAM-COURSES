package com.company.task_1.task_9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf(new ArrayList<>());
        Book book = new Book(1, "Java. A beginner`s Guide", "Herbert Schildt", "Williams publishing",
                2017, 720, 60.00f, "hardcover");
        bookshelf.addBook(book);
        Book book1 = new Book(2, "RICH DAD, POOR DAD", "Robert T. Kiyosaki", "Plata Publishing",
                2011, 350, 12.50f, "paperback");
        bookshelf.addBook(book1);
        Book book2 = new Book(3, "Maintenance manual BMW 5 series", null, "Grand",
                1997, 143, 0, "paperback");
        bookshelf.addBook(book2);
        Book book3 = new Book(4, "Maintenance manual BMW 5 series", "Herbert Schildt", "Grand",
                2005, 143, 0, "paperback");
        bookshelf.addBook(book3);
        System.out.println("by Author: ");
        bookshelf.findByAuthor("Herbert Schildt");
        System.out.println("by publisher: ");
        bookshelf.findByPublisher("Grand");
        System.out.println("after year: ");
        bookshelf.findAfterYear(2000);
    }
}
