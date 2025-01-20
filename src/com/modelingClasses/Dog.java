package com.modelingClasses;

public class Dog extends Animal{

    //Constructor with parameters. If the Animal's constructor don't have parameters is not necessary.
    //Only define public Dog()
    //public Dog(String name, int age){
    //    super(name,age);
    //}

    public Dog(){}

    @Override
    public String sound(){
        return "Bark";
    }
}
