package com.composition;

public class Main {

    public static void main(String[] args) {
	    Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "red" );
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();

        Table theTable = new Table(120,90,130,"IKEA","Living room","round",true);
        Chair theChair = new Chair(120,90,130,"IKEA","Living room");
        Closet theCloset = new Closet(120,90,130,"IKEA","Living room");
        Couch theCouch = new Couch(120,90,130,"IKEA","Living room");
        Room theRoom = new Room(479,567,213,theCouch,theChair,theTable,theCloset,new Television(67,23,45,"Samsung","Electronics",220,567.3));
        theRoom.unpack();
        System.out.println(theRoom.getCouch().isPlacedInRoom());
    }
}
