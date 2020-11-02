package com.company.task_3;

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{0, 1, 2, 3, 4, 5, 6};
        int[] array2 = new int[]{7, 8, 9, 10};
        int k = 3;
        System.out.println(Arrays.toString(shift(array1, array2, k)));
    }

    private static int[] shift(int[] array1, int[] array2, int k) {
        int L = array1.length + array2.length;
        array1 = Arrays.copyOf(array1, L);
        for (int j = 0; j < array2.length; j++) {
            merge(array1, k);
            array1[k] = array2[array2.length - j - 1];
        }
        return array1;
    }
    public static void merge(int[] array1, int k){
        if (array1.length - 1 - k >= 0) System.arraycopy(array1, k, array1, k + 1, array1.length - 1 - k);
    }
}
