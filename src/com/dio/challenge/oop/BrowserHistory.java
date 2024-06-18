package com.dio.challenge.oop;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private List<String> history;

    public BrowserHistory() {
        this.history = new ArrayList<>();
    }

    public void addPage(String url) {
        history.add(url);
        System.out.println("Page added to history: " + url);
    }

    public void display() {
        System.out.println("Browser History:");
        for (String url : history) {
            System.out.println(url);
        }
    }
}
