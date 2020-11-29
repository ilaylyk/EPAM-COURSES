package com.company.task_2.task_5;

public enum Food {
    BREAKFAST ("BREAKFAST"),
    NOT_INCLUDED ("NOT INCLUDED"),
    ALL_INCLUSIVE ("ALL INCLUSIVE");

    public final String name;

    Food(String name) {
        this.name = name;
    }
}
