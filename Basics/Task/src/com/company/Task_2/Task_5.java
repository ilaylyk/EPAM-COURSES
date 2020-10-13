package com.company.Task_2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: x");
        double x = scanner.nextDouble();

        if (x <= 3) {
            System.out.println(Math.pow(x, 2) - 3 * x + 9);
        } else if (x > 3) {
            System.out.println(1 / (Math.pow(x, 3) + 6));
        }
    }
}
