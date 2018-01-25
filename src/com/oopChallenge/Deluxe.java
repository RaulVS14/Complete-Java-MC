package com.oopChallenge;

public class Deluxe extends Hamburger {
    public Deluxe() {
        super("Deluxe", "White", "Two patties patty", 14.54);
        super.addHamburgerAddition1("Chips", 1.56);
        super.addHamburgerAddition2("Drinks", 1.95);
    }

    @Override
    public void addHamburgerAddition1(String addition1, double a1price) {
        System.out.println("Cannot add addition");
    }

    @Override
    public void addHamburgerAddition2(String addition2, double a2price) {
        System.out.println("Cannot add addition");
    }

    @Override
    public void addHamburgerAddition3(String addition3, double a3price) {
        System.out.println("Cannot add addition");
    }

    @Override
    public void addHamburgerAddition4(String addition4, double a4price) {
        System.out.println("Cannot add addition");
    }
}
