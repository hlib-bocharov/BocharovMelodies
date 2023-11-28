package com.bocharovmelodies.entity;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private static int generatingId = 0;

    private int playlistId;
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.playlistId = ++generatingId;
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(Song song) {
        if (findSong(song)) {
            System.out.println("This song has already been exist in the playlist");
            return false;
        }
        return songs.add(song);
    }

    public void updateSong(Song song) {

    }

    public boolean deleteSong() {
        return false;
    }

    public boolean findSong(Song actualSong) {
        for (Song song : songs) {
            if (actualSong.equals(song)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String string = name + "\n=================\n";
        for (Song song : songs) {
            string += song + "\n";
        }
        string += "=================";
        return string;
    }
}
