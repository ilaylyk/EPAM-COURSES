package com.company.task_1;


public class Task_6 {
    public static boolean isPrime(int a) {
        if (a < 2) return false;
        int temp;
        for (int i = 2; i <= a / 2; i++) {
            temp = a % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int[] array = new Random().ints(0, 0, 0).toArray();
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (isPrime(i)) {
                sum += array[i];
            }
        }
        System.out.println("Summ: " + sum);
    }
}
