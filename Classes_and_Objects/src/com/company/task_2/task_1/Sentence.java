package com.company.task_2.task_1;

public class Sentence {
    private final String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "sentence='" + sentence + '\'' +
                '}';
    }
}
