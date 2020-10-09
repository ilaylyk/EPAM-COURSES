package com.company.Task_2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размеры прямоугольного отверстия: ");
        System.out.print(" A ");
        double A = scanner.nextDouble();
        System.out.print(" B ");
        double B = scanner.nextDouble();

        System.out.println("Введите размеры кирпича: ");
        System.out.printf("x = ");
        double x = scanner.nextDouble();
        System.out.printf("y = ");
        double y = scanner.nextDouble();
        System.out.printf("z = ");
        double z = scanner.nextDouble();

        double x1 = Math.min(x, Math.min(y, z));
        double z2 = Math.max(x, Math.max(y, z));
        double y3 = x + y + z - x1 - z2;

        if ((A > x1 && B > y3) || (A > y3 && B > x1)){
            System.out.println("Кирпич пройдет через отверстие");
        }
        else {
            System.out.println("Кирпич не пройдет через отверстие");
        }
        scanner.close();
    }
}
