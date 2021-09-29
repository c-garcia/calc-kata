package com.thoughtworks.calc;

import com.thoughtworks.calc.model.CalculateChainOfResponsibility;
import com.thoughtworks.calc.model.SingleNumberCalculator;

public class Main {

  public static void main(String[] args) {
    var calc = new CalculateChainOfResponsibility(
            new SingleNumberCalculator()
    );
    System.out.println(calc.calculate(args[0]));
  }

  private static void showHelpMessage() {
    System.out.println("some help message");
  }
}
