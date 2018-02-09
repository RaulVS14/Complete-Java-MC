package com.arrayListChallenge;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;

    ArrayList<Contact> Contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.Contacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact) {
        if (findCOntact(contact) >= 0) {
            System.out.println("Contact already exists!");
            return false;
        }
        Contacts.add(contact);
        return true;
    }

    public boolean modifyContact(Contact oldContact, Contact newContact) {
        int foundPosition = findCOntact(oldContact);

        if (foundPosition<0) {
            System.out.println("Contact wasn't found");
            return false;
        }
        this.Contacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public void removeContact() {

    }

    public void retrieveContact() {

    }

    private int findCOntact(Contact contact) {
        return this.Contacts.indexOf(contact);
    }
    private int findContact(String contactName) {
        for (int i = 0; i < this.Contacts.size(); i++) {
            Contact contact = this.Contacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
}
