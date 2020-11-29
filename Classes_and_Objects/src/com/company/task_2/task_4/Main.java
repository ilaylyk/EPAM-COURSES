package com.company.task_2.task_4;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client1 = new Client("Dmitry", "Palchynski", "MP2756569");
        client1.addAccount(new Account("123456789101112131415", "BYN", -150));
        client1.addAccount(new Account("124523548962156624521", "BYN", 100));
        client1.addAccount(new Account("324532655224589965485", "BYN", 1500));
        client1.addAccount(new Account("332140000052169416654", "BYN", -500));
        bank.addClient(client1);
        bank.getClientByPassportId("MP2756569").sortAccountsByAmount();
        System.out.println(bank.getClientByPassportId("MP2756569"));
        bank.getClientByPassportId("MP2756569").printAccounts();
        bank.getClientByPassportId("MP2756569").printSumOfNegativeAccounts();
        bank.getClientByPassportId("MP2756569").printSumOfPositiveAccounts();
        bank.getClientByPassportId("MP2756569").printSumOfAllAccounts();
    }
}
