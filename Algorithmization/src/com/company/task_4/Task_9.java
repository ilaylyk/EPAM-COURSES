package com.company.task_4;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task_9 {
    public static void main(String[] args) {
        System.out.print("Enter the sides of the quadrilateral X, Y, Z, T : ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double t = scanner.nextDouble();
        scanner.close();

        System.out.println("Quadrangle area: " + squareQuadrangle(x, y, z, t));
    }

    public static double squareQuadrangle(double x, double y, double z, double t) {
        double s = sqrt(pow(x, 2) + pow(y, 2));
        return squareRightTriangle(x, y) + squareTriangleGeron(z, t, s);
    }

    public static double squareTriangleGeron(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return sqrt(p * (p - x) * (p - y) * (p - z));
    }

    public static double squareRightTriangle(double x, double y) {
        return x * y / 2;
    }
}
