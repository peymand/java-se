package com.peyman.core.java.concurrency.advanced.commonissues;

class Counter {
    private int counter = 0;

    public void increment() {
        counter++;
    }

    public int getValue() {
        return counter;
    }
}