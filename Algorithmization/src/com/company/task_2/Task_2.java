package com.company.task_2;


public class Task_2 {
    public static void diagonalElements(int[][] matrixA) {
        int j = 0;
        for (int[] ints : matrixA) {
            System.out.print(ints[j] + "\t");
            j++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 8;
        int m = 8;
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int[] x : array) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        diagonalElements(array);
    }
}
