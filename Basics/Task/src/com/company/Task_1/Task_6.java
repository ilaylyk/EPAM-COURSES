package com.company.Task_1;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: x");
        double x = scanner.nextDouble();

        System.out.println("Input: y");
        double y = scanner.nextDouble();

        System.out.println((x <= 4 && x >= -4) && (y <= 4 && y >= -3));
        scanner.close();
    }
}
