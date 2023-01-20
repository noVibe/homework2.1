package transport.cars;

import transport.drivers.DriverC;

public class Truck<T extends DriverC> extends Car{
    public Truck(String brand, String model, double engineVolume, T driver) {

        super(brand, model, engineVolume, driver);
    }
}
