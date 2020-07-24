package com.twschool.practice.marsrover;

public class TurnLeftCommand implements MarsRoverCommand {

    @Override
    public void doOperation(MarsRoverPosition marsRoverPosition) {
        marsRoverPosition.setDirection(marsRoverPosition.getDirection().leftDirection());
    }

    @Override
    public boolean match(String command) {
        return Command.TURN_LEFT.getShortName().equals(command);
    }

}
