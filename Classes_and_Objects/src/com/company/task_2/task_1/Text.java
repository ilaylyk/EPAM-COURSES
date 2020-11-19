package com.company.task_2.task_1;

import java.util.ArrayList;

public class Text {
    private final Word heading;
    private final ArrayList<Sentence> content;

    public Text(Word heading) {
        this.heading = heading;
        this.content = new ArrayList<>();
    }

    public void addSentence(Sentence sentence) {
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
