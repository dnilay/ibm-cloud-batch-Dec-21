package org.example.model;

public enum EmployeeType {
    REGULAR_EMPLOYEE("Regular Type Employee"),
    CONTRACT_EMPLOYEE("Contractual Employee");
    private String type;
    private EmployeeType(String type)
    {
        this.type=type;
    }

    public String getType() {
        return type;
    }
}
