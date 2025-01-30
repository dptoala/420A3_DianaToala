package com.assignment2;

public class Bullet {
    public void shoot(IShootable target, int damage) {
        target.onHit(damage);
    }
}
