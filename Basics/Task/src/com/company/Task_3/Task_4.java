package com.company.Task_3;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i <= 200; i++){
            sum += Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}
