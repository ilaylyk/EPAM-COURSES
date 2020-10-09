package com.company.Task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите: m = ");
        int m = scanner.nextInt();
        System.out.printf("Введите: n = ");
        int n = scanner.nextInt();

        for (int i = m; i <= n; i++){
            System.out.printf(i + " : ");
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    System.out.printf(j + " ");
                }
            }
            System.out.println("");
        }

    }
}
