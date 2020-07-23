package com.twschool.practice.marsrover;

public class TurnLeftCommand implements MarsRoverCommand {

    @Override
    public void doOperation(MarsRoverPosition marsRoverPosition) {
        marsRoverPosition.setDirection(marsRoverPosition.getDirection().leftDirection());
    }

}
