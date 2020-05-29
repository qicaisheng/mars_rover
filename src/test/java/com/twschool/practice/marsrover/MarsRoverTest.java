package com.twschool.practice.marsrover;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {
    @Test
    public void should_return_x_0_y_1_and_N_when_receive_M_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPlace(0 ,0 , "N"));
        
        MarsRoverPlace marsRoverPlace = marsRover.receive("M");

        Assert.assertEquals(0, marsRoverPlace.getCoordinatesX());
        Assert.assertEquals(1, marsRoverPlace.getCoordinatesY());
        Assert.assertEquals("N", marsRoverPlace.getToward());
    }

    @Test
    public void should_return_x_0_y_0_and_W_when_receive_L_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPlace(0 ,0 , "N"));

        MarsRoverPlace marsRoverPlace = marsRover.receive("L");

        Assert.assertEquals(0, marsRoverPlace.getCoordinatesX());
        Assert.assertEquals(0, marsRoverPlace.getCoordinatesY());
        Assert.assertEquals("W", marsRoverPlace.getToward());
    }

    @Test
    public void should_return_x_0_y_0_and_E_when_receive_R_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPlace(0 ,0 , "N"));

        MarsRoverPlace marsRoverPlace = marsRover.receive("R");

        Assert.assertEquals(0, marsRoverPlace.getCoordinatesX());
        Assert.assertEquals(0, marsRoverPlace.getCoordinatesY());
        Assert.assertEquals("E", marsRoverPlace.getToward());
    }

}
