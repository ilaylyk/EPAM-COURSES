package com.company.task_4;

import java.util.Arrays;

public class Task_12 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getMass(8, 5, 10)));

    }

    public static int[] getMass(int k, int n, int massLength) {
        int[] mass = new int[massLength];
        for (int i = 0; i < massLength; i++) {
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
