package mechanics;

import static utilities.Utilities.*;

import java.util.Objects;

public class Mechanic {
    private String name;
    private String company;

    public Mechanic(String name, String company) {
        setName(name);
        setCompany(company);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validationAndDefaultSet(name, "Default Guy");
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = validationAndDefaultSet(company, "Default Co");
    }

    public void doMaintenance() {
        System.out.println("Mechanic " + name + " has finished maintenance");
    }

    public void repairCar() {
        System.out.println("Mechanic " + name + " has repaired the vehicle");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanic)) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }

    @Override
    public String toString() {
        return "name: " + name + "company: " + company;
    }
}
