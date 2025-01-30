package com.assignment2;

public class Wall implements IShootable{
    private int durability;

    // Constructor without parameters
    public Wall(int durability) {
        this.durability = durability;
    }

    // Getter
    public int getDurability() {
        return durability;
    }

    // Implementing the onHit method from IShootable
    @Override
    public void onHit(int damage) {
        durability -= damage;  // Reduce durability by damage value
        System.out.println("Wall hit! Durability is now: " + durability);
    }
}
