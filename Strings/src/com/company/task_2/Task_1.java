package com.company.task_2;

public class Task_1 {
    private static final char SPACE = ' ';

    public static void main(String[] args) {
        String shakespeareLine = "    Meet my family. There are five of us – my parents, my elder brother,\n"
                + "my baby    sister and me. First,   meet my mum and dad, Jane and Michael. \n"
                + "My mum enjoys reading and my dad enjoys playing chess with my brother Ken. \n"
                + "My mum is slim and rather tall. She has long red hair and big brown eyes. \n"
                + "She has a very    pleasant smile and a soft voice. My mother is very kind and understanding.   \n"
                + "We are real friends. She is a housewife. As she has three children, she is always busy around the house. \n"
                + "She takes care of my baby sister Meg, who is only three months old.    ";

        System.out.println("String:\n" + shakespeareLine);
        System.out.println("String with changes:\n" + findBiggestNumberOfSpaces(shakespeareLine));
    }

    private static int findBiggestNumberOfSpaces(String line) {
        int counter = 0;
        int maxCount = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == SPACE) {
                counter++;
            } else {
                if (maxCount < counter) {
                    maxCount = counter;
                }
                counter = 0;
            }
        }
        return maxCount;
    }
}
