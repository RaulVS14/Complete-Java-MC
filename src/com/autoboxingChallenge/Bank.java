package com.autoboxingChallenge;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public boolean addBranch(String branchName) {
        if (findBranchIndex(branchName) == -1) {
            this.branches.add(Branch.createBranch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranchClass(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranchClass(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private int findBranchIndex(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch currentBranch = branches.get(i);
            if (currentBranch.getName() == branchName) {
                return i;
            }
        }
        return -1;
    }

    private Branch findBranchClass(String branchName) {
        for (Branch branch : this.branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomer(String branchName, boolean showTransactions) {
        Branch branch = findBranchClass(branchName);
        if (branch != null) {
            System.out.println("Customers for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println((i + 1) + ". " + branchCustomer.getName());
                if (showTransactions) {
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        Double transaction = transactions.get(j);
                        System.out.println(" - Amount: " + transaction);
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
