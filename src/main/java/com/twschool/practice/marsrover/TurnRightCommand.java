package com.twschool.practice.marsrover;

public class TurnRightCommand implements MarsRoverCommand{

    @Override
    public void doOperation(MarsRoverPosition marsRoverPosition) {
        marsRoverPosition.setDirection(marsRoverPosition.getDirection().rightDirection());
    }

}
