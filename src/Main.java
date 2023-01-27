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

//        Truck test = new Truck("", null, 0, bill);
//        lancia.printType();
//        System.out.println(lancia);
//        lancia.setBody(BodyType.HATCHBACK);
//        kamaz.printType();
//        kamaz.setLoadCapacity(LoadCapacity.N3);
//        ikarus.setPassengerCapacity(PassengerCapacity.TINY);
//        lancia.printType();
//        kamaz.printType();
//        System.out.println(kamaz);
//        ikarus.printType();
        lancia.diagnose();
        kamaz.diagnose();
        ikarus.diagnose();
    }

}