package com.company.task_1.task5.data;

import com.company.task_1.task5.data.packaging.Box;
import com.company.task_1.task5.data.sweets.Sweetness;


import java.util.ArrayList;

public class Present {
    private final ArrayList<Sweetness> sweets = new ArrayList<>();
    private Box box;

    public Present(Box box) {
        this.box = box;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public ArrayList<Sweetness> getSweets() {
        return sweets;
    }

    public void addSweets(Sweetness sweet) {
        sweets.add(sweet);
    }

    public int sumCost() {
        int sum = 0;
        for (Sweetness x : sweets) {
            sum += x.getCost();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Gift: material " + box.getTypeBoxMaterial().printTypeBoxMaterial() + ", color: "
                + box.getColor().printColor() + "." + "\nSweets in a box: " + sweets.toString() + "."
                + "\nFor total cost " + sumCost() + "$.";
    }
}
