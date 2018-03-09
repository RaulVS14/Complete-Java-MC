package com.linkedListsChallenge;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", "4:40");
        album.addSong("Love don't mean a thing", "4:11");
        album.addSong("Holy man", "4:32");
        album.addSong("Hold on", "4:45");
        album.addSong("Lady double dealer", "4:21");
        album.addSong("You can't do it right", "4:14");
        album.addSong("High ball shooter", "4:56");
        album.addSong("The gypsy", "4:43");
        album.addSong("Soldier of Fortune", "4:41");
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", "3:52");
        album.addSong("I put the finger on you", "3:52");
        album.addSong("Lets go", "3:52");
        album.addSong("Inject the venom", "3:52");
        album.addSong("Snowballed", "3:52");
        album.addSong("Evil walks", "3:52");
        album.addSong("C.O.D", "3:52");
        album.addSong("Breaking the rules", "3:52");
        album.addSong("Night of the long knives", "3:52");
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("High ball shooter", playList);
        albums.get(0).addToPlayList("The gypsy", playList);
        albums.get(0).addToPlayList(1, playList);
        albums.get(1).addToPlayList(9, playList);
        albums.get(1).addToPlayList(5, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(1, playList);
        albums.get(1).addToPlayList(4, playList);
        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing '" + listIterator.next().toString() + "'\n");
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
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
                        System.out.println("Now playing '" + listIterator.next().toString() + "'\n");
                    } else {
                        System.out.println("End of the playlist");
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
                        System.out.println("Now playing '" + listIterator.previous().toString() + "'\n");
                    } else {
                        System.out.println("Start of the playlist");
                        goingForward = true;
                    }
                    break;
                case 3:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying '" + listIterator.previous().toString() + "'\n");
                            goingForward = false;
                        } else {
                            System.out.println("Start of the playlist");

                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying '" + listIterator.next().toString() + "'\n");
                            goingForward = true;
                        } else {
                            System.out.println("End of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing '" + listIterator.next().toString() + "'\n");
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing '" + listIterator.previous().toString() + "'\n");
                        } else {
                            System.out.println("List empty!");
                            quit = true;
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next song\n" +
                "2 - go to previous song\n" +
                "3 - repeat the song\n" +
                "4 - to view current playlist\n" +
                "5 - to view  the menu options\n" +
                "6 - to remove song from playlist\n");

    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> i = playList.iterator();
        System.out.println("========= START OF PLAYLIST =======");
        while (i.hasNext()) {
            System.out.println(" " + i.next());
        }
        System.out.println("========= END OF PLAYLIST ==========");
    }

}
