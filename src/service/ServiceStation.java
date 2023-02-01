package service;

import transport.cars.Car;

import java.util.LinkedList;
import java.util.Queue;

public abstract class ServiceStation {
    private static Queue<Car> carsService = new LinkedList<>();

    public static void addCar(Car car) {
        System.out.print(car.getBrand() + " " + car.getModel());
        if (!car.checkIfServiceable())
            System.out.println(" can't be added to the service station");
        else if (carsService.contains(car))
            System.out.println(" is on service already and can't be added again now");
        else {
            carsService.add(car);
            System.out.println(" added to the service station");
        }
    }

    public static void doService() {
        if (carsService.isEmpty()) System.out.println("No cars in the service station");
         else System.out.printf("Service for %s %s has been finished\n", carsService.peek().getBrand(), carsService.poll().getModel());
    }

    public static void printCarsOnService() {
        System.out.println(carsService.isEmpty() ? "No cars in the service station" : carsService);
    }

}
