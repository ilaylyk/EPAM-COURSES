package com.company.task_2;

public class Task_13 {
    public static void main(String[] args) {
        int[][] array = new int[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    if (array[i][k] > array[j][k]) {
                        array[i][k] = array[i][k] ^ array[j][k];
                        array[j][k] = array[i][k] ^ array[j][k];
                        array[i][k] = array[i][k] ^ array[j][k];
                    }
                }
            }
        }
        System.out.println();

        for (int[] mas : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(mas[j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
