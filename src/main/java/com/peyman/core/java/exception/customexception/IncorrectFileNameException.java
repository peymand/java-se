package com.peyman.core.java.exception.customexception;

public class IncorrectFileNameException extends Exception {
    private static final long serialVersionUID = 1L;
    
    public IncorrectFileNameException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
