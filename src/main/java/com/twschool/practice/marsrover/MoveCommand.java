package com.twschool.practice.marsrover;

public class MoveCommand {

    public void move(MarsRoverPosition marsRoverPosition) {
        Coordinates coordinates = marsRoverPosition.getCoordinates();
        String directionShortName = marsRoverPosition.getDirection().getShortName();
        if (directionShortName.equals(Direction.NORTH.getShortName())) {
            coordinates.increaseCoordinatesYByOne();
        } else if (directionShortName.equals(Direction.EAST.getShortName())) {
            coordinates.increaseCoordinatesXByOne();
        } else if (directionShortName.equals(Direction.WEST.getShortName())) {
            coordinates.decreaseCoordinatesXByOne();
        } else if (directionShortName.equals(Direction.SOUTH.getShortName())) {
            coordinates.decreaseCoordinatesYByOne();
        }
    }

}
