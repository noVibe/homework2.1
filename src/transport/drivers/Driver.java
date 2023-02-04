package transport.drivers;
import static utilities.Utilities.*;

public abstract class Driver {
    final private String name;
    private boolean isDriverLicence;
    private int experienceYears;
    private boolean isHired;

    public Driver(String name, boolean isDriverLicence, int experienceYears) {
        this.name = validationAndDefaultSet(name,"default");
        this.isDriverLicence = isDriverLicence;
        this.experienceYears = validationAndDefaultSet(experienceYears, 0);
    }

    public void driveCar() {
        System.out.println("Driver is driving");
    }

    public void stopCar() {
        System.out.println("Driver has stopped the car");
    }

    public void fillUp() {
        System.out.println("Driver has filled up the car tank");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Driver name: " + name + (isDriverLicence ? ", Has" : ", No")  + " driving licence" +  ", experienceYears: " + experienceYears;
    }

    public boolean isDriverLicence() {
        return isDriverLicence;
    }

    public void setDriverLicence(boolean driverLicence) {
        isDriverLicence = driverLicence;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public boolean isHired() {
        return isHired;
    }

    public void SetIsHired() {
        isHired = !isHired;
    }
}
