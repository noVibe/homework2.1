package transport.cars;
import mechanics.Mechanic;
import transport.drivers.DriverC;
import transport.enums.LoadCapacity;

import java.util.List;
import java.util.Objects;

public class Truck extends WheelTransport<DriverC> {
    private final LoadCapacity capacity;
    public Truck(String brand, String model, double engineVolume, DriverC driver, LoadCapacity capacity, List<Mechanic> mechanics) {
        super(brand, model, engineVolume, driver, mechanics);
        this.capacity = capacity;
    }

    @Override

    public void printType() {
        System.out.println(capacity);
    }

    @Override
    public LoadCapacity getType() {
        return capacity;
    }

    @Override
    public String toString() {
        return super.toString() + ". " + (capacity != null ? capacity : "No capacity data");
    }

    @Override
    public boolean checkIfServiceable() {
        return true;
    }

    @Override
    public void diagnose() {
        System.out.println("Diagnosed");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return capacity == truck.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity);
    }
}
