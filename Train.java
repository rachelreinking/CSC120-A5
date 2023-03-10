/**
 * This creates a Train that is constructed using the Engine, Car, and Passenger classes
 * This keeps track of the engine of the train and a list of all the cars on the train
 * This class also has the capability to give the maximum passenger capacity across all cars, 
 * the number of seats remaining across all cars, and the manifest of all passengers across all cars
 * This class has a composition relationship with the Engine class
 * and an aggregation relationship with the Car class
 * @author Rachel Reinking
 * @version 9 March 2023
 */

import java.util.ArrayList;

public class Train {

    private final Engine engine;
    private ArrayList<Car> carsAttached;

    /** Constructer */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, fuelCapacity);
        this.carsAttached =  new ArrayList<Car>(nCars);
        for (int i = 0; i <= (nCars - 1); i++) {
            this.carsAttached.add(new Car(passengerCapacity));
          }
    }

    /** Accessor for Engine */
    public Engine getEngine() {
        return this.engine;
    }

    /** Accessor for Car*/
    public Car getCar(int i) {
        return this.carsAttached.get(i);
    }

    /**
     * Adds together the maximum passenger capacities of all cars on the train
     * @return The maximum passenger capacity across all cars
    */
    public int getMaxCapacity() {
        int maxCapacity = 0;
        for (int i = 0; i <= (this.carsAttached.size() - 1); i++) {
            maxCapacity += this.carsAttached.get(i).getCapacity();
          } 
        return maxCapacity;
    }

    /**
     * Adds together the remaining seats of all cars on the train
     * @return The number of seats remaining across all cars
     */
    public int seatsRemaining() {
        int totalSeatsRemaining = 0;
        for (int i = 0; i <= (this.carsAttached.size() - 1); i++) {
            totalSeatsRemaining += this.carsAttached.get(i).seatsRemaining();
          } 
        return totalSeatsRemaining;
    }

    /**
     * Prints a manifest of passengers on the train, which the roster of all passengers across all cars
     */
    public void printManifest() {
        System.out.println("All passengers onboard Train:");
        for (int i = 0; i <= (this.carsAttached.size() - 1); i++) {
            System.out.println("Car " + (i + 1));
            this.carsAttached.get(i).printManifest();
            System.out.println();
        }
    }

}
