package com.twschool.practice.marsrover;

import java.util.Arrays;

public class MarsRover {
    private MarsRoverPlace marsRoverPlace;

    public MarsRover(MarsRoverPlace marsRoverPlace) {
        this.marsRoverPlace = marsRoverPlace;
    }

    public MarsRoverPlace receive(String command) {
        Arrays.asList(command.split("")).forEach(this::receiveSingleCommand);
        return marsRoverPlace;
    }

    private void receiveSingleCommand(String command) {
        if ("M".equals(command)) {
            marsRoverPlace.move();
        }
        if ("L".equals(command)) {
            marsRoverPlace.turnLeft();
        }
        if ("R".equals(command)) {
            marsRoverPlace.turnRight();
        }

    }
}
