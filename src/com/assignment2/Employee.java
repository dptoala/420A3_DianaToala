package com.assignment2;

public class Employee implements Payable{
    private double salary;

    // Constructor
    public Employee(double salary) {
        this.salary = salary;
    }

    // Getter
    public double getSalary() {
        return salary;
    }

    // Implementing the calculatePay method from Payable interface
    @Override
    public double calculatePay() {
        return salary;
    }
}
