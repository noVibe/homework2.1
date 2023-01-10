public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand == null || brand.isEmpty() ? "default" : brand;
        this.model = model == null || model.isEmpty() ? "default" : model;
        this.country = country == null || country.isEmpty() ? "default" : country;
        this.engineVolume = engineVolume > 0 ? engineVolume : 1.5;
        this.color = color == null || color.isEmpty() ? "white" : color;
        this.year = year > 0 ? year : 2000;
       }

    @Override
    public String toString() {
        return "brand = " + brand + ", model = " + model + ", engineVolume = " + engineVolume +
                ", color = " + color + ", year = " + year + ", country = " + country;
    }
}
