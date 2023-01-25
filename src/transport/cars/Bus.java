package transport.cars;
import transport.drivers.DriverD;
import transport.enums.PassengerCapacity;

public class Bus extends Car{
    private PassengerCapacity passengerCapacity;
    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public String toString() {
        return super.toString() + (passengerCapacity == null ? ". Passenger capacity: No data" : ". " + passengerCapacity);
    }

    @Override
    public void printType() {
        System.out.println(passengerCapacity == null ? "Passenger capacity: No data" : passengerCapacity);
    }

    public PassengerCapacity getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(PassengerCapacity passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
