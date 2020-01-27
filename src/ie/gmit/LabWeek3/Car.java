package ie.gmit.LabWeek3;

public class Car {
    // Instance Variables
    int topSpeed;
    int totalSeats;
    int fuelCapacity;
    String manufacturer;
    String colour;
    String owner;
    float engineSize;
    float value;

    // Class Methods
    void show(){
        System.out.println(manufacturer);
    }

    void crash(){
        value = 0;
    }
}