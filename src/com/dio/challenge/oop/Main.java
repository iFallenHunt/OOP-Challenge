package com.dio.challenge.oop;

public class Main {
    public static void main(String[] args) {
        iPhone myiPhone = new iPhone();

        // Test MusicPlayer
        myiPhone.addSongToPlaylist("Imagine - John Lennon");
        myiPhone.addSongToPlaylist("Bohemian Rhapsody - Queen");
        myiPhone.displayPlaylist();
        myiPhone.play();
        myiPhone.pause();
        myiPhone.selectSong("Imagine - John Lennon");

        // Test Phone
        myiPhone.call("123456789");
        myiPhone.answer();
        myiPhone.startVoicemail();
        myiPhone.displayCallLog();

        // Test InternetBrowser
        myiPhone.displayPage("http://www.google.com");
        myiPhone.addNewTab();
        myiPhone.refreshPage();
        myiPhone.displayBrowserHistory();
    }
}
