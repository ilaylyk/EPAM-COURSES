package com.company.task_4;

public class Task_7 {
    public static void main(String[] args) {
        System.out.println("The sum of the factorials of all odd numbers from 1 to 9 is:  " + sumFact());
    }

    public static int sumFact() {
        int sum = 0;

        for (int i = 1; i <= 9; i += 2) {
            sum += factorial(i);
        }

        return sum;
    }

    public static long factorial(int n) {
        if (n < 2) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }
}
