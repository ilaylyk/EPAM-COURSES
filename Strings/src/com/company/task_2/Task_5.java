package com.company.task_2;

public class Task_5 {
    public static void main(String[] args) {
        String shakespeareLine = "    Meet my family. There are five of us – my parents, my elder brother,\n"
                + "my baby    sister and me. First,   meet my mum and dad, Jane and Michael. \n"
                + "My mum enjoys reading and my dad enjoys playing chess with my brother Ken. \n"
                + "My mum is slim and rather tall. She has long red hair and big brown eyes. \n"
                + "She has a very    pleasant smile and a soft voice. My mother is very kind and understanding.   \n"
                + "We are real friends. She is a housewife. As she has three children, she is always busy around the house. \n"
                + "She takes care of my baby sister Meg, who is only three months old.    ";

        System.out.println("Meet  a:  " + countCharacter(shakespeareLine));
    }

    private static int countCharacter(String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'a') {
                counter++;
            }
        }
        return counter;
    }
}
