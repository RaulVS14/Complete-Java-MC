package com.arrayListChallenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("53 91 84 40");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action:(6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    quit = shutdownPhone();
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name, number);
        if (mobilePhone.addContact(newContact)) {
            System.out.println("New contact added: " + name + ", phone number " + number);
        } else {
            System.out.println("Cannot add, contact '" + name + "' already exists");
        }

    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.modifyContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated contact");
        } else {
            System.out.println("Error updating contact");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted contact");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + ", phone number is " + existingContactRecord.getPhoneNumber() );
    }

    private static void printContacts() {
        mobilePhone.printContacts();
    }

    private static boolean shutdownPhone() {
        System.out.println("Shutting down ...");
        return true;
    }

    private static void startPhone() {
        System.out.println("Starting phone ...");
    }

    private static void printActions() {
        System.out.println("\n Actions available:\npress");
        System.out.println(
                "0 - to shutdown\n" +
                        "1 - to view contacts\n" +
                        "2 - to add new contact\n" +
                        "3 - to update any existing contact\n" +
                        "4 - to remove an existing contact\n" +
                        "5 - to query if an existing contact exists\n" +
                        "6 - to print a list of available actions\n"
        );
        System.out.println("Choose your action: ");

    }

}
