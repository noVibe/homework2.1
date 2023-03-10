package transport.cars;
import mechanics.Mechanic;
import transport.Competing;
import transport.Transport;
import transport.drivers.*;

import java.lang.reflect.InaccessibleObjectException;
import java.util.List;
import java.util.Objects;

import static utilities.Utilities.*;

public abstract class WheelTransport<T extends Driver> extends Transport implements Competing {
    final private String brand;
    final private String model;
    final private double engineVolume;
    private T driver;

    public WheelTransport(String brand, String model, double engineVolume, T driver, List<Mechanic> mechanics) {
        super(mechanics);
        this.brand = validationAndDefaultSet(brand, "default");
        this.model = validationAndDefaultSet(model, "default");
        this.engineVolume = validationAndDefaultSet(engineVolume, 1.5);
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

    public abstract void printType();

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
                ", engineVolume: " + engineVolume + ". " + driver + ". ";
    }

    public abstract Enum getType();


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
        WheelTransport<?> that = (WheelTransport<?>) o;
        return Double.compare(that.engineVolume, engineVolume) == 0 && Objects.equals(brand, that.brand) && Objects.equals(model, that.model) && Objects.equals(driver, that.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brand, model, engineVolume);
    }

    //          Checking plate number via regex:
//        [????????????????????????](?!000)\\d{3}[????????????????????????]{2}(0[1-9]|[1-9]\\d\\d?)
//
}
