package com.assignment2;

public class Player implements IShootable{
    private int health;

    // Constructor without parameters
    public Player(int health) {
        this.health = health;
    }

    // Getter
    public int getHealth() {
        return health;
    }

    // Implementing the onHit method from IShootable
    @Override
    public void onHit(int damage) {
        health -= damage;  // Reduce health
        System.out.println("Player hit! Health is now: " + health);
    }
}

