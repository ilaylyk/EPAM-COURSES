package com.company.task_2;

public class Task_4 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = j + 1;
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            if (i % 2 != 0) {
                for (int j = 9; j >= 0; j--) {
                    array[i][j] = j + 1;
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
