package com.company.task_4;

import java.util.Scanner;

public class Task_1 {
    public static int nod(int a, int b) {

        return (b == 0) ? a : nod(b, a % b);
    }

    public static int nok(int a, int b) {

        return a / nod(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        System.out.println("HOD: " + nod(a, b));
        System.out.println("HOK: " + nok(a, b));
    }
}
