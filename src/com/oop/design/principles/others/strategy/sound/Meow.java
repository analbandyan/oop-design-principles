package com.oop.design.principles.others.strategy.sound;

public class Meow implements Sound {
    @Override
    public void make() {
        System.out.println("Moew...");
    }
}
