package com.company.Task_1;

import java.util.Scanner;

public class Task_1 {
    public static double calculating(double a, double b, double c){
        return ((a - 3) *  b / 2) + c;
    }

    public static void main(String[] args) {
        System.out.println("Программа выполняет вычисление по формуле z = ((a-3)*b/2) + c");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите: a ");
        double a = scanner.nextDouble();

        System.out.println("Введите: b");
        double b = scanner.nextDouble();

        System.out.println("Введите: c");
        double c = scanner.nextDouble();

        System.out.println(calculating(a, b, c));
        scanner.close();
    }
}
