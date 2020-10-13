package com.company.Task_3;

import java.nio.charset.StandardCharsets;

public class Task_5 {
    public static void main(String[] args) {
        String s = "A" + "a" + "C" + "U" + "o";
        byte[] b = s.getBytes(StandardCharsets.US_ASCII);
        for (int i = 0; i < 5; i++) {
            System.out.println(b[i]);
        }
    }
}
