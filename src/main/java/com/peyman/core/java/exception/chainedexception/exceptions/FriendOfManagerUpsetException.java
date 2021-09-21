package com.peyman.core.java.exception.chainedexception.exceptions;

public class FriendOfManagerUpsetException extends Exception {

    public FriendOfManagerUpsetException(String message, Throwable cause) {
        super(message, cause);
    }

    public FriendOfManagerUpsetException(String message) {
        super(message);
    }
}
