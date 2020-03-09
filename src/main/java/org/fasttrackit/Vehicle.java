package org.fasttrackit;

public class Vehicle {
    // instance variables
    int racingNumber;
    String name;
    int maxSpeed;
    double mileage;
    String color;
    double fuelLevel;
    double totalDistance;
    boolean damaged;


    // Method signature
    public double accelerate(double speed, double durationInHours) {
        // Method body
        System.out.println(name + " is accelerating with " + speed + " km/h for" + durationInHours + " h");

        // local variables - variable declarate in interiorul unei metode si este doar pentru metoda respectiva
        double traveledDistance = speed * durationInHours;
        System.out.println("Traveled distance: " + traveledDistance);

        totalDistance += traveledDistance;
        System.out.println("Total traveled distance: " + totalDistance);



        double usedFuel = traveledDistance * mileage / 100;

        fuelLevel -= usedFuel; // same as fuelLevel = fuelLevel - usedFuel
        System.out.println("Remaining fuel: " + fuelLevel);

        return traveledDistance;
    };
}
