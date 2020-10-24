package com.company.task_2;

public class Task_15 {
    public static void main(String[] args) {
        int[][] array = new int[8][8];
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (10 + Math.random() * 89);
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nLargest element = " + max);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = max;
                }

            }

        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.printf("%5d", anInt);
            }
            System.out.println();
        }
    }
}
