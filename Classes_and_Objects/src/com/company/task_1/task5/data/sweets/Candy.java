package com.company.task_1.task5.data.sweets;

public class Candy extends Sweets {
    private int cost = 80;

    public String getName() {
        return "candy";
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Candy: " + getCost() + "$";
    }
}
