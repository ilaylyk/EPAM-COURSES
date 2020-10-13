package com.company.Task_3;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input positive number:");
        int a = scanner.nextInt();
        int sum = 0;

        if (a > 0) {
            for (int i = 0; i <= a; i++) {
                sum += i;
            }
        } else {
            System.out.println("Incorrect number entered: ");
        }
        System.out.println(sum);
    }
}
