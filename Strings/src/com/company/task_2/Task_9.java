package com.company.task_2;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        scanner.close();

        String str1 = line.replaceAll("[^A-Z]", "");
        String str2 = line.replaceAll("[^a-z]", "");

        System.out.println("Upper case letter = " + str1.length());
        System.out.println("Lower case letter = " + str2.length());
    }
}
