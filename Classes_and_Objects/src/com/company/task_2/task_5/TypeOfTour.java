package com.company.task_2.task_5;

public enum TypeOfTour {
    SHOPPING,
    CRUISE,
    RECREATION,
    EXCURSION,
    TREATMENT;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
