package com.company.Task_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите угол: FirstAngle");
        int FirstAngle = scanner.nextInt();

        System.out.println("Введите угол: SecondAngle");
        int SecondAngle = scanner.nextInt();

        if (FirstAngle + SecondAngle < 180){
            System.out.println("Такой треугольник существует");
            if (FirstAngle == 90 || SecondAngle == 90 || FirstAngle + SecondAngle == 180) {
                System.out.println("Это треугольник прямоугольный");
            } else {
                System.out.println("Это треугольник не прямоугольный");
            }
        } else {
            System.out.println("Такого треугольника не существует:");
        }
        scanner.close();
    }
}
