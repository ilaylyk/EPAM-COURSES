package com.company.task_4;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int numOne = scanner.nextInt();
        System.out.print("Input second number: ");
        int numTwo = scanner.nextInt();
        scanner.close();

        printGreaterNumberCount(numOne, numTwo);
    }

    public static void printGreaterNumberCount(int numOne, int numTwo) {
        if (countOfDigits(numOne) > countOfDigits(numTwo))
            System.out.println("The first number has more digits: ");
        else if (countOfDigits(numOne) < countOfDigits(numTwo))
            System.out.println("The second number has more digits: ");
        else
            System.out.println("Numbers have the same number of digits: ");
    }

    public static int countOfDigits(int num) {
        if (num == 0) return 1;
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
