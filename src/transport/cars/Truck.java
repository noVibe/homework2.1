package transport.cars;
import mechanics.Mechanic;
import transport.drivers.DriverC;
import transport.enums.LoadCapacity;

import java.util.List;

public class Truck extends Car{
    public Truck(String brand, String model, double engineVolume, DriverC driver, LoadCapacity capacity, List<Mechanic> mechanics) {
        super(brand, model, engineVolume, driver, capacity, mechanics);
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
