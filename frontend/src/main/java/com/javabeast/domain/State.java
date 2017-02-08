package com.javabeast.domain;

public enum State {

    OPEN("open"),
    IN_WORK("in work"),
    FINISHED("finished");

    private final String displayName;

    State(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}