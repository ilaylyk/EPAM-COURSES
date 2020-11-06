package com.company.task_2;

public class Task_4 {
    public static void main(String[] args) {
        String s = "информатика";

        String result = s.substring(7, 8).concat(s.substring(3, 5)).concat(s.substring(7, 8));

        System.out.printf("Original word: %s\n\nSearch word: %s", s, result);
    }
}
