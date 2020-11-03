package com.company.task_4;

import java.util.Scanner;

public class Task_2 {
    public static int nod1(int a, int b) {

        return (b == 0) ? a : nod1(b, a % b);
    }

    public static int nod2(int c, int d) {

        return (d == 0) ? c : nod2(d, c % d);
    }

    public static int result(int nod1, int nod2) {

        return (nod2 == 0) ? nod1 : result(nod2, nod1 % nod2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two 4 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println("HOD 4 numbers: " + result(nod1(a, b), nod2(c, d)));
    }
}
