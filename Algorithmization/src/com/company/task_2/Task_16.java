package com.company.task_2;

public class Task_16 {
    public static void main(String[] args) {
        int n = 3;
        int[][] a = new int[n + 1][n + 1];
        System.out.println("Source matrix: ");
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                a[i][j] = 1 + ((i + j - 1 + (n - 1) / 2) % n) * n + ((i + 2 * j + 2) % n);
                if (a[i][j] < 10)
                    System.out.print(" ");
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
    }
}
