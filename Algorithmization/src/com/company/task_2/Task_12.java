package com.company.task_2;

import java.util.Arrays;

public class Task_12 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int)(Math.random()* 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] mas : array) {
            Arrays.sort(mas);
        }

        System.out.println();

        for (int[] mas : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(mas[j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] mas : array) {
            for (int j = array.length - 1; j >= 0; j--) {
                System.out.print(mas[j] + " ");
            }
            System.out.println();
        }
    }
}
