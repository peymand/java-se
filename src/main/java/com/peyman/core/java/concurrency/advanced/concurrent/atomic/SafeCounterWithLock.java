package com.peyman.core.java.concurrency.advanced.concurrent.atomic;

public class SafeCounterWithLock {
    private volatile int counter;
    
    int getValue() {
        return counter;
    }
    
    synchronized void increment() {
        counter++;
    }
}
