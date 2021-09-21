package com.peyman.core.java.string.stringconversions;

import java.time.LocalDateTime;

public class UseLocalDateTime {

    public LocalDateTime getLocalDateTimeUsingParseMethod(String representation) {
        return LocalDateTime.parse(representation);
    }

}
