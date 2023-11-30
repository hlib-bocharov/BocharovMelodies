package com.bocharovmelodies.entity;

import java.util.Objects;

public class Song {

    private static int generateId = 0;

    private final int songId;
    private String name;
    private int duration;

    public Song(String name, int duration) {
        if (name.isBlank() || duration < 1){
            throw new IllegalArgumentException();
        }
        songId = ++generateId;
        this.name = name;
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return songId == song.songId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(songId, name);
    }

    @Override
    public String toString() {
        return "id=" + songId +
                ", name='" + name + '\'' +
                ", duration=" + duration;
    }

    public int getSongId() {
        return songId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
