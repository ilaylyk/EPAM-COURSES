package com.company.task_1;

public class Task_10 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 1; i < array.length; i+=2) {
            array[i] = 0;
        }
        for (int i : array) {
            System.out.print(i + "  ");
        }
    }
}
