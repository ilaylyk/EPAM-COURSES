package com.company.task_1.task5.data.sweets;

public class Biscuit extends Sweetness {
    private static int cost = 15;

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Biscuit: " + getCost() + "$";
    }
}
