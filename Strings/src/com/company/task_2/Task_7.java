package com.company.task_2;

public class Task_7 {
    private static String removeReplays(String line) {
        StringBuilder strBuilder = new StringBuilder(line);
        for (int i = 0; i < strBuilder.length(); i++) {
            char ch = strBuilder.charAt(i);

            if (ch == ' ') {
                strBuilder.deleteCharAt(i);
                i--;
            }

            for (int j = i + 1; j < strBuilder.length(); j++) {
                if (strBuilder.charAt(j) == ch) {
                    strBuilder.deleteCharAt(j);
                }
            }
        }
        return strBuilder.toString();
    }

    public static void main(String[] args) {
        String line = "aabc   cde def";

        System.out.println("String:\n" + line);
        System.out.println("\nLine with changes:\n" + removeReplays(line));
    }
}
