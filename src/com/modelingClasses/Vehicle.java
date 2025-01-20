package com.modelingClasses;

public abstract class Vehicle {
    String make;
    String model;
    int year;

    public String GetMake(){
        return this.make;
    }
    public void SetMake(String make){
        this.make = make;
    }

    public String GetModel(){
        return this.model;
    }
    public void SetModel(String model){
        this.model = model;
    }

    public int GetYear(){
        return this.year;
    }
    public void SetYear(int year){
        this.year = year;
    }

    //Abstract Method
    public abstract String getDescription();
}
