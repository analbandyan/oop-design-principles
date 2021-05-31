package com.oop.design.principles.others.strategy.movement;

public class Run implements Movement {

    @Override
    public void move() {
        System.out.println("Running...");
    }

}
