package com.company.task_4;

import java.util.Scanner;

public class Task_2 extends Nod{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two 4 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println("HOD 4 numbers: " + nod(nod(a,b),nod(d,c)));
    }
}
