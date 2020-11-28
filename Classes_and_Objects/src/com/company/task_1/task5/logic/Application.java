package com.company.task_1.task5.logic;

import com.company.task_1.task5.data.Present;
import com.company.task_1.task5.data.packaging.Box;
import com.company.task_1.task5.data.packaging.material.Color;
import com.company.task_1.task5.data.packaging.material.TypeBoxMaterial;
import com.company.task_1.task5.data.sweets.Sweetness;


import java.util.Scanner;

public class Application {

    SweetFactory sweetFactory = new SweetFactory();
    Scanner in = new Scanner(System.in);

    public void run() {

        Box box = choiceBox();
        Present present = new Present(box);
        addSweetsInPresent(present);

        System.out.println(present.toString());
    }

    public Box choiceBox() {
        TypeBoxMaterial type;
        Color color;

        String choiceMaterial;
        String choiceColor;

        System.out.print("\t\tGetting started creating a gift" + "\nSelect material for packaging: "
                + "cardboard, tree, metal." + "\nWrite material: ");

        while (!(in.hasNext("cardboard") | in.hasNext("tree") | in.hasNext("metal"))) {
            System.out.println("\nUnfortunately, there is no such material, write again: ");
            in.next();
        }
        choiceMaterial = in.next();
        type = TypeBoxMaterial.fromStringTypeBoxMaterial(choiceMaterial);

        System.out.print("\nSelect the color of the package" + "\n1 - red, 2 - green, 3 - white, 4 - blue, 5 - yellow"
                + "\nInsert the number: ");

        while (!(in.hasNext("red") | in.hasNext("green") | in.hasNext("white")
                | in.hasNext("blue") | in.hasNext("yellow"))) {
            System.out.println("\nYou have chosen the wrong color");
            in.next();
        }
        choiceColor = in.next();
        color = Color.fromString(choiceColor);

        return new Box(type, color);
    }

    public void addSweetsInPresent(Present coolPresent) {
        System.out.print("\nSelect the sweets to add as a gift: "
                + "biscuit, candy, chocolate, marmalade, marshmallows" + "\nIf there are enough sweets, then write 'exit'\n>>");

        do {
            while (!(in.hasNext("biscuit") | in.hasNext("candy") | in.hasNext("chocolate") | in.hasNext("marmalade")
                    | in.hasNext("marshmallow"))) {
                System.out.println("\nThere is no such yummy, write again\n>>");
                in.next();
            }

            String choiceSweet = in.next();

            Sweetness sweet = sweetFactory.getSweets(choiceSweet);
            coolPresent.addSweets(sweet);

            System.out.println("Maybe something else tasty?:)\n>>");
        } while (!in.hasNext("exit"));
    }
}
