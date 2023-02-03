package transport.cars;
import mechanics.Mechanic;
import transport.Competing;
import transport.Transport;
import transport.drivers.*;

import java.lang.reflect.InaccessibleObjectException;
import java.util.List;
import java.util.Objects;

import static utilities.Utilities.*;

public abstract class WheelTransport<T extends Driver, E extends Enum> extends Transport implements Competing {
    final private String brand;
    final private String model;
    final private double engineVolume;
    private T driver;
    private E type;

    public WheelTransport(String brand, String model, double engineVolume, T driver, E type, List<Mechanic> mechanics) {
        super(mechanics);
        this.brand = validationAndDefaultSet(brand, "default");
        this.model = validationAndDefaultSet(model, "default");
        this.engineVolume = validationAndDefaultSet(engineVolume, 1.5);
        this.type = type;
        hire(driver);
    }

    public abstract boolean checkIfServiceable();

    public void printDriverName() {
        System.out.println(this.driver.getName());
    }

    public abstract void diagnose();

    @Override
    public void printListOfMechanics() {
        System.out.printf("Mechanics of %s %s: ", getBrand(), getModel());
        super.printListOfMechanics();
    }

    public void printType() {
        System.out.println(type != null ? type : "No type data");
    }

    public void move() {
        String temp = getClass().toString().replaceAll(".+\\.", "");
        System.out.println(temp +  " is moving");
    }

    public void stop() {
        String temp = getClass().toString().replaceAll(".+\\.", "");
        System.out.println(temp +  " stopped");
    }


    private void hire(T driver) {
        if (driver.isHired())
            throw new InaccessibleObjectException("one driver can drive one car only!");
        else {
            driver.SetIsHired();
            this.driver = driver;
        }
    }

    public void raceMessage() {
        System.out.printf("Driver %s on the car %s %s is going to participate the race", getDriver().getName(), brand, model);
    }


    @Override
    public String toString() {
        return "Car " + "brand: " + brand + ", model: " + model  + ", " +
                (type != null ? type : "No type data") + ", engineVolume: " + engineVolume + ". " + driver + ". ";
    }

    public E getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        hire(driver);
    }

    @Override
    public void pitStop() {

    }

    @Override
    public void bestLap() {

    }

    public void maxSpeed() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WheelTransport)) return false;
        if (!super.equals(o)) return false;
        WheelTransport<?, ?> wheelTransport = (WheelTransport<?, ?>) o;
        return Double.compare(wheelTransport.engineVolume, engineVolume) == 0 && Objects.equals(brand, wheelTransport.brand) && Objects.equals(model, wheelTransport.model) && Objects.equals(driver, wheelTransport.driver) && Objects.equals(type, wheelTransport.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brand, model, engineVolume, driver, type);
    }
//          Checking plate number via regex:
//        [авсенкмоуртх](?!000)\\d{3}[авсенкмоуртх]{2}(0[1-9]|[1-9]\\d\\d?)
//
}
