package com.twschool.practice.marsrover;

public class TurnRightCommand {

    public void doOperation(MarsRoverPosition marsRoverPosition) {
        marsRoverPosition.setDirection(marsRoverPosition.getDirection().rightDirection());
    }

}
