import static Utilities.Utilities.*;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = isNullOrEmpty(brand) ? "default" : brand;
        this.model = isNullOrEmpty(model) || model.isEmpty() ? "default" : model;
        this.country = isNullOrEmpty(country) || country.isBlank() ? "default" : country;
        this.engineVolume = engineVolume > 0 ? engineVolume : 1.5;
        this.color = isNullOrEmpty(color) || color.isEmpty() ? "white" : color;
        this.year = year > 0 ? year : 2000;
    }


    @Override
    public String toString() {
        return "brand = " + brand + ", model = " + model + ", engineVolume = " + engineVolume +
                ", color = " + color + ", year = " + year + ", country = " + country;
    }
}
