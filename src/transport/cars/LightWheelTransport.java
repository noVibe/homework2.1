package transport.cars;

import mechanics.Mechanic;
import transport.drivers.*;
import transport.enums.BodyType;

import java.util.List;
import java.util.Objects;

public class LightWheelTransport extends WheelTransport<DriverB> {
    private final BodyType body;
    public LightWheelTransport(String brand, String model, double engineVolume, DriverB driver, BodyType body, List<Mechanic> mechanics) {
        super(brand, model, engineVolume, driver, mechanics);
        this.body = body;
    }

    @Override
    public void printType() {
        System.out.println(body);
    }

    @Override
    public BodyType getType() {
        return body;
    }

    @Override
    public String toString() {
        return super.toString() + " " + (body != null ? body : "No type data");
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
        if (!(o instanceof LightWheelTransport)) return false;
        if (!super.equals(o)) return false;
        LightWheelTransport that = (LightWheelTransport) o;
        return body == that.body;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), body);
    }
}