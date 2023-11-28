package com.bocharovmelodies.entity;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

        private static int playlistId;
        private String name;
        private List<Song> songs;

    public Playlist(String name) {
        playlistId++;
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(Song song){
        if (songs.contains(song)){
            System.out.println("This song has already been exist in the playlist");
            return false;
        }
        return songs.add(song);
    }

    public Song findSong(){
        return null;
    }

    public void updateSong(){

    }

    public boolean deleteSong(){
        return true;
    }



    @Override
    public String toString() {
        return "Playlist{" +
                "songs=" + songs +
                '}';
    }
}
