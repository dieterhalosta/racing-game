package org.fasttrackit;

public class Vehicle {
    // static variables sau class variable
    static int totalVehicleCount;


    // instance variables
    int racingNumber;
    String name;
    int maxSpeed;
    double mileage;
    String color;
    double fuelLevel;
    double totalDistance;
    boolean damaged;

    public Vehicle() {
        totalVehicleCount++;
    }
    // Method signature
    public double accelerate(double speed, double durationInHours) {
        // Method body

        if (fuelLevel <= 0) {
            System.out.println("No enough fuel.");
            return 0;
        }

        if (speed > maxSpeed) {
            System.out.println("Max Speed exceeded!");
            return 0;
        } else if (speed == maxSpeed) {
            System.out.println("Be careful! Max speed reached");
        } else {
            System.out.println("Valid speed entered.");
        }

        double mileageMultiplier = 1;
        if ( speed > 120 ) {
            mileageMultiplier = speed / 100;
        }

        System.out.println(name + " is accelerating with " + speed + " km/h for" + durationInHours + " h");

        // local variables - variable declarate in interiorul unei metode si este doar pentru metoda respectiva
        double traveledDistance = speed * durationInHours;
        System.out.println("Traveled distance: " + traveledDistance);

        totalDistance += traveledDistance;
        System.out.println("Total traveled distance: " + totalDistance);



        double usedFuel = traveledDistance * mileage / 100;
        usedFuel *= mileageMultiplier;

        fuelLevel -= usedFuel; // same as fuelLevel = fuelLevel - usedFuel
        System.out.println("Remaining fuel: " + fuelLevel);

        return traveledDistance;
    };

public void decelerate() {
        // TODO: implement this
        System.out.println("This is just a test method!");
        }
        }
