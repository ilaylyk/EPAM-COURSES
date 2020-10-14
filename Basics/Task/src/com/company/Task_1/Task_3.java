package com.company.Task_1;

import java.util.Scanner;

public class Task_3 {
    public static double calculating(double x, double y) {
        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: x");
        double x = scanner.nextDouble();

        System.out.println("Input: y");
        double y = scanner.nextDouble();

        System.out.println(calculating(x, y));
        scanner.close();
    }
}
