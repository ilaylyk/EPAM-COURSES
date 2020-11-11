package com.company.task_2;

public class Task_10 {
    public static void main(String[] args) {
        String s = "Are String! objects immutable? therefore all operations! which modify lines.";

        System.out.print("Total sentence:  " + countSentences(s));
    }

    public static int countSentences(String s) {
        String[] mas = s.split("!|\\?|\\.");
        return mas.length;
    }
}
