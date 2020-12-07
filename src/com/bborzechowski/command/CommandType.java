package com.bborzechowski.command;

public enum CommandType {
    P("STARTPLACE"),
    M("MOVE"),
    L("LEFT"),
    R("RIGHT");

    String name;

    CommandType(String name) {
        this.name = name;
    }
}
