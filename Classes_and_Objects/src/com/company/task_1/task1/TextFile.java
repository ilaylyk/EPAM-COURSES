package com.company.task_1.task1;

public class TextFile extends File {
    private String text;

    public TextFile(Directory directory, String fileName) {
        super(directory, fileName);
        super.getDirectory().addFile(this);
    }

    TextFile(String fileName) {
        super(fileName);
    }

    public void addText(String line) {
        text = text + "\n" + line;
    }

    public void printText() {
        System.out.println(text);
    }
}
