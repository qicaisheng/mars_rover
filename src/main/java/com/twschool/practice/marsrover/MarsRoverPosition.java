package com.twschool.practice.marsrover;


public class MarsRoverPosition {
    private int coordinatesX;
    private int coordinatesY;
    private Direction direction;

    public MarsRoverPosition(int coordinatesX, int coordinatesY, String direction) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.direction = Direction.fromShortName(direction);
    }

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public String getDirectionShortName() {
        return direction.getShortName();
    }

    public void move() {
        if (direction == Direction.NORTH) {
            this.coordinatesY++;
        } else if (direction == Direction.EAST) {
            this.coordinatesX++;
        } else if (direction == Direction.WEST) {
            this.coordinatesX--;
        } else if (direction == Direction.SOUTH) {
            this.coordinatesY--;
        }

    }

    public void turnLeft() {
        direction = direction.leftDirection();
    }

    public void turnRight() {
        direction = direction.rightDirection();
    }
}
