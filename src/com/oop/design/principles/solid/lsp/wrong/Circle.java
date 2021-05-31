package com.oop.design.principles.solid.lsp.wrong;

import java.util.Random;

public class Circle extends Square {

    @Override
    public double calculateArea() {
        return new Random().nextDouble();
    }

}
