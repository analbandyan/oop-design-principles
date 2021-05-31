package com.oop.design.principles.solid.lsp.wrong;

public class ShapeAreaCalculator {

    public double calculate() {
        Square shape = new Square();
//        Square shape = new Circle();
        return shape.calculateArea();
    }

}
