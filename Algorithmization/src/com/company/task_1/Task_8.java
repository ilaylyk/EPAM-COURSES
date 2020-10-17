package com.company.task_1;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task_8 {
    private static int[] removeMin(int[] a, int r) {
        return Arrays.stream(a).filter(i -> i != r).toArray();
    }

    private static int min(int[] a) {
        return Arrays.stream(a).min().orElse(Integer.MIN_VALUE);
    }


    public static void main(String[] args) {
        int[] a = ThreadLocalRandom.current().ints(10, 0, 5).toArray();
        int min = min(a);
        int[] b = removeMin(a, min);

        for (int j : a) {
            System.out.print("  " + j);
        }

        System.out.println();
        for (int j : b) {
            System.out.print("  " + j);
        }
    }
}
