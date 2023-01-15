import transport.Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Audi", "A8 50 L TDI quattro", 2000,"black",2020,
                "Germany", "Sedan", 4, "Robot", "а222ок202", false, true, false);
        Car test = new Car("", null, 0, null,-1, "", null,
                100, "", null, false, false, false);

        car.changeTiresForCurrentSeason();

        System.out.println(car);
        System.out.println(test);
    }
}