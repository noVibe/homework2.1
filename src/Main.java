import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Audi", "A8 50 L TDI quattro", 2.5,"black",2020,
                "Germany", "Sedan", 4, "Robot", "а222ок202", false, 170, true, false);
        Car testCar = new Car("", null, 0, null,-1, "", null,
                100, "", null, false, -2, false,false);

        car.changeTiresForCurrentSeason();

        System.out.println(car);
        System.out.println(testCar);

        Bus bus = new Bus("Ferrari", "Random", 1988, "Italy", "Red", 220);
        Bus testBus = new Bus(null, "", 0, null, "", -4);

        System.out.println(bus);
        System.out.println(testBus);

    }
}