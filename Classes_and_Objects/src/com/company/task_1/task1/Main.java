package com.company.task_1.task1;

public class Main {
    public static void main(String[] args) {
        Directory package1 = new Directory("Package_1");
        File textFile1 = new TextFile(package1, "textFile1.txt");
        File textFile2 = new TextFile("textFile5.txt");
        package1.addFile(textFile2);
        textFile2.setFileName("textFile2.txt");
        File textFile3 = new TextFile(package1, "textFile3.txt");
        package1.removeFile("textFile1.txt");
        package1.printContent();

    }
}
