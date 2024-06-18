package com.dio.challenge.oop;

public interface MusicPlayer {
    void play();
    void pause();
    void selectSong(String song);
    void addSongToPlaylist(String song);
    void displayPlaylist();
}
