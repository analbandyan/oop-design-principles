package com.oop.design.principles.solid.ocp.wrong;

import java.security.InvalidParameterException;

public class Calculator {

    public double calculate(CalculatorOperation calculatorOperation, double left, double right) {
        if (calculatorOperation == CalculatorOperation.ADDITION) {
            return left + right;
        }
        if (calculatorOperation == CalculatorOperation.SUBTRACTION) {
            return left - right;
        }
        throw new InvalidParameterException("Unsupported operation type: " + calculatorOperation);
    }

}