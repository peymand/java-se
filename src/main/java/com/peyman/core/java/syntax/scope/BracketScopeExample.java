package com.peyman.core.java.syntax.scope;

public class BracketScopeExample {

    public void mathOperationExample() {
        Integer sum = 0;
        {
            Integer number = 2;
            sum = sum + number;
        }
        // compiler error, number cannot be solved as a variable
        // number++;
    }
}