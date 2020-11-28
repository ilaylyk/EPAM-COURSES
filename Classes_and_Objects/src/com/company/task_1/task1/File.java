package com.company.task_1.task1;

public abstract class File {
    private Directory directory;
    private String fileName;

    public File(Directory directory, String fileName) {
        this.directory = directory;
        this.fileName = fileName;
    }

    File(String fileName) {
        this.fileName = fileName;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileName='" + fileName + '\'' +
                '}';
    }
}
