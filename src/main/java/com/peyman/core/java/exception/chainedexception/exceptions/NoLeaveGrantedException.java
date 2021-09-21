package com.peyman.core.java.exception.chainedexception.exceptions;

public class NoLeaveGrantedException extends Exception {

    public NoLeaveGrantedException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoLeaveGrantedException(String message) {
        super(message);
    }
}