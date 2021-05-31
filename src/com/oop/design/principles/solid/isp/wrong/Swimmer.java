package com.oop.design.principles.solid.isp.wrong;

public class Swimmer implements Athlete {
    @Override
    public void compete() {
        System.out.println("Started competing");
    }

    @Override
    public void swim() {
        System.out.println("Started swimming");
    }

    @Override
    public void highJump() {

    }

    @Override
    public void longJump() {

    }
}
