package com.company.Task_3;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many symbols do you want to enter? - ");
        int quantity = scanner.nextInt();
        for (int i = 1; i <= quantity; i++) {
            System.out.print(i + " Symbol: ");
            char Symbol = scanner.next().charAt(0);
            System.out.print("Number: " + (int) Symbol);
            System.out.println();
        }
        scanner.close();
    }
}
