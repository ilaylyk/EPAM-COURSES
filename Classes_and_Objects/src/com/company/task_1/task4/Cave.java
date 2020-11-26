package com.company.task_1.task4;

import com.company.task_1.task4.treasure.Treasure;
import com.company.task_1.task4.treasure.TreasureType;

import java.util.Arrays;

public class Cave {
    Treasure[] treasures;

    public Cave(int treasureCount) {
        treasures = new Treasure[TreasureType.values().length];
        int treasureIndex = 0;
        for (TreasureType treasureType : TreasureType.values()) {
            int randomAmount;
            if (treasureIndex < TreasureType.values().length - 1) {
                randomAmount = (int) (Math.random() * treasureCount / 2.5);
            } else {
                randomAmount = treasureCount;
            }
            treasures[treasureIndex] = new Treasure(treasureType, randomAmount);
            treasureIndex++;
            treasureCount -= randomAmount;
        }
    }

    public void printCurrentTreasures() {
        System.out.println("Treasures:");
        int total = 0;
        for (Treasure treasure : treasures) {
            System.out.println(treasure);
            total += treasure.getPrice() * treasure.getAmount();
        }
        System.out.println("Total price: " + total);
    }

    public String getMostValuableTreasure() {
        int maxPrice = Integer.MIN_VALUE;
        int indexMax = -1;
        for (int i = 0; i < treasures.length; i++) {
            if (treasures[i].getPrice() > maxPrice && treasures[i].getAmount() > 0) {
                maxPrice = treasures[i].getPrice();
                indexMax = i;
            }
        }
        if (indexMax == -1) {
            return "no treasures";
        } else {
            treasures[indexMax].setAmount(treasures[indexMax].getAmount() - 1);
            return "Got treasure: " + treasures[indexMax].getTitle();
        }
    }

    public void getTreasureBySum(int value) {
        int copyOfValue = value;

        Treasure[] gotTreasures = new Treasure[treasures.length];

        Arrays.sort(treasures, (t1, t2) -> Integer.compare(t2.getPrice(), t1.getPrice()));

        for (int i = 0; i < treasures.length; i++) {
            int n = value / treasures[i].getPrice();
            while (n > treasures[i].getAmount()) {
                n--;
            }
            gotTreasures[i] = new Treasure(treasures[i], n);
            value -= n * treasures[i].getPrice();
        }

        if (value == 0) {
            System.out.println("Treasures by value: " + copyOfValue);
            for (int i = 0; i < gotTreasures.length; i++) {
                if (gotTreasures[i].getAmount() > 0) {
                    treasures[i].setAmount(treasures[i].getAmount() - gotTreasures[i].getAmount());
                    System.out.println(gotTreasures[i]);
                }

            }
        } else {
            System.out.println("Cant get treasures by that value!");
        }
    }
}
