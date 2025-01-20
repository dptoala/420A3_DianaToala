package com.modelingClasses;

public class Student {
    //Attributes
    String name;
    int age;

    //Constructor
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Methods Get and Set
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
        this.age = age;
    }
}
