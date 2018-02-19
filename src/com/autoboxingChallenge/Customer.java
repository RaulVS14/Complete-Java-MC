package com.autoboxingChallenge;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name,double transaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public void addTransaction(double dbl) {
        this.transactions.add(dbl);
    }

    public static Customer createCustomer(String name, double transaction) {
        return new Customer(name, transaction);
    }
}
