package com.peyman.core.java.lang.system;

public class EnvironmentVariables {
    public String getPath() {
        return System.getenv("PATH");
    }
}
