package com.modelingClasses;

public class Item {
    //Attributes
    String name;
    double price;

    //Methods Get and Set
    public String GetName(){
        return this.name;
    }
    public void Set(String name){
        this.name = name;
    }

    public double GetPrice(){
        return this.price;
    }
    public void SetPrice(double price){
       this.price = price;
    }

}
