package com.encapsulation;

public class Printer {
    private double tonerLevel;
    private int nrOfPagesPrinted;
    private boolean duplex;

    public Printer(double tonerLevel, boolean duplex) {
        if (tonerLevel>-1 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
            this.nrOfPagesPrinted = 0;
            this.duplex = duplex;
        } else {
            this.tonerLevel = -1;
            this.nrOfPagesPrinted = 0;
            this.duplex = duplex;
        }
    }

    public void printPages(int pages, String data){
        if (this.duplex) {
            for (int i = 1; i < pages / 2 + 1; i++) {
                if (tonerLevel > 0) {
                    tonerLevel -= 0.05;
                    nrOfPagesPrinted++;
                    writeText(data);
                } else{
                    System.out.println("Out of toner, please refill!");
                }
            }
        } else {
            for(int i = 1; i<pages+1;i++) {
                if (tonerLevel > 0) {
                    tonerLevel -= 0.05;
                    nrOfPagesPrinted++;
                    writeText(data);
                } else{
                    System.out.println("Out of toner, please refill!");
                }
            }
        }
    }
    public int fillToner(int amount){
        if (amount > 0 && amount <= 100) {
            if (this.tonerLevel + amount > 100) {
                return -1;
            }
            this.tonerLevel+=amount;
            return (int)(this.tonerLevel);
        } else {
            return -1;
        }
    }
    private void writeText(String data){
        System.out.println(data);
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getNrOfPagesPrinted() {
        return nrOfPagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
