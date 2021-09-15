package com.thoughtworks.calc;

public class Main {

  public static void main(String[] args) {
    if (args.length == 1) {
      try {
        String operator = "\\+|-";
        String real_operator = "\\+";
        String[] tokens = args[0].split(operator);
        //No plus sign

        if(tokens.length == 1) {
          System.out.println(Integer.parseInt(tokens[0]));
          return;
        }

        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[1]);

        if (real_operator.equals("\\+"))  {
          System.out.println(a + b);
        }

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
