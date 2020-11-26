package com.company.task_1.task5.logic;

import com.company.task_1.task5.data.sweets.*;

public class SweetFactory {
    public Sweets getSweets(String name) {
        Sweets toReturn = null;

        switch (name) {
            case "candy":
                toReturn = new Candy();
                break;
            case "chocolate":
                toReturn = new Chocolate();
                break;
            case "marmalade":
                toReturn = new Marmalade();
                break;
            case "marshmallow":
                toReturn = new Marshmallows();
                break;
            case "biscuit":
                toReturn = new Biscuit();
                break;
            default:
                System.out.println("Enter the correct name of the sweet!");
                break;
        }
        return toReturn;
    }
}
