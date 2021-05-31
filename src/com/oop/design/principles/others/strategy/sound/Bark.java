package com.oop.design.principles.others.strategy.sound;

public class Bark implements Sound {
    @Override
    public void make() {
        System.out.println("Bark-bark");
    }
}
