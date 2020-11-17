package com.company.task_1.task_8;

import java.util.ArrayList;

public class SosediCustomers {
    private final ArrayList<Customer> list;

    public SosediCustomers(ArrayList<Customer> list) {
        this.list = list;
    }

    public void addCustomer(Customer customer) {
        this.list.add(new Customer(customer.id, customer.subName, customer.firstName, customer.patronymic, customer.address, customer.cardNumber,
                customer.bankAccountNumber));
    }


    public void sortAndPrint() {
        list.stream().sorted().forEach(System.out::println);
    }

    public void printCustomersCardRange(long a, long b) {
        list.stream().sorted().filter(o -> o.getCardNumber() >= a && o.getCardNumber() <= b).forEach(System.out::println);
    }
}
