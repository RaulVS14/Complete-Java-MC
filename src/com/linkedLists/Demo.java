package com.linkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit= new LinkedList<String>();
        placesToVisit.add("Tartu");
        addInOrder(placesToVisit, "Haapsalu");
        addInOrder(placesToVisit, "Tallinn");
        addInOrder(placesToVisit, "Pärnu");
        addInOrder(placesToVisit, "Kuressaare");
        addInOrder(placesToVisit, "Kärdla");
        addInOrder(placesToVisit, "Muhu");
        addInOrder(placesToVisit, "Võru");
        addInOrder(placesToVisit, "Narva");
        addInOrder(placesToVisit, "Rakvere");
        addInOrder(placesToVisit, "Viljandi");
        printList(placesToVisit);
        addInOrder(placesToVisit,  "Laiuse");
        printList(placesToVisit);
        placesToVisit.remove(2);
        printList(placesToVisit);
        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i=linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("============================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination.");
                return false;
            } else if (comparison > 0) {
                // new City should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) {
                // move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("No cities on plan");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else{
                        System.out.println("Already at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }


        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - go to menu options");
    }
}
