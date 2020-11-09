package com.company.task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Task_1 {
    private static void makeTextOperation(String text) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = "Input \"1\" to sort paragraphs by number of sentences; \n"
                + "Input \"2\" to sort words by length in each sentence;\n"
                + "Input \"3\" to sort tokens in sentences in descending order \n"
                + "occurrences of a given character, and in case of equality - alphabetically.\n"
                + "To close the application, input \"exit\"\n";
        String choice = "";
        System.out.println(start);
        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter the command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    sortParagraphs(text);
                    break;
                case "2":
                    sortWords(text);
                    break;
                case "3":
                    sortLexemes(text);
                    break;
                case "exit":
                    System.out.println("\nCompletion of work.");
                    break;
                default:
                    System.out.println("Invalid command. Re-enter the command again.\n");
            }
        }
    }

    private static void sortParagraphs(String text) {
        String[] paragraphs = text.split("\n");
        int[] counterSentences = new int[paragraphs.length];
        int maxLengthParagraph = 0;
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitSentences(paragraphs[i]);
            counterSentences[i] = sentences.length;
            if (maxLengthParagraph < sentences.length) {
                maxLengthParagraph = sentences.length;
            }
        }
        outputShortParagraph(maxLengthParagraph, counterSentences, paragraphs);
        System.out.println();
    }

    private static void outputShortParagraph(int maxLengthParagraph, int[] counterSentences, String[] paragraphs) {
        for (int i = 1; i <= maxLengthParagraph; i++) {
            for (int j = 0; j < counterSentences.length; j++) {
                if (i == counterSentences[j]) {
                    System.out.println(paragraphs[j]);
                }
            }
        }
    }

    private static void sortWords(String text) {
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);
                sortWordsTmp(words);
                wordOutput(words);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void sortWordsTmp(String[] words) {
        for (int k = words.length - 1; k >= 0; k--) {
            for (int m = 0; m < k; m++) {
                if (words[m].length() > words[m + 1].length()) {
                    String tmp = words[m];
                    words[m] = words[m + 1];
                    words[m + 1] = tmp;
                }
            }
        }
    }

    private static void sortLexemes(String text) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a character to sort tokens in descending order: ");
        String letter = reader.readLine();
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);
                sortLexemesTmp(words, letter);
                wordOutput(words);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void sortLexemesTmp(String[] words, String letter) {
        for (int k = words.length - 1; k >= 0; k--) {
            for (int m = 0; m < k; m++) {
                int countRight = 0;
                int countLeft = 0;
                countNumberEntries(words, countLeft, letter, m);
                countNumberEntriesNext(words, countRight, letter, m);
                compareNumberOccurrences(countLeft, countRight, words, m);
            }
        }
    }

    private static void countNumberEntries(String[] words, int countLeft, String letter, int m) {
        for (int n = 0; n < words[m].length(); n++) {
            if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
                countLeft++;
            }
        }
    }

    private static void countNumberEntriesNext(String[] words, int countRight, String letter, int m) {
        for (int n = 0; n < words[m + 1].length(); n++) {
            if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
                countRight++;
            }
        }
    }

    private static void compareNumberOccurrences(int countLeft, int countRight, String[] words, int m) {
        if (countLeft < countRight) {
            String tmp = words[m];
            words[m] = words[m + 1];
            words[m + 1] = tmp;
        } else if (countLeft == countRight) {
            String[] forCompare = {words[m], words[m + 1]};
            Arrays.sort(forCompare);
            words[m] = forCompare[0];
            words[m + 1] = forCompare[1];
        }
    }

    private static String[] splitSentences(String text) {
        Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
        return pattern.split(text);
    }

    private static String[] splitWords(String sentence) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
        return pattern.split(sentence);
    }

    private static void wordOutput(String[] words) {
        for (String word : words) {
            System.out.print(word + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        String text = "Once upon a time there lived an old king of Britain. His name was Lear.\n"
                + "He had three daughters: General, Regan and Cordelia.\n"
                + "One day King Lear called his daughters and said to them: «I am very old and tired.\n"
                + "I cannot be the king of Britain any more.\n"
                + "I want to divide the country into three parts and give one part to each of you.\n"
                + "Each of you will be the queen  of her part of the country.\n"
                + "But first you must tell me how  much you love me.\n"
                + "Then I shall know which of you   must get the better part.»\n"
                + "General and Regan were  not good daughters. They did not love their father. But they were very greedy.\n"
                + "They wanted to become queens very much.\n"
                + "They were glad to hear that their father wanted to divide his country into three parts.\n"
                + "They only thought  how to get the larger and better part of the country.  ";

        makeTextOperation(text);
    }
}
