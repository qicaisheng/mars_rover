package com.twschool.practice.marsrover;

public class TurnLeftCommand {

    public void turnLeft(MarsRoverPosition marsRoverPosition) {
        marsRoverPosition.setDirection(marsRoverPosition.getDirection().leftDirection());
    }

}
