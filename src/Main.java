import service.ServiceStation;
import transport.Transport;
import transport.cars.*;
import transport.drivers.*;
import transport.enums.BodyType;
import transport.enums.LoadCapacity;
import transport.enums.PassengerCapacity;

public class Main {
    public static void main(String[] args) {
        DriverB mark = new DriverB("Mark", true, 10);
        DriverD bob = new DriverD("Bob", true, 25);
        DriverC bill = new DriverC("Bill", true, 8);

        LightCar lancia = new LightCar("Lancia", "Delta HF Integrale", 1.995, mark);
        Bus ikarus = new Bus("Ikarus", "55", 8.28, bob);
        Truck kamaz = new Truck("Kamaz", "K5", 12.98, bill);

        lancia.setBody(BodyType.HATCHBACK);
        ikarus.setPassengerCapacity(PassengerCapacity.TINY);
        kamaz.setLoadCapacity(LoadCapacity.N2);

        Transport.addMechanic("Tim", "Apple");

        ServiceStation.addCar(lancia);
        ServiceStation.addCar(lancia);
        ServiceStation.addCar(kamaz);
        ServiceStation.addCar(ikarus);
        ServiceStation.doService();
        ServiceStation.printCarsOnService();
    }
}