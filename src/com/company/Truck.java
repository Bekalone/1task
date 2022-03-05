package com.company;

import java.util.Random;

final class Truck extends PassengerCar{
    private int cargoWeight;

    public Truck(String model, Rudder rudder, double volume, int capacity, int cargoWeight) {
        super(model, rudder, volume, capacity);
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        Random random = new Random();
        if (cargoWeight > 60){
            return  cargoWeight = random.nextInt(40) + 10;
        } else {
            return cargoWeight;
        }
    }

    /*public int generateDefaultCargoWeight(){
        Random random = new Random();
        if (cargoWeight > 60){
            cargoWeight = random.nextInt(40) + 10;
        }
        return cargoWeight;
    }*/

    @Override
    public String getInfoCar() {
        return super.getInfoCar() + ", Cargo Weight" + cargoWeight;
    }
}
