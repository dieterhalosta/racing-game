package org.fasttrackit;

public class Vehicle {
    // static variables sau class variable
    private static int totalVehicleCount;


    // instance variables
    private int racingNumber;
    private String name;
    private int maxSpeed;
    private double mileage;
    private String color;
    private double fuelLevel;
    private double totalDistance;
    private boolean damaged;

    public Vehicle() {
        totalVehicleCount++;
    }


    // Method overloading
    public double accelerate(double speed) {
        return accelerate(speed, 1);
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

        //co-variant return type - posibila intrebare la examenul final - atunci cand suprascriem o metoda, putem schimba tipul de returnare doar daca returneaza precum in clasa ce o mosteneste. Trebuie sa respect ce se returneaza...de tipul IS A.
        //TODO: look at recording for exact explanation.
    protected Vehicle clone() {
        return new Vehicle();
    }

    public int getRacingNumber() {
        return racingNumber;
    }

    public void setRacingNumber(int racingNumber) {
        this.racingNumber = racingNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }
    // Read only Property
    public static int getTotalVehicleCount() {
        return totalVehicleCount;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "racingNumber=" + racingNumber +
                ", name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", totalDistance=" + totalDistance +
                ", damaged=" + damaged +
                '}';
    }
}
