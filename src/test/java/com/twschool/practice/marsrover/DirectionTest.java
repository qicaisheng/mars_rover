package com.twschool.practice.marsrover;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DirectionTest {

    @Test
    public void should_return_the_WEST_when_get_left_direction_given_direction_NORTH() {
        Direction north = Direction.NORTH;

        Assert.assertEquals(Direction.WEST, north.leftDirection());
    }
}