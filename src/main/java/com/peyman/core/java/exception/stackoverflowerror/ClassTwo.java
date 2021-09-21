package com.peyman.core.java.exception.stackoverflowerror;

public class ClassTwo {
    private int twoValue;
    private ClassOne clsOneInstance = null;

    public ClassTwo() {
        twoValue = 10;
        clsOneInstance = new ClassOne();
    }

    public ClassTwo(int twoValue, ClassOne clsOneInstance) {
        this.twoValue = twoValue;
        this.clsOneInstance = clsOneInstance;
    }
}
