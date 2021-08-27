package com.peyman.core.java.syntax.scope;

public class ClassScopeExample {

    Integer amount = 0;

    public void exampleMethod() {
        amount++;
    }

    public void anotherExampleMethod() {
        Integer anotherAmount = amount + 4;
    }
}