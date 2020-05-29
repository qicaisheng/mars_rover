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
}