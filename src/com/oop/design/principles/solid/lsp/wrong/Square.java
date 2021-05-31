package com.oop.design.principles.solid.lsp.wrong;

import java.util.Random;

public class Square {

    public double calculateArea() {
        return new Random().nextDouble();
    }

}
