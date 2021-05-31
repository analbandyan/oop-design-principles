package com.oop.design.principles.solid.dip.right;

public class FrontendDeveloper implements Developer {
    @Override
    public void develop() {
        writeJs();
    }

    private void writeJs() {
        System.out.println("Write JS");
    }
}
