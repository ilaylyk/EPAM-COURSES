package com.company.task_1.task_9;

import java.util.ArrayList;

public class Bookshelf {
    private final ArrayList<Book> list;

    public Bookshelf(ArrayList<Book> list) {
        this.list = list;
    }

    public void addBook(Book book) {
        this.list.add(new Book(book.id, book.title, book.author, book.publishingHouse, book.publishingYear, book.pageCount, book.price, book.bindingType));
    }


    public void findByAuthor(String author) {
        list.stream().filter(o -> o.getAuthor() != null && o.getAuthor().equalsIgnoreCase(author)).forEach(System.out::println);
    }

    public void findByPublisher(String publishingHouse) {
        list.stream().filter(o -> o.getPublishingHouse().equalsIgnoreCase(publishingHouse)).forEach(System.out::println);
    }

    public void findAfterYear(int year) {
        list.stream().filter(o -> o.getPublishingYear() > year).forEach(System.out::println);
    }
}
