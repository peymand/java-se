package com.peyman.core.java.syntax.scope;

public class NestedScopesExample {

    String title = "Baeldung";

    public void printTitle() {
        System.out.println(title);
        String title = "John Doe";
        System.out.println(title);
    }
}