package com.company.task_2.task_2;

public class Engine {
    private final int fuelConsumptionPerOneKm;

    public Engine(int fuelConsumptionPerOneKm) {
        this.fuelConsumptionPerOneKm = fuelConsumptionPerOneKm;
    }

    public int work() {
        return fuelConsumptionPerOneKm;
    }
}
