package com.twschool.practice.marsrover;

import java.util.Arrays;

public class MarsRover {
    private MarsRoverPosition marsRoverPosition;

    public MarsRover(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition = marsRoverPosition;
    }

    public MarsRoverPosition getMarsRoverPosition() {
        return marsRoverPosition;
    }
    
    public MarsRoverPosition receive(String commands) {
        Arrays.asList(commands.split("")).forEach(this::receiveSingleCommand);
        return getMarsRoverPosition();
    }

    private void receiveSingleCommand(String command) {
        if (Command.MOVE.getShortName().equals(command)) {
            move();
        }
        if (Command.TURN_LEFT.getShortName().equals(command)) {
            marsRoverPosition.setDirection(marsRoverPosition.getDirection().leftDirection());
        }
        if (Command.TURN_RIGHT.getShortName().equals(command)) {
            marsRoverPosition.setDirection(marsRoverPosition.getDirection().rightDirection());
        }

    }

    private void move() {
        Coordinates coordinates = marsRoverPosition.getCoordinates();
        String directionShortName = marsRoverPosition.getDirection().getShortName();
        if (directionShortName.equals(Direction.NORTH.getShortName())) {
            coordinates.increaseCoordinatesYByOne();
        } else if (directionShortName.equals(Direction.EAST.getShortName())) {
            coordinates.increaseCoordinatesXByOne();
        } else if (directionShortName.equals(Direction.WEST.getShortName())) {
            coordinates.decreaseCoordinatesXByOne();
        } else if (directionShortName.equals(Direction.SOUTH.getShortName())) {
            coordinates.decreaseCoordinatesYByOne();
        }
    }
}
