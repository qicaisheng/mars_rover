package com.twschool.practice.marsrover;

public class MarsRoverSafetyArea {
    private Coordinates coordinates;
    private int distance;

    public MarsRoverSafetyArea(Coordinates coordinates, int distance) {
        this.coordinates = coordinates;
        this.distance = distance;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public int getDistance() {
        return distance;
    }

    public boolean contains(Coordinates coordinates) {

        double distanceWithCoordinates = coordinates.distanceWith(this.coordinates);
        return distanceWithCoordinates <= distance;

    }

}
