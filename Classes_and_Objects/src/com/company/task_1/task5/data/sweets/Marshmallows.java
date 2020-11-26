package com.company.task_1.task5.data.sweets;

public class Marshmallows extends Sweets {
    private int cost = 35;

    public String getName() {
        return "marshmallow";
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Marshmallow: " + getCost() + "$";
    }
}
