package com.company.task_4;

public class Task_13 {
    public static void main(String[] args) {
        int n = 80;

        System.out.printf("Prime numbers \"twins\n\" on the segment from %d to %d:\n", n, 2 * n);

        findAndPrintTwinNumb(n);
    }

    public static void findAndPrintTwinNumb(int n) {
        for (int i = n + 2; i <= 2 * n; i++) {
            if (isSimple(i) && isSimple(i - 2)) {
                System.out.println(i - 2 + " и " + i);
            }
        }
    }

    public static boolean isSimple(int a) {
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
