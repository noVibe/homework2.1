package transport.cars;
import transport.drivers.DriverC;
import transport.enums.LoadCapacity;

public class Truck extends Car{
    private LoadCapacity loadCapacity;
    public Truck(String brand, String model, double engineVolume, DriverC driver) {
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
        return super.toString() + (loadCapacity == null ? ". Load capacity: No data" : ". " + loadCapacity);
    }

    @Override
    public void printType() {
        System.out.println(loadCapacity == null ? "Load capacity: No data" : loadCapacity);
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

}
