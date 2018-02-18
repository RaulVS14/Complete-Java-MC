package com.autoboxing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Tom");

        ArrayList<IntClass> newIntArrayList = new ArrayList<>();
        newIntArrayList.add(new IntClass(54));
        System.out.println("haha"+newIntArrayList.get(0).getIntVal());

        Integer integer = 54;

        Double dbl = 65.0;

        ArrayList<Integer> intArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            intArrayList.add(i+5*2);
            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Array list member " + i +".  " +intArrayList.get(i));

        }
    }
}

class IntClass {
    private int intVal;

    public IntClass(int intVal) {
        this.intVal = intVal;
    }

    public int getIntVal() {
        return intVal;
    }

    public void setIntVal(int intVal) {
        this.intVal = intVal;
    }
}