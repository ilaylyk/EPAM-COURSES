package com.company.Task_2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: x1");
        int x1 = scanner.nextInt();

        System.out.println("Input: x2");
        int x2 = scanner.nextInt();

        System.out.println("Input: x3");
        int x3 = scanner.nextInt();

        System.out.println("Input: y1");
        int y1 = scanner.nextInt();

        System.out.println("Input: y2");
        int y2 = scanner.nextInt();

        System.out.println("Input: y3");
        int y3 = scanner.nextInt();

        if ((x1 == x2 && x1 == x3) || (y1 == y2 && y1 == y3) || (x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("The points lie on one straight line");
        } else {
            System.out.println("Points do not lie on one straight line");
        }
    }
}
