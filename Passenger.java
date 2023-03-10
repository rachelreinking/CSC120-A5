/**
 * This creates a Passenger that is used to construct a Train
 * This keeps track of the name of the passenger
 * The passenger also has the capability to board and get off the train car
 * This class has an association relationship with the Car class
 * @author Rachel Reinking
 * @version 9 March 2023
 */

public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Lets the passenger board the car 
     * Catches a RuntimeException if the car is full and a passenger can't be added
     * @param c A Car (from the Car class)
    */
    public void boardCar(Car c) {
        try {
            c.addPassenger(this);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    /**
     * Lets the passengers get off the car 
     * Catches a RuntimeException if the passenger isn't in the car's roster and can't be removed
     * @param c
    */
    public void getOffCar(Car c) {
        try {
            c.removePassenger(this);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    /** Accessor for name */ 
    public String getName() {
        return this.name;
    }

}
