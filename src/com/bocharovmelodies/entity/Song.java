package com.bocharovmelodies.entity;

public class Song {

    private static int songId;
    private  String name;
    private int duration;

    public Song(String name, int duration) {
        songId++;
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
