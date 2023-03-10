/**
 * This creates a Car that is used to construct a Train
 * This keeps track of the roster of passengers on the car and the passenger capacity of the car
 * This class also has the capabilities to add and remove passengers from the car,
 * number of seats remaining, and the manifest of all passengers on the car
 * This class has an aggregation relationship with the Train class 
 * and an association relationship with the Passenger class
 * @author Rachel Reinking
 * @version 9 March 2023
 */

import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger> carPassengers;
    private int passengerCapacity;

    /** Constructor */
    public Car(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
        this.carPassengers = new ArrayList<Passenger>(0);
    }

    /** Accessor for passengerCapacity */
    public int getCapacity() {
        return this.passengerCapacity;
    }

    /** Accessor for numPassengers */
    public int seatsRemaining() {
        return (this.passengerCapacity - this.carPassengers.size());
    }

    /**
     * Adds a passenger to the car's roster
     * Throws a RuntimeExcception if the car is full and a passenger can't be added
     * @param p A Passenger (from the Passenger class)
    */
    public void addPassenger(Passenger p) {
        if(this.carPassengers.size() < this.passengerCapacity) {
            this.carPassengers.add(p);
            System.out.println("Passenger added to car");
        }
        else {
            throw new RuntimeException("This car is FULL. No seats available.");
        }
    }

    /**
     * Removes a passenger from the car's roster
     * Throws a RuntimeExcception if the passenger isn't in the car's roster and can't be removed
     * @param p A Passenger (from the Passenger class)
    */
    public void removePassenger(Passenger p) {
        if(this.carPassengers.contains(p)) {
            this.carPassengers.remove(p);
        }
        else {
            throw new RuntimeException("This passenger is not on the car. Cannot remove passenger");
        }
    }

    /**
     * Prints a manifest of passengers on car, which is all the passengers on the car's roster
     */
    public void printManifest() {
        if(this.carPassengers.size() == 0) {
            System.out.println("This car is EMPTY.");
        }
        else {
            System.out.println("Passengers:");
            for (int i = 0; i <= (this.carPassengers.size() - 1); i++) {
                System.out.println(carPassengers.get(i).getName());
              }  
        }
    }

}