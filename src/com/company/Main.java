package com.company;

public class Main {

    public static void main(String[] args) {
        PassengerCar passengerCar = new PassengerCar("Tesla", Rudder.LEFT_HAND_DRIVE, 2.3, 151);
        Truck truck = new Truck("Groza", Rudder.RIGHT_HAND_DRIVE, 5.5, 342, 62);
        Truck bigTruck = new Truck("Monster", Rudder.LEFT_HAND_DRIVE, 6, 314, 30);
        Car[] cars = {passengerCar, truck, bigTruck};
        for (Car car : cars) {
            System.out.println(car.getInfoCar());
        }
    }
}
