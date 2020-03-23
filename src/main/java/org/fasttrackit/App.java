package org.fasttrackit;

import java.util.Scanner;
import java.util.SortedMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("----------------------------------");
        System.out.println( "Welcome to the racing game!" );
        System.out.println("----------------------------------");

//        Game game = new Game();
//        game.start();

        // method implementation taken from object's class not from variable's class
        Vehicle cheater = new CheatingVehicle();
        cheater.setName("Cheater");

        cheater.accelerate(60, 1);
        System.out.println("Total distance: " + cheater.getTotalDistance());

        // variable type decides what methods can be invoked
        // type casting
        ( (CheatingVehicle) cheater).fly();

        Vehicle vehicle1 = new Vehicle();
        //vehicle1.totalVehicleCount = 1;

        Vehicle vehicle2 = new Vehicle();
        //vehicle2.totalVehicleCount = 2;

        //Vehicle.totalVehicleCount = 50;
        System.out.println("Vehicle 1: " + vehicle1.getTotalVehicleCount());
        System.out.println("Vehicle 2: " + vehicle2.getTotalVehicleCount());
        System.out.println("Vehicle: " + Vehicle.getTotalVehicleCount());


//        System.out.println("Please enter vehicle name:");
//        Scanner scanner = new Scanner(System.in);
//        String vehicleName = scanner.nextLine();
//        System.out.println("Entered name: " + vehicleName);
//
//        Scanner scanner2 = new Scanner(System.in);
//        int enteredNumber = scanner2.nextInt();
//        System.out.println("Entered number: " + enteredNumber);

        Engine engine1 = new Engine();
        engine1.manufacturer = "VW";
        engine1.capacity = 2000;

        Car carReference = new Car(engine1);
        carReference.setName("Audi");
        carReference.setColor("red");
        carReference.setMaxSpeed(260);
        carReference.setMileage(6.2);
        carReference.setFuelLevel(100);
        carReference.setDamaged(true);

        System.out.println(carReference);

        System.out.println("Name: " + carReference.getName());


       double currentDistance = carReference.accelerate(60, 1);

       System.out.println("Current distance: " + currentDistance);

       Mechanic mechanic = new Mechanic();
       mechanic.repair(carReference);
//
//        System.out.println("Is car damaged? " + carReference.damaged);
//
//
//        // One object with two references
//
//        System.out.println("Engine details:");
//        System.out.println(engine1.capacity);
//        System.out.println(carReference.engine.capacity);
//        System.out.println("------------------------------");
//
//        engine1.capacity = 2100;
//        System.out.println("Updated engine details:");
//        System.out.println(engine1.capacity);
//        System.out.println(carReference.engine.capacity);
//        System.out.println("-------------------------------");
//
//
//        // concatenation
//        System.out.println("Properties of " + carReference.name + ":");
//        System.out.println("Color: " + carReference.color);
//        System.out.println("Max Speed: " + carReference.maxSpeed);
//        System.out.println("Mileage: " + carReference.mileage);
//        System.out.println("Fuel level: " + carReference.fuelLevel);
//        System.out.println("Racing number: " + carReference.racingNumber);
//        System.out.println("Damage: " + carReference.damaged);
//        System.out.println("--------------------------------------------------");
//
//        Car car2 = new Car(new Engine());
//        car2.name = "Lamborghini";
//        car2.damaged = true;
//
//        System.out.println("Properties of " + car2.name + ":");
//        System.out.println("Color: " + car2.color);
//        System.out.println("Damage: " + car2.damaged);

        // Restul unei impartiri (modulo)
       // System.out.println(4 % 2);
       // System.out.println(4 % 2 == 0); // printeaza true sau false depinde de caz
        // System.out.println(4 % 3);
    }

}
