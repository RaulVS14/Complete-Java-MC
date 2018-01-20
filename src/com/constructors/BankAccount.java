package com.constructors;

public class BankAccount {
    private String accNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNr;
    public BankAccount() {
        this("4123123123123123",2.50, "Default Name", "Default Address","Default Number");
    }

    public BankAccount(String accNr, double balance, String cName, String cEmail, String phoneNr) {
        this.accNumber = accNr;
        this.balance = balance;
        this.customerName = cName;
        this.email = cEmail;
        this.phoneNr = phoneNr;
    }

    public BankAccount(String customerName, String email, String phoneNr) {
        this("4123123123123123",10.55,customerName,email,phoneNr);
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void deposit(double amntDeposited) {
        this.balance += amntDeposited;
    }

    public void withdraw(double amntWithdrawn) {
        if (this.balance >= amntWithdrawn) {
            this.balance -= amntWithdrawn;
        } else {
            System.out.println("Withdrawal not processed");
        }
    }
}
