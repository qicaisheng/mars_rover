package com.twschool.practice.marsrover;

import java.util.Arrays;

public class MarsRover {
    private MarsRoverPosition marsRoverPosition;

    public MarsRover(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition = marsRoverPosition;
    }

    public MarsRoverPosition receive(String command) {
        Arrays.asList(command.split("")).forEach(this::receiveSingleCommand);
        return marsRoverPosition;
    }

    private void receiveSingleCommand(String command) {
        if ("M".equals(command)) {
            marsRoverPosition.move();
        }
        if ("L".equals(command)) {
            marsRoverPosition.turnLeft();
        }
        if ("R".equals(command)) {
            marsRoverPosition.turnRight();
        }

    }
}
