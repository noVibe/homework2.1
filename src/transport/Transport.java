package transport;

import mechanics.Mechanic;

import static utilities.Utilities.*;

import java.util.List;
import java.util.Objects;

public abstract class Transport {
    private List<Mechanic> listOfMechanics;

    public Transport(List<Mechanic> listOfMechanics) {
        this.listOfMechanics = listOfMechanics;
    }

    public void addMechanic(String name, String company) {
        if (listOfMechanics.contains(new Mechanic(name, company))) System.out.println("Can't duplicate mechanics");
        else listOfMechanics.add(new Mechanic(name, company));
    }

    public void addMechanic(Mechanic mechanic) {
        if (listOfMechanics.contains(mechanic)) System.err.println("Can't duplicate mechanics");
        else listOfMechanics.add(mechanic);
    }

    public void removeMechanic(String name, String company) {
        listOfMechanics.remove(new Mechanic(name, company));
    }

    public void removeMechanic(Mechanic mechanic) {
        listOfMechanics.remove(mechanic);
    }

    public void removeMechanic(int index) {
        listOfMechanics.remove(index);
    }

    public void printListOfMechanics() {
        for (Mechanic mechanic : listOfMechanics) {
            System.out.printf("name: %s, company: %s; ", mechanic.getName(), mechanic.getCompany());
        }
        System.out.println();
    }

    public List<Mechanic> getListOfMechanics() {
        return listOfMechanics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return listOfMechanics.equals(transport.listOfMechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfMechanics);
    }
}

