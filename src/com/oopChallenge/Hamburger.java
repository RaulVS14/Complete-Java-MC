package com.oopChallenge;

public class Hamburger {
    private String name;
    private String rollType;
    private String meat;
    private double basePrice;

    private String addition1;
    private double a1price;

    private String addition2;
    private double a2price;

    private String addition3;
    private double a3price;

    private String addition4;
    private double a4price;

    public Hamburger(String name, String rollType, String meat, double basePrice) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public double getTotalPrice() {
        double totalPrice = this.basePrice;
        if (addition1 != null) {
            totalPrice += a1price;
        }
        if (addition2 != null) {
            totalPrice += a2price;
        }
        if (addition3 != null) {
            totalPrice += a3price;
        }
        if (addition4 != null) {
            totalPrice += a4price;
        }
       // System.out.println(basePrice+" "+a1price+" "+a2price+" "+a3price+" "+a4price);
        return totalPrice;
    }

    public void addHamburgerAddition1(String addition1, double a1price) {
        this.addition1 = addition1;
        this.a1price = a1price;
        System.out.println("Added: " + addition1 + " priced " + a1price);
    }

    public void addHamburgerAddition2(String addition2, double a2price) {
        this.addition2 = addition2;
        this.a2price = a2price;
        System.out.println("Added: " + addition2 + " priced " + a2price);
    }

    public void addHamburgerAddition3(String addition3, double a3price) {
        this.addition3 = addition3;
        this.a3price = a3price;
        System.out.println("Added: " + addition3 + " priced " + a3price);
    }

    public void addHamburgerAddition4(String addition4, double a4price) {
        this.addition4 = addition4;
        this.a4price = a4price;
        System.out.println("Added: " + addition4 + " priced " + a4price);
    }
}
