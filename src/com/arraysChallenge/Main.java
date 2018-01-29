package com.arraysChallenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printArray(sortIntegers(getInteger(5)));
    }

    public static int[] getInteger(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array element " + i + " is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i];
        }
        boolean flag=true;

        while (flag) {
            flag = false;
            for (int i = 0; i < array.length-1; i++) {
                if (values[i] < values[i + 1]) {
                    int temp = values[i];
                    values[i] = values[i+1];
                    values[i+1] = temp;
                    flag = true;
                }
            }
        }
        return values;
    }
}
