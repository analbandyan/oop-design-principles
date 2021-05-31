package com.oop.design.principles.solid.lsp.right.area;

import java.util.Random;

public class Rectangle extends Square {

    @Override
    public double calculateArea() {
        return new Random().nextDouble();
    }

}
