package com.company.Task_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input corner: FirstAngle");
        int firstAngle = scanner.nextInt();

        System.out.println("Input corner: SecondAngle");
        int secondAngle = scanner.nextInt();

        if (firstAngle + secondAngle < 180) {
            System.out.println("Such triangle exists");
            if (firstAngle == 90 || secondAngle == 90 || firstAngle + secondAngle == 180) {
                System.out.println("This is rectangular triangle");
            } else {
                System.out.println("This triangle is not rectangular");
            }
        } else {
            System.out.println("There is no such triangle:");
        }
    }
}
