package com.twschool.practice.marsrover;

public class TurnRightCommand implements MarsRoverCommand{

    @Override
    public void doOperation(MarsRoverPosition marsRoverPosition) {
        marsRoverPosition.setDirection(marsRoverPosition.getDirection().rightDirection());
    }
    
    @Override
    public boolean match(String command) {
        return Command.TURN_RIGHT.getShortName().equals(command);
    }

}
