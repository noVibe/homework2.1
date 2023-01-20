package transport.cars;

import transport.drivers.DriverD;

public class Bus<T extends DriverD> extends Car{
    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }
}
