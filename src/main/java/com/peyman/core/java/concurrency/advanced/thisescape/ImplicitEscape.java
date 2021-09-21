package com.peyman.core.java.concurrency.advanced.thisescape;

public class ImplicitEscape {

    public ImplicitEscape() {
        Thread t = new Thread() {

            @Override
            public void run() {
                System.out.println("Started...");
            }
        };

        t.start();
    }
}
