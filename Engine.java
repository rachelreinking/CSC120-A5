/**
 * This creates an Engine that is used to construct a Train
 * This keeps track of the fuel type, current fuel level, an maximum fuel level of the engine
 * The engine also has the capability to go and refuel
 * This class has a composition relationship with the Train class
 * @author Rachel Reinking
 * @version 9 March 2023
 */

public class Engine {

    private FuelType fuelType; 
    private double currentFuel;
    private double fuelCapacity;

    /** Constructor */
    public Engine(FuelType fuelType, double fuelCapacity) {
        this.fuelType = fuelType;
        this.currentFuel = fuelCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    /** Accessor for fuelType */
    public FuelType getFuelType() {
        return this.fuelType;
    }

    /**Accessor for currentFuel */
    public double getCurrentFuel() {
        return this.currentFuel;
    }

    /**Accessor for fuelCapacity */
    public double getFuelCapacity() {
        return this.fuelCapacity;
    }

    /**
     * Resets the current fuel level to the maximum fuel level
     * @param fuelCapacity The maximum fuel level of the engine
     */
    public void refuel(double fuelCapacity) {
        this.currentFuel = fuelCapacity;
    }

    /**
     * Decreases the current fuel level and prints the remaining fuel level when the fuel level is above 0 
     * Otherwise, a RuntimeException is thrown
     * @param fuelSpent The quantity of fuel spent to run engine
     */
    public void go(double fuelSpent) {
        if (this.currentFuel > 0) {
            this.currentFuel -= fuelSpent;
            if (currentFuel <= 0) {
                this.currentFuel = 0;
            }
            System.out.println("Remaining fuel level: " + this.currentFuel);
        }
        else {
            throw new RuntimeException("Not enough fuel to start engine. Current fuel level is " + this.currentFuel);
        }
    }

}