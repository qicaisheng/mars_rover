package com.twschool.practice.marsrover;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverSafetyAreaTest {

    @Test
    public void should_return_true_when_coordinates_in_safety_area() {
        MarsRoverSafetyArea marsRoverSafetyArea = new MarsRoverSafetyArea(new Coordinates(0, 0), 5);
        
        boolean inSafetyArea = marsRoverSafetyArea.contains(new Coordinates(0, 5));

        Assert.assertTrue(inSafetyArea);
    }

    @Test
    public void should_return_false_when_coordinates_out_of_safety_area() {
        MarsRoverSafetyArea marsRoverSafetyArea = new MarsRoverSafetyArea(new Coordinates(0, 0), 5);

        boolean inSafetyArea = marsRoverSafetyArea.contains(new Coordinates(0, 6));

        Assert.assertFalse(inSafetyArea);
    }

}