package com.peyman.core.java.concurrency.advanced.commonissues;

class SynchronizedCounter {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public synchronized int getValue() {
        return counter;
    }
}