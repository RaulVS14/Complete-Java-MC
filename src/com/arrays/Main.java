package com.arrays;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        double[] myDoubleArray = new double[25];
        myIntArray[4]=60;
        for (int i=0; i<myDoubleArray.length; i++) {
            myDoubleArray[i]=(double)((2*i+1)/2.0);
        }
        for (int i=0; i<myDoubleArray.length; i++) {
            System.out.println(myDoubleArray[i]);
        }

        int[] myInt2ndArray = getIntegers(5);
        for(int i = 0; i<myInt2ndArray.length ; i++){
            System.out.println("Element " + i + ", typed value was "+myInt2ndArray[i]);
        }
        System.out.println("The average is " + getAverage(myInt2ndArray));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i=0; i<values.length;i++) {
            values[i]= scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i< array.length; i++){
            sum+=array[i];
        }
        return (double) sum/(double)array.length;
    }
}
