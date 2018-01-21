package com.composition;

public class Furniture {
    private int width;
    private int heigth;
    private int length;
    private String manufacturer;
    private String category;
    private boolean placedInRoom;

    public Furniture(int width, int heigth, int length, String manufacturer, String category) {
        this.width = width;
        this.heigth = heigth;
        this.length = length;
        this.manufacturer = manufacturer;
        this.category = category;
    }

    public void place(){
        if (!placedInRoom) {
            placedInRoom = true;
        } else {
            System.out.println("You have already place it!");
        }
    }

    public boolean isPlacedInRoom() {
        return placedInRoom;
    }

    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }

    public int getLength() {
        return length;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCategory() {
        return category;
    }
}
