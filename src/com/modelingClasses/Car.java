package com.modelingClasses;

public class Car {
    //Attributes
    String model;
    int year;
    boolean isElectric;

    //Methods Get and Set
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

    public boolean GetIsElectric(){
        return this.isElectric;
    }
    public void SetIsElectric(boolean isElectric){
        this.isElectric = isElectric;
    }

}
