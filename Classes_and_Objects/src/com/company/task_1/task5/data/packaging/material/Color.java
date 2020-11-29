package com.company.task_1.task5.data.packaging.material;

public enum Color {
    RED("red"), GREEN("green"), WHITE("white"), BLUE("blue"), YELLOW("yellow");

    Color(String name) {
        this.name = name;
    }

    public String name;

    public static Color fromString(String value) {
        for (Color color : Color.values()) {
            if (color.name.equals(value)) return color;
        }
        throw new IllegalArgumentException("Unknown color");
    }
}
