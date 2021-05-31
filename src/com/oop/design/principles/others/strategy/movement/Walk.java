package com.oop.design.principles.others.strategy.movement;

public class Walk implements Movement {
    @Override
    public void move() {
        System.out.println("Walking...");
    }
}
