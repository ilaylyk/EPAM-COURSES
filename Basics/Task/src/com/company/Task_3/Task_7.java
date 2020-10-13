package com.company.Task_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_7 {
    private static final Scanner scan = new Scanner(System.in);
    private static final int SIZE = 10;

    public static void main(String[] args) {
        System.out.print("Input first number: ");
        int m = scan.nextInt();
        System.out.print("Input second number: ");
        int n = scan.nextInt();
        System.out.printf("Total amount %d and %d: %s \n", n, m, findAllNumbers(n, m).toString());
    }

    private static ArrayList<Integer> findAllNumbers(int n, int m) {
        ArrayList<Integer> totalNumbers = new ArrayList<>();
        boolean[] firstNumber = getNumbers(n);
        boolean[] secondNumber = getNumbers(m);
        for (int i = 0; i < SIZE; i++) {
            if (firstNumber[i] && secondNumber[i]) {
                totalNumbers.add(i);
            }
        }
        return totalNumbers;
    }

    private static boolean[] getNumbers(int n) {
        boolean[] numbers = new boolean[SIZE];
        int i;
        while (n != 0) {
            i = n % 10;
            numbers[i] = true;
            n /= 10;
        }
        return numbers;
    }
}
