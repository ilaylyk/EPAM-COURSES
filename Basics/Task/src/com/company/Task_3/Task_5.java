package com.company.Task_3;

import java.io.UnsupportedEncodingException;

public class Task_5 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String s = "A"+"a"+"C"+"U"+"o";
        byte[] b = s.getBytes("US-ASCII");
        for (int i=0;i<5;i++){
            System.out.println(b[i]);
        }
    }
}
