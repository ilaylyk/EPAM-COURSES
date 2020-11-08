package com.company.task_2;

public class Task_14 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 10);

        int[][] array = new int[x][x];

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                array[i][j] = 1;
            }
        }

        for (int[] mas : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(mas[j] + " ");
            }
            System.out.println();
        }
    }
}
