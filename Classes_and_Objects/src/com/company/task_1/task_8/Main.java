package com.company.task_1.task_8;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SosediCustomers constantClient = new SosediCustomers(new ArrayList<>());
        Customer myCustomer = new Customer(1, "Ribin", "Victor", "Sergeevich",
                "Minsk", 1457893215687811L, new BigInteger("12351616546545678"));
        constantClient.addCustomer(myCustomer);
        Customer customer = new Customer(2, "Palchynskaya", "Milana", "Sergeevna",
                "Minsk", 1341141119464159L, new BigInteger("11515610654651165188"));
        constantClient.addCustomer(customer);
        Customer customer1 = new Customer(3, "Pushkin", "Oleg", "Andreevich",
                "Vitebsk", 1111111111111111L, new BigInteger("123418165168415678"));
        constantClient.addCustomer(customer1);
        Customer customer2 = new Customer(4, "Blablablakin", "Victor", "Sergeevich",
                "Minsk", 5299554854123118L, new BigInteger("1233151515134185418"));
        constantClient.addCustomer(customer2);
        Customer customer3 = new Customer(5, "Kukin", "Victor", "Sergeevich",
                "Grodno", 9455151515151433L, new BigInteger("116516516515111250158"));
        constantClient.addCustomer(customer3);
        System.out.println("Sorted by lastname: ");
        constantClient.sortAndPrint();
        System.out.println("Sorted by card : ");
        constantClient.printCustomersCardRange(1300000000000000L, 1460000000000000L);
    }
}
