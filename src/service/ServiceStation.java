package service;

import transport.cars.WheelTransport;

import java.util.LinkedList;
import java.util.Queue;

public abstract class ServiceStation {
    private static Queue<WheelTransport> carsService = new LinkedList<>();

    public static void addCar(WheelTransport wheelTransport) {
        System.out.print(wheelTransport.getBrand() + " " + wheelTransport.getModel());
        if (!wheelTransport.checkIfServiceable())
            System.out.println(" can't be added to the service station");
        else if (carsService.contains(wheelTransport))
            System.out.println(" is on service already and can't be added again now");
        else {
            carsService.add(wheelTransport);
            System.out.println(" added to the service station");
        }
    }

    public static void doService() {
        if (carsService.isEmpty()) System.err.println("No cars in the service station");
        else
            System.out.printf("Service for %s %s has been finished\n", carsService.peek().getBrand(), carsService.poll().getModel());
    }

    public static void printCarsOnService() {
        System.out.println(carsService.isEmpty() ? "No cars in the service station" : carsService);
    }

    public static void printAmountOfCarsInService() {
        System.out.println(carsService.size());
    }

}
