package com.thoughtworks.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MainTest {
  ByteArrayOutputStream outputStreamCaptor;

  @BeforeEach
  public void setUp(){
    outputStreamCaptor = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStreamCaptor));
  }


  @Test
  @Tag("e2e")
  public void shouldShowTheHelpWhenNoArgs() {

    Main.main(new String[0]);

    assertEquals("some help message\n", outputStreamCaptor.toString());
  }

  @Test
  @Tag("e2e")
  public void shouldShowTheHelpWhenMultipleArgs() {
    String []args = {"arg1", "arg2"};

    Main.main(args);

    assertEquals("some help message\n", outputStreamCaptor.toString());
  }

  @Test
  @Tag("e2e")
  public void shouldPrintTheArgumentWhenItsAnInteger() {
    String []args = {"1"};

    Main.main(args);

    assertEquals("1\n", outputStreamCaptor.toString());
  }

  @Test
  @Tag("e2e")
  public void shouldPrintTheResultOfAnAdditionBetweenTwoIntegers() {
    String []args = {"1+2"};

    Main.main(args);

    assertEquals("3\n", outputStreamCaptor.toString());
  }
}
