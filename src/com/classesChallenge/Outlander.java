package com.classesChallenge;

public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander( int roadServiceMonths) {
        super("Outlander", "4WD", "4 tonnes",5, 5, 6, false, 2345, 210);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity>10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity>20 && newVelocity <= 30) {
            changeGear(3);
        } else if (newVelocity>30 && newVelocity <= 40) {
            changeGear(5);
        } else if (newVelocity>40 && newVelocity <= 50) {
            changeGear(6);
        }
        if (newVelocity>=0) {
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}
