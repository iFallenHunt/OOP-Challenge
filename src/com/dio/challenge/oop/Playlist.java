package com.dio.challenge.oop;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<String> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
        System.out.println("Song added to playlist: " + song);
    }

    public void display() {
        System.out.println("Playlist:");
        for (String song : songs) {
            System.out.println(song);
        }
    }
}
