package com.company.task_2.task_1;

public class Main {
    public static void main(String[] args) {
        Word heading = new Word("Heading");
        Text text = new Text(heading);
        text.addSentence("Hello world.");
        text.addSentence("It`s the second sentence");
        System.out.println("HEADING:");
        text.printHeading();
        System.out.println("by.epam.Text: ");
        text.printText();
    }
}
