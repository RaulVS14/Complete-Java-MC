package com.composition;

public class Room {
    private int width;
    private int height;
    private int length;
    private Couch couch;
    private Chair chair;
    private Table table;
    private Closet closet;
    private Television telly;

    public Room(int width, int height, int length, Couch couch, Chair chair, Table table, Closet closet, Television telly) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.couch = couch;
        this.chair = chair;
        this.table = table;
        this.closet = closet;
        this.telly = telly;
    }

    public void unpack(){
        table.assemble();
        chair.place();
        closet.place();

        System.out.println(getWidth());
        System.out.println(getCouch().getWidth());
        getCouch().place();

        telly.place();
        getTelly().plugIn();
        getTelly().turnOn();
    }

    public Couch getCouch() {
        return couch;
    }

    private Television getTelly() {
        return telly;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }
}
