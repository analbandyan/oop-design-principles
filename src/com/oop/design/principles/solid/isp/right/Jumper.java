package com.oop.design.principles.solid.isp.right;

public class Jumper implements JumpingAthlete {
    @Override
    public void compete() {
        System.out.println("Started competing");
    }

    @Override
    public void highJump() {
        System.out.println("Started high jumping");
    }

    @Override
    public void longJump() {
        System.out.println("Started long jumping");
    }
}
