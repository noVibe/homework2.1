package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, int year, String country, String color, int maxVelocity) {
        super(brand, model, year, country, color, maxVelocity);
    }
    @Override
    public String toString() {
        return "Bus " + super.toString();
    }
}
