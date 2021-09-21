package com.peyman.core.java.string.emptystrings;

class PlainJavaBlankStringCheck {

    boolean isBlankString(String string) {
        return string == null || string.trim().isEmpty();
    }
}
