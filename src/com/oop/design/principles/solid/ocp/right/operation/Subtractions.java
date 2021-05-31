package com.oop.design.principles.solid.ocp.right.operation;

public class Subtractions implements CalculatorOperation {
    private double left;
    private double right;
    private double result;

    // constructor, getters and setters

    @Override
    public void perform() {
        result = left - right;
    }
}
