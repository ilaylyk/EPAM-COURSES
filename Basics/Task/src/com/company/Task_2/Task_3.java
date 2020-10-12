package com.company.Task_2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите: x1");
        int x1 = scanner.nextInt();

        System.out.println("Введите: x2");
        int x2 = scanner.nextInt();

        System.out.println("Введите: x3");
        int x3 = scanner.nextInt();

        System.out.println("Введите: y1");
        int y1 = scanner.nextInt();

        System.out.println("Введите: y2");
        int y2 = scanner.nextInt();

        System.out.println("Введите: y3");
        int y3 = scanner.nextInt();

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1) || (x1 == x2 && x1 == x3) || (y1 == y2 && y1 == y3)){
            System.out.println("Точки лежат на одной прямой");
        }
        else {
            System.out.println("Точки не лежат на одной прямой");
        }
        scanner.close();
    }
}
