package com.assignment2;

import java.util.ArrayList;
import java.util.List;

public class Airplane {
    private List<IWeightable> weightables;

    public Airplane(){
        this.weightables = new ArrayList<>();
    }

    // Add IWeightable objects
    public void addWeightable(IWeightable weightable) {
        weightables.add(weightable);
    }

    // Calculate total weight
    public double calculateTotalWeight() {
        double totalWeight = 0.0;
        for (IWeightable weightable : weightables) {
            totalWeight += weightable.getWeight();
        }
        return totalWeight;
    }

    // Display the total weight
    public void displayTotalWeight() {
        System.out.println("Total weight of the airplane: " + calculateTotalWeight() + " kg");
    }

}
