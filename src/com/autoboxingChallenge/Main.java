package com.autoboxingChallenge;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("SEB");
        bank.addBranch("Tartu");

        bank.addCustomer("Tartu", "Tim", 50.45);
        bank.addCustomer("Tartu", "Mike", 502.45);
        bank.addCustomer("Tartu", "Percy", 510.45);
        bank.addCustomer("Tartu", "Ron", 150.45);

        bank.addBranch("Tallinn");
        bank.addCustomer("Tallinn", "Steve", 21.00);

        bank.addCustomerTransaction("Tartu", "Tim", 232.11);
        bank.addCustomerTransaction("Tartu", "Ron", 232.11);
        bank.addCustomerTransaction("Tallinn", "Steve", 232.11);
        bank.addCustomerTransaction("Tallinn", "Steve", 232.11);

        bank.listCustomer("Tartu", true);
        bank.listCustomer("Tallinn", true);
        if (!bank.addCustomer("Pärnu","Brian",2.54)) {
            System.out.println("Error, branch doesn't exist");
        }

        if (!bank.addBranch("Tartu")) {
            System.out.println("Error, already exists");
        }

        if (!bank.addCustomerTransaction("Tartu","Mickey",23.23)) {
            System.out.println("Error, customer doesn't exist");
        }
        if (!bank.addCustomer("Tartu","Ron",23.23)) {
            System.out.println("Error, customer already exist");
        }
    }
}
