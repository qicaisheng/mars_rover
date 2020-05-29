package com.twschool.practice.marsrover;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverPlaceTest {
    @Test
    public void should_return_toward_W_when_turn_left_give_init_toward_N() {
        MarsRoverPlace marsRoverPlace = new MarsRoverPlace(0, 0, "N");
        
        marsRoverPlace.turnLeft();

        Assert.assertEquals("W", marsRoverPlace.getDirectionShortName());
    }

    @Test
    public void should_return_toward_S_when_turn_left_give_init_toward_W() {
        MarsRoverPlace marsRoverPlace = new MarsRoverPlace(0, 0, "W");

        marsRoverPlace.turnLeft();

        Assert.assertEquals("S", marsRoverPlace.getDirectionShortName());
    }

    @Test
    public void should_return_toward_E_when_turn_left_give_init_toward_S() {
        MarsRoverPlace marsRoverPlace = new MarsRoverPlace(0, 0, "S");

        marsRoverPlace.turnLeft();

        Assert.assertEquals("E", marsRoverPlace.getDirectionShortName());
    }

    @Test
    public void should_return_toward_N_when_turn_left_give_init_toward_E() {
        MarsRoverPlace marsRoverPlace = new MarsRoverPlace(0, 0, "E");

        marsRoverPlace.turnLeft();

        Assert.assertEquals("N", marsRoverPlace.getDirectionShortName());
    }

    @Test
    public void should_add_coordinatesY_by_1_when_move_give_direction_N() {
        MarsRoverPlace marsRoverPlace = new MarsRoverPlace(0, 0, "N");

        marsRoverPlace.move();

        Assert.assertEquals(1, marsRoverPlace.getCoordinatesY());
    }

    @Test
    public void should_add_coordinatesX_by_1_when_move_give_direction_E() {
        MarsRoverPlace marsRoverPlace = new MarsRoverPlace(0, 0, "E");

        marsRoverPlace.move();

        Assert.assertEquals(1, marsRoverPlace.getCoordinatesX());
    }

    @Test
    public void should_minus_coordinatesX_by_1_when_move_give_direction_W() {
        MarsRoverPlace marsRoverPlace = new MarsRoverPlace(0, 0, "W");

        marsRoverPlace.move();

        Assert.assertEquals(-1, marsRoverPlace.getCoordinatesX());
    }

    @Test
    public void should_minus_coordinatesY_by_1_when_move_give_direction_S() {
        MarsRoverPlace marsRoverPlace = new MarsRoverPlace(0, 0, "S");

        marsRoverPlace.move();

        Assert.assertEquals(-1, marsRoverPlace.getCoordinatesY());
    }
}