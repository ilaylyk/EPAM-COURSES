package com.company.task_4;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task_14 {
    public static int numberLength(int number) {
        return (int) log10(number) + 1;
    }

    public static void numArmstrong(int number) {
        System.out.println("Armstrong number in the interim " + 1 + " - " + number + " : ");

        for (int i = 1; i <= number; i++) {
            if (divisor(i) == i) {
                System.out.print(i + ", ");
            }
        }
    }

    public static int divisor(int number) {
        int sum = 0;
        int degree = numberLength(number);
        int powerNumber;
        for (int i = 0; i <= degree; i++) {
            powerNumber = number;
            powerNumber %= 10;
            powerNumber = (int) pow(powerNumber, degree);
            sum += powerNumber;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int number = scanner.nextInt();
        scanner.close();

        numArmstrong(number);
    }
}
