package com.company.task_1;

import java.util.Scanner;

public class Task_2 {
    public static int findSum(int[] array, int z) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                result += 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: z");
        int z = scanner.nextInt();

        scanner.close();

        System.out.println("Sum: " + findSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, z));
    }
}
