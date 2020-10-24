package com.company.task_2;


public class Task_9 {
    public static void main(String[] args) {
        int[][] array = { { 5, 4, 3, 2, 1 }, { 5, 4, 3, 2, 1 }, { 5, 4, 3, 2, 1 }, { 5, 4, 3, 2, 1 }, { 5, 4, 3, 2, 1 } };
        int[] count = new int[5];

        for (int[] a : array) {
            for (int j = 0; j < array.length; j++) {
                count[j] += a[j];
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSums of ite   ms in columns:");
        for (int j : count) {
            System.out.print(j + " ");
        }

        int max = 0;
        int maxNum = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                maxNum = i + 1;
            }
        }

        System.out.println("\n\nThe column contains the maximum amount № " + maxNum + ", sum" + max);
    }
}
