package com.company.task_1.task_10;

import java.util.Arrays;

public class Airline {
    String destinationPoint;
    String flightNumber;
    String planeType;
    String departureTime;
    String[] dayOfWeek;

    public Airline(String destinationPoint, String flightNumber, String planeType, String departureTime, String[] dayOfWeek) {
        this.destinationPoint = destinationPoint;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String[] getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String[] dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destinationPoint='" + destinationPoint + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", planeType='" + planeType + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", dayOfWeek=" + Arrays.toString(dayOfWeek) +
                '}';
    }
}
