package com.peyman.core.java.concurrency.advanced.concurrent.daemon;

public class SingleThreadExample {
    public static void main(String[] args) {
        NewThread t = new NewThread();
        t.start();
    }
}
