package com.company.Task_1;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Time: ");
        int t = scanner.nextInt();

        int s = t % 60;
        t = (t - s) / 60;
        int m = t % 60;
        t = (t - m) / 60;

        System.out.println(t + " ч " + m + " мин " + s + " с ");
        scanner.close();
    }
}
