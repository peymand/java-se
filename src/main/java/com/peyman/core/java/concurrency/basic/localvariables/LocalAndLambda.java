package com.peyman.core.java.concurrency.basic.localvariables;

public class LocalAndLambda {
    public static void main(String... args) {
        String text = "";
        // Un-commenting the next line will break compilation, because text is no longer effectively final
        // text = "675";
        new Thread(() -> System.out.println(text)).start();
    }
}
