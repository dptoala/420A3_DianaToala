package com.assignment2;

public class Freelancer implements Payable{
    private int hoursWorked;
    private double hourlyRate;

    // Constructor
    public Freelancer(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Getters
    public int getHoursWorked() {
        return hoursWorked;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }

    // Implementing the calculatePay method from Payable interface
    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;  // Pay is calculated based on hours worked and hourly rate
    }
}
