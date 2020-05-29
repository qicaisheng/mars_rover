package com.twschool.practice.marsrover;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DirectionTest {

    @Test
    public void should_return_the_WEST_when_get_left_direction_given_direction_NORTH() {
        Assert.assertEquals(Direction.WEST, Direction.NORTH.leftDirection());
    }

    @Test
    public void should_return_the_EAST_when_get_right_direction_given_direction_NORTH() {
        Assert.assertEquals(Direction.EAST, Direction.NORTH.rightDirection());
    }

    @Test
    public void should_return_the_SOUTH_when_get_left_direction_given_direction_WEST() {
        Assert.assertEquals(Direction.SOUTH, Direction.WEST.leftDirection());
    }
    
    @Test
    public void should_return_the_NORTH_when_get_right_direction_given_direction_WEST() {
        Assert.assertEquals(Direction.NORTH, Direction.WEST.rightDirection());
    }
    
    @Test
    public void should_return_the_EAST_when_get_left_direction_given_direction_SOUTH() {
        Assert.assertEquals(Direction.EAST, Direction.SOUTH.leftDirection());
    }

    @Test
    public void should_return_the_WEST_when_get_right_direction_given_direction_SOUTH() {
        Assert.assertEquals(Direction.WEST, Direction.SOUTH.rightDirection());
    }

    @Test
    public void should_return_the_NORTH_when_get_left_direction_given_direction_EAST() {
        Assert.assertEquals(Direction.NORTH, Direction.EAST.leftDirection());
    }

    @Test
    public void should_return_the_SOUTH_when_get_right_direction_given_direction_EAST() {
        Assert.assertEquals(Direction.SOUTH, Direction.EAST.rightDirection());
    }

}