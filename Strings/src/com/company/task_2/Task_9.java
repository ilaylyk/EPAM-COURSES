package com.company.task_2;

import java.util.Scanner;

public class Task_9 {
    private static int countLowerCase(String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                counter++;
            }
        }
        return counter;
    }

    private static int countUpperCase(String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);
            if (letter >= 'A' && letter <= 'Z') {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String line = scanner.nextLine();
        scanner.close();

        System.out.printf("\nLower case letter: %d%n", countLowerCase(line));
        System.out.printf("Upper case letter: %d%n", countUpperCase(line));
    }
}
