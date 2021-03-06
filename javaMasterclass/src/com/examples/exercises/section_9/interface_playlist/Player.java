package com.examples.exercises.section_9.interface_playlist;

// Instructor named this file 'Main' with a main()
// Switching previous code to an interface.

/*
 Create a program that implements a playlist for songs
 Create a Song class having Title and Duration for a song.
 The program will have an Album class containing a list of songs.
 The albums will be stored in an ArrayList
 Songs from different albums can be added to the playlist and will appear in the list in the order
 they are added.
 Once the songs have been added to the playlist, create a menu of options to:-
 Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
 List the songs in the playlist
 A song must exist on the album before it can be added to the playlist (so you can only play songs that
 you own).
 Hint:  To replay a song, consider what happened when we went back and forth from a city before we
 started tracking the direction we were going.
 As an optional extra, provide an option to remove the current song from the playlist
 (hint: listIterator.remove())
 */

import java.util.*;

// Program is not completed there are some issues - OneNote

public class Player {

    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        List<Song> playlist = new ArrayList<>();
        albums.get(0).addToPlayList("You can't do it right", playlist);
        albums.get(0).addToPlayList("Holy man", playlist);
        albums.get(0).addToPlayList("Speed king", playlist);  // Does not exist
        albums.get(0).addToPlayList(9, playlist);
        albums.get(1).addToPlayList(8, playlist);
        albums.get(1).addToPlayList(3, playlist);
        albums.get(1).addToPlayList(2, playlist);
//        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        play(playlist);

    }

    private static void play(List<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0) {
            System.out.println("No song in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString() + ".");
            playlistMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.print("Skip: ");
                        System.out.println("Now playing " + listIterator.next().toString() + ".");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasNext()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.print("Previous: ");
                        System.out.println("Now playing " + listIterator.previous().toString() + ".");
                    } else {
                        System.out.println("We are at the start of the playlist.");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.print("Currently playing: ");
                            System.out.println(listIterator.previous().toString() + ".");
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list.");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.print("Currently playing***: ");
                            System.out.println("Now replaying " + listIterator.next().toString() + ".");
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list.");
                        }
                    }
                    break;
                case 4:
                    printPlaylist(playlist);
                    break;
                case 5:
                    playlistMenu();
                    break;
                case 6:
                    if(playlist.size() >0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next() + ".");
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous() + ".");
                        }
                    }
                    break;
            }
        }
    }

    public static void playlistMenu() {
        System.out.println("Available actions:\nPress");
        System.out.println(
                "0 - To quit\n" +
                "1 - Go to next song\n" +
                "2 - Go to previous song\n" +
                "3 - Replay the current song\n" +
                "4 - List songs on the playlist\n" +
                "5 - Print menu actions\n" +
                "6 - Delete current song from playlist"
        );
    }

    private static void printPlaylist(List<Song> linkedList) {
        Iterator<Song> iterator = linkedList.iterator();
        System.out.println("======================");
        while(iterator.hasNext()) {
            for(int i = 1; i <= linkedList.size(); i++) {
                System.out.println(i + ": " + iterator.next() + ".");
            }
        }
        System.out.println("======================");
    }
}
