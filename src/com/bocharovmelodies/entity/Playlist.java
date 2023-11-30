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

    public Song getSongById(int id){
        Song song = findSong(id);
        if (song != null) {
            System.out.println(song);
            return song;
        }
        System.out.println("This playlist doesn't contain current song");
        return null;
    }

    public void updateSong(Song song) {

    }

    public boolean deleteSong(Song song) {
        if (findSong(song)){
            return songs.remove(song);
        }
        System.out.println("This playlist doesn't contain current song");
        return false;
    }

    public boolean deleteSong(int id){
        Song song = findSong(id);
        if (song != null){
            return songs.remove(song);
        }
        System.out.println("This playlist doesn't contain current song");
        return false;
    }

    private boolean findSong(Song actualSong) {
        for (Song song : songs) {
            if (actualSong.equals(song)) {
                return true;
            }
        }
        return false;
    }

    private Song findSong(int id){
        for (Song song: songs){
            if (song.getSongId() == id){
                return song;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String string = name + "\n=================\n";
        for (Song song : songs) {
            string = string.concat(song + "\n");
        }
        string += "=================";
        return string;
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs;
    }
}
