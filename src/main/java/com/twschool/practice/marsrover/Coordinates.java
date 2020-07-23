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

    public void increaseCoordinatesXByOne() {
        this.coordinatesX++;
    }

    public void decreaseCoordinatesXByOne() {
        this.coordinatesX--;
    }

    public void increaseCoordinatesYByOne() {
        this.coordinatesY++;
    }

    public void decreaseCoordinatesYByOne() {
        this.coordinatesY--;
    }

    public double distanceWith(Coordinates coordinates) {
        return Math.sqrt(Math.pow(coordinates.getCoordinatesX() - getCoordinatesX(), 2) + Math.pow(coordinates.getCoordinatesY() - getCoordinatesY(), 2));
    }

    
}
