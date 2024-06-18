package com.dio.challenge.oop;

import java.util.ArrayList;
import java.util.List;

public class CallLog {
    private List<String> calls;

    public CallLog() {
        this.calls = new ArrayList<>();
    }

    public void addCall(String call) {
        calls.add(call);
        System.out.println("Call logged: " + call);
    }

    public void display() {
        System.out.println("Call Log:");
        for (String call : calls) {
            System.out.println(call);
        }
    }
}
