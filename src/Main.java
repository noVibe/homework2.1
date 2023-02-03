import mechanics.Mechanic;
import service.ServiceStation;
import transport.cars.*;
import transport.drivers.*;
import transport.enums.BodyType;
import transport.enums.LoadCapacity;
import transport.enums.PassengerCapacity;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DriverB mark = new DriverB("Mark", true, 10);
        DriverD bob = new DriverD("Bob", true, 25);
        DriverC bill = new DriverC("Bill", true, 8);

        Mechanic dan = new Mechanic("Dan", "Servicemen");

        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(dan);
        mechanics.add(new Mechanic("Bob", "Gop"));
        dan.doMaintenance();
        dan.repairCar();

        WheelTransport lancia = new LightWheelTransport("Lancia", "Delta HF Integrale", 1.995, mark, BodyType.HATCHBACK, mechanics);
        WheelTransport ikarus = new Bus("Ikarus", "55", 8.28, bob, PassengerCapacity.TINY, mechanics);
        WheelTransport kamaz = new Truck("Kamaz", "K5", 12.98, bill, LoadCapacity.N2, mechanics);

        ArrayList<? extends WheelTransport> wheelTransports = new ArrayList<>(){{
            add(new Bus("Mercedes","A300",9.00, new DriverD("Frank", true, 7), PassengerCapacity.BIG, mechanics));
        }};

        wheelTransports.get(3).getDriver();

        wheelTransports.add(lancia);
        wheelTransports.add(ikarus);
        wheelTransports.add(kamaz);

        lancia.printListOfMechanics();
        System.out.println(lancia.getDriver().getName());

        ServiceStation.addCar(lancia);
        ServiceStation.addCar(kamaz);
        ServiceStation.printCarsOnService();
        ServiceStation.addCar(ikarus);
        ServiceStation.doService();
        ServiceStation.printCarsOnService();
    }
}