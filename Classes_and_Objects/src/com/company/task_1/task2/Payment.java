package com.company.task_1.task2;


import java.util.ArrayList;
import java.util.List;

public class Payment {
    private static class Product {
        public String name;
        public int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }

    private final List<Product> products;

    public Payment() {
        products = new ArrayList<>();
    }

    public void addProduct(String name, int price) {
        products.add(new Product(name, price));
        System.out.println("Added product: " + name + ", price = " + price);
    }

    public int getAmount() {
        int amount = 0;
        for (Product product : products) {
            amount += product.price;
        }
        return amount;
    }
}
