package com.peyman.core.java.exception.exceptionhandling;

import java.io.IOException;

public class PlayerLoadException extends Exception {

    public PlayerLoadException(IOException io) {
        super(io);
    }

}
