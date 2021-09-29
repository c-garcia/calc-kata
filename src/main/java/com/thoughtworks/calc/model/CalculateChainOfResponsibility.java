package com.thoughtworks.calc.model;

public class CalculateChainOfResponsibility implements ExpressionCalculator {
    private ExpressionCalculator[] calculators;
    public CalculateChainOfResponsibility(ExpressionCalculator... calculators){
        this.calculators = calculators;
    }

    @Override
    public double calculate(String expr) {
        for(var calc:this.calculators) {
            try {
                return calc.calculate(expr);
            } catch(UnsupportedOperationException e) {}
        }
        throw new UnsupportedOperationException(String.format("Unsupported expression: {}", expr));
    }
}
