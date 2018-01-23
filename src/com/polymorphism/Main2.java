package com.polymorphism;

class Car {
    private int engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int engine, int cylinders, String name) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }
    public String startEngine(){
        return "Starting engine";
    }
    public String accelerate(){
        return "Accelerating";
    }
    public String  brake(){
        return "Braking";
    }

    public int getEngine() {
        return engine;
    }

    public int getCyliners() {
        return cylinders;
    }

    public String getName() {
        return this.name;
    }

    public int getWheels() {
        return wheels;
    }
}

class outlander extends Car {
    public outlander() {
        super(250, 4, "Porche Outlander");
    }
    public String startEngine(){
        return "Pressing button.Starting engine";
    }
    public String accelerate(){
        return "Accelerating with rate of 25";
    }
    public String  brake(){
        return "Applying brakes";
    }
}

class sierra extends Car {
    public sierra() {
        super(309, 5,"Ford Sierra");
    }
    public String startEngine(){
        return "Turning key.Starting engine";
    }
    public String accelerate(){
        return "Accelerating with rate of 15";
    }
    public String brake(){
        return "Failure of brakes";
    }
}

class golf extends Car {
    public golf() {
        super(500,8,"Volkswagen Golf");
    }
    public String startEngine(){
        return "Already working";
    }
    public String accelerate(){
        return "Accelerating with rate of 52";
    }
    public String brake(){
        return "We dont need brakes";
    }
}
public class Main2 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Car machine = randomCar();
            System.out.println("Car #" + i + ":" + machine.getName() + "\n" +
                    "Plot: " + machine.startEngine() + "\n");
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("random number: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new golf();
            case 2:
                return new sierra();
            case 3:
                return new outlander();
            default:
                return null;
        }
    }
}
