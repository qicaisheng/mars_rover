package com.twschool.practice.marsrover;

public class TurnLeftCommand {

    public void doOperation(MarsRoverPosition marsRoverPosition) {
        marsRoverPosition.setDirection(marsRoverPosition.getDirection().leftDirection());
    }

}
