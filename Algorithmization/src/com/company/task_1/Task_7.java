package com.company.task_1;

public class Task_7 {
    public static void main(String[] args) {
        double[] array = {2, 1, 3, 2, 4, 5, 9, 1};
        double max = array[0] + array[array.length - 1];
        double temp;
        int indexOfFirst = 0;
        int indexOfSecond = 0;

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i] + array[array.length - 1 - i];
            if (temp > max) {
                max = temp;
                indexOfFirst = i;
                indexOfSecond = array.length - 1 - i;
            }
        }

        System.out.println("array[" + indexOfFirst + "] + array[" + indexOfSecond + "] = " + max);
    }
}
