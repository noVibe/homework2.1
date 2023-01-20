package transport.cars;

import transport.drivers.DriverC;

public class Truck extends Car<DriverC>{
    public Truck(String brand, String model, double engineVolume, DriverC driver) {

        super(brand, model, engineVolume, driver);
    }
}
