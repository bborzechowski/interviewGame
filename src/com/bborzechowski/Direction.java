package com.bborzechowski;

public enum Direction {
    E("East"),
    W("West"),
    S("South"),
    N("North");

    String direction;

    Direction(String direction) {
        this.direction = direction;
    }
}
