package com.company.task_2;

public class Task_7 {
    public static void main(String[] args) {
        int n = (int) (3 + Math.random() * 7);
        double[][] array = new double[n][n];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (array[i][j] > 0) {
                    count++;
                }
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println("Positive elements in a matrix:   " + count);
    }
}
