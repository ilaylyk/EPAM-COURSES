package com.company.task_2;

public class Task_10 {
    public static void main(String[] args) {
        String s = "Are String! objects immutable? therefore all operations! which modify lines.";

        System.out.print("Total offers:  " + countTopic(s));
    }

    public static int countTopic(String s) {
        String[] mas = s.split("!|\\?|\\.");
        return mas.length;
    }
}
