package com.company.task_4;

import java.util.Scanner;

public class Task_3 {
    public static double calculateAreaOfTriangle(int a) {
        return (3 * Math.sqrt(3)) / 2 * Math.pow(a, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input side a: ");
        int a = scanner.nextInt();

        System.out.println("Area of a triangle:  " + calculateAreaOfTriangle(a));
    }
}
