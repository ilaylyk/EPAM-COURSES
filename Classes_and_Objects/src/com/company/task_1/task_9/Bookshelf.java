package com.company.task_1.task_9;

import java.util.ArrayList;

public class Bookshelf {
    private static int id = 1;
    private final ArrayList<Book> list;

    public Bookshelf(ArrayList<Book> list) {
        this.list = list;
    }

    public void addBook(String title, String author, String publisher, int yearOfPublishing, int numberOfPages, float price,
                        String bindingType) {
        this.list.add(new Book(id, title, author, publisher, yearOfPublishing, numberOfPages, price, bindingType));
        id++;
    }

    public void findByAuthor(String author) {
        list.stream().filter(o -> o.getAuthor() != null && o.getAuthor().equalsIgnoreCase(author)).forEach(System.out::println);
    }

    public void findByPublisher(String publisher) {
        list.stream().filter(o -> o.getPublishingHouse().equalsIgnoreCase(publisher)).forEach(System.out::println);
    }

    public void findAfterYear(int year) {
        list.stream().filter(o -> o.getPublishingYear() > year).forEach(System.out::println);
    }
}
