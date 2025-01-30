package com.assignment2;
import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private List<Payable> payables;

    // Constructor
    public PayrollSystem() {
        payables = new ArrayList<>();
    }

    // Add a Payable object (Employee or Freelancer)
    public void addPayable(Payable payable) {
        payables.add(payable);
    }

    // Method to calculate the total payroll
    public double calculateTotalPayroll() {
        double totalPayroll = 0.0;
        for (Payable payable : payables) {
            totalPayroll += payable.calculatePay();
        }
        return totalPayroll;
    }

    // Display the total payroll
    public void displayTotalPayroll() {
        System.out.println("Total payroll: $" + calculateTotalPayroll());
    }
}
