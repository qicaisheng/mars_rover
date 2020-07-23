package com.twschool.practice.marsrover;

public class TurnRightCommand {

    public void turnRight(MarsRoverPosition marsRoverPosition) {
        marsRoverPosition.setDirection(marsRoverPosition.getDirection().rightDirection());
    }

}
