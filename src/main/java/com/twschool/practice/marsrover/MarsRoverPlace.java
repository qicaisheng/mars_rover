package com.twschool.practice.marsrover;


public class MarsRoverPlace {
    private int coordinatesX;
    private int coordinatesY;
    private String direction;

    public MarsRoverPlace(int coordinatesX, int coordinatesY, String direction) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.direction = direction;
    }

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public String getDirection() {
        return direction;
    }

    public void move() {
        this.coordinatesY++;
    }

    public void turnLeft() {
        if (Direction.NORTH.getShortName().equals(direction)) {
            direction = Direction.WEST.getShortName();
        } else if (Direction.WEST.getShortName().equals(direction)) {
            direction = Direction.SOUTH.getShortName();
        } else if (Direction.SOUTH.getShortName().equals(direction)) {
            direction = Direction.EAST.getShortName();
        } else if (Direction.EAST.getShortName().equals(direction)) {
            direction = Direction.NORTH.getShortName();
        }

    }

    public void turnRight() {
        if (Direction.NORTH.getShortName().equals(direction)) {
            direction = Direction.EAST.getShortName();
        }
    }
}
