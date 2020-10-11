package com.company.Task_3;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.printf("Введите a = ");
        double a = in.nextDouble();
        System.out.printf("Введите b = ");
        double b = in.nextDouble();
        System.out.printf("Введите h = ");
        double h = in.nextDouble();

        for (double i = a; i <= b; i += h) {
            if (i > 2){
                System.out.println("x = " + i + " y = " + i);
            }
            else {
                System.out.println("x = " + i + " y = " + (-i));
            }
        }

    }
}
