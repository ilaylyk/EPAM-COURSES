package com.company.task_4;

public class Nod {
    public static int nod(int a, int b) {
        return (b == 0) ? a : nod(b, a % b);
    }
}
