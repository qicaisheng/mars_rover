package com.twschool.practice.marsrover;

import java.util.Arrays;

public class MarsRover {
    public static final int DISTANCE = 5;
    private MarsRoverSafetyArea marsRoverSafetyArea;
    private MarsRoverPosition marsRoverPosition;

    public MarsRover(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition = marsRoverPosition;
        this.marsRoverSafetyArea = new MarsRoverSafetyArea(new Coordinates(marsRoverPosition.getCoordinatesX(), marsRoverPosition.getCoordinatesY()), DISTANCE);
    }
    
    public boolean isInSafetyArea() {
        return marsRoverSafetyArea.contains(new Coordinates(marsRoverPosition.getCoordinatesX(), marsRoverPosition.getCoordinatesY()));
    }

    public MarsRoverPosition receive(String commands) {
        Arrays.asList(commands.split("")).forEach(this::receiveSingleCommand);
        return marsRoverPosition;
    }

    private void receiveSingleCommand(String command) {
        if (Command.MOVE.getShortName().equals(command)) {
            marsRoverPosition.move();
        }
        if (Command.TURN_LEFT.getShortName().equals(command)) {
            marsRoverPosition.turnLeft();
        }
        if (Command.TURN_RIGHT.getShortName().equals(command)) {
            marsRoverPosition.turnRight();
        }

    }
}
