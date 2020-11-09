package com.company.task_1;

public class Task_5 {
    private static String removeExtraSpaces(String s) {
        StringBuilder strBuilder = new StringBuilder();
        String line = s.trim();
        boolean isSpace = false;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                if (!isSpace) {
                    strBuilder.append(" ");
                }
                isSpace = true;
            } else {
                strBuilder.append(line.charAt(i));
                isSpace = false;
            }
        }
        return strBuilder.toString();
    }

    public static void main(String[] args) {
        String shakespeareLine = "    Meet my family. There are five of us – my parents, my elder brother,\n"
                + "my baby    sister and me. First,   meet my mum and dad, Jane and Michael. \n"
                + "My mum enjoys reading and my dad enjoys playing chess with my brother Ken. \n"
                + "My mum is slim and rather tall. She has long red hair and big brown eyes. \n"
                + "She has a very    pleasant smile and a soft voice. My mother is very kind and understanding.   \n"
                + "We are real friends. She is a housewife. As she has three children, she is always busy around the house. \n"
                + "She takes care of my baby sister Meg, who is only three months old.    ";

        System.out.println("String:\n" + shakespeareLine);
        System.out.println("String with changes:\n" + removeExtraSpaces(shakespeareLine));
    }
}
