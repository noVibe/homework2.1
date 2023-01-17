package transport;

import static utilities.Utilities.*;

public abstract class Transport {
    final private String brand;
    final private String model;
    final private int year;
    final private String country;
    private String color;
    private int maxVelocity;

    public Transport(String brand, String model, int year, String country, String color, int maxVelocity) {
        this.brand = validationAndDefaultSet(brand, "default");
        this.model = validationAndDefaultSet(model, "default");
        this.country = validationAndDefaultSet(country, "default");
        this.year = validationAndDefaultSet(year, 2000);
        setColor(color);
        setMaxVelocity(maxVelocity);
    }

    @Override
    public String toString() {
        return "brand: " + brand +
                ", model: " + model +
                ", year: " + year +
                ", country: " + country +
                ", color: " + color +
                ", maxVelocity: " + maxVelocity;
    }

    public void setColor(String color) {
        this.color = validationAndDefaultSet(color, "white");
    }

    public void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = validationAndDefaultSet(maxVelocity, 60);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public int getMaxVelocity() {
        return maxVelocity;
    }

    public String getColor() {
        return color;
    }
}
