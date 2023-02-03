package transport.cars;

import mechanics.Mechanic;
import transport.drivers.*;
import transport.enums.BodyType;

import java.util.List;

public class LightWheelTransport extends WheelTransport {
    public LightWheelTransport(String brand, String model, double engineVolume, DriverB driver, BodyType body, List<Mechanic> mechanics) {
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