package com.example.model;

public  abstract class Vehicle {

    public abstract double calculateTripDistance(double currentOdometerReading,double previousOdodmeterReading);
    public abstract double calculateFuelEfficiency(double fuelConsumed);

    private int a;

    public void a()
    {
        a=100;
        System.out.println(a);
    }
}
