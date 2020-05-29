package com.twschool.practice.marsrover;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MarsRoverPlaceTest {
    @Test
    public void should_return_toward_W_when_turn_left_give_init_toward_N() {
        MarsRoverPlace marsRoverPlace = new MarsRoverPlace(0, 0, "N");
        
        marsRoverPlace.turnLeft();

        Assert.assertEquals("W", marsRoverPlace.getToward());
    }

    @Test
    public void should_return_toward_S_when_turn_left_give_init_toward_W() {
        MarsRoverPlace marsRoverPlace = new MarsRoverPlace(0, 0, "W");

        marsRoverPlace.turnLeft();

        Assert.assertEquals("S", marsRoverPlace.getToward());
    }

    @Test
    public void should_return_toward_E_when_turn_left_give_init_toward_S() {
        MarsRoverPlace marsRoverPlace = new MarsRoverPlace(0, 0, "S");

        marsRoverPlace.turnLeft();

        Assert.assertEquals("E", marsRoverPlace.getToward());
    }

    @Test
    public void should_return_toward_N_when_turn_left_give_init_toward_E() {
        MarsRoverPlace marsRoverPlace = new MarsRoverPlace(0, 0, "E");

        marsRoverPlace.turnLeft();

        Assert.assertEquals("N", marsRoverPlace.getToward());
    }

}