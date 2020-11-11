package com.company.task_4;

import java.util.Random;

public class Task_8 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[9];

        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            System.out.print(array[i] + ", ");
        }

        getSum(1, 3, array);
        getSum(4, 6, array);
        getSum(7, 9, array);
    }

    public static void getSum(int k, int m, int[] array) {
        int sum = 0;
        for (int i = k - 1; i <= m - 1; i++) {
            sum += array[i];
        }
        System.out.println('\n' + "Amount from " + k + " to " + m + " = " + sum);
    }
}
