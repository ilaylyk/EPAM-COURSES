package com.company.task_4;

import java.util.Arrays;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nToMassive(459856)));
    }

    public static int[] nToMassive(int n) {
        String number = String.valueOf(n);
        int[] array = new int[number.length()];
        for (int i = number.length() - 1; i >= 0; i--) {
            array[i] = n % 10;
            n = n / 10;
        }
        return array;
    }
}
