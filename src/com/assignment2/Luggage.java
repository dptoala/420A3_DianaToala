package com.assignment2;

public class Luggage implements IWeightable{
    private double weight;

    // Constructor
    public Luggage(double weight) {
        this.weight = weight;
    }

    // Getter for weight
    @Override
    public double getWeight() {
        return weight;
    }

    // Setter for weight (optional)
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
