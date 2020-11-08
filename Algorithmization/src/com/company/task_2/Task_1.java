package com.company.task_2;

import java.util.Arrays;

public class Task_1 {
    public static void showArray(int[][] array) {
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void randomArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = new int[5][5];

        randomArray(array);

        showArray(array);

        for (int i = 0; i < array.length; i = i + 2) {
            if (array[0][i] > array[array.length - 1][i]) {
                System.out.println("column " + (i + 1) + ": ");
                for (int j = 0; j < array[i].length; j++) {
                    System.out.println(array[j][i]);
                }
            }
        }
    }
}
