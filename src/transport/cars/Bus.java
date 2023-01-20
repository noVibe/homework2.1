package transport.cars;

import transport.drivers.DriverD;

public class Bus extends Car<DriverD>{
    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }
}
