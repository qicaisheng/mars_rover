package com.twschool.practice.marsrover;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {
    @Test
    public void should_return_x_0_y_1_and_N_when_receive_M_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));
        
        MarsRoverPosition marsRoverPosition = marsRover.receive("M");

        Assert.assertEquals(0, marsRoverPosition.getCoordinatesX());
        Assert.assertEquals(1, marsRoverPosition.getCoordinatesY());
        Assert.assertEquals("N", marsRoverPosition.getDirectionShortName());
    }

    @Test
    public void should_return_x_0_y_0_and_W_when_receive_L_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("L");

        Assert.assertEquals(0, marsRoverPosition.getCoordinatesX());
        Assert.assertEquals(0, marsRoverPosition.getCoordinatesY());
        Assert.assertEquals("W", marsRoverPosition.getDirectionShortName());
    }

    @Test
    public void should_return_x_0_y_0_and_E_when_receive_R_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("R");

        Assert.assertEquals(0, marsRoverPosition.getCoordinatesX());
        Assert.assertEquals(0, marsRoverPosition.getCoordinatesY());
        Assert.assertEquals("E", marsRoverPosition.getDirectionShortName());
    }

    @Test
    public void should_return_x_0_y_2_and_N_when_receive_MM_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("MM");

        Assert.assertEquals(0, marsRoverPosition.getCoordinatesX());
        Assert.assertEquals(2, marsRoverPosition.getCoordinatesY());
        Assert.assertEquals("N", marsRoverPosition.getDirectionShortName());
    }

    @Test
    public void should_return_x_0_y_0_and_W_when_receive_MLLMR_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("MLLMR");

        Assert.assertEquals(0, marsRoverPosition.getCoordinatesX());
        Assert.assertEquals(0, marsRoverPosition.getCoordinatesY());
        Assert.assertEquals("W", marsRoverPosition.getDirectionShortName());
    }

}
