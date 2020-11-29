package com.company.task_1.task5.data.sweets;

public class Marmalade extends Sweetness {
    private static int cost = 40;

    public String getName() {
        return "marmalade";
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        Marmalade.cost = cost;
    }

    @Override
    public String toString() {
        return "Marmalade: " + getCost() + "$";
    }
}
