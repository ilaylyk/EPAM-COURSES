package com.company.task_4;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task_15 {
    public static void main(String[] args) {
        System.out.print("Enter the number of digits of the number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i = (int) pow(10, n - 1), j = 0; i < (int) pow(10, n); i++) {
            if (growingNumber(i)) {
                System.out.print(i + "  ");
                j++;
                if (j % 10 == 0) System.out.println();
            }
        }
        System.out.println();
    }

    public static boolean growingNumber(int num) {
        int temp1, temp2;
        while (num != 0) {
            temp1 = num % 10;
            num /= 10;
            temp2 = num % 10;
            if (temp2 - temp1 >= 0) return false;
        }
        return true;
    }
}
