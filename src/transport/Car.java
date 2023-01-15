package transport;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static utilities.Utilities.*;

public class Car {
    final private String brand;
    final private String model;
    final private int year;
    final private String country;
    final private String bodyStyle;
    final private int seatsAmount;
    private double engineVolume;
    private String color;
    private String gearBox;
    private String plateNumber;
    private boolean isWinterTires;

    Key key;

    private class Key {
        final boolean isRemoteEngineStartAvailable;
        final boolean isNoKeyAccessAvailable;

        public Key(boolean isRemoteEngineStartAvailable, boolean isNoKeyAccessAvailable) {
            this.isRemoteEngineStartAvailable = isRemoteEngineStartAvailable;
            this.isNoKeyAccessAvailable = isNoKeyAccessAvailable;
        }

        @Override
        public String toString() {
            return (isRemoteEngineStartAvailable ? "Remote Engine Start Available, " : "No Remote Engine Start, ") +
                    (isNoKeyAccessAvailable ? "No-key Access Available" : "Access by key only");
        }
    }


    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String bodyStyle, int seatsAmount, String gearBox, String plateNumber, boolean isWinterTires,
               boolean isRemoteEngineStartAvailable, boolean isNoKeyAccessAvailable) {
        this.brand = validationAndDefaultSet(brand, "default");
        this.model = validationAndDefaultSet(model, "default");
        this.country = validationAndDefaultSet(country, "default");
        this.year = validationAndDefaultSet(year, 2000);
        this.bodyStyle = validationAndDefaultSet(bodyStyle, "default");
        this.seatsAmount = validationAndDefaultSet(seatsAmount, 4);
        setEngineVolume(engineVolume);
        setColor(color);
        setGearBox(gearBox);
        setPlateNumber(plateNumber);
        this.isWinterTires = isWinterTires;
        key = new Key(isRemoteEngineStartAvailable, isNoKeyAccessAvailable);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validationAndDefaultSet(engineVolume, 1500);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validationAndDefaultSet(color, "white");
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = validationAndDefaultSet(gearBox, "default");
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        if (plateNumber != null && plateNumber.matches("[авсенкмоуртх](?!000)\\d{3}[авсенкмоуртх]{2}(0[1-9]|[1-9]\\d\\d?)"))
            this.plateNumber = plateNumber;
        else this.plateNumber = "default";
    }

    public boolean isWinterTires() {
        return isWinterTires;
    }

    public void setWinterTires(boolean winterTires) {
        isWinterTires = winterTires;
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

    public String getBodyStyle() {
        return bodyStyle;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public void changeTiresForCurrentSeason() {
        int current = LocalDate.now().getMonthValue();
        isWinterTires = current < 4 || current > 9;
    }

    @Override
    public String toString() {
        return "brand: " + brand +
                ", model: " + model +
                ", year: " + year +
                ", country: " + country +
                ", bodyStyle: " + bodyStyle +
                ", seatsAmount: " + seatsAmount +
                ", engineVolume: " + engineVolume +
                ", color: " + color +
                ", gearBox: " + gearBox +
                ", plateNumber: " + plateNumber + ", " +
                (isWinterTires ? "Winter tires" : "Summer tires") + ", " +
                key.toString();
    }
}
