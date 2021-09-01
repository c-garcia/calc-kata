package com.thoughtworks.calc;

public class Main {

  public static void main(String[] args) {
    if (args.length == 1) {
      try {
        int input = Integer.parseInt(args[0]);
        System.out.println(input);
        return;
      } catch (NumberFormatException ex) {
        showHelpMessage();
        return;
      }
    }

    showHelpMessage();
  }

  private static void showHelpMessage() {
    System.out.println("some help message");
  }
}
