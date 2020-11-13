package com.company.task_1.task_10;


public class Main {
    public static void main(String[] args) {
        FlightSchedule flightSchedule = new FlightSchedule();
        flightSchedule.addAirline("Krasnodar", "B2927", "Boeing", "00:25"
                , new String[]{"tuesday", "wednesday"});
        flightSchedule.addAirline("Moscow", "SU1835", "Sukhoi", "05:40"
                , new String[]{"monday", "friday", "saturday"});
        flightSchedule.addAirline("Vienna", "B2690", "Boeing", "06:00"
                , new String[]{"tuesday", "wednesday", "sunday"});
        flightSchedule.addAirline("Moscow", "SU1831", "Sukhoi", "07:25"
                , new String[]{"monday", "wednesday", "friday"});
        System.out.println("To Moscow: ");
        flightSchedule.findAirlinesToDestination("moscow");
        System.out.println("On Monday: ");
        flightSchedule.findAirlinesOnDay("tuesday");
        System.out.println("On Wednesday after 03:00 : ");
        flightSchedule.findAirlinesOnDayAndTime("wednesday", "03:00");
    }
}
