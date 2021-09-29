package com.thoughtworks.calc.model;

public class AddIntegers implements ExpressionCalculator{
    @Override
    public double calculate(String expr) {
      try {
        String[] tokens = expr.split("\\+");

        double sum = 0;
        for (String token : tokens) {
          int operand = Integer.parseInt(token);
          sum += operand;
        }

        return sum;
      } catch (NumberFormatException ex) {
      }

      throw new UnsupportedOperationException();
    }
}
