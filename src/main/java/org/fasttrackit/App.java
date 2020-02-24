package org.fasttrackit;

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

        Car carReference = new Car();
        carReference.name = "Audi";
        carReference.color = "red";
        carReference.maxSpeed = 260;
        carReference.mileage = 6.2;

  //     carReference.engine = new Engine();
  //     carReference.engine.manufacturer = "VW";
  //     carReference.engine.capacity = 2000;

        Engine engine1 = new Engine();
        engine1.manufacturer = "VW";
        engine1.capacity = 2000;

        carReference.engine = engine1;

        // One object with two references

        System.out.println("Engine details:");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);
        System.out.println("------------------------------");

        engine1.capacity = 2100;
        System.out.println("Updated engine details:");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);
        System.out.println("-------------------------------");


        // concatenation
        System.out.println("Properties of " + carReference.name + ":");
        System.out.println("Color: " + carReference.color);
        System.out.println("Max Speed: " + carReference.maxSpeed);
        System.out.println("Mileage: " + carReference.mileage);
        System.out.println("Fuel level: " + carReference.fuelLevel);
        System.out.println("Racing number: " + carReference.racingNumber);
        System.out.println("Damage: " + carReference.damaged);
        System.out.println("--------------------------------------------------");

        Car car2 = new Car();
        car2.name = "Lamborghini";
        car2.damaged = true;

        System.out.println("Properties of " + car2.name + ":");
        System.out.println("Color: " + car2.color);
        System.out.println("Damage: " + car2.damaged);
    }

}
