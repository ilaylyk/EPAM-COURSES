package com.company.task_2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int[] x : array) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("Input string: ");
        int str = scan.nextInt();
        System.out.println("Input column: ");
        int column = scan.nextInt();
        scan.close();

        System.out.println("string " + str + ", column " + column + " value: " + array[str - 1][column - 1]);
    }
}
