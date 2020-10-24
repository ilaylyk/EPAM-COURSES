package com.company.task_3;

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6};
        int[] mas = new int[]{7, 8, 9, 10};
        int k = 3;
        System.out.println(Arrays.toString(shift(array, mas, k)));
    }

    private static int[] shift(int[] array, int[] mas, int k) {
        int L = array.length + mas.length;
        array = Arrays.copyOf(array, L);
        int m = k;
        for (int j = 0; j < mas.length; j++) {
            for (int i = array.length - 1; i > k; i--) {
                array[i] = array[i - 1];
                m = i - 1;
            }
            array[m] = mas[mas.length - j - 1];
        }
        return array;
    }
}
