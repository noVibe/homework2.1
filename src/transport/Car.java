package transport;

import java.time.LocalDate;

import static utilities.Utilities.*;

public class Car extends Transport {
    final private String bodyStyle;
    final private int seatsAmount;
    private double engineVolume;
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


    public Car(String brand, String model, double engineVolume, String color, int year, String country, String bodyStyle,
               int seatsAmount, String gearBox, String plateNumber, boolean isWinterTires, int maxVelocity,
               boolean isRemoteEngineStartAvailable, boolean isNoKeyAccessAvailable) {
        super(brand, model, year, country, color, maxVelocity);
        this.bodyStyle = validationAndDefaultSet(bodyStyle, "default");
        this.seatsAmount = validationAndDefaultSet(seatsAmount, 4);
        setEngineVolume(engineVolume);
        setGearBox(gearBox);
        setPlateNumber(plateNumber);
        this.isWinterTires = isWinterTires;
        key = new Key(isRemoteEngineStartAvailable, isNoKeyAccessAvailable);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validationAndDefaultSet(engineVolume, 1.5);
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
        return "Car " + super.toString() +
                ", bodyStyle: " + bodyStyle +
                ", seatsAmount: " + seatsAmount +
                ", engineVolume: " + engineVolume +
                ", gearBox: " + gearBox +
                ", plateNumber: " + plateNumber + ", " +
                (isWinterTires ? "Winter tires" : "Summer tires") + ", " +
                key.toString();
    }
}
