package com.twschool.practice.marsrover;

public class MarsRoverSafetyArea {
    private Coordinates centerCoordinates;
    private int distance;

    public MarsRoverSafetyArea(Coordinates centerCoordinates, int distance) {
        this.centerCoordinates = centerCoordinates;
        this.distance = distance;
    }

    public Coordinates getCenterCoordinates() {
        return centerCoordinates;
    }

    public int getDistance() {
        return distance;
    }

    public boolean contains(Coordinates coordinates) {

        double distanceWithCoordinates = coordinates.distanceWith(this.centerCoordinates);
        return distanceWithCoordinates <= distance;

    }

}
