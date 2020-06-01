package com.twschool.practice.marsrover;

public class Coordinates {
    private int coordinatesX;
    private int coordinatesY;

    public Coordinates(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void moveToward(String directionShortName) {
        if (directionShortName.equals(Direction.NORTH.getShortName())) {
            this.coordinatesY++;
        } else if (directionShortName.equals(Direction.EAST.getShortName())) {
            this.coordinatesX++;
        } else if (directionShortName.equals(Direction.WEST.getShortName())) {
            this.coordinatesX--;
        } else if (directionShortName.equals(Direction.SOUTH.getShortName())) {
            this.coordinatesY--;
        }
    }

    public double distanceWith(Coordinates coordinates) {
        return Math.sqrt(Math.pow(coordinates.getCoordinatesX() - getCoordinatesX(), 2) + Math.pow(coordinates.getCoordinatesY() - getCoordinatesY(), 2));
    }
}
