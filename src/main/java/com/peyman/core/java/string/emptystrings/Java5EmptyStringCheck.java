package com.peyman.core.java.string.emptystrings;

class Java5EmptyStringCheck {

    boolean isEmptyString(String string) {
        return string == null || string.length() == 0;
    }
}
