package com.oop.design.principles.solid.dip.right;

public class BackendDeveloper implements Developer {

    @Override
    public void develop() {
        writeJava();
    }

    private void writeJava() {
        System.out.println("Write java");
    }
}
