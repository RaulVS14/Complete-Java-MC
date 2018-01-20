package com.inheritance;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public Dog(int size, int weight, String name, int eyes, int legs,int tail, int teeth, String coat) {
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew(){
        System.out.println("Dog chewed!");
    }

    @Override
    public void eat() {
        this.chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog is walking!");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog is running!");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog moving!");
        moveLegs(speed);
        super.move(speed);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog moved legs!");
    }
}
