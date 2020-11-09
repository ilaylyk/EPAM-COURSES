package com.company.task_4;

import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        System.out.print("Enter a natural number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Number of operations until zero is reached: " + sumOperations(n));
    }

    public static int sumOperations(int n) {
        int count = 0;
        while (n != 0) {
            n -= sumOfDigits(n);
            count++;
        }
        return count;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
