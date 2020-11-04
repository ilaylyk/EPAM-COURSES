package com.company.task_1;

public class Task_2 {
    private static String changeWords(String word) {
        StringBuilder strBuilder = new StringBuilder();
        String letter;

        for (int i = 0; i < word.length(); i++) {
            if (i + 3 < word.length() && word.charAt(i) == 'w' && word.charAt(i + 1) == 'o' && word.charAt(i + 2) == 'r'
                    && word.charAt(i + 3) == 'd') {
                strBuilder.append("letter");
                i += 3;
            } else {
                strBuilder.append(word.charAt(i));
            }
        }
        letter = strBuilder.toString();
        return letter;
    }

    public static void main(String[] args) {
        String word = "displaying word gasbags in going Microsoft word";
        String letter = changeWords(word);

        System.out.println("String:\n" + word);
        System.out.println("String changes:\n" + letter);
    }
}
