package com.thoughtworks.calc.model;

public class SingleNumberCalculator implements ExpressionCalculator{
    @Override
    public double calculate(String expr) {
        try {
            return Integer.parseInt(expr);
        }catch(NumberFormatException e) {
            throw new UnsupportedOperationException();
        }
    }
}
