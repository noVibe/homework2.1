package transport.cars;

import transport.drivers.*;

public class LightCar<T extends DriverB> extends Car {
    public LightCar(String brand, String model, double engineVolume, T driver) {
        super(brand, model, engineVolume, driver);
    }






}
