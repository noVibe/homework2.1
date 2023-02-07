import mechanics.Mechanic;
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

        Set<Driver> driverSet = new HashSet<>();
        driverSet.add(mark);
        driverSet.add(bill);
        driverSet.add(bob);
        Iterator pederator = driverSet.iterator();
        while (pederator.hasNext()) System.out.println(pederator.next());


        Mechanic dan = new Mechanic("Dan", "Servicemen");

        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(dan);
        mechanics.add(new Mechanic("Bob", "Gop"));


        WheelTransport<DriverB> lancia = new LightWheelTransport("Lancia", "Delta HF Integrale", 1.995, mark, BodyType.HATCHBACK, mechanics);
        WheelTransport<DriverD> ikarus = new Bus("Ikarus", "55", 8.28, bob, PassengerCapacity.TINY, mechanics);
        WheelTransport<DriverC> kamaz = new Truck("Kamaz", "K5", 12.98, bill, LoadCapacity.N2, mechanics);

        lancia.getListOfMechanics().add(new Mechanic("Rob", "Fixi"));

        Map<WheelTransport<? extends Driver>, List<Mechanic>> carsAndMechanics = new HashMap<>();
        carsAndMechanics.put(lancia, lancia.getListOfMechanics());
        carsAndMechanics.put(ikarus, ikarus.getListOfMechanics());
        carsAndMechanics.put(kamaz, kamaz.getListOfMechanics());

        carsAndMechanics.forEach((k, v) -> System.out.printf("%s %s mechanics list:\n%s\n", k.getBrand(), k.getModel(), v));

        /// PROBLEM ///
//                Iterator iterator = carsAndMechanics.entrySet().iterator();
//        while (iterator.hasNext())
//            Map.Entry<WheelTransport, List<Mechanic>> entry = iterator.next();
        /// PROVIDED TYPE: OBJECT ///

        ArrayList<WheelTransport<? extends Driver>> wheelTransports = new ArrayList<>() {{
            add(new Bus("Mercedes", "A300", 9.00, new DriverD("Frank", true, 7), PassengerCapacity.BIG, mechanics));
        }};
        wheelTransports.add(lancia);
        wheelTransports.add(ikarus);
        wheelTransports.add(kamaz);
        System.out.println(wheelTransports);
    }
}