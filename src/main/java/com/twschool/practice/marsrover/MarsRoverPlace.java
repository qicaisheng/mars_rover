package com.twschool.practice.marsrover;


public class MarsRoverPlace {
    private int coordinatesX;
    private int coordinatesY;
    private Direction direction;

    public MarsRoverPlace(int coordinatesX, int coordinatesY, String direction) {
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
        }

    }

    public void turnLeft() {
        direction = direction.leftDirection();
    }

    public void turnRight() {
        direction = direction.rightDirection();
    }
}
