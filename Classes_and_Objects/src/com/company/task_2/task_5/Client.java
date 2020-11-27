package com.company.task_2.task_5;

public class Client {
    private int id = 1;
    private int clientId;
    private String firstName;
    private String lastName;
    private Tour tour;

    public Client(String firstName, String lastName) {
        clientId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        id++;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "id=" + clientId +
                ", firstName= " + firstName +
                ", lastName= " + lastName +
                ", tour: " + tour;
    }
}
