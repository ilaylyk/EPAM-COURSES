package com.company.task_1;

import java.util.Scanner;

public class Task_1 {
    public static int findSum(int[] array, int k) {
        int result = 0;
        for (int j : array) {
            if ((j % k) == 0) {
                result += j;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: k");
        int k = scanner.nextInt();

        scanner.close();

        System.out.println("Sum: " + findSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, k));
    }
}
