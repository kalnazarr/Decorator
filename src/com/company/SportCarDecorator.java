package com.company;

public class SportCarDecorator extends CarDecorator{

    public SportCarDecorator(Car car) {
        super(car);
    }

    @Override
    public int speed() {
        return super.speed() + 100;
    }

    @Override
    public int baggageWeight() {
        return super.baggageWeight();
    }
}
