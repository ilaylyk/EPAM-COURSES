package com.company.task_1.task_3;

public class Student {
    private final String surnameAndInitials;
    private final int groupNumber;
    private final int[] rating;

    public Student(String surNameInitials, int groupNumber, int[] rating) {
        this.surnameAndInitials = surNameInitials;
        this.groupNumber = groupNumber;
        this.rating = rating;
    }

    private static void printSuccessfulStudents(Student[] students) {
        for (Student student : students) {
            boolean isGood = true;
            for (int rating : student.rating) {
                if (rating != 9 && rating != 10) {
                    isGood = false;
                    break;
                }
            }
            if (isGood) {
                System.out.println("Name: " + student.surnameAndInitials);
                System.out.println("Group: " + student.groupNumber + "\n");
            }
        }
    }


    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Petrov A.V.", 114221, new int[]{10, 10, 10, 9, 10}),
                new Student("Ivanov V.S.", 114211, new int[]{7, 8, 4, 3, 6}),
                new Student("Galkin A.P.", 114221, new int[]{5, 10, 10, 9, 6}),
                new Student("Vorobiov A.A.", 114211, new int[]{10, 9, 9, 9, 10}),
                new Student("Pelkin I.G.", 114211, new int[]{7, 8, 4, 3, 6}),
                new Student("Vasechkin V.I.", 114221, new int[]{7, 8, 4, 3, 6}),
                new Student("Silich I.I.", 114211, new int[]{2, 9, 6, 4, 10}),
                new Student("Iodo J.A.", 114211, new int[]{9, 9, 10, 8, 10}),
        };
        Student.printSuccessfulStudents(students);
    }
}
