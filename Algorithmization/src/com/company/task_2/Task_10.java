package com.company.task_2;

import java.util.ArrayList;
import java.util.List;

public class Task_10 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        List<Integer> elements = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) ((Math.random() * 20) - 10);
                if (i == j && array[i][j] > 0) {
                    elements.add(array[i][j]);
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Positive elements of the main diagonal: " + elements);
    }
}
