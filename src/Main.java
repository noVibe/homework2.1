import mechanics.Mechanic;
import service.ServiceStation;
import transport.cars.*;
import transport.drivers.*;
import transport.enums.BodyType;
import transport.enums.LoadCapacity;
import transport.enums.PassengerCapacity;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        DriverB mark = new DriverB("Mark", true, 10);
        DriverD bob = new DriverD("Bob", true, 25);
        DriverC bill = new DriverC("Bill", true, 8);

        Mechanic dan = new Mechanic("Dan", "Servicemen");

        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(dan);
        mechanics.add(new Mechanic("Bob", "Gop"));


        WheelTransport lancia = new LightWheelTransport("Lancia", "Delta HF Integrale", 1.995, mark, BodyType.HATCHBACK, mechanics);
        WheelTransport ikarus = new Bus("Ikarus", "55", 8.28, bob, PassengerCapacity.TINY, mechanics);
        WheelTransport kamaz = new Truck("Kamaz", "K5", 12.98, bill, LoadCapacity.N2, mechanics);

        Map<WheelTransport, List<Mechanic>> carsAndMechanics = new HashMap<>();
        carsAndMechanics.put(lancia, lancia.getListOfMechanics());
        carsAndMechanics.put(ikarus, ikarus.getListOfMechanics());
        carsAndMechanics.put(kamaz, kamaz.getListOfMechanics());

        carsAndMechanics.forEach((k, v) -> System.out.printf("%s %s mechanics list:\n%s\n", k.getBrand(), k.getModel(), v));

        for (var pair : carsAndMechanics.entrySet()) {
            System.out.println("---------Same via loop-----------");
            System.out.printf("%s %s mechanics list:\n%s\n", pair.getKey().getBrand(), pair.getKey().getModel(), pair.getValue());
        }

        /// PROBLEM ///
        Iterator iterator = carsAndMechanics.entrySet().iterator();
        while (iterator.hasNext())
            Map.Entry<WheelTransport, List<Mechanic>> entry = iterator.next(); /// PROVIDED TYPE: OBJECT ///

        ArrayList<? extends WheelTransport> wheelTransports = new ArrayList<>() {{
            add(new Bus("Mercedes", "A300", 9.00, new DriverD("Frank", true, 7), PassengerCapacity.BIG, mechanics));
        }};

//        wheelTransports.add(lancia);
//        wheelTransports.add(ikarus);
//        wheelTransports.add(kamaz);

    }
}