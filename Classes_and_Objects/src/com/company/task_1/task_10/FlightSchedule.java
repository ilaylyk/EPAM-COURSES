package com.company.task_1.task_10;

import java.util.ArrayList;
import java.util.Arrays;

public class FlightSchedule {
    private final ArrayList<Airline> airlines;

    public FlightSchedule() {
        this.airlines = new ArrayList<>();
    }

    public void addAirline(Airline airline) {
        airlines.add(new Airline(airline.destinationPoint, airline.flightNumber, airline.planeType, airline.departureTime, airline.dayOfWeek));
    }

    public void findAirlinesToDestination(String destination) {
        airlines.stream()
                .filter(o -> o.getDestinationPoint().equalsIgnoreCase(destination))
                .forEach(System.out::println);
    }

    public void findAirlinesOnDay(String day) {
        airlines.stream()
                .filter(o -> Arrays.asList(o.getDayOfWeek()).contains(day))
                .forEach(System.out::println);
    }

    public void findAirlinesOnDayAndTime(String day, String departureTime) {
        airlines.stream()
                .filter(o -> Arrays.asList(o.getDayOfWeek()).contains(day) &&
                        o.getDepartureTime().compareTo(departureTime) < 0)
                .forEach(System.out::println);
    }
}
