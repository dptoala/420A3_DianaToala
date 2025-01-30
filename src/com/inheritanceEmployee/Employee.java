package com.inheritanceEmployee;

public class Employee {
    private String name;
    private double salary;

    //Constructor
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    //Getters and Setters
    public String GetName(){
        return this.name;
    }
    public double GetSalary(){
        return this.salary;
    }

    public void SetName(String name){
        this.name= name;
    }
    public void SetSalary (double salary){
        this.salary = salary;
    }

    //Functions
    //I don't need "abstract" because this functions will return name and salary
    public String getDetails(){
       return this.name + this.salary;
    }

}
