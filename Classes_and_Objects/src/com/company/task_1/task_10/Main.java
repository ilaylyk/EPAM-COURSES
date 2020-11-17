package com.company.task_1.task_10;


public class Main {
    public static void main(String[] args) {
        FlightSchedule flightSchedule = new FlightSchedule();
        Airline airline = new Airline("Krasnodar", "B2927", "Boeing", "00:25",
                new String[]{"tuesday", "wednesday"});
        flightSchedule.addAirline(airline);
        Airline airline1 = new Airline("Moscow", "SU1835", "Sukhoi", "05:40",
                new String[]{"monday", "friday", "saturday"});
        flightSchedule.addAirline(airline1);
        Airline airline2 = new Airline("Vienna", "B2690", "Boeing", "06:00",
                new String[]{"tuesday", "wednesday", "sunday"});
        flightSchedule.addAirline(airline2);
        Airline airline3 = new Airline("Moscow", "SU1831", "Sukhoi", "07:25",
                new String[]{"monday", "wednesday", "friday"});
        flightSchedule.addAirline(airline3);
        System.out.println("To Moscow: ");
        flightSchedule.findAirlinesToDestination("moscow");
        System.out.println("On Monday: ");
        flightSchedule.findAirlinesOnDay("tuesday");
        System.out.println("On Wednesday after 03:00 : ");
        flightSchedule.findAirlinesOnDayAndTime("wednesday", "03:00");
    }
}
