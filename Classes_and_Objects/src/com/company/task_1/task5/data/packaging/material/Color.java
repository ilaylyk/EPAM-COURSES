package com.company.task_1.task5.data.packaging.material;

public enum Color {
    RED, GREEN, WHITE, BLUE, YELLOW;

    public static Color choiceColor(String color) {
        switch (color) {
            case "red":
                return Color.RED;
            case "green":
                return Color.GREEN;
            case "white":
                return Color.WHITE;
            case "blue":
                return Color.BLUE;
            case "yellow":
                return Color.YELLOW;
            default:
                return Color.RED;
        }
    }

    public String printColor() {
        switch (this) {
            case RED:
                return "red";
            case GREEN:
                return "green";
            case WHITE:
                return "white";
            case BLUE:
                return "blue";
            case YELLOW:
                return "yellow";
            default:
                return "color not selected";
        }
    }
}
