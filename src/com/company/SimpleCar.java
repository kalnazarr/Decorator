package com.company;

public class SimpleCar implements Car {

    private int speed = 100;
    private int baggageWeight = 100;

    @Override
    public int speed() {
        return speed;
    }

    @Override
    public int baggageWeight() {
        return baggageWeight;
    }
}
