package com.inheritance;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(int size, int weight, String name, int gills, int eyes, int fins) {
        super(1, 1, size, weight, name);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest(){

    }

    private void moveMuscles() {

    }

    private void swim(int speed){
        moveMuscles();
        moveBackfin();
        super.move(speed);
    }

    private void moveBackfin() {


    }
}
