package com.example.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class RiverBerge implements MyVehicle{

    private int numberOfTurbine;
    private  String shipId;
    private int maxLoadInTons;
    private double distanceCovered;
    private Manufacturer manufacturer;
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
