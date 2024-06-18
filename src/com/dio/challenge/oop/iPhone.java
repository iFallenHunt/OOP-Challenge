package com.dio.challenge.oop;

public class iPhone implements MusicPlayer, Phone, InternetBrowser {
    private Playlist playlist;
    private CallLog callLog;
    private BrowserHistory browserHistory;

    public iPhone() {
        this.playlist = new Playlist();
        this.callLog = new CallLog();
        this.browserHistory = new BrowserHistory();
    }

    // MusicPlayer methods
    @Override
    public void play() {
        System.out.println("Playing music.");
    }

    @Override
    public void pause() {
        System.out.println("Music paused.");
    }

    @Override
    public void selectSong(String song) {
        System.out.println("Selected song: " + song);
    }

    @Override
    public void addSongToPlaylist(String song) {
        playlist.addSong(song);
    }

    @Override
    public void displayPlaylist() {
        playlist.display();
    }

    // Phone methods
    @Override
    public void call(String number) {
        System.out.println("Calling: " + number);
        callLog.addCall("Called " + number);
    }

    @Override
    public void answer() {
        System.out.println("Answering call.");
        callLog.addCall("Answered a call");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Starting voicemail.");
        callLog.addCall("Started voicemail");
    }

    @Override
    public void displayCallLog() {
        callLog.display();
    }

    // InternetBrowser methods
    @Override
    public void displayPage(String url) {
        System.out.println("Displaying page: " + url);
        browserHistory.addPage(url);
    }

    @Override
    public void addNewTab() {
        System.out.println("New tab added.");
    }

    @Override
    public void refreshPage() {
        System.out.println("Page refreshed.");
    }

    @Override
    public void displayBrowserHistory() {
        browserHistory.display();
    }
}
