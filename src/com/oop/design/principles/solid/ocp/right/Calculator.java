package com.oop.design.principles.solid.ocp.right;

import com.oop.design.principles.solid.ocp.right.operation.CalculatorOperation;

import java.security.InvalidParameterException;

public class Calculator {

    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        operation.perform();
    }

}