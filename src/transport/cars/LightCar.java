package transport.cars;

import transport.drivers.*;
import transport.enums.BodyType;
public class LightCar extends Car {
    private BodyType body;
    public LightCar(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
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
    public String toString() {
        return super.toString() + (body == null ? ". Body type: No data" : ". " + body);
    }

    @Override
    public void printType() {
        System.out.println(body == null ? "Passenger type: No data" : body);
    }

    public BodyType getBody() {
        return body;
    }

    public void setBody(BodyType body) {
        this.body = body;
    }
}
