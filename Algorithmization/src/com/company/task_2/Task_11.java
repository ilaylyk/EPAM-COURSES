package com.company.task_2;

import java.util.ArrayList;
import java.util.List;

public class Task_11 {
    public static void main(String[] args) {
        int[][] array = new int[10][20];
        int count = 0;
        List<Integer> number = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 20; j++) {
                array[i][j] = (int) (Math.random() * 15);
                System.out.print(array[i][j] + "  ");
                if (array[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                number.add(i + 1);
            }
            count = 0;
            System.out.println();
        }

        if (number.isEmpty()) {
            System.out.println("Absent!");
        } else {
            System.out.println("Line numbers: " + number);
        }

    }
}
