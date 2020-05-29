package com.twschool.practice.marsrover;

import org.junit.Assert;
import org.junit.Test;

public class CoordinatesTest {

    @Test
    public void should_add_coordinatesY_by_1_when_move_give_direction_N() {
        Coordinates coordinates = new Coordinates(0, 0);

        coordinates.moveToward("N");

        Assert.assertEquals(1, coordinates.getCoordinatesY());
    }

    @Test
    public void should_add_coordinatesX_by_1_when_move_give_direction_E() {
        Coordinates coordinates = new Coordinates(0, 0);

        coordinates.moveToward("E");

        Assert.assertEquals(1, coordinates.getCoordinatesX());
    }

    @Test
    public void should_minus_coordinatesX_by_1_when_move_give_direction_W() {
        Coordinates coordinates = new Coordinates(0, 0);

        coordinates.moveToward("W");

        Assert.assertEquals(-1, coordinates.getCoordinatesX());
    }

    @Test
    public void should_minus_coordinatesY_by_1_when_move_give_direction_S() {
        Coordinates coordinates = new Coordinates(0, 0);

        coordinates.moveToward("S");

        Assert.assertEquals(-1, coordinates.getCoordinatesY());
    }
}