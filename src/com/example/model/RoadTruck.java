package com.example.model;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public class RoadTruck extends Vehicle{

    private int numberOfWhees;
    private String truckId;
    private Manufacturer manufacturer;
    private int loadInTons;
    private double distanceCovered;

    @Override
    public double calculateTripDistance(double currentOdometerReading, double previousOdodmeterReading) {
        distanceCovered=currentOdometerReading- previousOdodmeterReading;
        return distanceCovered;
    }

    @Override
    public double calculateFuelEfficiency(double fuelConsumed) {
        return distanceCovered/fuelConsumed;
    }
}

