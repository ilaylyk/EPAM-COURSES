package com.company.task_1;

public class Task_9 {
    public static void main(String[] args) {
        int[] array = {2, 1, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1};
        int countmax = 0;
        int ncount;
        int number = 0;

        for (int i = 0; i < array.length; ++i) {
            ncount = 1;
            for (int j = i + 1; j < array.length; ++j) {
                if (array[i] == array[j])
                    ++ncount;
            }
            if (ncount > countmax) {
                countmax = ncount;
                number = array[i];
            } else {
                number = (ncount == countmax) ? Math.min(number, array[i]) : number;
            }
        }
        System.out.println("Number:  " + number + " Count:  " + countmax);
    }
}
