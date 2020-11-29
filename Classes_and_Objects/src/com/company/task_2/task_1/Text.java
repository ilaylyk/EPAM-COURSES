package com.company.task_2.task_1;

import java.util.ArrayList;

public class Text {
    private final Word heading;
    private final ArrayList<String> content = new ArrayList<>();

    public Text(Word heading) {
        this.heading = heading;
    }

    public void addSentence(String sentence) {
        this.content.add(sentence);
    }

    public void printText() {
        System.out.println(heading);
        content.forEach(System.out::println);
    }

    public void printHeading() {
        System.out.println(heading);
    }
}
