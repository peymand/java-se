package com.peyman.core.java.syntax.nativekeyword;

public class DateTimeUtils {

    public native String getSystemTime();

    static {
        System.loadLibrary("nativedatetimeutils");
    }
}
