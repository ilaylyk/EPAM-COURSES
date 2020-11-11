package com.company.task_4;

import java.util.Arrays;

public class Task_12 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildArray(8, 5, 10)));

    }

    public static int[] buildArray(int k, int n, int arrayLength) {
        int[] mass = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            mass[i] = getNumber(k, n);
        }
        return mass;
    }

    public static int getNumber(int k, int n) {
        int i = 0;
        String temp = "";
        while (i < k) {
            int x = (int) (Math.random() * n + 1);
            i = i + x;
            temp = temp.concat(String.valueOf(x));
        }
        int number = Integer.parseInt(temp);
        if (i > k) {
            number = number - (i % k);
        }
        return number;
    }
}
