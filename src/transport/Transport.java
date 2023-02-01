package transport;

import mechanics.Mechanic;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    protected static List<Mechanic> listOfMechanics = new ArrayList<>();

    public static void addMechanic(String name, String company) {
        listOfMechanics.add(new Mechanic(name, company));
    }

    public static void removeMechanic(String name, String company) {
        listOfMechanics.remove(new Mechanic(name, company));
    }

    public static void removeMechanic(Mechanic mechanic) {
        listOfMechanics.remove(mechanic);
    }

    public static void removeMechanic(int index) {
        listOfMechanics.remove(index);
    }

    public static void printListOfMechanics() {
        System.out.println(listOfMechanics);
    }
}

