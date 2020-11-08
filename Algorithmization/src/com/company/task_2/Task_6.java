package com.company.task_2;

public class Task_6 {
    public static void main(String[] args) {
        int[][] array = new int[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length - i; j++) {
                array[i][j] = 1;
            }
            for (int j = array.length - (i + 1); j < i + 1; j++) {
                array[i][j] = 1;
            }
        }

        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
