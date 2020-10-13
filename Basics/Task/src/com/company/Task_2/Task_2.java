package com.company.Task_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: a");
        int a = scanner.nextInt();

        System.out.println("Input: b");
        int b = scanner.nextInt();

        System.out.println("Input: c");
        int c = scanner.nextInt();

        System.out.println("Input: d");
        int d = scanner.nextInt();

        int max = Math.max(Math.min(a, b), Math.min(c, d));

        System.out.println("max = " + max);
    }
}
