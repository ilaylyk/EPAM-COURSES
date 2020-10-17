package com.company.task_1;


public class Task_3 {
    public static void main(String[] args) {
        int[] array = {2, 5, 6, -12, 17, 19, 0};

        int resultPositive = 0;
        int resultZero = 0;
        int resultNegative = 0;

        for (int j : array) {
            if (j >= 1) {
                resultPositive += 1;
            } else if (j <= -1) {
                resultNegative += 1;
            } else if (j == 0) {
                resultZero += 1;
            }
        }

        System.out.println("Sum pisitive:  " + resultPositive);
        System.out.println("Sum zero:  " + resultZero);
        System.out.println("Sum negative:  " + resultNegative);
    }

}
