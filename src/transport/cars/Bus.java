package transport.cars;

import exceptions.TransportTypeException;
import mechanics.Mechanic;
import transport.drivers.DriverD;
import transport.enums.PassengerCapacity;


import java.util.List;
import java.util.Objects;

public class Bus extends WheelTransport<DriverD> {
    private final PassengerCapacity capacity;

    public Bus(String brand, String model, double engineVolume, DriverD driver, PassengerCapacity capacity, List<Mechanic> mechanics) {
        super(brand, model, engineVolume, driver, mechanics);
        this.capacity = capacity;
    }

    @Override
    public void printType() {
        System.out.println(capacity);
    }

    @Override
    public PassengerCapacity getType() {
        return capacity;
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
    public String toString() {
        return super.toString() + ". " + (capacity != null ? capacity : "No capacity data");
    }

    @Override
    public boolean checkIfServiceable() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return capacity == bus.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity);
    }
}
