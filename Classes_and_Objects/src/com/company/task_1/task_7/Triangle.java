package com.company.task_1.task_7;

public class Triangle {
    private final double aX;
    private final double aY;
    private final double bX;
    private final double bY;
    private final double cX;
    private final double cY;


    public Triangle(double aX, double aY, double bX, double bY, double cX, double cY) {
        this.aX = aX;
        this.aY = aY;
        this.bX = bX;
        this.bY = bY;
        this.cX = cX;
        this.cY = cY;
    }

    private double sideA() {
        return Math.sqrt(Math.pow(aX - bX, 2) + Math.pow(aY - bY, 2));
    }

    private double sideB() {
        return Math.sqrt(Math.pow(bX - cX, 2) + Math.pow(bY - cY, 2));
    }

    private double sideC() {
        return Math.sqrt(Math.pow(aX - cX, 2) + Math.pow(aY - cY, 2));
    }


    public double getPerimeter() {
        return sideA() + sideB() + sideC();
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA()) * (p - sideB()) * (p - sideC()));
    }

    private void meridianIntersection() {
        System.out.println("(" + pointMeridianX() + ", " + pointMeridianY() + ")");
    }

    private double pointMeridianX() {
        return (aX + bX + cX) / 3;
    }

    private double pointMeridianY() {
        return (aY + bY + cY) / 3;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 4, 2, -3, 8, 6);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        triangle.meridianIntersection();
    }
}
