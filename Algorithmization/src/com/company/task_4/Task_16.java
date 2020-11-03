package com.company.task_4;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task_16 {
    public static void main(String[] args) {
        System.out.print("Enter the number of digits of the number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for (int i = (int) pow(10, n - 1); i < (int) pow(10, n); i++) {
            if (oddNumber(i)) sum += i;
        }
        System.out.println("The sum of numbers of the specified bit width containing only odd digits: " + sum);
        System.out.println("The number of even digits in the found amount: " + countOfEvenNumbers(sum));
    }

    public static boolean oddNumber(int num) {
        while (num != 0) {
            if (num % 2 == 0) return false;
            num /= 10;
        }
        return true;
    }

    public static int countOfEvenNumbers(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) count++;
            num /= 10;
        }
        return count;
    }
}
