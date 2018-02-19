package com.autoboxingChallenge;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.name = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }


    public boolean newCustomer(String customerName, double initalAmount) {
        if (findCustomer(customerName) == -1) {
            this.customers.add(Customer.createCustomer(customerName,initalAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        int customerPosition = findCustomer(customerName);
        if (findCustomer(customerName) != -1) {
            this.customers.get(customerPosition).addTransaction(transaction);
            return true;
        }
        return false;
    }

    public void addCustomer(Customer customer){
        if (findCustomer(customer.getName())>=-1) {
            return;
        }
        this.customers.add(customer);
    }

    public static Branch createBranch(String branchName) {
        return new Branch(branchName);
    }

    private int findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }

    private Customer findCustomerClass(String customerName) {
        for (Customer customer : this.customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
