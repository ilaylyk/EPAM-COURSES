package com.company.task_4;

public class Task_6 {
    public static void main(String[] args) {
        int a = 8;
        int b = 15;
        int c = 49;

        boolean coprime = areCoprime(a, b, c);

        System.out.println("Numbers " + a + ", " + b + ", " + c + (coprime ? " are" : " are not ") + "mutually simple");
    }

    public static boolean areCoprime(int a, int b, int c) {
        return nod(a, b) == 1 && nod(b, c) == 1 && nod(a, c) == 1;
    }

    public static int nod(int a, int b) {

        return (b == 0) ? a : nod(b, a % b);
    }
}
