package com.company.task_2.task_2;

public class Car {
    private final Engine engine;
    private final Wheel[] wheels;
    private int tank;
    private final static int MAX_TANK_CAPACITY = 100;
    private final String name;

    public Car(String name, Engine engine, Wheel[] wheels) throws CarCreateException {
        if (wheels == null || engine == null || wheels.length != 4) {
            throw new CarCreateException();
        } else {
            this.name = name;
            this.engine = engine;
            this.wheels = wheels;
            tank = MAX_TANK_CAPACITY;
        }
    }

    public int move(int distance) {
        int sourceDistance = distance;

        while (tank > 0 && distance > 0) {
            int spendFuel = engine.work();
            for (Wheel wheel : wheels) {
                wheel.round();
            }
            tank -= spendFuel;
            distance--;
        }

        return sourceDistance - distance;
    }

    public void refuel() {
        tank = MAX_TANK_CAPACITY;
    }

    public String getName() {
        return name;
    }

    public void changeWheel(Wheel wheel, int pos) throws CarWheelChangeException {
        if (wheel == null || pos > 3 || pos < 0) {
            throw new CarWheelChangeException();
        } else {
            wheels[pos] = wheel;
        }
    }
}
