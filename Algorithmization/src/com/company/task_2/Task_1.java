package com.company.task_2;

public class Task_1 {
    public static void main(String[] args) {
        int n = 5, m = 10;
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Source matrix: ");
        for (int[] x : array) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        int[] range = new int[m];
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (array[0][i] > array[n - 1][i] && i % 2 == 0) {
                range[count++] = i;
            }
        }

        System.out.println("Odd columns in which the first element is greater than the last: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < count; k++) {
                    if (j == range[k]) System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
