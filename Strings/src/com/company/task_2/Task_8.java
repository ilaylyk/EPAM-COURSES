package com.company.task_2;

import java.util.Scanner;

public class Task_8 {
    public static String findBigWord(String s) {
        String[] array = s.split(" ");

        int max = 0;
        int maxId = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i].length()) {
                max = array[i].length();
                maxId = i;
            }
        }
        return array[maxId];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        scanner.close();

        System.out.print("Longest word: " + findBigWord(s));
    }
}
