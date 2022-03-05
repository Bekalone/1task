package com.company;

import java.util.Random;

final class Truck extends PassengerCar {
    private int cargoWeight;

    public Truck(String model, Rudder rudder, double volume, int capacity, int cargoWeight) {
        super(model, rudder, volume, capacity);
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    @Override
    public String getInfoCar() {
        return super.getInfoCar() + ", Cargo Weight" + cargoWeight;
    }
}
