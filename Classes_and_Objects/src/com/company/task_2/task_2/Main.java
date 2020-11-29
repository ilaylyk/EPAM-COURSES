package com.company.task_2.task_2;

public class Main {
    public static void main(String[] args) {
        try {
            Wheel[] wheels = new Wheel[]{new Wheel(), new Wheel(), new Wheel(), new Wheel()};
            Car car = new Car("Pussy Wagon", new Engine(3), wheels);

            System.out.println("Car created");

            System.out.println("Car name: " + car.getName());

            System.out.println("Attempt to drive 10 km");
            int dist = car.move(10);
            System.out.println("Car drove " + dist + " km");

            System.out.println("Attempt to drive 1000 km");
            dist = car.move(1000);
            System.out.println("Car drove " + dist + " km");

            System.out.println("Car refuel");
            car.refuel();

            System.out.println("Attempt to change wheel");
            car.changeWheel(new Wheel(), 3);
            System.out.println("Wheel changed");

            System.out.println("Attempt to drive 1000 km");
            dist = car.move(1000);
            System.out.println("Car drove " + dist + " km");

        } catch (CarCreateException e) {
            System.out.println("Car creation failed");
        } catch (CarWheelChangeException e) {
            System.out.println("Wheel change failed");
        }
    }
}
