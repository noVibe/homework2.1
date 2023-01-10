public class Main {
    public static void main(String[] args) {

        Car car = new Car("Audi", "A8 50 L TDI quattro", 3,"black", 2020, "Germany");
        Car test = new Car("", null, 0, null, -1, "");
        System.out.println(car);
        System.out.println(test);
    }
}