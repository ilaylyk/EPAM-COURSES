package com.company.task_4;

import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 4, 1, 3};
        Arrays.sort(array);
        System.out.println("Second largest number: " + array[array.length - 2]);
    }
}
