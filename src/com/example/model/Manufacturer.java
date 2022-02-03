package com.example.model;

public enum Manufacturer {
    TATA("Tata"),
    ASHOKE_LYLAND("Ashoke Lyland"),
    SURAJ_MAZDA("Suraj Mazda"),
    VOLVO("Volvo");

    private String name;

   private Manufacturer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

