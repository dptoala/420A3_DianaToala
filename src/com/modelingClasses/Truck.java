package com.modelingClasses;

public class Truck extends Vehicle{
    double payloadCapacity;

    public double SetPayloadCapacity(){
        return this.payloadCapacity;
    }
    public void GetPayloadCapacity(double payloadCapacity){
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public String getDescription(){
        return "It is Truck";
    }
}
