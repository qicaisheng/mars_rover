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
            new MoveCommand().move(marsRoverPosition);
        }
        if (Command.TURN_LEFT.getShortName().equals(command)) {
            turnLeft();
        }
        if (Command.TURN_RIGHT.getShortName().equals(command)) {
            turnRight();
        }

    }

    private void turnRight() {
        marsRoverPosition.setDirection(marsRoverPosition.getDirection().rightDirection());
    }

    private void turnLeft() {
        marsRoverPosition.setDirection(marsRoverPosition.getDirection().leftDirection());
    }

}
