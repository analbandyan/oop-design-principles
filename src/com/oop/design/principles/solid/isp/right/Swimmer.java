package com.oop.design.principles.solid.isp.right;

public class Swimmer implements SwimmingAthlete {
    @Override
    public void swim() {
        System.out.println("Started swimming");
    }

    @Override
    public void compete() {
        System.out.println("Started competing");
    }
}
