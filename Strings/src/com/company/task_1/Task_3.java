package com.company.task_1;

public class Task_3 {
    public static void main(String[] args) {
        String s = "123fa4fsd5gf 6_7,()9";

        System.out.println("String: " + s);
        System.out.println("Number of digits in a line " + countDigits(s));
    }

    private static int countDigits(String s) {
        char[] c;
        c = s.toCharArray();
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(c[i]))
                counter++;
        }
        return counter;
    }
}
