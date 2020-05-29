package com.twschool.practice.marsrover;

public class MarsRover {
    private MarsRoverPlace marsRoverPlace;

    public MarsRover(MarsRoverPlace marsRoverPlace) {
        this.marsRoverPlace = marsRoverPlace;
    }

    public MarsRoverPlace receive(String command) {
        if ("M".equals(command)) {
            marsRoverPlace.move();
        }
        if ("L".equals(command)) {
            marsRoverPlace.turnLeft();
        }
        if ("R".equals(command)) {
            marsRoverPlace.turnRight();
        }

        return marsRoverPlace;
    }
}
