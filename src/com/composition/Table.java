package com.composition;

public class Table extends Furniture {
    private String type;
    private boolean foldable;
    private boolean assembled;

    public Table(int width, int heigth, int length, String manufacturer, String category, String type, boolean foldable) {
        super(width, heigth, length, manufacturer, category);
        this.type = type;
        this.foldable = foldable;
    }

    public void assemble(){
        assembled = true;
    }
}
