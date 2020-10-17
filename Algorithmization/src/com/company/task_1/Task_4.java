package com.company.task_1;

public class Task_4 {
    public static void main(String[] args) {
        int[] array = {2, 5, 6, -12, 17, 19, 0};

        int max = 0;
        int min = 0;
        int temp;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
            if (array[i] < array[min]) {
                min = i;
            }
        }

        temp = array[max];
        array[max] = array[min];
        array[min] = temp;

        for (int j : array) {
            System.out.print(j + "  ");
        }
    }
}
