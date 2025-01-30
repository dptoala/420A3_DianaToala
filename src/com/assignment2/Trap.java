package com.assignment2;

public class Trap implements IShootable{
    private boolean isActive;

    // Constructor without parameters
    public Trap() {
        this.isActive = true;
    }

    // Getter
    public boolean isActive() {
        return isActive;
    }

    // Implementing the onHit method from IShootable
    @Override
    public void onHit(int damage) {
        if (isActive) {
            isActive = false;  // Disarm the trap
            System.out.println("Trap disarmed!");
        } else {
            System.out.println("Trap is already disarmed.");
        }
    }
}
