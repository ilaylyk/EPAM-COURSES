package com.company.task_2;

public class Task_6 {
    public static void main(String[] args) {
        String s = "Get a new one from the given string by repeating each character twice.";

        System.out.printf("Source string:\n\"%s\"\n\nEdited line:\n\"%s\"", s, repeatSymbol(s));

    }

    public static String repeatSymbol(String s) {
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            strBuilder.append(symbol);
            strBuilder.append(symbol);
        }
        return strBuilder.toString();
    }
}
