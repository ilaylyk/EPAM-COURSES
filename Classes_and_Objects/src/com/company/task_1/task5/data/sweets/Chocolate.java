package com.company.task_1.task5.data.sweets;

public class Chocolate extends Sweetness {
    private static int cost = 50;

    public String getName() {
        return "chocolate";
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        Chocolate.cost = cost;
    }

    @Override
    public String toString() {
        return "Chocolate " + getCost() + "$";
    }
}
