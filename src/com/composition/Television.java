package com.composition;

public class Television extends Furniture {
    private int voltage;
    private double power;
    private boolean turnedOn;
    private boolean pluggedIn;

    public Television(int width, int heigth, int length, String manufacturer, String category, int voltage, double power) {
        super(width, heigth, length, manufacturer, category);
        this.voltage = voltage;
        this.power = power;
        this.turnedOn = false;
        this.pluggedIn = false;
    }

    public void turnOn(){
        if (pluggedIn) {
            turnedOn = true;
            System.out.println("TV turned on!");
        } else {
            System.out.println("Please, plug it in!");
        }
    }

    public void plugIn(){
        pluggedIn = true;
    }
    public boolean isTurnedOn() {
        return turnedOn;
    }

    public boolean isPluggedIn() {
        return pluggedIn;
    }


}
