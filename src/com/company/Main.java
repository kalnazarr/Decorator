package com.company;

public class Main {

    public static void main(String[] args) {
        Car simpleCar = new SimpleCar();

        System.out.println("Simple car speed: " + simpleCar.speed());
        System.out.println("Simple car baggage weight: " + simpleCar.baggageWeight());

        Car sportCar = new SportCarDecorator(simpleCar);

        System.out.println("\nSport car speed: " + sportCar.speed());
        System.out.println("Sport car baggage weight: " + sportCar.baggageWeight());

        Car truck = new TruckDecorator(simpleCar);

        System.out.println("\nTruck speed: " + truck.speed());
        System.out.println("Truck baggage weight: " + truck.baggageWeight());
    }
}
