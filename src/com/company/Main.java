package com.company;

public class Main {

    public static void main(String[] args) {
        PassengerCar passengerCar = new PassengerCar("Tesla", Rudder.LEFT_HAND_DRIVE, 2.3,151);
        System.out.println(passengerCar.getInfoCar());

        Truck truck = new Truck("Groza",Rudder.RIGHT_HAND_DRIVE,5.5,342,62);
        System.out.println(truck.getInfoCar());

        Truck bigTruck = new Truck("Monster",Rudder.LEFT_HAND_DRIVE,6,314,30);
        System.out.println(bigTruck.getInfoCar());
    }
}
