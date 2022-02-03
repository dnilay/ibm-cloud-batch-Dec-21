package com.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Company {
    private String companyId;
    private String companyName;
    private MyVehicle[] vehicles;

    {
        vehicles=new MyVehicle[4];
    }

    public void addVehicle(MyVehicle[] vehicles)
    {
        this.vehicles=vehicles;
    }

    public void displayVehicleDetails()
    {
        for(MyVehicle v: vehicles)
        {
            if (v instanceof RoadTruck)
            {
                RoadTruck roadTruck=(RoadTruck) v;
                System.out.println("Displaying Truck Details:\n ==========================================\n"+roadTruck);
                System.out.println(" Distance Covered By Truck Is: "+roadTruck.calculateTripDistance(10000,9000));
                System.out.println("Truck's Fuel Efficiency is: "+roadTruck.calculateFuelEfficiency(100));
            }
            if (v instanceof RiverBerge)
            {
                RiverBerge riverBerge=(RiverBerge) v;
                System.out.println("Displaying Ship Details:\\n ==========================================\n"+riverBerge);
                System.out.println(" Distance Covered By Truck Is: "+riverBerge.calculateTripDistance(10000,9000));
                System.out.println("Truck's Fuel Efficiency is: "+riverBerge.calculateFuelEfficiency(1000));
            }
        }
    }


}
