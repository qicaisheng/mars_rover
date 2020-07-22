package com.twschool.practice.marsrover;


public class MarsRoverPosition {
    private Coordinates coordinates;
    private Direction direction;

    public MarsRoverPosition(int coordinatesX, int coordinatesY, String direction) {
        this.coordinates = new Coordinates(coordinatesX, coordinatesY);
        this.direction = Direction.fromShortName(direction);
    }

    public int getCoordinatesX() {
        return coordinates.getCoordinatesX();
    }

    public int getCoordinatesY() {
        return coordinates.getCoordinatesY();
    }

    public String getDirectionShortName() {
        return direction.getShortName();
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
