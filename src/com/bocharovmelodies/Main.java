package com.bocharovmelodies;

import com.bocharovmelodies.entity.Playlist;
import com.bocharovmelodies.entity.Song;

public class Main {

    public static void main(String[] args) {

        Playlist playlist = new Playlist("myPlaylist");
        for (int i = 0; i < 5; i++) {
            Song song = new Song(String.valueOf(i), (i + 1) * 35);
            System.out.println(song.hashCode());
            playlist.addSong(song);
            playlist.addSong(song);

            if(i == 2)
                playlist.deleteSong(song);
        }
        System.out.println(playlist);

        Song song = new Song("key", 3);
        playlist.deleteSong(song);

        Song getSong = playlist.getSongById(4);
    }
}
