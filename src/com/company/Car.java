package com.company;

public class Car {
    private String model;
    private Rudder rudder;
    private double volume;

    public Car(String model, Rudder rudder, double volume) {
        this.model = model;
        this.rudder = rudder;
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public Rudder getRudder() {
        return rudder;
    }

    public double getVolume() {
        return volume;
    }


    public String getInfoCar(){
    return "Model: " + model + ", Rudder: " + rudder + ", Volume: " + volume;
    }
}
