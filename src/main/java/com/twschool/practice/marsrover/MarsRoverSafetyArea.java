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

        double distanceWithCoordinates = Math.sqrt(Math.pow(coordinates.getCoordinatesX() - this.coordinates.getCoordinatesX(), 2) + Math.pow(coordinates.getCoordinatesY() - this.coordinates.getCoordinatesY(), 2));
        return distanceWithCoordinates <= distance;

    }

}
