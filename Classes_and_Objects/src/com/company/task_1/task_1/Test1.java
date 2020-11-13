package com.company.task_1.task_1;

public class Test1 {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    private void print() {
        System.out.println("a = " + a + ", b = " + b);
    }

    private int getSumOf() {
        return a + b;
    }

    private int getMaxOf() {
        return a > b ? a : b;
    }

}
