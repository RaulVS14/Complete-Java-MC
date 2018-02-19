package com.linkedLists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Steve", 56.23);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.13);
        System.out.println("Balance for " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(7);
        myArrayList.add(6);
        myArrayList.add(3);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(i + ": " + myArrayList.get(i));
        }

        myArrayList.add(1, 25);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(i + ": " + myArrayList.get(i));
        }
    }
}
