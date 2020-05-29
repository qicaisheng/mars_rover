package com.twschool.practice.marsrover;


public class MarsRoverPlace {
    private int coordinatesX;
    private int coordinatesY;
    private String toward;

    public MarsRoverPlace(int coordinatesX, int coordinatesY, String toward) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.toward = toward;
    }

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public String getToward() {
        return toward;
    }

    public void move() {
        this.coordinatesY++;
    }

    public void turnLeft() {
        if ("N".equals(toward)) {
            toward = "W";
        } else if ("W".equals(toward)) {
            toward = "S";
        } else if ("S".equals(toward)) {
            toward = "E";
        }
    }

    public void turnRight() {
        if ("N".equals(toward)) {
            toward = "E";
        }
    }
}
