package com.peyman.core.java.exception.rethrow.custom;

public class InvalidDataException extends Exception {

    public InvalidDataException(Exception e) {
        super(e);
    }
}
