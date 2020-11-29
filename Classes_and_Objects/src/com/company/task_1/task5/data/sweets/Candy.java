package com.company.task_1.task5.data.sweets;

public class Candy extends Sweetness {
    private static int cost = 80;

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Candy: " + getCost() + "$";
    }
}
