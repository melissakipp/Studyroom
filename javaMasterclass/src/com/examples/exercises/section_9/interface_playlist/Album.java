package com.examples.exercises.section_9.interface_playlist;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private String artist;

    private ArrayList<Song> songs;

    // Constructor
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        // Initializing
        this.songs = new ArrayList<Song>();
    }

    // IntelliJ suggested making this protected
    protected boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for(Song checkedSong: this.songs) {
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, List<Song> playlist) {
        int index = trackNumber - 1;
        if((index >= 0) && (index <= this.songs.size())) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track" + trackNumber  + ".");
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playlist) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album.");
        return false;
    }
}
