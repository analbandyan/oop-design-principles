package com.oop.design.principles.solid.lsp.right.area;

import com.oop.design.principles.solid.lsp.wrong.Square;

public class ShapeAreaCalculator {

    public double calculate() {
        Square shape = new Square();
//        Square shape = new Circle();
        return shape.calculateArea();
    }

}
