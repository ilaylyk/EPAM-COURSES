package com.company.task_1;

public class Task_5 {
    public static void main(String[] args) {
        int[] array = {2, 5, 6, -12, 17, 19, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.println("Write:  " + array[i]);
            }
        }
    }
}
