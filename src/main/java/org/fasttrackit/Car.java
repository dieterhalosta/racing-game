package org.fasttrackit;

// "is-a" relationship or Inheritance
public class Car extends AutoVehicle{
    int doorCount;

    public Car(Engine engine) {
        super(engine);
    }
    // Constructor overloading
    public Car() {
        super(new Engine());
    }
}
