package com.company.task_2;

public class Task_3 {
    private static boolean isPalindrome(String word) {
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            String a = String.valueOf(word.charAt(i));
            String b = String.valueOf(word.charAt(word.length() - i - 1));
            if (!a.equalsIgnoreCase(b)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        String[] words = {"level", "referee", "palindrome", "madam", "AAAddddAAA"};

        for (String word : words) {
            String result = isPalindrome(word) ? " - palindrome" : " - not palindrome";
            System.out.println(word + result);
        }
    }
}
