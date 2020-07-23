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
        MarsRoverCommand marsRoverCommand = getMarsRoverCommand(command);
        marsRoverCommand.doOperation(marsRoverPosition);
    }

    private MarsRoverCommand getMarsRoverCommand(String command) {
        MarsRoverCommand marsRoverCommand;
        if (Command.MOVE.getShortName().equals(command)) {
            marsRoverCommand = new MoveCommand();
        } else if (Command.TURN_LEFT.getShortName().equals(command)) {
            marsRoverCommand = new TurnLeftCommand();
        } else {
            marsRoverCommand = new TurnRightCommand();
        }
        return marsRoverCommand;
    }

}
