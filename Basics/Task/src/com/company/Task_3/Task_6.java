package com.company.Task_3;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: m = ");
        int m = scanner.nextInt();
        System.out.print("Input: n = ");
        int n = scanner.nextInt();

        scanner.close();

        for (int i = m; i <= n; i++) {
            System.out.print(i + " : ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
