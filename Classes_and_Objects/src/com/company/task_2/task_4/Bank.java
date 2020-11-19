package com.company.task_2.task_4;

import java.util.ArrayList;
import java.util.Optional;

public class Bank {
    private final ArrayList<Client> clients;

    public Bank() {
        this.clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public Client getClientByPassportId(String passportId) {
        Optional<Client> client = clients.stream().filter(o -> o.getPassportId().equals(passportId)).findFirst();
        return client.get();
    }

    public void printClients() {
        clients.forEach(System.out::println);
    }
}
