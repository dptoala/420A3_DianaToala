package com.modelingClasses;

public abstract class Animal {
    //Attributes
    String name;
    int age;

    //Methods get and Set
    public String GetName(){
        return this.name;
    }
    public void SetName(String name){
        this.name = name;
    }

    public int GetAge(){
        return this.age;
    }
    public void SetAge(int age){
        this.age= age;
    }

    //Abstract Method
    public abstract String sound();
}
