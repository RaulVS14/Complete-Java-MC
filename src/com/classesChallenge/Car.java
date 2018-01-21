package com.classesChallenge;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int horsePower;
    private int maxSpeed;
    private int currentGear;

    public Car(String name, String size, String weight, int wheels, int doors, int gears, boolean isManual, int horsePower, int maxSpeed) {
        super(name, size, weight);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Changed to " + currentGear + " gear");
    }
    
    public void changeVelocity(int speed, int direction){
        System.out.printf("%d, %d \n",speed, direction);
        move(speed,direction);

    }

    @Override
    public void stop() {
        super.stop();
    }
}
