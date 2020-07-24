package com.twschool.practice.marsrover;

public interface MarsRoverCommand {
    void doOperation(MarsRoverPosition marsRoverPosition);

    boolean match(String command);
}
