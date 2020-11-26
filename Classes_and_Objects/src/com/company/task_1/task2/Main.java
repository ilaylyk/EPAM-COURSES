package com.company.task_1.task2;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addProduct("phone", 1500);
        payment.addProduct("fish", 2);
        payment.addProduct("water", 1);
        System.out.println("Total amount of payment = " + payment.getAmount());
    }
}
