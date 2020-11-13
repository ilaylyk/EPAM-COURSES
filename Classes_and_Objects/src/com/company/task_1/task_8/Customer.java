package com.company.task_1.task_8;


import java.math.BigInteger;

public class Customer implements Comparable<Customer> {
    private int id;
    private String subName;
    private String firstName;
    private String patronymic;
    private String address;
    private long cardNumber;
    private BigInteger bankAccountNumber;

    public Customer(int id, String subName, String firstName, String patronymic, String address, long cardNumber, BigInteger bankAccountNumber) {
        this.id = id;
        this.subName = subName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBankAccountNumber(BigInteger bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public String getSubName() {
        return subName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public BigInteger getBankAccountNumber() {
        return bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", subName='" + subName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return firstName.compareTo(o.getFirstName());
    }
}
