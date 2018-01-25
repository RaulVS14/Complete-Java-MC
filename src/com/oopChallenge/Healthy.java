package com.oopChallenge;

public class Healthy extends Hamburger {
    public Healthy(String meat, double basePrice) {
        super("Healthy", "Brown rye", meat, basePrice);
    }

    private String addition5;
    private double a5price;

    private String addition6;
    private double a6price;
    public void addHamburgerAddition5(String addition5,double a5price) {
        this.addition5 = addition5;
        this.a5price = a5price;
        System.out.println("Added: " + addition5 + " priced "+ a5price);
    }
    public void addHamburgerAddition6(String addition6,double a6price) {
        this.addition6 = addition6;
        this.a6price = a6price;
        System.out.println("Added: " + addition6 + " priced "+ a6price);
    }

    @Override
    public double getTotalPrice() {

        double healthyPrice = super.getTotalPrice();

        if (addition5 != null) {
            healthyPrice+=a5price;
        }
        if (addition6 != null) {
            healthyPrice+=a6price;
        }
        // System.out.println(healthyPrice +" "+ a5price +" "+a6price);
        return healthyPrice;

    }
}