package com.classesChallenge;

public class Main {
    public static void main(String[] args) {
        Car lambo = new Car("Sierra, Ford", "Wide", "2t",4,3,5,true,2300,240);
        lambo.changeVelocity(13,21);
        Outlander silver = new Outlander(9);
        silver.steer(45);
        silver.accelerate(30);
        silver.accelerate(-20);
    }
}
