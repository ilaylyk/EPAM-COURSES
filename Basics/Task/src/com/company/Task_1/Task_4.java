package com.company.Task_1;

import java.util.Scanner;

public class Task_4 {
    public static double calculating(double a) {
        return (a * 1000) % 1000 + (int) a / 1000.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input fractional number: a");
        double a = scanner.nextDouble();

        System.out.println(calculating(a));
    }
}
