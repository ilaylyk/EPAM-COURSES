package com.company.task_1;

public class Task_4 {
    public static void main(String[] args) {
        String s = "123fa4fsd5gf 6_7,()9";

        System.out.println("String: " + s);
        System.out.println("The number of numbers in a line is " + countNumbers(s));
    }

    private static int countNumbers(String s) {
        char[] c;
        c = s.toCharArray();
        int counter = 0;
        boolean notDigit = true;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(c[i])) {
                if (notDigit) {
                    counter++;
                    notDigit = false;
                }
            } else {
                notDigit = true;
            }
        }
        return counter;
    }
}
