package com.company;

public class TruckDecorator extends CarDecorator{
    public TruckDecorator(Car car) {
        super(car);
    }

    @Override
    public int speed() {
        return super.speed() - 30;
    }

    @Override
    public int baggageWeight() {
        return super.baggageWeight() + 1000;
    }
}
