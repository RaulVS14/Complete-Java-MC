package com.oopChallenge;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","White","Meatloaf",3.56);
        double price = hamburger.getTotalPrice();
        hamburger.addHamburgerAddition1("Tomato",0.25);
        hamburger.addHamburgerAddition2("Lettuce",0.25);
        hamburger.addHamburgerAddition3("Cheese",0.25);
        hamburger.addHamburgerAddition4("Pineapple",0.25);
        price = hamburger.getTotalPrice();
        System.out.println("Burger"+price);

        Healthy healthy = new Healthy("Tofu",4.67);
        healthy.addHamburgerAddition5("Eggs",2.00);
        healthy.addHamburgerAddition6("Soybeans",2.00);
        System.out.println(healthy.getTotalPrice());

        Deluxe deluxe = new Deluxe();
        System.out.println(deluxe.getTotalPrice());
    }
}
