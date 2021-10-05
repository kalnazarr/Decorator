package com.company;

public class CarDecorator implements Car{

    private Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public int speed() {
        return car.speed();
    }

    @Override
    public int baggageWeight() {
        return car.baggageWeight();
    }
}
