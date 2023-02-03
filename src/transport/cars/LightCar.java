package transport.cars;

import mechanics.Mechanic;
import transport.drivers.*;
import transport.enums.BodyType;

import java.util.List;

public class LightCar extends Car {
    public LightCar(String brand, String model, double engineVolume, DriverB driver, BodyType body, List<Mechanic> mechanics) {
        super(brand, model, engineVolume, driver, body, mechanics);
    }

    @Override
    public boolean checkIfServiceable() {
        return true;
    }

    @Override
    public void diagnose() {
        System.out.println("Diagnosed");

    }
}