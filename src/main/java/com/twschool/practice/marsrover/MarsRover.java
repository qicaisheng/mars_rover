package com.twschool.practice.marsrover;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private MarsRoverPosition marsRoverPosition;
    private List<MarsRoverCommand> marsRoverCommandList = new ArrayList<>();

    public MarsRover(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition = marsRoverPosition;
        marsRoverCommandList.addAll(Arrays.asList(new MoveCommand(), new TurnLeftCommand(), new TurnRightCommand()));
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
        return marsRoverCommandList.stream().filter(marsRoverCommand -> marsRoverCommand.match(command)).findFirst().orElseThrow(RuntimeException::new);
    }

}
