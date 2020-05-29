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
        if ("N".equals(direction)) {
            direction = "W";
        } else if ("W".equals(direction)) {
            direction = "S";
        } else if ("S".equals(direction)) {
            direction = "E";
        } else if ("E".equals(direction)) {
            direction = "N";
        }

    }

    public void turnRight() {
        if ("N".equals(direction)) {
            direction = "E";
        }
    }
}
