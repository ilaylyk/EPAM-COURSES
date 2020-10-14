package com.company.Task_1;

import java.util.Scanner;

public class Task_2 {
    public static double calculating(double a, double b, double c) {
        return ((b - Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: a");
        double a = scanner.nextDouble();

        System.out.println("Input: b");
        double b = scanner.nextDouble();

        System.out.println("Input: c");
        double c = scanner.nextDouble();

        System.out.println(calculating(a, b, c));
        scanner.close();
    }
}
