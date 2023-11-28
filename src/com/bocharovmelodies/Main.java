package com.bocharovmelodies;

import com.bocharovmelodies.entity.Playlist;
import com.bocharovmelodies.entity.Song;

import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        Playlist playlist = new Playlist("myPlaylist");
        for (int i = 0; i < 5; i++){
            Song song = new Song(String.valueOf(i), i * 35);
            System.out.println(song.hashCode());
            playlist.addSong(song);
            playlist.addSong(song);
        }
        System.out.println(playlist);
    }
}
