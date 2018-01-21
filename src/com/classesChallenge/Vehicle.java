package com.classesChallenge;

public class Vehicle {
    private String name;
    private String size;
    private String weight;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size, String weight) {

        this.name = name;
        this.size = size;
        this.weight = weight;
        this.currentVelocity = 0;
        this.currentDirection = 0;

    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Steering at " + currentDirection);

    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle moving: " + currentVelocity + " in direction " + currentDirection);
    }

    public void stop(){
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getWeight() {
        return weight;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
