package com.example;

import com.example.model.*;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        MyVehicle[] vehicles=new MyVehicle[4];
        vehicles[0]=new RoadTruck(10,UUID.randomUUID().toString(), Manufacturer.TATA,900,0);
        vehicles[1]=new RoadTruck(8,UUID.randomUUID().toString(), Manufacturer.SURAJ_MAZDA,910,0);
        vehicles[2]=new RiverBerge(4,UUID.randomUUID().toString(),1090,0,Manufacturer.TATA);
        vehicles[3]=new RiverBerge(6,UUID.randomUUID().toString(),4000,0,Manufacturer.ASHOKE_LYLAND);
        Company company=new Company();
        company.addVehicle(vehicles);
        company.displayVehicleDetails();
       /* Vehicle vehicle=new RoadTruck();
        vehicle.a();*/

        System.out.println(MyInterface.str);


    }
}
