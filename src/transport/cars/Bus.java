package transport.cars;
import excepptions.TransportTypeException;
import mechanics.Mechanic;
import transport.drivers.DriverD;
import transport.enums.PassengerCapacity;


import java.util.List;

public class Bus extends WheelTransport {
    public Bus(String brand, String model, double engineVolume, DriverD driver, PassengerCapacity passengerCapacity, List<Mechanic> mechanics) {
        super(brand, model, engineVolume, driver, passengerCapacity, mechanics);
    }

    @Override
    public void diagnose() {
        try {
                throw new TransportTypeException("Bus diagnosing is not allowed");
        } catch (TransportTypeException t) {
            System.err.println(t.getMessage());
        }
    }

    @Override
    public boolean checkIfServiceable() {
        return false;
    }

}
