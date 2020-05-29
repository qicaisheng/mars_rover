package com.twschool.practice.marsrover;

public enum Direction {
    NORTH("N"), WEST("W"), SOUTH("S"), EAST("E");

    private String shortName;

    Direction(String shortName) {

        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }
}
