package com.company.Task_3;


import java.math.BigInteger;

public class Task_4 {
    public static void main(String[] args) {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= 200; i++) {
            BigInteger bigInteger = BigInteger.valueOf(i);
            result = result.multiply(bigInteger).multiply(bigInteger);
        }
        System.out.println(result);
    }
}
