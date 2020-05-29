package com.twschool.practice.marsrover;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverPositionTest {
    @Test
    public void should_return_toward_W_when_turn_left_give_init_toward_N() {
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "N");
        
        marsRoverPosition.turnLeft();

        Assert.assertEquals("W", marsRoverPosition.getDirectionShortName());
    }

    @Test
    public void should_return_toward_S_when_turn_left_give_init_toward_W() {
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "W");

        marsRoverPosition.turnLeft();

        Assert.assertEquals("S", marsRoverPosition.getDirectionShortName());
    }

    @Test
    public void should_return_toward_E_when_turn_left_give_init_toward_S() {
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "S");

        marsRoverPosition.turnLeft();

        Assert.assertEquals("E", marsRoverPosition.getDirectionShortName());
    }

    @Test
    public void should_return_toward_N_when_turn_left_give_init_toward_E() {
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "E");

        marsRoverPosition.turnLeft();

        Assert.assertEquals("N", marsRoverPosition.getDirectionShortName());
    }

    @Test
    public void should_add_coordinatesY_by_1_when_move_give_direction_N() {
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "N");

        marsRoverPosition.move();

        Assert.assertEquals(1, marsRoverPosition.getCoordinatesY());
    }

    @Test
    public void should_add_coordinatesX_by_1_when_move_give_direction_E() {
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "E");

        marsRoverPosition.move();

        Assert.assertEquals(1, marsRoverPosition.getCoordinatesX());
    }

    @Test
    public void should_minus_coordinatesX_by_1_when_move_give_direction_W() {
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "W");

        marsRoverPosition.move();

        Assert.assertEquals(-1, marsRoverPosition.getCoordinatesX());
    }

    @Test
    public void should_minus_coordinatesY_by_1_when_move_give_direction_S() {
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "S");

        marsRoverPosition.move();

        Assert.assertEquals(-1, marsRoverPosition.getCoordinatesY());
    }
}