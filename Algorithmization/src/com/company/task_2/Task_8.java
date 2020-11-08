package com.company.task_2;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter column: ");
        int columnOne = scanner.nextInt() - 1;
        System.out.print("Enter column: ");
        int columnTwo = scanner.nextInt() - 1;
        scanner.close();

        for (int i = 0; i < array.length; i++) {
            array[i][columnOne] = array[i][columnOne] ^ array[i][columnTwo];
            array[i][columnTwo] = array[i][columnOne] ^ array[i][columnTwo];
            array[i][columnOne] = array[i][columnOne] ^ array[i][columnTwo];
        }

        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
