package com.company.Task_3;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a = ");
        double a = scanner.nextDouble();
        System.out.print("Input b = ");
        double b = scanner.nextDouble();
        System.out.print("Input h = ");
        double h = scanner.nextDouble();

        scanner.close();

        for (double i = a; i <= b; i += h) {
            if (i > 2) {
                System.out.println("x = " + i + " y = " + i);
            } else if (i <= 2) {
                System.out.println("x = " + i + " y = " + (-i));
            }
        }
    }
}
